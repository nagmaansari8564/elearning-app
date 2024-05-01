package springpro;

public class BillCollector {

	
	private IPayment payment ;
	
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}



	public BillCollector(IPayment payment) {
		super();
		this.payment = payment;
	}



	public void payBill(double amt) {
		  String s= payment.pay(amt);
		  System.out.println(s);
		 
  }
}
