package ru.liga.ppr.exam.task_9_sql;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComputerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	public SqlRowSet getMFUProducers(String type) {
		return jdbcTemplate.queryForRowSet(
				"""
						SELECT producer as "producer"
          	FROM Goods
          	WHERE type=:type
						""", Map.of("type", type));
	}

}
