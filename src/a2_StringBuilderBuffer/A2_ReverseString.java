package a2_StringBuilderBuffer;

public class A2_ReverseString {
	
	public static void main(String[] args) {
		
		StringBuffer a=new StringBuffer("Sharmila");
		StringBuilder b=new StringBuilder("Tester");
		a.reverse();
		b.append(a);
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
	}

}
