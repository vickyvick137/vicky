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

import com.lti.Home_Loan.entity.Register;
import com.lti.Home_Loan.service.RegisterService;


@Controller
public class RegisterController {
	// Constructor based Dependency Injection
	private RegisterService registerService;

	public RegisterController() {

	}

	@Autowired
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}


	@RequestMapping(value = { "/", "/Register" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Register");
		return mv;
	}

	// Get All Users
/*	@RequestMapping(value = "/allUsers", method = RequestMethod.POST)
	public ModelAndView displayAllUser() {
		System.out.println("User Page Requested : All Users");
		ModelAndView mv = new ModelAndView();
		List<Author> userList = userService.getAllUsers();
		mv.addObject("userList", userList);
		mv.setViewName("allUsers");
		return mv;
	}*/

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public ModelAndView displayNewUserForm() {
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("headerMessage", "Add Registration Details");
		mv.addObject("register", new Register());
		return mv;
	}

	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public ModelAndView saveNewUser(@ModelAttribute Register register, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/Self");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = registerService.saveUser(register);
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
/*
	@RequestMapping(value = "/editUser/{id}", method = RequestMethod.GET)
	public ModelAndView displayEditUserForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("/editUser");
		Author user = userService.getUserById(id);
		mv.addObject("headerMessage", "Edit User Details");
		mv.addObject("user", user);
		return mv;
	}

	@RequestMapping(value = "/editUser/{id}", method = RequestMethod.POST)
	public ModelAndView saveEditedUser(@ModelAttribute Author user, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/home");

		if (result.hasErrors()) {
			System.out.println(result.toString());
			return new ModelAndView("error");
		}
		boolean isSaved = userService.saveUser(user);
		if (!isSaved) {

			return new ModelAndView("error");
		}

		return mv;
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUserById(@PathVariable Long id) {
		boolean isDeleted = userService.deleteUserById(id);
		System.out.println("User deletion respone: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/home");
		return mv;

	}*/

}
