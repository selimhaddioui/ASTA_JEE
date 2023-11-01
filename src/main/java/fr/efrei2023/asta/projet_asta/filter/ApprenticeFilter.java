package fr.efrei2023.asta.projet_asta.filter;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import jakarta.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static fr.efrei2023.asta.projet_asta.utils.ApprenticeConstants.*;

public class ApprenticeFilter {
    public static List<ApprenticeEntity> applyFromRequestFilters(List<ApprenticeEntity> apprentices, HttpServletRequest request) {
        var filters = getFiltersFromRequest(request);
        return apply(apprentices, filters);
    }

    public static HashMap<String, String> getFiltersFromRequest(HttpServletRequest request) {
        var filters = new HashMap<String, String>();
        filters.put(FILTER_ARCHIVE_PARAMETER, request.getParameter(FILTER_ARCHIVE_PARAMETER));
        return filters;
    }

    public static List<ApprenticeEntity> apply(List<ApprenticeEntity> apprentices, HashMap<String, String> filters) {
        if (apprentices.isEmpty())
            return apprentices;
        var apprenticesStream = apprentices.stream();
        apprenticesStream = applyArchiveFilter(apprenticesStream, filters.get(FILTER_ARCHIVE_PARAMETER));
        return apprenticesStream.toList();
    }

    /**
     * If no specified filters we get only not archived apprentices.
     * Otherwise we filter
     */
    private static Stream<ApprenticeEntity> applyArchiveFilter(Stream<ApprenticeEntity> apprenticesStream, String filterValue) {
        if(filterValue == null || filterValue.isEmpty() || filterValue.equals(FILTER_ARCHIVE_VALUE_APPRENTICES_NOT_ARCHIVED))
            return apprenticesStream.filter(apprentice -> !apprentice.isArchived());
        if (filterValue.equals(FILTER_ARCHIVE_VALUE_ONLY_ARCHIVED_APPRENTICES))
            return apprenticesStream.filter(ApprenticeEntity::isArchived);
        if (filterValue.equals(FILTER_ARCHIVE_VALUE_ALL_APPRENTICES))
                return apprenticesStream;
        return apprenticesStream.filter(apprentice -> !apprentice.isArchived());
    }
}
