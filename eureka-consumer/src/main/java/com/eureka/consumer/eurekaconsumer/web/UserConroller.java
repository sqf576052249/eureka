package com.eureka.consumer.eurekaconsumer.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eureka.api.model.UserVO;
import com.eureka.api.result.Paginator;
import com.eureka.api.result.RestArrayResult;
import com.eureka.api.result.RestObjectResult;
import com.eureka.api.result.RestPaginatorResult;
import com.eureka.api.service.UserService;

@Controller
public class UserConroller {

	@Autowired 
	private UserService userService;
	
	@RequestMapping(value = "/user/getUsers")
	@ResponseBody
	public RestObjectResult<UserVO> getUsers(  String userName) {
		UserVO user = new UserVO();
		user= userService.getUsers(userName).getData();
		return new RestObjectResult<UserVO>(user);
	}
	
	@RequestMapping(value = "/user/listUsers")
	@ResponseBody
	public RestArrayResult<UserVO> listUsers(  String userName) {
		List<UserVO> userVOs = new ArrayList<>();
		userVOs= userService.listUsers(userName).getData();
		return new RestArrayResult<UserVO>(userVOs);
	}
	
	@RequestMapping(value = "/user/pageUsers")
	@ResponseBody
	public RestPaginatorResult<UserVO> pageUsers(  String userName) {
		List<UserVO> userVOs = new ArrayList<>();
		userVOs= userService.listUsers(userName).getData();
		Paginator<UserVO> page = new Paginator<>(1,10,10,userVOs);
		return new RestPaginatorResult<UserVO>(page);
	}

}
