package toutiao.miaoji.boot_activemq.service;

/**
 * 类功能描述：
 *
 * @author：喵吉爱科技
 * @createTime：2019/8/1 17:51
 */
public interface IMessageSendService {
    void sendMessageQueue(String msg);
    void sendMessageTopic(String msg);
}
