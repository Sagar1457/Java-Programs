package spring.sample;

public class BillPayment 
{
	Payment payment;
	
	BillPayment()
	{
		System.out.println("Bill Payment obj created");
	}

	public BillPayment(Payment payment) {
		super();
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	void paybill(int amt)
	{
		payment.payamt(amt);
	}

}
