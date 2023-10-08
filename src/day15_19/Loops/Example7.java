package day15_19.Loops;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Kajal", reverseStr = "";
        int strLength = str.length();
        for(int i=(strLength -1); i>=0;--i) {
        	reverseStr = reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
        	System.out.println(str + " is a palidrome String");
        }
        else {
        	System.out.println(str + " is a palidrome String");
        }
	}

}
