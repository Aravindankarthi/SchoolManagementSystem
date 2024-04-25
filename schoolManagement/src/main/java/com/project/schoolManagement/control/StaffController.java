package com.project.schoolManagement.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.schoolManagement.entity.StaffEntity;
import com.project.schoolManagement.repos.StaffDAO;

@Controller
public class StaffController {
	
	@Autowired
	StaffDAO stf;
	
	@RequestMapping("/login")
	public ModelAndView addDetails(StaffEntity ste) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("staffDetails",ste);
		mv.setViewName("Added.html");
		stf.save(ste);
		return mv;
		
	}
	@RequestMapping("/home")
	public ModelAndView home() {
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("Home.html");
		return mv;
		
	}
	
}
