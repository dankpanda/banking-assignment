package myPackage;
import java.util.ArrayList;
public class Bank {
	private  ArrayList<Customer> customers = new ArrayList<Customer>();
	private int numberOfCustomers = 0;
	private String bankName;
	
	public Bank(String name) {
		this.bankName = name;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		numberOfCustomers++;
	}
	
	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return this.customers.get(index);
	}
	
	public String getBankName() {
		return this.bankName;
	}
}
