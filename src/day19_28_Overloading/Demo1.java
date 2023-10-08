package day19_28_Overloading;

public class Demo1 {
	 void addingTwoNumber(int num1 , int num2) {
  	   int res=num1+num2;
  	   System.out.println(num1);//25
  	 System.out.println(num2);//50
  	 System.out.println(res);//75
  	 return;
     }
	 void addTwoNumber() {
		 int num1=10,num2=20;
		 int res=num1+num2;
		 System.out.println(num1);//10
		 System.out.println(num2);//20
		 System.out.println(res);//30
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Demo1 d1=new Demo1();
		d1.addTwoNumber();
		//System.out.println(d1.addTwoNumber());
		d1.addingTwoNumber(25, 35);
		int x=10,y=20;
		d1.addingTwoNumber(x,y);
	

	}

}
