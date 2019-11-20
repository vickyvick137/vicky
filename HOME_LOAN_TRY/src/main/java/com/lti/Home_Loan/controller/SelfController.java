package com.lti.Home_Loan.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.Home_Loan.entity.Self;
import com.lti.Home_Loan.service.SelfService;

@Controller
public class SelfController {

	private SelfService selfService;

	public SelfController() {

	}

	@Autowired
	public SelfController(SelfService selfService) {
		this.selfService = selfService;
	}


	@RequestMapping(value = { "/", "/Self" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Self");
		return mv;
	}
	@RequestMapping(value = "/Self", method = RequestMethod.GET)
	public ModelAndView displayNewUserForm() {
		ModelAndView mv = new ModelAndView("Self");
		mv.addObject("headerMessage", "Add Registration Details");
		mv.addObject("self", new Self());
		return mv;
	}

	@RequestMapping(value = "/Self", method = RequestMethod.POST)
	public ModelAndView saveNewUser(@ModelAttribute Self self, BindingResult result) {
		ModelAndView mv = new ModelAndView("/home");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = selfService.saveUser(self);
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
}
