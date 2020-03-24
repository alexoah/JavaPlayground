/**
 *	from JAVA Methods: Exercise 5 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_methods5 )
 *
 *	question:
 *	Follow the comments to insert the missing parts of the code below:
 *
 *	// Create a checkAge() method with an integer variable called age
 *	static void ________(___ ___) {
 *		// If age is less than 18, print "Access denied"
 *		__ (___ _ __) {
 *			System.out.println("Access denied"); 
 *		// If age is greater than 18, print "Access granted"
 *		} ____ {
 *			System.out.println("Access granted"); 
 *		}
 *	} 
 *
 *	public static void main(String[] args) { 
 *		// Call the checkAge method and pass along an age of 20
 *		________(__);
 *	}
 *
 */
// Create a checkAge() method with an integer variable called age
static void checkAge(int age) {
	// If age is less than 18, print "Access denied"
	if (age < 18) {
		System.out.println("Access denied"); 
	// If age is greater than 18, print "Access granted"
	} else {
		System.out.println("Access granted"); 
	}
} 

public static void main(String[] args) { 
	// Call the checkAge method and pass along an age of 20
	checkAge(20);
}