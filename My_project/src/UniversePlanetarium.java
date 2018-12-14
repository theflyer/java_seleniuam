
public class UniversePlanetarium {
	
	private double basefare = 100.0;
	private int seatsAvailable = 250;
	
	public double getBasefare(){
		return this.basefare;
	}
	public void setBaseFare(double n){
		this.basefare = n;
	}
	
	public int getSeatsAvailable(){
		return this.seatsAvailable;
	}
	
	public void setSeatsAvailable(int n){
		this.seatsAvailable = n;
	}
	public void bookSeat( String name, int n_seat){
		
		if (n_seat < this.seatsAvailable){
			this.seatsAvailable = this.seatsAvailable - n_seat;
			double fare = this.basefare * n_seat;
			System.out.printf("%s has successfulley booked %d and total fare is %f \n",name,n_seat,fare);
		}
		else {
			System.out.printf("sorry %s!! insufficient number of seats.\n",name);
		}

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniversePlanetarium u = new UniversePlanetarium();
		u.bookSeat("asif", 8);
		u.bookSeat("Komal", 80);
		u.bookSeat("Prity", 165);
		System.out.println(u.getSeatsAvailable());
		
	}

}
