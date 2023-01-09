package dailyprograms;

public class stringmethodall {
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
				// LENGTH METHOD 
		System.out.println(a.length()); // 19
				// LENGTH METHOD AFTER ADDING SPACE
		a = "Velocity Class Pune ";
		System.out.println(a.length()); // 20
		a = "Velocity Class Pune"; 
		System.out.println(a); //Velocity Class Pune
				// charAt METHOD
		System.out.println(a.charAt(0)); // V
		System.out.println(a.charAt(1)); // e
		System.out.println(a.charAt(2)); // l
		System.out.println(a.charAt(3)); // o
		System.out.println(a.charAt(4)); // c
		System.out.println(a.charAt(5)); // i
		System.out.println(a.charAt(6)); // t
		System.out.println(a.charAt(7)); // y
		       // concat METHOD
		System.out.println(a.concat("MAHARASHTRA")); //Velocity Class PuneMAHARASHTRA
		 		// WITHOUT concat METHOD
		System.out.println(a+"maharashtra"); //Velocity Class Punemaharashtra
		System.out.println(a); // Velocity Class Pune
		 		//TOUPPERCASE AND TOLOWERCASE METHOD
		String e="SaNdIp WaKaDe";
		System.out.println(e); // SaNdIp WaKaDe
		System.out.println(e.toUpperCase()); // SANDIP WAKADE
		System.out.println(e.toLowerCase()); // sandip wakade
				// INDEXOF METHOD
		a = "Velocity Class Pune";
		System.out.println(a.indexOf("Velocity")); // 0
		System.out.println(a.indexOf("Class")); // 9
		System.out.println(a.indexOf("class")); // -1 means not present
		System.out.println(a.indexOf("Pune")); //15
				//LASTINDEX METHOD
		a = "Velocity Class Pune";
		System.out.println(a.lastIndexOf("e")); // 18
				//REPLACE METHOD
		a = "Velocity Class Pune";
		System.out.println(a.replace("Pune", "Thane")); // Velocity Class Thane
		System.out.println(a.replace("s", "*")); //Velocity Cla** Pune
				// TRIM METHOD
		a = "  Velocity Class Pune  ";
		System.out.println(a); //    Velocity Class Pune 
		System.out.println(a.trim()); //Velocity Class Pune
				// ENDWITH AND STARTWITH METHOD
		a = "Velocity Class Pune";
		System.out.println(a.startsWith("Velocity")); // true
		System.out.println(a.endsWith("Pune")); // true
		System.out.println(a.startsWith("Pune")); // false
		System.out.println(a.endsWith("Velocity")); // false
				// SUBSTRING METHOD
		a = "Velocity Class Pune";
		System.out.println(a.substring(4)); //city Class Pune
		System.out.println(a.substring(4,6)); //ci
				// SPLIT METHOD
		a = "Velocity Class Pune";
		String f [] = a.split(" ");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
