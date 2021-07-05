package com.teerjustin.date.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
//java.text.SimpleDateFormat

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		String pattern = "EEE, d 'of' MMMMMMMMMM , yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		String pattern = "HH:mm";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		model.addAttribute("dateTime", date);
		model.addAttribute("word", "time");
		return "time.jsp";
	}
}
