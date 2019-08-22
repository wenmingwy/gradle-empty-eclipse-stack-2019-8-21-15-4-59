public abstract class Car {
	public String engine = "engine" ;
	public String wheels =  "wheels";
//	public Car(String engine,String wheels) {
//		this.engine = engine ;
//		this.wheels = wheels ;
//	} 	
	public void start(){
		System.out.println(this.engine +" is on and " + this.wheels+ " are running!"); 
	}
//	public static void main(String[] args) {
//		start();
//	} 
}


