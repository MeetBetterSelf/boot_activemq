package toutiao.miaoji.boot_activemq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toutiao.miaoji.boot_activemq.mq.producer.MessageSend;
import toutiao.miaoji.boot_activemq.service.IMessageSendService;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;


/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/1 17:52
 */
@Service
public class MessageSendServiceImpl implements IMessageSendService {
    @Resource
    private Topic topic;
    @Resource
    private Queue queue;
    @Autowired
    private MessageSend messageSend;

    @Override
    public void sendMessageQueue(String msg) {
        messageSend.sendMessage(queue,msg);
    }

    @Override
    public void sendMessageTopic(String msg) {
        messageSend.sendMessage(topic,msg);
    }
}
