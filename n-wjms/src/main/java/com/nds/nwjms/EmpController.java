package com.nds.nwjms;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.Rstrnt_infoService;
import com.nds.nwjms.vo.Rstrnt_infoVO;


/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("emp")
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Resource(name="rstrnt_infoService")
	private Rstrnt_infoService rstrnt_infoSerivce;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/empmain", method = RequestMethod.GET)
	public String empmain(Model model) throws Exception {
		List<Rstrnt_infoVO> list = rstrnt_infoSerivce.selectRstrnt_infoList();
		JSONArray jsonArray = new JSONArray(list);
		model.addAttribute("list", jsonArray);
		System.out.println("##################################");
		return "employee/EmpMain";
	}
	
	@RequestMapping(value = "/empmypage", method = RequestMethod.GET)
	public String empmypage() throws Exception {
		return "employee/EmpMypage";
	}
}
