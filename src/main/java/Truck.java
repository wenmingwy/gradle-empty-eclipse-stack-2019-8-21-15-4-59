
public class Truck extends Car {
	public String payload = "payload";
//	public Truck(String engine,String wheels,String payload) {
//		super(engine , wheels);
//		this.payload = payload ;
//	}
	public void truckStart() {
		System.out.println("tips, "+this.engine + "is on and "+this.wheels+ " are running!");
	}
	
	public void payLoad() {
		System.out.println(this.payload + " is loading goods");
 	}		
 }

 