package hello;

public class HelloWorld {
	/*
	 *
	 *
	 *
	 *
	 * This is a long comment.
	 * Really.
	 * It takes up lots of lines
	 * For multiple line comments
	 *
	 * Types of types:
	 * int: integer that has 32 bits(2^31-1), it can be negative
	 * long: integer that has 64 bits (2^63 - 1), it can also be negative
	 * String: a word that has any number of bits; note that it is capitalized
	 * boolean: True or false: 1 bit
	 *
	 */
	//For one line comment
	public static void main(String[] args){
		System.out.println("Hello, world!");
		System.out.println("YOU HAVE SO MUCH AIDS!");
		int x = 3; //declares and defines x
		System.out.println(x); //prints x
		long peopleOfTheWorld = 7000000000L;
		System.out.println(peopleOfTheWorld);
		System.out.println(fib(10));
	}
	//the word before the name says what is being returned;
	public static int fib(int x){
		if (x<2){
			return 1;

		}
		else{
			return fib(x -2) + fib(x-1);

		}
	}
}
