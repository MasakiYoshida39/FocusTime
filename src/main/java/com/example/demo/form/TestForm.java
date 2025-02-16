package com.example.demo.form;

import java.sql.Date;

import lombok.Data;
//lombokのデータアノテーションでgetter、setter省略
@Data
public class TestForm {
	/**
		ユーザー情報
		private String userId;
	*/
		//勉強日
		private Date study;
		//勉強時間
		private Integer studyhours;
		//教科
		private String subject;
		//内容
		private String comment;
}

