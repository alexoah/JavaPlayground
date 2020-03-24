/**
 *	from JAVA Loops: Exercise 5 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_while_loop5 )
 *
 *	question:
 *	Stop the loop if i is 5.
 *
 *	for (int i = 0; i < 10; i++) {
 *		if (i == 5) {
 *			_____;
 *		}
 *		System.out.println(i);
 *	}
 *
 */
for (int i = 0; i < 10; i++) {
	if (i == 5) {
		break;
	}
	System.out.println(i);
}