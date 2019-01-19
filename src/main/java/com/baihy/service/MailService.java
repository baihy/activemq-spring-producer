package com.baihy.service;

import com.baihy.domain.MailContent;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.service
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 15:31
 */
public interface MailService {

    boolean sendMessage(MailContent mailContent);
}
