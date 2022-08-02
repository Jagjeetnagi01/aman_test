package java_basic_programs;

public class Test {

	public static void main(String[] args) {
		System.out.println("test");
		int i = 100;
		int j = i++;
		int k = ++i - --i + i-- - ++i;
		int l = k-- - ++k + i-- - ++i + i--;
		int m = i++ + i-- - ++i + --i +j++ - k-- + l-- - ++l;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);

	}

}
