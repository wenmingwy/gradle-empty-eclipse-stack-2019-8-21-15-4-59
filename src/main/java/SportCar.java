public class SportCar extends Car {
	public String lights ="lights";
//	public SportCar(String engine,String wheels,String lights) {
//		super(engine , wheels);
//		this.lights = lights ;
//	}
	public void sportCarStart() {
		System.out.println(this.lights+ "are shining," + this.engine + " is on and "+ this.wheels +" are running!");
	}
	
	public void speedOn() {
		System.out.println(this.engine+ "is overload and " + this.wheels + " are running!");
 	}	
	
 }
