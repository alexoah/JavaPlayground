/**
 *	from JAVA Loops: Exercise 6 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_while_loop6 )
 *
 *	question:
 *	In the loop, when the value is "4", jump directly to the next value.
 *
 *	for (int i = 0; i < 10; i++) {
 *		if (i == 4) {
 *			________;
 *		}
 *		System.out.println(i);
 *	}
 *
 */
for (int i = 0; i < 10; i++) {
	if (i == 4) {
		continue;
	}
	System.out.println(i);
}