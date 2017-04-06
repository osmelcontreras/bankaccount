import java.text.DecimalFormat;      // Import for decimal format
import java.text.NumberFormat;     // Import for number format

public class BankAccount
{
	private static Double currentBalance;     // Customer current balance
	private static String accountNumber;      // Customer account number
	private static String customerName;		// Customer name
	private static String customerAddress;		// Customer address


	public BankAccount() {             // Contractor for the class

	this.currentBalance = 0.00;			// Initial value for the current Balance
	this.accountNumber = "0192837363";			// Account Number as a string
	this.customerName = "Robert Jones";		// Customer name
	this.customerAddress = "128 James St Mont, KY 07043";		// Customer address (Not real)

	}

	public static Double getCurrentBalance() {			//get and return of Current Balance
		return BankAccount.currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {   	// set current Balance
		currentBalance = currentBalance;
	}

	public static String getCustomerAddress() {				// get and return of Customer Address
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) { 		//set Current Address
		this.customerAddress = customerAddress;
	}


	public static String getAccountNumber() {								// get and return Account Number
		return accountNumber;
	}


	public static String getCustomerName() {									//get Customer Name
		return customerName;
	}

	public static Double getDeposit() {
		return (5.00);

	}

	public static Double getDebit(){
		return (1.50);
	}


	public static void deposit(double amount) {     			// deposit amount

		BankAccount.currentBalance +=  amount;						//Deposit amount will increase balance
	}
	public double getBalance() {
		return currentBalance;
	}


	public static void debit(double amount2) {      // Withdraw amount
		if(amount2 <= currentBalance) {
		currentBalance -= amount2;				//Withdraw amount will decrease balance

		}else{

		//System.err.println("Insuffiennt Funds."); // Message to the customer when there is not funds
		BankAccount.currentBalance += amount2;
		}

	}

		public void transfer(double amount, BankAccount otherpayment){
			otherpayment.deposit(amount);
			currentBalance +=  amount;
	}

		public void transfer1(double amount2, BankAccount debitpayment)
 {
			debitpayment.debit(amount2);
			currentBalance += amount2;
	}


	public static void main(String[] args) {

	   BankAccount currentBalance = new BankAccount();
	   BankAccount customerName = new BankAccount();
	   BankAccount accountNumber = new BankAccount();
	   BankAccount customerAddress = new BankAccount();
	   BankAccount osmel = new BankAccount();								//deposit of $5.00
		 osmel.deposit(5.00);
	 	 BankAccount osmel1 = new BankAccount();								//debit is set to $1.50
		 osmel1.debit(1.50);

	   System.out.println("Bank Account");										//Title
	   System.out.println("Customer Name:  " + BankAccount.getCustomerName());    		//Customer name
	   System.out.println("Customer Address: " + BankAccount.getCustomerAddress());     // Customer Address
	   System.out.println("Account Number: " + BankAccount.getAccountNumber());          //Account Number
	   System.out.println("Current Balance:  $"+ (BankAccount.getCurrentBalance() + osmel.getDeposit())); // previous balance of $0.00 with a deposit of $5.00
	   System.out.println("Deposit: $" + osmel.getDeposit());    //Deposit amount
	   System.out.println("Debit: $"+ osmel1.getDebit());        // Debit amount

	}
	}
