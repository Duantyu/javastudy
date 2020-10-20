 package test;

public class HelloWorldException {
	public static void main(String args[]) {
		int i = 0;
		String greetings [] = {
				"Hello world!",
				"No, I mena it!",
				"HELLO WORLD!!"
		};
		
		while (i > 1) {
			try {
				System.out.println(greetings[i]);
		 	} 
			//捕获所发生的异常，将越界的下标重新置回0
			  catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Resetting Index Value");
				i = -1;  
			} catch (Exception e) {
				System.out.println(e.toString());
			} finally {
				System.out.println("This is always printed");
			}
			i++;
		}
	}
}
