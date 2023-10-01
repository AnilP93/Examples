package stringexamples;
public class Assignment13 {
	String userName;
	int debitCount, creditCount, printCount;
	int balance;
	static int debitAllCount;
	static int creditAllCount;
	static int printAllCount;
	
	void debitAmount(int amount) {
		debitCount++;
		debitAllCount++;
		if (amount<balance) {
		balance= balance - amount;
		} else {
			System.out.println("Insufficient balance");
		}
		printBalance();
	}
	
	void creditAmount(int amount) {
		creditCount++;
		creditAllCount++;
		balance= balance+ amount;
		//printBalance();
	}
	void printBalance() {
		printCount++;
		printAllCount++;
		System.out.println(balance);
		System.out.println(creditCount);
		System.out.println(debitCount);
		System.out.println(printCount);

	}
	
	void individualTransactionSummary() {
		System.out.println("credit-"+ creditCount+"debit-"+debitCount +"print balance-"+printCount);
	}
	
	static void allTransactionSummary() {
		System.out.println("All credit-"+ creditAllCount+"All debit-"+debitAllCount +"All print balance-"+printAllCount);

	}
	
	void setUserDetails(String userName, int balance) {
		this.userName= userName;
		this.balance= balance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment13 user1 = new Assignment13();
		user1.setUserDetails("Anil", 5000);
		user1.creditAmount(1000);
		user1.debitAmount(500);
		user1.creditAmount(1500);
		Assignment13 user2 = new Assignment13();
		user2.setUserDetails("Snil", 1000);
		user2.creditAmount(100);
		user2.debitAmount(300);
		user1.individualTransactionSummary();
		user2.individualTransactionSummary();
		allTransactionSummary();
		//Assignment13 user2 = new Assignment13();
		//user2.debitAmount(1000);
	}

}
