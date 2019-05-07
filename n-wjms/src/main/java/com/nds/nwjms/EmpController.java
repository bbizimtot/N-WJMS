package com.nds.nwjms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("emp")
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
  
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/empmain", method = RequestMethod.GET)
	public String empmain() {
		System.out.println("##################################");
		return "employee/EmpMain";
	}
	
	@RequestMapping(value = "/empmypage", method = RequestMethod.GET)
	public String empmypage() {
		return "employee/EmpMypage";
	}
}
