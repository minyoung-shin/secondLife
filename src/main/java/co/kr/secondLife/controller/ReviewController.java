package co.kr.secondLife.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewController {

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
    
	@RequestMapping(value = "/review/list", method = RequestMethod.GET)
    public String review(Locale locale, Model model) throws Exception {
    	return "review/list";
    }
	
	@RequestMapping(value = "/review/write", method = RequestMethod.GET)
	public String write(Locale locale, Model model) throws Exception {
		return "review/write";
	}
	
}
