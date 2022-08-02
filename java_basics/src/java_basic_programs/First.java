package java_basic_programs;

public class First {

	public static void main(String[] args) {
		String myName;
		myName = "Amanpreet"; 
		String myJob = "Tester";
		String myNameCopy = myName;
		
		System.out.println(myName);
		System.out.println(myJob);
		System.out.println(myNameCopy);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		
		Inttypes.inttypes(null); //calling static class
		
		int i = 100;
		int j = i++;
		int k = ++i - --i + i-- + ++i ;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);



	}

}
