/**
 *	from JAVA Switch: Exercise 2 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_switch2 )
 *
 *	question:
 *	Complete the switch statement, and add the correct keyword at the end to specify some code to run if there is no case match in the switch statement.
 *
 *	int day = 4;
 *	switch (___) {
 *		____ 1:
 *			System.out.println("Saturday");
 *			break;
 *		____ 2:
 *			System.out.println("Sunday");
 *			_____;
 *		_______:
 *			System.out.println("Weekend");
 *	}
 *
 */
int day = 4;
switch (day) {
	case 1:
		System.out.println("Saturday");
		break;
	case 2:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Weekend");
}