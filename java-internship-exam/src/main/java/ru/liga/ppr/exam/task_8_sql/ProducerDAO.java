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
							SELECT producer as "producer", 1 as "count"
							FROM Goods
							where 1000 >= :minModels
							""", Map.of("minModels", minModels));
	}

}
