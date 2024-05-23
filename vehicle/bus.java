package vehicle;

	public class bus extends vehicle {
		private int Seats;
		public bus(int model, int engine,String color,int seats) {
			super(model, engine, color);
			Seats=seats;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "bus [Seats=" +Seats+ ", toString()=" + super.toString()+ "]";
			
		}
		void busout() {
			super.vehicleout(); 
			System.out.println("Seats=" +Seats);
		}
	       
}
