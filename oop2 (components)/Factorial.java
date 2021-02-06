//factorial code within handle exception

public class Factorial{

	public static int fact(int n) throws InvalidInputException{
		if(n==0){
			return 1;
		}
		if(n<0){
			//throw exception
			InvalidInputException e = new InvalidInputException();
			throw e;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args){
		//int n = ;
		//calling fact method can throw exception so either handle it or throw it
		try{
			int res=fact(-5); 
			System.out.println(res);
		}catch(InvalidInputException e){
			System.out.println("invalid input");
			return;
		}
		
	}
}