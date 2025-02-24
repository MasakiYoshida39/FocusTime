package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Learning;
@Repository
public class RegistRepositoryImpl implements RegistRepository {

	@Override
	public void add(Learning learning) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("---登録---");
		System.out.println(learning);

	}

}
