package fr.efrei2023.asta.projet_asta.filter;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.Apprentice.*;

public class ApprenticeFilter {
    private final static String[] _filtersName =
            {
                    FILTER_ARCHIVE_PARAMETER, FILTER_FIRSTNAME_PARAMETER, FILTER_LASTNAME_PARAMETER, FILTER_MAJOR_PARAMETER,
                    FILTER_PROGRAM_PARAMETER, FILTER_YEAR_PARAMETER, FILTER_PHONE_NUMBER_PARAMETER
            };

    public static List<ApprenticeEntity> apply(List<ApprenticeEntity> apprentices, HashMap<String, String> filters) {
        if (apprentices.isEmpty())
            return apprentices;
        var apprenticesStream = apprentices.stream();
        apprenticesStream = applyArchiveFilter(apprenticesStream, filters.get(FILTER_ARCHIVE_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getFirstName, filters.get(FILTER_FIRSTNAME_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getLastName, filters.get(FILTER_LASTNAME_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getMajor, filters.get(FILTER_MAJOR_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getProgram, filters.get(FILTER_PROGRAM_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getYear, filters.get(FILTER_YEAR_PARAMETER));
        apprenticesStream = applyGenericFilter(apprenticesStream, ApprenticeEntity::getPhoneNumber, filters.get(FILTER_PHONE_NUMBER_PARAMETER));
        return apprenticesStream.toList();
    }

    public static List<ApprenticeEntity> applyFromRequestOrSessionFilters(List<ApprenticeEntity> apprentices, HttpServletRequest request) {
        var filters = getFiltersFromGivenFunction(request::getParameter);
        filters.putIfAbsent(FILTER_ARCHIVE_PARAMETER, (String) request.getSession().getAttribute(FILTER_ARCHIVE_PARAMETER));
        if (filters.values().stream().noneMatch(value -> value != null && !value.isEmpty())) {
            var session = request.getSession();
            filters = getFiltersFromGivenFunction(value -> (String) session.getAttribute(value));
        } else {
            saveFiltersInSession(request.getSession(), filters);
        }
        return apply(apprentices, filters);
    }

    public static void reset(HttpServletRequest request) {
        var session = request.getSession();
        for (String filterName : _filtersName) {
            session.removeAttribute(filterName);
        }
    }

    private static HashMap<String, String> getFiltersFromGivenFunction(Function<String, String> function) {
        var filters = new HashMap<String, String>();
        for (String filterName : _filtersName) {
            filters.put(filterName, function.apply(filterName));
        }
        return filters;
    }

    private static void saveFiltersInSession(HttpSession session, HashMap<String, String> filters) {
        filters.forEach(session::setAttribute);
    }

    private static Stream<ApprenticeEntity> applyArchiveFilter(Stream<ApprenticeEntity> apprenticesStream, String filterValue) {
        if (filterValue == null || filterValue.isEmpty() || filterValue.equals(FILTER_ARCHIVE_VALUE_APPRENTICES_NOT_ARCHIVED))
            return apprenticesStream.filter(apprentice -> !apprentice.isArchived());
        if (filterValue.equals(FILTER_ARCHIVE_VALUE_ONLY_ARCHIVED_APPRENTICES))
            return apprenticesStream.filter(ApprenticeEntity::isArchived);
        if (filterValue.equals(FILTER_ARCHIVE_VALUE_ALL_APPRENTICES))
            return apprenticesStream;
        return apprenticesStream.filter(apprentice -> !apprentice.isArchived());
    }

    private static Stream<ApprenticeEntity> applyGenericFilter(Stream<ApprenticeEntity> stream, Function<ApprenticeEntity, String> function, String filterValue) {
        return filterValue != null && !filterValue.isEmpty()
                ? stream.filter(apprentice -> function.apply(apprentice).contains(filterValue))
                : stream;
    }
}
