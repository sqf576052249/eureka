package com.eureka.provider.eurekaprovider.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.api.model.UserVO;
import com.eureka.api.result.RestArrayResult;
import com.eureka.api.result.RestObjectResult;
import com.eureka.api.service.UserService;

@RestController
public class UserRestConroller implements  UserService
{

	@Override
	@RequestMapping(value = "/user/getUsers")
	public RestObjectResult<UserVO> getUsers(@RequestParam("userName") String userName) {
		System.out.println(userName);
		UserVO user = new UserVO();
		user.setUserName(userName);
		user.setAge(26);
		user.setSex("男");
		return new RestObjectResult<UserVO>(user);
	}

	@Override
	@RequestMapping(value = "/user/listUsers")
	public RestArrayResult<UserVO> listUsers(String userName) {
		List<UserVO> list = new ArrayList<UserVO>();
		for(int i= 0 ;i<10;i++){
			UserVO user = new UserVO();
			user.setUserName(userName);
			user.setAge(20+i);
			user.setSex("男");
			list.add(user);
		}
		return new RestArrayResult<UserVO>(list);
	}
	
	

}
