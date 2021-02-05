//understanding inheritance
package vehicle
public class Vehicle{
	String color;
	private int maxSpeed;

	public void setMaxspeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public int getMaxspeed(){
		return maxSpeed;
	}
	public void print(){ //havenot written static bz print() can use object
		System.out.println("Vehicle Color:"+color);
		System.out.println("Vehicle maxspeed:"+maxSpeed);
	}

}