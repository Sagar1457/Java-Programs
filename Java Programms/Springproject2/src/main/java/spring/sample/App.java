package spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context =new ClassPathXmlApplicationContext("spring.cfg.xml");
    	 BillPayment blp=context.getBean("billpayment",BillPayment.class);
    	 blp.paybill(1000);

    }
}
