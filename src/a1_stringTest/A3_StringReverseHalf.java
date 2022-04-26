package a1_stringTest;

public class A3_StringReverseHalf {
	
	public static void main(String[] args) {
		
		String a="Sharmila Balasundaram";
		int x=a.indexOf("B");
		a=a.substring(x);
		System.out.println(a);
		StringBuffer str=new StringBuffer(a);
		System.out.println(str.reverse());
		
	}

}
