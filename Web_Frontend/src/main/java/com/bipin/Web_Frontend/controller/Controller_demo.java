package com.bipin.Web_Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_demo 
{
	@RequestMapping("/demo")
	public String demo()
	{
		
		return "master";
		
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/registration")
    public String registration()
    {
		return "registration";
    }
}
