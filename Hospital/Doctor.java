package Hospital;

public class Doctor extends Hospital {
              
	private String Specialisation;

	public Doctor(String name,int age,String gender,String specialisation) {
		super(name,age,gender);
		Specialisation=specialisation;
	}
	@Override
		// TODO Auto-generated method stub
		return "Doctor [Specialisation=" +Specialisation+ ", toString()=" + super.toString()+ "]";
		
	}
	void Doctorout() {
		super.Hospitalout(); 
		System.out.println("Specialisation=" +Specialisation);
	}
       
}

	