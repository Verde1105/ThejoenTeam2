package com.thejoeun.team2.Controller.thejoeun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThejoeunController {
//페이지 이동 컨트롤러
	
	@GetMapping("/thejoeun/index")
	public String index() {//컨트롤에서 세션을 어떻게 찾는가?
		return "thejoeun/index";
	}
	
	@GetMapping("/thejoeun/gen")
	public String gen() {
		return "thejoeun/generic";
	}
	
	@GetMapping("/thejoeun/ele")
	public String ele() {
		return "thejoeun/elements";
	}
	
	@GetMapping("/user/loginForm")
	public String 주소붙이기() {
		return "thejoeun/index";
	}

	@GetMapping("/thejoeun/여름감염병")
	public String 여름감염병() {
		return "writing/summer";
	}

}
//@AuthenticationPrincipal PrincipalDetail principal
