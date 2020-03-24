/**
 *	from JAVA Exceptions: Exercise 2 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_try_catch2 )
 *
 *	question:
 *	Insert the missing keyword to execute code, after try..catch, regardless of the result.
 *
 *	try {
 *		int[] myNumbers = {1, 2, 3};
 *		System.out.println(myNumbers[10]);
 *	} catch (Exception e) {
 *		System.out.println("Something went wrong.");
 *	} _______ {
 *		System.out.println("The 'try catch' is finished.");
 *	}
 *
 */
try {
	int[] myNumbers = {1, 2, 3};
	System.out.println(myNumbers[10]);
} catch (Exception e) {
	System.out.println("Something went wrong.");
} finally {
	System.out.println("The 'try catch' is finished.");
}