package com.nds.nwjms;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nds.nwjms.service.MemberService;
import com.nds.nwjms.vo.MemberVO;


/**
 * Handles requests for the application home page.
 */

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
  
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@Resource(name = "MemberService")
	private MemberService memberService;

	// 로그인 처리하는 부분
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, MemberVO membervo) throws Exception {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			// 기존에 login이란 세션 값이 존재한다면
			session.removeAttribute("login"); // 기존값을 제거해 준다.
		}

		// 로그인이 성공하면 MemverVO 객체를 반환함.
		MemberVO mvo = memberService.memberlogin(membervo);
		
		if (mvo != null) { // 로그인 성공
			session.setAttribute("login", mvo); // 세션에 login인이란 이름으로 MemverVO 객체를 저장해 놈.
			if(mvo.getMember_type().equals("R"))
				returnURL = "redirect:/res/resmain";
			else if(mvo.getMember_type().equals("E"))
				returnURL = "redirect:/emp/empmain";
			else
				returnURL = "redirect:/emp/empmypage";
		} else { // 로그인에 실패한 경우
			returnURL = "redirect:/"; // 로그인 폼으로 다시 가도록 함
		}
		
		return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response, Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("login");
		System.out.println(session.getAttribute("login") + "!!!!!!!!!!!!");
		if ( obj == null ){
			return "common/loginform";
		}
		else
			return "redirect:/emp/empmain";
	}
	
	@RequestMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        session.invalidate();
        ModelAndView mv = new ModelAndView("redirect:/");
        return mv;
    }
}
