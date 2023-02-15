package Sample;

import java.util.Scanner;
import java.util.stream.Collectors;

@FunctionalInterface
interface StringSpace{
	String addSpace(String s);
}
public class IntefaceLam {

	static String insertSpace(String s)
	{
		String str1=s.chars().mapToObj(i -> (char) i + " ").collect(Collectors.joining()).strip();
		return str1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner =new Scanner(System.in);
	String message=scanner.next();
	message=insertSpace(message);
	System.out.println(message);
	}

}
