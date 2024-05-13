package kh.mclass.test1.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.mclass.test1.member.model.dto.MemberRes;
import kh.mclass.test1.member.model.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/list")
	public String selectList(
			Model model
			) {
		List<MemberRes> list = memberService.selectList();
		model.addAttribute("memberlist", list);
		return "member/list";
	}
}
