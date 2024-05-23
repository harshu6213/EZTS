package Hospital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hospital h=new Hospital("Apollo",12,"none");
        System.out.println(h.toString());
        h.Hospitalout();
        
        Doctor d=new Doctor("harshi",25,"female","orthopedic");
        System.out.println(d.toString());
        d.Doctorout();
      
        Nurse n=new Nurse("shiv",34,"male",4);
        System.out.println(n.toString());
        n.Nurseout();
        
        Patients p=new Patients("yash",25,"female","memoryloss",3);
        System.out.println(p.toString());
        p.Patientsout();	
		
	}

}
