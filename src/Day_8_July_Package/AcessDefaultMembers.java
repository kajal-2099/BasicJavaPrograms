package Day_8_July_Package;
public class AcessDefaultMembers{
	int accNum = 1234;
	void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		AcessDefaultMembers p1 = new AcessDefaultMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AcessDefaultMembers p1 = new AcessDefaultMembers();
     System.out.println("Accessing Default Members from child class");
     System.out.println(p1.accNum);
     p1.displayAccNum();
	}

}
