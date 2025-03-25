package com.future.my.free.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.future.my.free.vo.FreeBoardSearchVO;
import com.future.my.free.vo.FreeBoardVO;

@Mapper
public interface IFreeBoardDAO {
	
	// 전체 건수
	public int getToralRowCount(FreeBoardSearchVO searchVO);
	// 목록 조회
	public ArrayList<FreeBoardVO> getBoardList(FreeBoardSearchVO searchVO);
	// 게시글 조회수
	public int increaseHit(int boNo);

}
