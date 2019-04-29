package com.nds.nwjms;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.Admin_infoService;
import com.nds.nwjms.vo.Admin_infoVO;

/**
 * Handles requests for the application home page.
 */


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name ="admin_infoService") 
	private Admin_infoService admin_infoService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/admin_infoList.do")
	public String admin_infoList(Locale locale, Model model) throws Exception {
		List<Admin_infoVO> list = admin_infoService.selectAdmin_infoList();
		//logger.info(list.toString());
		model.addAttribute("list",list);
		return "admin_infoList";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("hi");
		System.out.println("bye");
		System.out.println("한글 테스트");
		System.out.println("dd");
		
		return "home";
	}
	
	@RequestMapping(value = "/empInfo")
	public String emp_info(Locale locale) {
		return "manager_empInfo";
	}
	
	@RequestMapping(value = "/rstrntInfo")
	public String rstrnt_Info(Locale locale) {
		return "manager_rstrntInfo";
	}
	
}
