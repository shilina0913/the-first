package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping("fir")
	public ModelAndView index(){
		ModelAndView reAndView = new ModelAndView();
		reAndView.setViewName("/index.jsp");
		return reAndView;
	}
}
