//vehicle use class
package vehicle;
public class VehicleUse{

	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.print();
		Car c = new Car();
		c.color = "black";
		c.print();
	}
}