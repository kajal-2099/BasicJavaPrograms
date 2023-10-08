package Day24_4julyInheritance;
 class fruitA{
	 int fruitAge;
	 fruitA(){
		 System.out.println("fruitA classncons..");
	 }
	 public void taste() {
		 System.out.println("Fruits are sweet");
	 }
 }
 class mango extends fruitA{
	 int fruitAge;
	 mango(){
		 // super();
		 System.out.println("mango class cons..");
		 fruitAge = 5;
	 }
	// @ovveride
	 public void taste() {
		System.out.println("mango are tart in taste"); 
	 }
	 public void shape() {
		 System.out.println("mango is roound");
	 }
 }
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("*****************************");
      mango m1 = new mango();
      m1.shape();
      m1.taste();
      System.out.println("m1.fruitAge");
      
      fruitA f1 = new fruitA();
      f1.taste();
      System.out.println(f1.fruitAge);
      
      System.out.println("============================");
      fruitA f2 = new mango();
      f2.taste();
      System.out.println(f2.fruitAge);
      System.out.println("***************************");
      }

}
