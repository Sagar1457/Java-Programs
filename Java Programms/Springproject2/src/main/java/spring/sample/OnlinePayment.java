package spring.sample;

public class OnlinePayment implements Payment
{
	OnlinePayment()
	{
		System.out.println("onlinepayment obj created");
	}
    
	public void payamt(int amt)
	{
		System.out.println("Online Payment of "+amt+" is successfully done");
	}

}
