package com.baihy.controller;

import com.baihy.domain.MailContent;
import com.baihy.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.controller
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 14:45
 */
@Controller
public class MailController {


    @Autowired
    private MailService mailService;

    @RequestMapping(value = {"sendMessage"}, method = {RequestMethod.GET})
    @ResponseBody
    public String sendMessage(MailContent content) {
        if (mailService.sendMessage(content)) {
            return "sunccess";
        }
        return "failed";
    }

}
