/**
 *	from JAVA If...Else: Exercise 4 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_conditions4 )
 *
 *	question:
 *	Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
 * 
 *	int x = 50;
 *	int y = 50;
 *	__ (x __ y) {
 *		System.out.println("1");
 *	} ____ __ (x > y) {
 *		System.out.println("2");
 *	} ____ {
 *		System.out.println("3");
 *	}
 *
 */
int x = 50;
int y = 50;
if (x == y) {
	System.out.println("1");
} else if (x > y) {
	System.out.println("2");
} else {
	System.out.println("3");
}