package org.lnut.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @Auther ZhaoXin
 * @Date 2020/9/2
 */
@Component
@RabbitListener(queues = "direct")
public class RabbitTest {


    @RabbitHandler
    public void rabbitReceive(String msg) {
        System.out.println(msg);
    }

}
