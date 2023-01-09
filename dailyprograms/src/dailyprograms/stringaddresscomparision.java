package dailyprograms;

public class stringaddresscomparision {
	public static void main(String[]args)
	{
		String a = "Velocity Class Pune";
		String b = "Velocity Class Pune";
		String c = new String("Velocity Class Mumbai");
		String d = new String("Velocity Class Mumbai");
		System.out.println(a); // Velocity Class Pune
		System.out.println(b); // Velocity Class Pune
		System.out.println(c); // Velocity Class Mumbai
		System.out.println(d); // Velocity Class Mumbai
		     // ADDRESS COMPARISION//
		System.out.println(a==b); // true
		System.out.println(a==c); // false
		System.out.println(c==d); // false
		b = "Velocity Class Mumbai";
		System.out.println(a==b); //false
		b= "Velocity Class Pune";
		System.out.println(a==b); // true
		b= "velocity class pune";
		System.out.println(a==b); //false
		
	}
}
