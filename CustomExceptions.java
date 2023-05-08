/*--------------------Program for creating a custom exception to check whether individual is an adult or not -----------------------/*

class Exception1 extends Exception {
	public Exception1(String s) {
		super(s);
	}
}
class CustomExceptions {
	//static int age;
	public static void age(int a) throws Exception1 {
		if(a<18) {
			throw new Exception1("Underage not allowed");
		}
		else {
			System.out.println("Welcome");
		}
	}
	public static void main(String[]str) {
		try {
			age(19);
		}
		catch(Exception1 ex) {
			System.out.println("Exception caught "+ ex);

		}
	}
}