package com.ngh.checkstyle_pmd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ngh.checkstyle_pmd.model.Data;


@Controller
public class DataController {
	
	@GetMapping("/data")
	public String dataForm(Model model) {
		
		//comment1
		//comment2
		//comment3
		model.addAttribute("data", new Data());
		try{
			
			
		}catch(Exception e) {
			
			
		}
		return "data";
	}

	@PostMapping("/data")
	public String dataSUBMItted(@ModelAttribute Data data, Model model) {
		model.addAttribute("data", data);
		return "display";
	}
	
	public void sample() {
		int a=2;
		int b=3;
		List<String> user = new ArrayList<>();
		user.add("data");
		user.add("data");
		System.out.println(user);
	}
 
}
