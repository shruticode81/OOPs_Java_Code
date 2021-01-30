//creating a dynamic Array class which will resize itself whenever the array is full.

public class DynamicArray{
	private int data[];
	private int nextIndex;

	public DynamicArray(){ //constructor
		data = new int[5];
		nextIndex=0;
	}
	
	public int size(){
		return nextIndex;
	}
	
	public void add(int element){
		if(nextIndex == data.length){
			restructure();
		}
		data[nextIndex]=element;
		nextIndex++;
	}

	public void set(int index,int element){
		if(index<nextIndex){
			data[index]=element;
		}
		if(index>nextIndex){
			return;
		}
		else{
			add(element);
		}
	}

	public int get(int index){
		if(index>=nextIndex){
			//errorout
			return -1;
		}
		else{
			return data[index];
		}
	}
	public boolean isEmpty(){
		if(size()==0){
			return true;
		}
		else{
			return false;
		}
	}
	public int removeLast(){
		int element = data[nextIndex-1];
		data[nextIndex-1]=0;
		nextIndex--;
		return element;
	}

	public void restructure(){
		int temp[] = data;
		data = new int[data.length*2];
		for(int i=0;i<temp.length;i++){
			data[i]=temp[i];
		}
	}
}