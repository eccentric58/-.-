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
SELECT DISTINCT g.producer
FROM Goods g
WHERE g.type = :type
AND EXISTS (
  SELECT 1
  FROM Computer c
  WHERE c.model = g.model
  AND c.price = (
    SELECT MIN(price) FROM Computer
  )
  AND c.frequency = (
    SELECT MAX(frequency)
    FROM Computer
    WHERE price = (
      SELECT MIN(price) FROM Computer
    )
  )
)
""", Map.of("type", type));
	}
// проходит 2 теста из 3
}
