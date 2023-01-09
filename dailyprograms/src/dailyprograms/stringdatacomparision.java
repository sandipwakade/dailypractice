package dailyprograms;

public class stringdatacomparision {
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
		     // DATA COMPARISION//
		System.out.println(a.equals(b)); // true
		System.out.println(a.equals(c)); // false
		System.out.println(c.equals(d)); // true
		b = "Velocity Class Mumbai";
		System.out.println(a.equals(b)); //false
		b= "Velocity Class Pune";
		System.out.println(a.equals(b)); // true
		b= "velocity class pune";
		System.out.println(a.equals(b)); //false
		System.out.println(a.equalsIgnoreCase(b)); // true
		
	}
}
