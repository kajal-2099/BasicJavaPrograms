package Day_11_July_Polymorphism;

public class DerivedCasting2 {
	class GrandParent101{
		void myHome() {
			System.out.println("Home belongs to GrandParent");
		}
	}
	class Parent01 extends GrandParent101{
		// function
		void show() {
			// Print message for this class
					System.out.println("Parent show method is called");
				}
				void callme() {
					System.out.println("Parent callme method is called");
				}
			}
			class Child101 extends Parent01 {
				void readme() {
					System.out.println("Child readme method is called");
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************Ref and Object both of child*********************");
		//Object of Child class and reference of child class
		Child101 c1= new Child101();
		c1.readme();
		c1.callme();
		c1.show();
		c1.myHome();
		System.out.println("****************Access only Parent member*********************");
		Parent01 p1=c1;//Auto upcasting -->Parent p1=c1=new Child(); -->Parent p1=(Parent)new Child();
		p1.myHome();
		p1.callme();
		p1.show();
		System.out.println("****************Access only GrandParent member*********************");
		GrandParent101 g1=(GrandParent101)c1;//explicit upcasting
		g1.myHome();
	}
       
}
