package toutiao.miaoji.boot_activemq.mq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * 类功能描述：
 * 该类用于发送不同类型的消息
 * @author：喵吉爱科技
 * @createTime：2019/8/1 17:23
 */
@Component
public class MessageSend {
    private static final Logger logger = LoggerFactory.getLogger(MessageSend.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 定义一个Queue类型的发送消息方法
     * @param queue
     * @param msg
     */
    public void sendMessage(Queue queue, String msg) {
        try {
            logger.info(queue.getQueueName() + " 发送消息：" + msg);
            jmsMessagingTemplate.convertAndSend(queue, msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义一个Topic类型的发送消息方法
     * @param topic
     * @param msg
     */
    public void sendMessage(Topic topic, String msg) {
        try {
            logger.info(topic.getTopicName() + " 发送消息：" + msg);
            jmsMessagingTemplate.convertAndSend(topic, msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
