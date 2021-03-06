//method overloading practice



public class Asif_Travels {
	
	public static class Traveller{
		private String name;
		private String id;
		private double fare = 2000;
		
		Traveller(String name, String id){
			this.name=name;
			this.id=id;
		}

		public String getName() {
			return name;
		}

		public String getId() {
			return id;
		}

		public double getFare() {
			return fare;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setFare(double fare) {
			this.fare = fare;
		}
		
		public void calculateFare(){
			this.fare = this.fare + (this.fare* (11.36/100));
			
		}
		
		public void displayDetails(){
			calculateFare();
			System.out.println("Traveller Details");
			System.out.println("******************************");
			System.out.println("Name: "+ this.name);
			System.out.println("id: "+this.id);
			System.out.println("Cost of travel: "+ this.fare + "\n");
			
		}
	}
	
	public static class SeniorTraveller extends Traveller{
		private int age;
		
		SeniorTraveller(String name, String id, int age){
			super(name,id);
			this.age=age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public void calculateFare(){
			double discount = 0;
			
			if (this.age >= 50 && this.age<=65){
				discount =0.10;
			}else if (this.age > 65){
				discount =0.15;
			}
			
			double base_fare =super.getFare();
			double curr_fare = base_fare + (base_fare * (11.36/100));
			curr_fare = curr_fare - (curr_fare * discount);
			super.setFare(curr_fare);
			/*System.out.println( curr_fare *.15);
			System.out.println(curr_fare);
			System.out.println(base_fare);
			*/
		}
		
		@Override
		public void displayDetails(){
			
			if (this.age < 50){
				System.out.println("Sorry "+super.getName()+", age should be 50 or above to avail senior tralveller's concession.");
			}else{
				calculateFare();
				System.out.println("Senior Traveller Details");
				System.out.println("******************************");
				System.out.println("Name: "+ super.getName());
				System.out.println("id: "+super.getId());
				System.out.println("Cost of travel: "+ super.getFare() +"\n");
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller tv1 = new Traveller("Priya","AQ456472");
		//tv1.setFare(2000);
		tv1.displayDetails();
		
		Traveller tv2 = new SeniorTraveller("Jooooey","PJM666565",70);
		tv2.displayDetails();
		//tv2.calculateFare();
		Traveller tv3 = new SeniorTraveller("Mooooey","PJK666565",49);
		tv3.displayDetails();
	}

}
