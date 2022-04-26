package a1_stringTest;

public class A4_RemoveDuplicateChar {

	public static void main(String[] args) {

		String s = "Sharmila Balasundaram";
		int count;
		char a[] = s.toCharArray();

		System.out.println("Duplicate characters in a given string is: ");

		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j] && a[i] != ' ') {
					count++;
					a[j] = '0';
					// please see below steps			
				}
			}
			if (count > 1 && a[i] != '0')
				System.out.println(a[i]);
	}
		
		
        //	1)Sharmil0 B0l0sund0r0m
		//	  a[2]=a, nested loop exit, count=2 if condition also satisfied print a[2]
		
		//  2)Sharmil0 B0l0sund000m
		//    a[3]=r, nested loop exit, count =2 if condition also satisfied print a[3]
		
		//  3)Sharmil0 B0l0sund0000
		//    a[4]=l, nested loop exit, count =2 if condition also satisfied print a[5]
			
		//  3)Sharmil0 B000sund0000
		//    a[6]=l, nested loop exit, count =2 if condition also satisfied print a[5]

		
	}

}
