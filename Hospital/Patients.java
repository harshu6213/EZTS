package Hospital;

public class Patients extends Hospital {
	private String Disease; 
	private int Bednumber;
	
			public Patients(String name,int age,String gender,String disease,int bednumber) {
				super(name,age,gender);
				Disease=disease;
				Bednumber=bednumber;
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Patients [Disease=" +Disease+ ",Bednumber=" +Bednumber+", toString()=" + super.toString()+ "]";
				
			}
			void Patientsout() {
				super.Hospitalout(); 
				System.out.println("Disease=" +Disease);
				System.out.println("Bednumber=" +Bednumber);
			}
		       
		}

