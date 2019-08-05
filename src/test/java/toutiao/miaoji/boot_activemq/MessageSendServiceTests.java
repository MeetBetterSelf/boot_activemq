package toutiao.miaoji.boot_activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import toutiao.miaoji.boot_activemq.service.IMessageSendService;

import java.util.concurrent.TimeUnit;

/**
 * 类功能描述：
 * 测试类
 * @author：喵吉爱科技
 * @createTime：2019/8/5 17:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageSendServiceTests {
    @Autowired
    private IMessageSendService messageSendService;

    @Test
    public void testSendMessage() throws Exception {
        for (int x = 0 ; x < 10 ; x ++) {
            this.messageSendService.sendMessageTopic("message - " + x);
        }
        TimeUnit.SECONDS.sleep(2);
    }
}
