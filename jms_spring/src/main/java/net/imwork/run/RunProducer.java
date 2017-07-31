package net.imwork.run;

import net.imwork.jms.producer.ProducerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jason.
 * Date 2017/7/31 12:46
 */
public class RunProducer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
//            producerService.sendMessage("Hello JMS -- Queue-->"+i);
            producerService.sendMessage("Hello JMS -- Topic-->"+i);
        }
        context.close();
    }
}
