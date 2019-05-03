package com.nds.nwjms;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.MemberService;
import com.nds.nwjms.vo.MemberVO;


/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("emp")
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
  
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/empmain", method = RequestMethod.GET)
	public String empmain() {
		return "employee/EmpMain";
	}
}
