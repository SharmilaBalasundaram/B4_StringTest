package a2_StringBuilderBuffer;

public class A1_StringBuilder {

	public static void main(String[] args) {
		
		String a=new String("Sharmila ");
		String b="Software Engineer";
		System.out.println(a);
		System.out.println(a.concat(b));
		System.out.println(a);
		
		StringBuffer c=new StringBuffer("Sharmila ");
		StringBuilder d=new StringBuilder("a Software Engineer");
		System.out.println(c.capacity());
	    c.append(d);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(c.capacity());
	    System.out.println(c.reverse());
	    System.out.println(d.reverse());

		
		
	}
	
}
