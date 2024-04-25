package com.project.schoolManagement.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.schoolManagement.entity.PayRollEntity;
import com.project.schoolManagement.entity.PayrollModel;
import com.project.schoolManagement.repos.PayRollDAO;
@Controller
public class Payrollcontrol  {
	
	@Autowired
	PayRollDAO payrepo;
//	private static final long serialVersionUID = 1L;
//
//	@PostMapping("/Payrollcontrol")
//	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
//		String optionValue=request.getParameter("classValue");
//		System.out.println(optionValue);
//		String optionValue1=request.getParameter("secValue");
//		System.out.println(optionValue1);
//		String optionValue2=request.getParameter("yearValue");
//		System.out.println(optionValue2);
//	}
	@RequestMapping("/payroll")
	public ModelAndView home1() {
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("Payroll.html");
		return mv;
	}
	
	@PostMapping("/Payrollcontrol")
	public ModelAndView userRegistration(@ModelAttribute PayrollModel user, Model model) {
		 ModelAndView mv = new ModelAndView();
		model.addAttribute("Class", user.getClassValue());
		model.addAttribute("Section", user.getSecValue());
		model.addAttribute("Year", user.getYearValue());
		int year=Integer.parseInt(user.getYearValue());
		List<PayRollEntity> datalist= payrepo.findAllByPayRoll(user.getClassValue(), user.getSecValue(), year);
		mv.addObject("Datalist",datalist);
		mv.setViewName("Payroll.html");
		return mv;
	}

	
	
}
