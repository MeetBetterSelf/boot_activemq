package toutiao.miaoji.boot_activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * 类功能描述：
 * ActiveMQ配置类
 * @author：喵吉爱科技
 * @createTime：2019/8/1 17:45
 */
@Configuration
@EnableJms
public class ActivieMQConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("miaoji.queue.msg");
    }
    @Bean
    public Topic topic() {
        return new ActiveMQTopic("miaoji.topic.msg");
    }
}
