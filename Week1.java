public class Week1 { //declaration of class
	public static void main(String[] args) { //Main Method: Operates code
		
	//SYNTAX
		
	    //Declaring Variables
		double test = 4.0;
		//type name = value;
		final double pi = 3.14;
		//final signifies that you cannot change it later in the code
			
		//Printing 	
		System.out.print("Hello");
		//Prints Hello
		System.out.println("Hello");//(More useful)
		//Prints Hello and then creates a new line beneath it
		System.out.println(1);
		//number values do not have to be in quotations.
		
	//VARIABLE TYPES
		
		//Double variables: Can hold large decimal values
		double alpha = 1.0; 
		double beta = 2.0;
		System.out.println(alpha + beta);// would output 3.0
		
		//Integer Variables: can hold integer values
		int alpha2 = 1;
		int beta2 = 2;
		System.out.println(alpha2 + beta2);// would output 3
		
		//String Variable: Can hold multiple characters
		String delta = "Hello";
		System.out.println(delta);//would output Hello
		
		//Char Variable: Can hold one character
		char letter = 'a';

	//OPERATORS
		
		double a = beta + alpha;//Addition: a = 3.0
		double b = beta - alpha;//Subtraction: b = 1.0
		double c = beta * alpha;//Multiplication: c = 2.0
		double d = alpha/beta;//Division: d = 0.5
		double f = beta%alpha;//Modulus:(provides remainder) f = 0.0
		double g = alpha++;//Increment:(adds 1) g = 2.0;
		double h = alpha--;//Decrement:(subtracts 1) h = 0.0;
		
	//CASTING
		
		double decimal= 1.71;
	  //int integer = casting; 
	  //will not work because integers cannot hold decimal values.  
	  //Instead you should cast the double as an int.
		int integer =(int) decimal; 
		// changes the double value into an int by cutting off decimals NOT ROUNDING
	  
		
		double fraction = 1/2;//fraction will = 0.0
		//while 1/2 = 0.5 in real life, when two ints are divided in java, the result is also an int. 
		//This means the resulting 0.5 would be shortened to 0
		
		//to fix this either the numerator or denominator must be made a double
		fraction = 1.0/2;
		//or the number must be cast as a double
		fraction = (double) 1/2;//fraction = 0.5
		
		//Extra notes
		
		/* typing // creates a comment that does not change the code
		 * words like double, int, and String are key words that cannot to be used as variable names
		 * the = sign sets a value to the variable, it does not signify that the values are equal
		 * while doubles cannot go into ints, ints can always go into doubles
		 * (ie. double a = 1 works, but int a = 1.2 does not)
		 * there are many more variable types, but most are not useful for beginners right now		
		 */
		
		//If you have any questions feel free to ask any of the teachers on classroom. 
		//We would be more than happy to help.

	}
}
