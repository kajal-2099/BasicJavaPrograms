package Stringclasses;

public class StringDemo {

	public static void main(String[] args) {
	 StringDemo s1 = new StringDemo();
	 System.out.println("s1: "+s1);
	 String str1 = "Pune";
	 System.out.println("str1: "+str1);
	 String str2 = "Pune";
	 System.out.println("Str2: "+str2);
	 System.out.println("check str1 and str2 both are same object or not? "+(str1==str2));
	 String str3 = "Mumbai";
	 System.out.println("Str3: "+str3);
	 System.out.println("check str1 and str3 both are same object or not? "+(str1==str3));
	 System.out.println("check str1 and str3 both are same object or not? "+str1.equals(str3));
	 
	}

}
