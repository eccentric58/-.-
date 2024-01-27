package ru.liga.ppr.exam.task_8_sql;

import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerDAO {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public SqlRowSet getProducerAndStatsHavingMoreThen3Models(int minModels) {
        return jdbcTemplate.queryForRowSet(
                """
                    SELECT producer, COUNT(model) as count
                    FROM goods
                    WHERE type = 'Computer'
                    GROUP BY producer
                    HAVING COUNT(model) >= :minModels
                    ORDER BY producer DESC;
                    """, Map.of("minModels", minModels));
    }

}
