/**
 *	from JAVA Methods: Exercise 3 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_methods3 )
 *
 *	question:
 *	Add a fname parameter of type String to myMethod, and output "John Doe".
 *
 *	static void myMethod(______ _____) {
 *		System.out.println(_____ + " Doe");
 *	}
 *
 *	public static void main(String[] args) {
 *		myMethod("John");
 *	}
 *
 */
static void myMethod(String fname) {
	System.out.println(fname + " Doe");
}

public static void main(String[] args) {
	myMethod("John");
}