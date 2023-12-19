package spring.sample;

public class CashPayment implements Payment
{
	CashPayment()
	{
		System.out.println("cashpayment obj created");
	}
    
	public void payamt(int amt)
	{
		System.out.println("Cash Payment of "+amt+" is successfully done");
	}

}
