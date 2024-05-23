package Hospital;

 public class Nurse extends Hospital{
	              
		private int FloorNumber;

		public Nurse(String name,int age,String gender,int floorNumber) {
			super(name,age,gender);
			FloorNumber= floorNumber;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Nurse [FloorNumber=" +FloorNumber+ ", toString()=" + super.toString()+ "]";
			
		}
		void Nurseout() {
			super.Hospitalout(); 
			System.out.println("FloorNumber=" +FloorNumber);
		}
	       
	}

