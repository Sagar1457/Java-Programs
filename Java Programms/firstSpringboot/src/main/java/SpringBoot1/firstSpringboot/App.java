package SpringBoot1.firstSpringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring.cfg.xml");
    	SpringBootexam s1=(SpringBootexam)context.getBean("student1");
    	System.out.println(s1);
    }

}
