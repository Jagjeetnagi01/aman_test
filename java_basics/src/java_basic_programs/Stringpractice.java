package java_basic_programs;

import java.util.Scanner;

class Girl {
	
// Default constructor
	
	/*
	 * Girl() {
	 * 
	 * }
	 */
	
	Girl()
	{
		this.name = "Pagal";
	}
	Girl(String name)
	{
		this.name  = name;
	}
	String name;
	int age;
}

public class Stringpractice {
	
	public static void main(String[] args) {
	
		Girl aman = new Girl();
		System.out.println(aman.name);
		aman.name = "SHadain";
		System.out.println(aman.name);
		
		Girl raman = new Girl("machi buthi");
		System.out.println(raman.name);
		
	}

	/*
	 * public static void main(String[] args) { //calling string methods String s1 =
	 * "Neso Academy";
	 * 
	 * System.out.println(s1.toUpperCase());
	 * 
	 * String s2 = s1.toLowerCase(); System.out.println(s2);
	 * 
	 * int i = s1.length(); System.out.println(i); System.out.println(s1.isEmpty());
	 * System.out.println(s1.isBlank()); char c = s1.charAt(11);
	 * System.out.println(c); System.out.println(s1.indexOf('A'));
	 * System.out.println(s1.lastIndexOf('e'));
	 * System.out.println(s1.concat("Thank you")); System.out.println("neso"
	 * +"academy" + (5 +3) );
	 * System.out.println("neso".concat("academy").concat("5").isEmpty());
	 * 
	 * //Instantiating a string object String name1 = "Amanpreet Kaur"; String name2
	 * = new String("Amanpreet Kaur"); System.out.println(name1);
	 * System.out.println(name2);
	 * 
	 * //Immutable objects String str = "old Value"; str = "New value"; String
	 * userName = "Aman"; System.out.println("Hello" + userName);
	 * 
	 * //scanner class in Java //Scanner input = new Scanner(System.in) Scanner
	 * input = new Scanner(System.in);
	 * 
	 * System.out.println("Enter your favorite number: "); String number =
	 * input.nextLine(); System.out.println(number + " is your favorite number.");
	 * 
	 * 
	 * 
	 * //read name and age System.out.print("Enter your name and age: "); String
	 * name = input.nextLine(); int age = input.nextInt(); System.out.println(name +
	 * "! You are " + age + " years old");
	 * 
	 * 
	 * input.close();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
