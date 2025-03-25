package com.future.my.free.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.my.free.dao.IFreeBoardDAO;
import com.future.my.free.vo.FreeBoardSearchVO;
import com.future.my.free.vo.FreeBoardVO;

@Service
public class FreeBoardService {
	
	@Autowired
	IFreeBoardDAO dao;
	
	// 자유게시판 조회
	public ArrayList<FreeBoardVO> getBoardList(FreeBoardSearchVO searchVO){
		
		// 1. 전체 건수 조회
		int totalRowCount = dao.getToralRowCount(searchVO);
		searchVO.setTotalRowCount(totalRowCount);
		// 2. 검색 조건으로 검색된 전체 건수를 기준으로 paing 세팅
		searchVO.pageSetting();
		// 3. current에 해당하는 firstRow ~ lastRow 까지 목록 조회결과 리턴
		return dao.getBoardList(searchVO);
	}
	// 게시글 조회수
	public void increaseHit(int boNo) throws Exception {
		int result = dao.increaseHit(boNo);
		if(result == 0) {
			throw new Exception();
		}
	}
}
