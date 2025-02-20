package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("Home page handler");
		// sending data to view
		model.addAttribute("name", "Substring Technology");
		model.addAttribute("youtubeChannel", "deone");
		model.addAttribute("github_repo", "https://github.com/deone23");
		return "home";
	}
	
	// about route
	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("isLogin", false);
		System.out.println("About page loading");
		return "about";
	}
	
	@RequestMapping("/services")
	public String servicesPage() {
		System.out.println("services page loading");
		return "services";
	}

}
