package assignments;

public class Assignment8 {

	public static void main(String[] args) {
    int[] transactions = {5000,-2000,3000,-15000,-200,-300,4000,-3000};
    
    int totalCredits = 0;
	int totalDebits = 0;
	int totalCreditAmount = 0;
	int totalDebitAmount = 0;
	int suspiciousTransactions = 0;
	
	for(int amount : transactions) {
		if(amount > 0) {
		totalCredits++;  //increasing the credit transaction count
		totalCreditAmount +=amount;  //add total credited amount
		if(amount >10000) {
			System.out.println("Suspicious credit transaction with Amount : "+ amount);
		}
		}else {
			//It's a debit transaction 
			totalDebits++; //Increasing the debit amount 
			totalDebitAmount -= amount;
			if(amount <- 10000) {
				suspiciousTransactions++;
				System.out.println("Suspicious debit transactions with Amount :"+ amount);
			}
		}
	}
	int finalBalance = totalCreditAmount - totalDebitAmount;

	// Print a summary of the account activity

	System.out.println("Total number of credit transactions: " + totalCredits);
	System.out.println("Total number of debit transactions: " + totalDebits);
	System.out.println("Total amount credited: " + totalCreditAmount);
	System.out.println("Total amount debited: " + totalDebitAmount);
	System.out.println("Final remaining amount in the account: " + finalBalance);
	System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
	}

}
