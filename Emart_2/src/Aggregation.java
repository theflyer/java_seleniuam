
public class Aggregation {

	
	public static class RRAccount{
		private String customerName;
		private Address address;
		private double depositAmount;
		
		RRAccount (String name, Address addr, double amount){
			this.customerName=name;
			this.address = addr;
			this.depositAmount=amount;
			
			display();
			
		}
		public String getcustomerName(){
			return this.customerName;
		}
		
		public Address getAddress(){
			return this.address;
		}
		
		public double getDepositAmount(){
			return this.depositAmount;
		}
		
		public boolean isValidAddress(){
			int pin = this.address.getPinCode();
			int len = String.valueOf(pin).length();
			
			if (len < 6){
				return false;
			}
			return true;
		}
		
		public void display(){
			if (!isValidAddress()){
				System.out.println("the zipcode you entered you entered is invalid !!!!!");
			}else{
				System.out.println("*******Customer Deltails*******");
				System.out.println("Name: "+this.customerName);
				System.out.println("Address: "+ this.address.getFirstline() + "," + this.address.getCity()+", "+this.address.getState() + ", "+ this.address.getPinCode());
				System.out.println("Deposit Amount: "+ this.depositAmount);
				
			}
		}
		
	}
	
	public static class Address{
		private String firstline;
		private String secondline;
		private String city;
		private String state;
		private int pinCode;
		
		Address(String fl, String sl, String city, String state, int pin){
			this.firstline=fl;
			this.secondline=sl;
			this.city=city;
			this.state = state;
			this.pinCode=pin;
		}

		public String getFirstline() {
			return firstline;
		}

		public String getSecondline() {
			return secondline;
		}

		public String getCity() {
			return city;
		}

		public String getState() {
			return state;
		}

		public int getPinCode() {
			return pinCode;
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address("No.123","9th Cross","Jamaica","NY",11432);
		Address add2 = new Address("No.12","12th Cross","Jamaica","NY",114322);

		RRAccount ra1 = new RRAccount("rajesh",add1,30000.0);
		RRAccount ra2 = new RRAccount("rakesh",add2,30000.0);
		
	}

}
