package a1_stringTest;

public class A1_StringTest {

	public static void main(String[] args) {

		String a = "Sharmila";
		String b = "Sharmila";

		String c = new String("Sharmila");
		String d = new String("Sharmila");

		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println("-----");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));

	}

}
