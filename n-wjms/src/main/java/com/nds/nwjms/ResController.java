package com.nds.nwjms;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.Rstrnt_infoService;


/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("res")
public class ResController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Resource(name="rstrnt_infoService")
	private Rstrnt_infoService rstrnt_infoSerivce;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/resmain", method = RequestMethod.GET)
	public String empmain(Model model) throws Exception {
		
		return "restaurant/ResMain";
	}
	
	@RequestMapping(value = "/empmypage", method = RequestMethod.GET)
	public String empmypage() throws Exception {
		return "employee/EmpMypage";
	}
}
