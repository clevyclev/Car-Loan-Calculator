public class CarLoan {
	public static void main(String[] args) {
		int carLoan = 50000;
    int loanLength = 6;
    int interestRate = 2;
    int downPayment = 0;
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error!  You must take out a valid car loan.");
    } else if (downPayment >= carLoan){
      System.out.println("The car could be paid in full.  Loan not necessary.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = 12 * loanLength;
      int monthlyBalance = remainingBalance/months;
      int interest = (monthlyBalance * interestRate)/100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
    
	

	}
}