package com.itmayiadu.contoller;

import com.itmayiadu.servier.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderFeignContorller {
    @Autowired
  private MemberFeign memberFeign;
    @RequestMapping("/getOrderByUserList")
    public List<String> getOrderByUserList(){
        System .out.println("Feign调用member工程");
        return memberFeign.getOrderByUserList();
    }


}
