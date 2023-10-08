package Day20_29_thisKeywords;

public class ThisExample1 {
	int x = 25, y = 55;
	void calling(int x) {   //10
		System.out.println("local variable x:"+x);//25
		System.out.println("non-static global y:"+y);//55
		System.out.println("non-static global x: "+this.x);
	     this.display();
	}
	  void display() {
		// TODO Auto-generated method stub
		System.out.println("I'M display method");
		System.out.println("Display() ends here");
	}
	
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ThisExample1.testing();
    ThisExample1 t1 = new ThisExample1();
      t1.calling(10);
  
	}
  static void testing() {
	  System.out.println("hello , i m testing");
  }
}
