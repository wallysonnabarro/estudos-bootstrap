package com.example.exemplosbootstraps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exe")
public class ExemplosController {

	@GetMapping
	public String exe() {
		return "cheatsheet/index";
	}
}
