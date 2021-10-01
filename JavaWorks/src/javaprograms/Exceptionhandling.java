package javaprograms;

public class Exceptionhandling {
	static String d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int b = 3;
			d.length();
			int c = b / a;                       
			System.out.println(c);        
			// we can also give exception name which is caused is best way ( eg: Arithmetic exception)
		} catch (ArithmeticException e) {                              // We can give " n"  number catch block in  program
			System.out.println("Cant able to divide ");
		}
			
			catch (NullPointerException e) {                              // We can give " n"  number catch block in  program
				System.out.println("Cant able to divide 2");
		} catch (Exception e) {                                       // Exception keyword is common to all exception 
			e.printStackTrace();                             //  --------------> (The printStackTrace() method of Java. lang.
			                                                 //Throwable class used to print this Throwable along with
			System.out.println("Cant  ");                    // other details like class name and line number where the exception occurred means its backtrace.)
		}

	}

}
