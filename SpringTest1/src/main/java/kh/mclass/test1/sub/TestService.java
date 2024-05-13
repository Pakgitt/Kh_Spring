package kh.mclass.test1.sub;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {
	public String msthod1() {
		return "Service return";
	}
}
