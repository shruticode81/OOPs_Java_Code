//coding generic class ,, generic class is useful bz it can get any type of class

public class Pair<T,V>{ //Pair class will be of T type

	private T first;
	private V second;
	//constructor
	public Pair(T first,V second){
		this.first = first;
		this.second = second;
	}
	public void setFirst(T first){
		this.first = first;
	}
	public T getFirst(){
		return first;
	}
	public V getSecond(){
		return second;
	}
	public void setSecond(V second){
		this.second = second;
	}
}