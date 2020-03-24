/**
 *	from JAVA Classes/Objects: Exercise 5 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_classes5 )
 *
 *	question:
 *	Create and call a class constructor of MyClass
 *	Follow the comments to insert the missing parts of the code below:
 *
 *	// Create a MyClass class
 *	public class _______ {
 *		int _;  // Create a class attribute x
 *
 *		// Create a class constructor for the MyClass class
 *		public _______() {
 *			x = _;  // Set the initial value for the class attribute x to 5
 *		}
 *
 *		public static void main(String[] args) {
 *			// Create an myObj object of class MyClass (This will call the constructor)
 *			MyClass _____ = new MyClass(); 
 *			// Print the value of x
 *			System.out.println(_____._);
 *		}
 *	}
 *
 */
// Create a MyClass class
public class MyClass {
	int x;  // Create a class attribute x

	// Create a class constructor for the MyClass class
	public MyClass() {
		x = 5;  // Set the initial value for the class attribute x to 5
	}

	public static void main(String[] args) {
		// Create an myObj object of class MyClass (This will call the constructor)
		MyClass myObj = new MyClass(); 
		// Print the value of x
		System.out.println(myObj.x);
	}
}