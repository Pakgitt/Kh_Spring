package kh.mclass.test1.sub;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kh.mclass.test1.sub.model.dto.TestDto;

@Controller
public class TestController {
//	private TestService ts = new TestService();
	@Autowired
//	Component 이름으로 Autowired 첫글자 소문자 
	private TestService testService;
//	@RequestMapping (method = RequestMethod.GET, path = "/test")
//	@Qualifier(value = "testDto")
	@Autowired
	private TestDto testDto;
	@GetMapping ("/test")
	public String method1(
			@RequestParam(defaultValue = "aaa", required = false, name = "a") String b,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession ss,
			Locale locale,
			Model model) {
		System.out.println("여기서 testDto 확인");
		System.out.println(testDto);
		System.out.println(b);
		System.out.println(request.getParameter("a"));
		request.getSession().setAttribute("b", "���ǰ�");
		ss.setAttribute("c", "���żżżż�");
		
//		try {
//			response.sendRedirect("/");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		request.setAttribute("serverTime", "�׽�Ʈ��Ʈ�ѷ�"+ testService.msthod1() + formattedDate);
		return "home";
	}
	
}
