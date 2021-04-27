package unq.tp3;

public class Expresiones {
	public static void main(String args[]) {
	    String a = "abc";
		String s = a;
		String t;

	      System.out.println(a.substring(1,3).equals("bc"));
	    }
	
	/*
	 * ● s.length(); 3
	 * ● t.length(); error: variable t might not have been initialized
	 * ● 1 + a; 1abc
	 * ● a.toUpperCase(); ABC
	 * ● "Libertad".indexOf("r"); 4
	 * ● "Universidad".lastIndexOf('i'); 7
	 * ● "Quilmes".substring(2,4); il
	 * ● (a.length() + a).startsWith("a"); false
	 * ● s == a; true
	 * ● a.substring(1,3).equals("bc"); true

	*/
	
}

