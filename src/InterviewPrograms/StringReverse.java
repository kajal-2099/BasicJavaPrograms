package InterviewPrograms;

public class StringReverse {

	public static void main(String[] args){
		String  s = "Kajal Jaiswal";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed string : "+rev);
	}
}


// String input = “Hello world”;
//StringBuffer sb = new StringBuffer(input);
//sb.reverse();
//String reversed = sb.toString();
//System.out.println(reversed);

