//oops code creating blueprint for student class

class Student{
	String name;
	private final int rollno; // now studentUse can't access the rollno directly as rollno. datamember is private

	//to let the studentUse class use the rollno. property we will build getter and setter method and make them public 
	//bz these methods can be accessed by the StudentUse class and they can call them
	public Student(String name,int rollno){
		this.name = name;
		
		this.rollno = rollno;
	}
	//public void setRollno(int rn){
	//	if(rn<=0){    // if rollno to set is <=0 then just return
	//		return;
	//	}
	//	rollno = rn;
	//}
	public int getRollno(){
		return rollno;
	}
	public void print(){
		System.out.println(name+":"+rollno);
	} 


}

public class StudentUse{
	public static void main(String[] args){
		Student s1 = new Student("shruti",12); // creating student object and the properties of Student blueprint class is copied inside this object
		//s1.name = "shruti";
		//s1.setRollno(23);
		Student s2 = new Student("anand",23);
		//s2.name = "anand";
		//s2.setRollno(-26);
		System.out.println(s1.name);
		System.out.println(s1.getRollno());

		System.out.println(s2.name);
		System.out.println(s2.getRollno());
	}
}