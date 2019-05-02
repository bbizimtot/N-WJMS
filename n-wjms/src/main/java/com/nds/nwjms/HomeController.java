package com.nds.nwjms;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nds.nwjms.service.Admin_infoService;
import com.nds.nwjms.service.MemberService;
import com.nds.nwjms.vo.Admin_infoVO;
import com.nds.nwjms.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Resource(name = "admin_infoService")
	private Admin_infoService admin_infoService;
	@Resource(name = "MemberService")
	private MemberService memberService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/admin_infoList.do")
	public String admin_infoList(Locale locale, Model model) throws Exception {
		List<Admin_infoVO> list = admin_infoService.selectAdmin_infoList();
		// logger.info(list.toString());
		model.addAttribute("list", list);
		return "admin_infoList";
	}

	// 로그인 처리하는 부분
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, MemberVO membervo) throws Exception {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			// 기존에 login이란 세션 값이 존재한다면
			session.removeAttribute("login"); // 기존값을 제거해 준다.
		}

		// 로그인이 성공하면 UserVO 객체를 반환함.
		MemberVO mvo = memberService.memberlogin(membervo);
		
		if (mvo != null) { // 로그인 성공
			session.setAttribute("login", mvo); // 세션에 login인이란 이름으로 UserVO 객체를 저장해 놈.
			returnURL = "redirect:/admin_infoList.do"; // 로그인 성공시 게시글 목록페이지로 바로 이동하도록 하고
		} else { // 로그인에 실패한 경우
			returnURL = "redirect:/login"; // 로그인 폼으로 다시 가도록 함
		}

		return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴
	}

	// 로그인 폼을 띄우는 부분
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginform"; // /login/loginForm.jsp를 띄움.
	}// end of loginForm

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		System.out.println("hi");
		System.out.println("bye");
		System.out.println("한글 테스트");
		System.out.println("dd");
		System.out.println("dfd");
		System.out.println("hi2");

		return "loginform";
	}
}
