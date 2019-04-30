package com.nds.nwjms;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.Admin_infoService;
import com.nds.nwjms.service.Emp_infoService;
import com.nds.nwjms.service.Rstrnt_infoService;
import com.nds.nwjms.vo.Admin_infoVO;
import com.nds.nwjms.vo.Emp_infoVO;
import com.nds.nwjms.vo.Rstrnt_infoVO;

/**
 * Handles requests for the application home page.
 */


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Resource(name ="admin_infoService") 
	private Admin_infoService admin_infoService;
	
	@RequestMapping(value = "/admin_infoList.do")
	public String admin_infoList(Locale locale, Model model) throws Exception {
		List<Admin_infoVO> list = admin_infoService.selectAdmin_infoList();
		//logger.info(list.toString());
		model.addAttribute("list",list);
		return "admin_infoList";
	}
	
	@Resource(name="emp_infoService")
	private Emp_infoService emp_infoService;
	
	
	@RequestMapping(value = "/empInfo")
	public String emp_info(Locale locale, Model model) throws Exception{
		List<Emp_infoVO> list = emp_infoService.selectEmp_infoList();
		model.addAttribute("list",list);
		return "manager_empInfo";
	}
	
	@Resource(name="rstrnt_infoService")
	private Rstrnt_infoService rstrnt_infoSerivce;
	
	@RequestMapping(value = "/rstrntInfo")
	public String rstrnt_Info(Locale locale, Model model) throws Exception {
		List<Rstrnt_infoVO> list = rstrnt_infoSerivce.selectRstrnt_infoList();
		model.addAttribute("list", list);
		return "manager_rstrntInfo";
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
		System.out.println("dfd");
		System.out.println("hi2");
		
		return "home";
	}
	
	
	
}
