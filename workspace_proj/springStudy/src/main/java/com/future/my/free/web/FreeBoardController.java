package com.future.my.free.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.future.my.common.service.CodeService;
import com.future.my.common.vo.CodeVO;

@Controller
@RequestMapping("/free")
public class FreeBoardController {
	
	@Autowired
	CodeService codeService;
	
	// 해당 컨트롤러에서 연결되는 화면에서 
	@ModelAttribute("comList")
	public ArrayList<CodeVO> getCodeList(){
		return codeService.getCodeList("BC00");	// 게시판 관련
		
	}
	
	@ModelAttribute("comMainList")
	public ArrayList<CodeVO> comMainList(){
		return codeService.getCodeList(null);	// test
	}
	
	@RequestMapping("/test")
	public String test() {
		return "free/test";
	}
	
	@RequestMapping("/freeList")
	public String freeList() {
		return "free/freeList";
	}
	

}
