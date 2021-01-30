//Creating Fraction class which will contain data member constructor which will represent a/b fraction,and perform some method to
//perform addition,multiply

public class Fraction{
	private int numerator;
	private int denominator;

	public Fraction(int numerator,int denominator){
		this.numerator = numerator;
		if(denominator==0){
			//todo error out
		}
		this.denominator = denominator;
		simplify();
	}
	public int getDenominator(){
		return denominator;
	}
	public int getNumerator(){
		return numerator;
	}
	public void setNumerator(int n){
		this.numerator = n;
		simplify();
	}
	public void setDenominator(int d){
		if(d==0){
			//error out
			return;
		}
		this.denominator = d;
		simplify();
	}
	public void print(){
		if(denominator==1){
			System.out.println(numerator);
		}else{
			System.out.println(numerator+"/"+denominator);
		}
	}
	public void simplify(){
		int gcd = 1;
		int smallest = Math.min(numerator,denominator);
		for(int i=2;i<=smallest;i++){
			if(numerator%i == 0 && denominator%i == 0){
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	public void add(Fraction f2){ // this method is non-static bz change is happening within the current object
		this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	public void multiply(Fraction f2){
		this.numerator = this.numerator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	public static Fraction add(Fraction f1,Fraction f2){
		int newNum = f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		int newDeno = f1.denominator*f2.denominator;
		Fraction f = new Fraction(newNum,newDeno);
		return f;
	}

}