package com.itmayiadu.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("wulin");
        listUser.add("serverPort:"+serverPort);
        return listUser;
    }
    @RequestMapping("/getMemberServiceApi")
    public String getMemberServiceApi(){
        return "是个order工程";
    }
}
