package vehicle;

public class bike extends vehicle {
	private String Type;
	public bike(int model, int engine,String color,String type) {
		super(model, engine, color);
		Type=type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "bike [Type=" +Type+ ", toString()=" + super.toString()+ "]";
		
	}
	void bikeout() {
		super.vehicleout(); 
		System.out.println("Type=" +Type);
	}
       
}
