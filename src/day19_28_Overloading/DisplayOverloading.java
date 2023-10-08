package day19_28_Overloading;

public class DisplayOverloading {
    public void disp(char c) {
    	System.out.println(c);
    }
    public void disp(char c, int num) {
    	System.out.println(c + " " + num);
    }
    public void disp(double c, double num) {
    	System.out.println(c + " " + num);
    }
    public class MethodOverloading{
    	DisplayOverloading obj = new DisplayOverloading();
    	obj.disp('a');
		obj.disp('a', 10);
		obj.disp(10,25);
		MethodOverloading m2=new MethodOverloading();
		m2.call(63.5);
		m2.call(123);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	}

}
