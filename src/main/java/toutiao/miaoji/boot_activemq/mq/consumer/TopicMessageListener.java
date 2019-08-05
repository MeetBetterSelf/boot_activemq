package toutiao.miaoji.boot_activemq.mq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/1 17:23
 */
@Component
public class TopicMessageListener {

    @JmsListener(destination = "miaoji.topic.msg")
    public void receiveMessage(String msg) {
        System.out.println("### topic接收消息 ### " + msg);
    }

}
