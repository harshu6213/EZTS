package Hospital;

public class Hospital {
		private String Name;
		private int Age;
		private String Gender;
		
		public Hospital(String name,int age,String gender) {
			 Name= name;
			 Age=age;
			 Gender=gender;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Hospital[Name="+ Name +",Age=" + Age+",Gender="+Gender+"]";
			
		}
		void Hospitalout() {
			System.out.println("Name=" +Name);
			System.out.println("Age=" +Age);
			System.out.println("Gender=" +Gender);
			
		}

	}


