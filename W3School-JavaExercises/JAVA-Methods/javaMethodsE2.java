/**
 *	from JAVA Methods: Exercise 2 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_methods2 )
 *
 *	question:
 *	Insert the missing part to call myMethod from main two times.
 *
 *	static void myMethod() {
 *		System.out.println("I just got executed!");
 *	}
 *
 *	public static void main(String[] args) {
 *		__________;
 *		__________;
 *	}
 *
 */
static void myMethod() {
	System.out.println("I just got executed!");
}

public static void main(String[] args) {
	myMethod();
	myMethod();
}