package vehicle;

public class vehicle {
	private int Model;
	private int Engine;
	private String Color;
	
	public vehicle(int model,int engine,String color) {
		Model=model;
		Engine=engine;
		Color=color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "vehicle[Model=" + Model+",Engine=" + Engine +",Color="+Color+"]";
		
	}
	void vehicleout() {
		System.out.println("Model="+Model);
		System.out.println("Engine=" + Engine);
		System.out.println("Color="+Color);
	}

}
