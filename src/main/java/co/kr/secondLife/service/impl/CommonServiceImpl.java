package co.kr.secondLife.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.secondLife.dao.CommonDao;
import co.kr.secondLife.service.CommonService;
import co.kr.secondLife.vo.UserVO;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	CommonDao common;
	
	@Override
	public int insertUser(UserVO param) throws Exception {
		int result = 0;
		if(common.selectUser(param) == 0) {
			result = common.insertUser(param);
		}
		return result;
	}

}
