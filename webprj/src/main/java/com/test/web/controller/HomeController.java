package com.test.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController{

	@RequestMapping("index")
	public String index() {
		System.out.println("asdfasdfsadfasdfsdfasdfsad");
		return "root.index";
	}
	
	

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("------------------ index start ---------------");
//		ModelAndView mv = new ModelAndView(); mv.addObject("data","Hello sss!");
//		mv.setViewName("root.index");
//		
//		return mv;
//	}	
	
}
