package kh.mclass.test1.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor{
	// preHandle() : 실제 controller(handler)가 실행되기 전에 실행되며 boolean 타입의 값을 return
	// true면 요청한 handle을 처리하고 false면 처리 X
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("제하하하하");
		// session 객체를 가져옴
		HttpSession session = request.getSession();
		// login 처리를 담당하는 사용자 정보를 담고 있는 객체를 가져옴
		Object obj = session.getAttribute("sslogin");
		
		// 로그인 X
		if (obj == null) {
			response.sendRedirect(request.getContextPath()+"/login");
			// 더이상 컨트롤러 요청으로 가지 않도록 false 반환
			return false;
		}else {
			// preHandle의  return은 컨트롤러 요청 url로 가도 되냐 안되냐를 허가하는 의미
			// 따라서 true일 경우 url로 가게됨
			return true;
		}
	}
}
