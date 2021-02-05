// building class  to test the fraction constructor class Fraction

public class FractionUse{
	public static void main(String[] args){
		Fraction f1 = new Fraction(20,30);
		f1.print();

		try{
			f1.setDenominator(3); // calling this method can throw exception so either handle it or throws it
		}catch(ZeroDenominatorException e){
			System.out.print("pls don't enter input as 0");
		}
		
	}

}