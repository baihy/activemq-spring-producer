package com.baihy.service.impl;

import com.baihy.domain.MailContent;
import com.baihy.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @projectName: activemq-spring
 * @packageName: com.baihy.service
 * @description:
 * @author: huayang.bai
 * @date: 2019/01/18 15:32
 */
@Service
public class MailServiceImpl implements MailService {

    /**
     * 注入jmsTemplate
     */
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public boolean sendMessage(MailContent mailContent) {
        boolean result = false;
        /**
         * 注意：ActiveMQ发送消息的send方法是没有返回值，判断发送消息是成功还是失败，是根据是否发生异常来判断的。
         */
        try {
            /**
             * template自动将消息发送给MOM容器中
             */
            jmsTemplate.send((session) -> session.createObjectMessage(mailContent));
            result = true;
        } catch (JmsException e) {
            e.printStackTrace();
        }
        return result;
    }
}
