/**
 *	from JAVA Exceptions: Exercise 1 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_try_catch1 )
 *
 *	question:
 *	Insert the missing parts to handle the error in the code below.
 *
 *	___ {
 *		int[] myNumbers = {1, 2, 3};
 *		System.out.println(myNumbers[10]);
 *	} _____ (Exception e) {
 *		System.out.println("Something went wrong.");
 *	}
 *
 */
try {
	int[] myNumbers = {1, 2, 3};
	System.out.println(myNumbers[10]);
} catch (Exception e) {
	System.out.println("Something went wrong.");
}