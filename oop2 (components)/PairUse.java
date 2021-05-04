// this is pair class use 

public class PairUse{
	public static void main(String[] args){
		//Pair<String> p1 = new Pair<>("abc","def");
		Pair<Integer,String> p = new Pair<>(1,"shruti");
		Pair<Integer,Integer> internalPair = new Pair<>(2,4);
		Pair<Pair<Integer,Integer>,Integer> p1 = new Pair<>(internalPair,6);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());


	}
}