package assignments;

public class Assignment7_ConditionalStatements {
	public static void main(String[] args) {
		
	String customerName = "John Doe";
	int creditScore = 720;
	double income = 55000.0;
	boolean isEmployed = true;
	double debtToIncomeRatio = 35.0;
	
	System.out.println("Evaluation for : "+ customerName);
	
	if(creditScore>750) {
	
		System.out.println("Excellent credit score, your is 'Loan Appored'");
	}
	else if(creditScore >=650){
		//If credit score is between 650 and 750, futher checks needed
		//step-2 check income
		if(income >=55000) {
		//if income is at least 55000, check employment status
			if(isEmployed) {
				//check debt to income ratio
				if(debtToIncomeRatio <=35.0) {
					//If debt to income ratio is less than or equal to 35% approve loan
					System.out.println("Loan Approved :- checked all criteria");
					
				}else {
					// If debt is greater than 35%, deny the loan
					System.out.println("Loan Denied : debt is greater than 35%");
				}
			}else {
				//If customer is unemployed , deny the loan
				System.out.println("Loan Denied : Income is less than required");
			}
		}else {
			//If credit score is less than 650, deny the loan
			System.out.println("Loan Denied : credit score is less than required");
		}
	}
}
}
