
public class Association {

	
	public static class FDAccount{
		private int accountid;
		private float balance;
		
		FDAccount(int id, float balance){
			this.accountid=id;
			this.balance=balance;
			display();
			
		}

		public void setAccountid(int accountid) {
			this.accountid = accountid;
		}

		public int getAccountid() {
			return accountid;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}
		
		public void updateBalance(InterestCalculator interestCalc){
			float intrst = interestCalc.calculateInterest(this.balance);
			
			this.balance = this.balance + (intrst/100);
		}
		
		public void display(){
			System.out.println("Your FD account is created with interest amount.");
			System.out.println("Your current balance is : "+ this.balance);
		}
	}
	
	public static class  InterestCalculator{
		private int timeInYears;
		private float rateOfInterest;
		
	    InterestCalculator(int timeInYears, float rateOfInterest) {
			//super();
			this.timeInYears = timeInYears;
			this.rateOfInterest = rateOfInterest;
		}

		public int getTimeInYears() {
			return timeInYears;
		}

		public float getRateOfInterest() {
			return rateOfInterest;
		}

		public void setTimeInYears(int timeInYears) {
			this.timeInYears = timeInYears;
		}

		public void setRateOfInterest(float rateOfInterest) {
			this.rateOfInterest = rateOfInterest;
		}
	    
		public float calculateInterest(float principal){
			return (principal*this.rateOfInterest*this.timeInYears)/100;
		}
		
		
		
	}
	public static void main(String[] args) {
		
		InterestCalculator in1 = new InterestCalculator(1,(float) 8.4);
		FDAccount fd1= new FDAccount(1010,50000);
		fd1.updateBalance(in1);
		fd1.display();
		
		
		// TODO Auto-generated method stub
		
	}

}
