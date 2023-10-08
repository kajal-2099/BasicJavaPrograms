package Day5_july_Overriding;
class Parent{
	void show()
	{
		System.out.println("Parent's show()");
	}
	class Child extends Parent{
		//@override
		void show() {
			System.out.println("Child's show()");
		}
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // if a parent type reference refers to a parent object,then parent's show is called
		   Parent obj1 = new Parent();
		   obj1.show();
		   // if a Parent type reference refers to a child object child's show() is called.this is called RUN TIME
		   // Polymorphism
		   Parent obj2 = new Parent();
		   obj2.show();//Child's show()
	}

}
