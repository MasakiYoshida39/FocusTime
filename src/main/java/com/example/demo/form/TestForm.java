package com.example.demo.form;

import java.sql.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;
//lombokのデータアノテーションでgetter、setter省略
@Data
public class TestForm {
	/**
		ユーザー情報
		private String userId;
	*/
		//勉強日
       @Past(message="今日以前の日付を入力してください。")
		private Date study;
		//勉強時間
		@Min(value=1,  message="入力してください。")
		@NotNull(message = "入力してください。")
		private Integer studyhours;
		//教科
		@NotBlank(message = "内容を入力してください。")
		private String subject;
		//内容
		@NotBlank(message = "内容を入力してください。")
		private String comment;
}

