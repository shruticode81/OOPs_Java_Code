//java code to represent a polynomial form coefficient will be stored in array and index will be it's degree

public class Polynomial{
	int coefficient[];
	public Polynomial(){
		coefficient = new coefficient[10];
	} 
	public void set(int degree,int coeff){
		if(degree>this.coefficient.length-1){
			//increase the size of array
			int temp[] = coefficient;
			coefficient = new coefficient[degree+1];
			for(int i=0;i<temp.length;i++){
				coefficient[i]=temp[i];
			}
		}
		coefficient[degree]=coeff;
	}

	public void print(){
		for(int i=0;i<this.coefficient.length;i++){
			if(coefficient[i]!=0){
				System.out.print(coefficient[i]+"x"+"^"+i+" ");	
			}
		}
	}

	public Polynomial add(Polynomial p){
		Polynomial ans = new Polynomial();
		int plen1 = this.coefficient.length;
		int plen2 = p.coefficient.length;
		int min = Math.min(plen1,plen2);
		for(int i=0;i<min;i++){
			ans.set(i,this.coefficient[i]+p.coefficient[i]);
		}
		while(i<plen1){
			ans.set(i,this.coefficient[i]);
			i++;
		}
		while(i<plen2){
			ans.set(i,p.coefficient[i]);
			i++;
		}
		return ans;
	}
	public Polynomial subtract(Polynomial p){
		Polynomial ans = new Polynomial();
		int plen1 = this.coefficient.length;
		int plen2 = p.coefficient.length;
		int min = Math.min(plen1,plen2);
		for(int i=0;i<min;i++){
			ans.set(i,this.coefficient[i]-p.coefficient[i]);
		}
		while(i<plen1){
			ans.set(i,this.coefficient[i]);
			i++;
		}
		while(i<plen2){
			ans.set(i,-p.coefficient[i]);
			i++;
		}
		return ans;
	}
	public int getCoeff(int degree){
		if(degree<this.coefficient.length){
			return coefficient[degree];
		}
		else{
			return 0;
		}
	}
}