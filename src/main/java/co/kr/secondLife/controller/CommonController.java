package co.kr.secondLife.controller;

import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import co.kr.secondLife.service.CommonService;
import co.kr.secondLife.vo.UserVO;

@Controller
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
    
	@Autowired
	CommonService commonService;
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		return "login";
	}
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Locale locale, Model model) {
    	return "register";
    }
    
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String, Object> insertUser(Locale locale, Model model, UserVO vo) throws Exception {
    	HashMap<String, Object> map = new HashMap<String, Object>();
    	map.put("result", commonService.insertUser(vo));
    	return map;
    }
    
}
