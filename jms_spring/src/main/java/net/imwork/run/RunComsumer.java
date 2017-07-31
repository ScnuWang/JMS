package net.imwork.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jason.
 * Date 2017/7/31 15:12
 */
public class RunComsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("comsumer.xml");
    }
}
