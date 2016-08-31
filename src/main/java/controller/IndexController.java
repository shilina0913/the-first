package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("dfjkdfskds")
	public ModelAndView index(){
		ModelAndView reAndView = new ModelAndView();
		reAndView.setViewName("/index.jsp");
		return reAndView;
	}
}
