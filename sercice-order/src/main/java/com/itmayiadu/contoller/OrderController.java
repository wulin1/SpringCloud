package com.itmayiadu.contoller;

import com.itmayiadu.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMemberService orderMemberService;
    @RequestMapping("/getOrderByUserList")
    public List<String> getOrderByUserList()
    {
        System.out.println("调用会员服务");
        return  orderMemberService.getOrderByUserList();
    }
    @RequestMapping("/OrderMemberServiceApi")
        public String OrderMemberServiceApi(){
        return "是个order工程";
        }

}
