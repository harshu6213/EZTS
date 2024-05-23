package vehicle;

	public class car extends vehicle {
		private String Fuletype;
		public car(int model, int engine,String color,String fuletype) {
			super(model, engine, color);
			Fuletype= fuletype;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "car [Fuletype=" + Fuletype+ ", toString()=" + super.toString()+ "]";
			
		}
		void carout() {
			super.vehicleout(); 
			System.out.println("Fuletype=" +Fuletype);
		}
	       
	}


