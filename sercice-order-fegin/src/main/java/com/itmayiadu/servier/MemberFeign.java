package com.itmayiadu.servier;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("service-member")
public interface MemberFeign {
	@RequestMapping("/getUserList")
	public List<String> getOrderByUserList();
}