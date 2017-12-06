package com.pcitech.fnetserver;

import java.util.List;

import cn.hotapk.fhttpserver.NanoHTTPD;
import cn.hotapk.fhttpserver.annotation.RequestBody;
import cn.hotapk.fhttpserver.annotation.RequestMapping;
import cn.hotapk.fhttpserver.annotation.RequestParam;
import cn.hotapk.fhttpserver.annotation.ResponseBody;

/**
 * @author laijian
 * @version 2017/12/3
 * @Copyright (C)上午12:29 , www.hotapk.cn
 */
public class UserController {

    @ResponseBody
    @RequestMapping("userls")
    public NanoHTTPD.Response getUserLs() {
        return setResponse("ddddd");
    }

    @RequestMapping("adduser")
    public NanoHTTPD.Response addUser(@RequestBody List<UserBean> userBean) {
//        System.out.println("====="+userBean.getPassw());
        return setResponse("ddddd");
    }

    @RequestMapping("edituser")
    public NanoHTTPD.Response editUser(@RequestParam("userName") String userName, @RequestParam("id") int id) {
        System.out.println("userName===" + userName + "--id==" + id);
        return setResponse("ddddd");
    }

    public static NanoHTTPD.Response setResponse(String res) {
        return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/octet-stream", res);
    }

}
