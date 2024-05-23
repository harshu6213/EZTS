package vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             vehicle vh=new vehicle(2010,999,"red");
             System.out.println(vh.toString());
             vh.vehicleout();
             
             bike b=new bike(2010,99,"blue","sports");
             System.out.println(b.toString());
             b.bikeout();
             
             car c=new car(2013,88,"white","petrol");
             System.out.println(c.toString());
             c.carout();
             
             bus bs=new bus(2010,98,"red",40);
             System.out.println(bs.toString());
             bs.busout();
	}

}
