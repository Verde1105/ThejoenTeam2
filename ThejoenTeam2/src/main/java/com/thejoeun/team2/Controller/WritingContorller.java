package com.thejoeun.team2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WritingContorller {

	/*
	 * 
	@GetMapping("/thejoeun/")
	public String 감염대책() {
		return "thejoeun/writing/";
	}
	
	@GetMapping("/thejoeun/")
	public String 더위() {
		return "thejoeun/writing/";
	}
	 */
	
	@GetMapping("/thejoeun/infectious")
	public String infectious() {
		return "thejoeun/writing/infectious";
	}
	
	@GetMapping("/thejoeun/respiratory")
	public String respiratory() {
		return "thejoeun/writing/respiratory";
	}
	
	@GetMapping("/thejoeun/mpox_people")
	public String mpox_people() {
		return "thejoeun/writing/mpox_people";
	}
	
	@GetMapping("/thejoeun/mpox_guest")
	public String mpox_guest() {
		return "thejoeun/writing/mpox_guest";
	}
	
}
