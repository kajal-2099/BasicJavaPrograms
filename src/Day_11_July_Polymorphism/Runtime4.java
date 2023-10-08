package Day_11_July_Polymorphism;
class Bank{
	float getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 7.4f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 9.6f;
	}
}
public class Runtime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank b = new SBI();
      System.out.println("SBI Rate OF Interest: "+b.getRateOfInterest());
      b = new ICICI();
      System.out.println("ICICI Rate Of Interest: "+b.getRateOfInterest());
      b = new AXIS();
      System.out.println("ICICI Rate Of Interest: "+b.getRateOfInterest());
	}

}
