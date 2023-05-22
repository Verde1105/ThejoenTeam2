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

	//계절성 감염병 링크
	@GetMapping("/thejoeun/spring")
	public String spring() {
		return "thejoeun/writing/spring";
	}
	@GetMapping("/thejoeun/summer")
	public String summer() {
		return "thejoeun/writing/summer";
	}
	@GetMapping("/thejoeun/autumn")
	public String autumn() {
		return "thejoeun/writing/autumn";
	}
	@GetMapping("/thejoeun/winter")
	public String winter() {
		return "thejoeun/writing/winter";
	}

}
//@AuthenticationPrincipal PrincipalDetail principal
