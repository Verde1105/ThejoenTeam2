package com.thejoeun.team2.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.thejoeun.team2.config.auth.PrincipalDetail;

@Controller
public class UserController {

	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		System.out.println("Success Login");
		return "user/loginForm";
//		return "thejoeun/index";
	}

	@GetMapping("/user/updateForm")
	public String updateForm(@AuthenticationPrincipal PrincipalDetail principal) {
		System.out.println("회원정보 수정!");
		return "user/updateForm";
	}
}
