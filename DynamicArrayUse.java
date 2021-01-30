//create class to use DynamicArray Class
public class DynamicArrayUse{
	public static void main(String[] args){
		DynamicArray d = new DynamicArray();
		for(int i=0;i<100;i++){
			d.add(i+10);
		}
		System.out.println(d.size());
		d.set(4,10);
		System.out.println(d.get(4));
		System.out.println(d.get(3));
		while(!d.isEmpty()){
			System.out.println(d.removeLast());
			System.out.println("size="+d.size());
		}
	}
}