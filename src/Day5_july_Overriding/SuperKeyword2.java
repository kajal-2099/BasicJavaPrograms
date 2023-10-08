package Day5_july_Overriding;
class Animal1{
	void eat() {
		System.out.println("eat() of animal1 class...");
	}
	class Dog1 extends Animal1{
		void eat() {
			System.out.println("eat() of Dog1 class...");
		}
		void bark() {
			System.out.println("bark() of Dog1 class...");
		}
		void work() {
			super.eat();
			bark();
			eat();
			System.out.println("work() of Dog1 class...");
			}
	}
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog1 d = new Dog1();
       d.work(;)
	}

}
