package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;
@Data
public class Learning {
	//後日実装
	//private String userId;
	private Date study;
	private Integer studyhours;
	private String subject;
	private String comment;


}
