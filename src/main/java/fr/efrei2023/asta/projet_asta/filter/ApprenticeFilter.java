package fr.efrei2023.asta.projet_asta.filter;

import fr.efrei2023.asta.projet_asta.model.ApprenticeEntity;
import jakarta.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ApprenticeFilter {
    public static List<ApprenticeEntity> applyFromRequestFilters(List<ApprenticeEntity> apprentices, HttpServletRequest request){
        var filters = getFiltersFromRequest(request);
        return apply(apprentices, filters);
    }

    public static HashMap<String, String> getFiltersFromRequest(HttpServletRequest request){
        return new HashMap<>();
    }

    public static List<ApprenticeEntity> apply(List<ApprenticeEntity> apprentices, HashMap<String, String> filters){
        if(apprentices.isEmpty())
            return apprentices;
        var apprenticesStream = apprentices.stream();
        apprenticesStream = applyArchiveFilter(apprenticesStream, filters.get("archiveFilter"));
        return apprenticesStream.toList();
    }
    /**
     * If no specified filters we get only not archived apprentices.
     * Otherwise we filter
     */
    private static Stream<ApprenticeEntity> applyArchiveFilter(Stream<ApprenticeEntity> apprenticesStream, String filterValue) {
        return filterValue != null && filterValue.equals("archived") ?
                apprenticesStream.filter(ApprenticeEntity::isArchived)
                : filterValue != null && filterValue.equals("all") ?
                apprenticesStream
                : apprenticesStream.filter(apprentice -> !apprentice.isArchived());
    }
}
