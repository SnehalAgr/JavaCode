package exceptionHandling;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = new String("ABC");
		System.out.println(str1.hashCode());

		str1 = str1.concat("123");
		System.out.println(str1.hashCode());
		
		str1 = str1.concat("456");
		System.out.println(str1.hashCode());
		
		str1 = str1.concat("pqr");
		System.out.println(str1.hashCode());
	}

}
