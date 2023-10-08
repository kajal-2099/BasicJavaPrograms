package Day20_29_thisKeywords;

public class StaticGlobalVariableExample1 {
    static int age=25;
    double salary=4500.36;
    void display(double sal, Object obj) {
    	System.out.println("local salary:"+sal);
    	StaticGlobalVariableExample1 s1 = new StaticGlobalVariableExample1();
    	System.out.println("NSGV salary:"+obj.salary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age=25;
        System.out.println("local age: "+age);
        System.out.println("global SV age: "+StaticGlobalVariableExample1.age);
        StaticGlobalVariableExample1 s1 = new StaticGlobalVariableExample1();
        s1.display(55000.56);
	}
	private void display(double d) {
		// TODO Auto-generated method stub
		
	}

}
