package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Learning;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository {
	
	private final JdbcTemplate jdbcTemplate;
	

	@Override
	public void add(Learning learning) {
		String sql =
				" INSERT INTO learning " +
				" (study, studyhours, subject,  comment) " +
				" VALUES (?, ?, ?, ?) ";	
		;
	
			jdbcTemplate.update(sql, learning.getStudy(),
					                 learning.getStudyhours(),
					                 learning.getSubject(),
					                 learning.getComment()		);
			// learning.get.UserId(),
		
	}

}
