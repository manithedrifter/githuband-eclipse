package javaprograms;

public class Stringbuffermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//String is immutable
		String s1="mani"; // via literals
		String s2="mani";
		s2.concat("kandan");
		System.out.println(s2);
		String sn1=new String("Mani");//via new keyword
		String sn2=new String ("mani");
		s2.concat("mani");
		System.out.println(sn2);
		
		
		//Stringbuffer &  string builder is mutable
		StringBuffer sb1=new StringBuffer("Mani");
	    StringBuffer sb2=new StringBuffer("Mani");
	    sb2.append("kandan");
	    System.out.println(sb2);
	   
	    
	 // String buffer methods  
	    
	 		StringBuffer s=new StringBuffer("Manikand");
	 		System.out.println(s.reverse());         
	 		StringBuffer k=s.replace(5, 10,"  " );   
	 		System.out.println(k);                   
	 		System.out.println(s.delete(1, 1));      
	 		System.out.println(s.insert(3, "ManikandanMan"));
	 		System.out.println(s.capacity());        
	    
		
	
		
		
	}

}
