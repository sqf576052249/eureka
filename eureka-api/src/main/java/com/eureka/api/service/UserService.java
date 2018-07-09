package com.eureka.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eureka.api.model.UserVO;
import com.eureka.api.result.RestArrayResult;
import com.eureka.api.result.RestObjectResult;

@FeignClient(name="eureka-provider")
public interface UserService {


    
    @RequestMapping(value = "/user/getUsers")
    public RestObjectResult<UserVO> getUsers(@RequestParam(value = "userName",required =false) String userName);
    
    @RequestMapping(value = "/user/listUsers")
    public RestArrayResult<UserVO> listUsers(@RequestParam("userName") String userName);

}
