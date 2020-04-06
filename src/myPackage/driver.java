package myPackage;

public class driver {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(5000);
		System.out.println(acc1.withdraw(7000));
		System.out.println(acc1.deposit(-1));
		System.out.println(acc1.getBalance());
		
		Customer cs1 = new Customer("Test", "Name");
		cs1.setAccount(acc1);
		System.out.println(cs1.getAccount());
		
		Bank b1 = new Bank("test bank");
		b1.addCustomer(cs1);
		System.out.println(b1.getNumOfCustomers());
		System.out.println(b1.getCustomer(0));
	}

}
