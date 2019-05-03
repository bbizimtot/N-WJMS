package com.nds.nwjms;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
  
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Resource(name ="admin_infoService") 
	private Admin_infoService admin_infoService;
	@Resource(name="emp_infoService")
	private Emp_infoService emp_infoService;
	@Resource(name="rstrnt_infoService")
	private Rstrnt_infoService rstrnt_infoSerivce;

	@RequestMapping(value = "/admin_infoList.do")
	public String admin_infoList(Locale locale, Model model) throws Exception {
		List<Admin_infoVO> list = admin_infoService.selectAdmin_infoList();
		// logger.info(list.toString());
		model.addAttribute("list", list);
		return "admin_infoList";
	}
	
	@RequestMapping(value = "/empInfo")
	public String emp_info(Locale locale, Model model) throws Exception{
		List<Emp_infoVO> list = emp_infoService.selectEmp_infoList();
		model.addAttribute("list",list);
		return "admin_empInfo";
	}
	
	@RequestMapping(value = "/rstrntInfo")
	public String rstrnt_Info(Locale locale, Model model) throws Exception {
		List<Rstrnt_infoVO> list = rstrnt_infoSerivce.selectRstrnt_infoList();
		model.addAttribute("list", list);
		return "admin_rstrntInfo";
	}
}
