package kh.mclass.test1.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.mclass.test1.member.model.dto.MemberRes;
import kh.mclass.test1.member.model.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
//	@GetMapping("/login")
//	public String login(
//			Model model
//			, String memId
//			) {
//		model.addAttribute("member", memberService.selectOne(memId));
//		System.out.println("-------------------" + memberService.selectOne(memId));
//		return "home";
//	}
	
//	@GetMapping(path = "/member/list")
	@GetMapping("/list")
	public void selectList(
			Model model
			) {
		List<MemberRes> list = memberService.selectList();
		model.addAttribute("memberlist", list);
//		return "member/list";
	}
	
	@GetMapping("/one")
	public String selectList(
			Model model
			, String memId
			) {
		model.addAttribute("member", memberService.selectOne(memId));
		System.out.println("-------------------" + memberService.selectOne(memId));
		return "member/one";
	}
	
	@PostMapping("/insert")
	public String insert(
			Model model
			, String memId
			) {
//		model.addAttribute("member", memberService.selectOne(memId));
		return "redirect:/login"; // redirect:url - Redirect...
	}
	
	@RequestMapping("/ajax")
//	@ResponseBody - ajax 다시 전달
	public @ResponseBody String getajax(
			Model model
			, String memId
			) {
//		model.addAttribute("member", memberService.selectOne(memId));
		return "ajax전달 완료"; // redirect:url - Redirect...
	}
}
