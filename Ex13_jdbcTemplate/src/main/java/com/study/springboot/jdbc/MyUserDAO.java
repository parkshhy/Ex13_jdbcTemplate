package com.study.springboot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyUserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate; //데이터베이스를 사용하기 위한 코드
	
	public List<MyUserDTO> list() {
		String query = "select * from myuser";
		List<MyUserDTO> list = jdbcTemplate.query(
				query, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));
			

		
		return list;

	}

}
