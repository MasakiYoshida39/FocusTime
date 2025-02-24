package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Learning;
import com.example.demo.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService {
	
	private final ReviewRepository repository;

	@Override
	public void regist(Learning learning) {
		// TODO 自動生成されたメソッド・スタブ
		repository.add(learning);

	}

}
