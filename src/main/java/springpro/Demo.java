package springpro;

public class Demo {

	
	public static void main(String agrs[]){
		BillCollector bc=new BillCollector(new CreditCard());
//		bc.setPayment(new DbitCard());
		bc.payBill(3748.9);
	}
}
