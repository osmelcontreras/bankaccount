public class Transactions {

	
	public static void main(String[] args) {
		BankAccount osmel = new BankAccount();
		osmel.deposit(5.0); 
		
		
		BankAccount osmel1 = new BankAccount();
		osmel1.debit(1.50);		
		
		System.out.println("Deposit: $" + osmel.getCurrentBalance());
		System.out.println("Debit: $"+ osmel1.getDebit());
	}

}
