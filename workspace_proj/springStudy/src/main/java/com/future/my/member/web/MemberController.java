package com.future.my.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.future.my.member.web.vo.MemberVO;

@Controller
public class MemberController {
	
	@RequestMapping("/registView")
	public String registView() {
		
		return "member/registView";
	}
	
	@RequestMapping("/registDo")
	public String registDo(MemberVO member) {
		
		System.out.println(member);
		
		return "redirect:/";
	}

}
