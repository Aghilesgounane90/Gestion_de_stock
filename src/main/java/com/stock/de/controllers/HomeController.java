package com.stock.de.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value = "/")
	public String Home(){
		
		return "home";
	}
	
	@RequestMapping(value = "/blank")
	public String blankHome(){
		
		return "blank/blank";
	}

}
