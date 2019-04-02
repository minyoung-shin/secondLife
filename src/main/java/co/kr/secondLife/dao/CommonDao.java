package co.kr.secondLife.dao;

import org.springframework.stereotype.Repository;

import co.kr.secondLife.vo.UserVO;

@Repository
public interface CommonDao {

	public int selectUser(UserVO param) throws Exception;
	public int insertUser(UserVO param) throws Exception;
	
}
