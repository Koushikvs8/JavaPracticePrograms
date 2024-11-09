package JavaStringBased;

public class StringImpFunctions {
 
public static void main(String[] args) {
	String Str1="Koushik is good Guy";
	String Str2="Koushik is good Guy and dumb fellow";
	String Str3="   good    dad  bad son  ";
	String str4="   click   on the menu bar of HomePage  ";
	String str5="Tommato - 34";
	///////////////////////
	System.out.println(Str1.charAt(6));
////////////////////////////
	System.out.println(Str1.equals(Str2));
	///////////////////////////////
	System.out.println(Str1.compareTo(Str2));
	/////////////////////////
	System.out.println(Str1.length());
	///////////////////////////
	System.out.println(Str2.contains(Str1));
	///////////////////////////
	System.out.println(Str2.substring(7)+" "+Str1.substring(3, 18));
///////////////////////////
	System.out.println(Str3.trim());
///////////////////////////
System.out.println(str4.replaceAll("\\s+", "_"));
///////////////////////////
String[] split=str5.split("-");
System.out.println(split[0].trim());
}
}
