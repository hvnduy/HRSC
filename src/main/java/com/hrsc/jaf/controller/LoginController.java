/*
 * $Id: LoginController.java,v 1.3 2015/01/14 20:14:39  Exp $
 *
 * Copyright (c) 2015 MAG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of MAG.
 */
package com.hrsc.jaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for the Login screen.
 * @author
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private static final String LOGIN_TILE = "login.tile";

	@Autowired
	private StandardEnvironment environment;

	/**
	 * Handles any login case.
	 * @param logout
	 *            boolean whether the user has just logged out
	 * @param fail
	 *            boolean whether the user has failed a login attempt
	 * @param model
	 *            ModelMap Spring's model to which to add the logout and failure
	 *            flags
	 * @return the tile for the login page
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String showLogin(@RequestParam(required = false) boolean logout, @RequestParam(required = false) boolean fail, ModelMap model) {
		String[] profs = this.environment.getActiveProfiles();
		if (profs.length > 0)
			model.addAttribute("env", profs[0]);
		model.addAttribute("showLogout", logout);
		model.addAttribute("showFailure", fail);
		return LOGIN_TILE;
	}

}
