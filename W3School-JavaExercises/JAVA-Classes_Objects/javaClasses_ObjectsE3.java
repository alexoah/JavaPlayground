/**
 *	from JAVA Classes/Objects: Exercise 3 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_classes3 )
 *
 *	question:
 *	Use myObj to access and print the value of the x attribute of MyClass.
 *
public class MyClass {
	int x = 5;

	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		System.out.println(_____._);
	}
} 
 *
 */
public class MyClass {
	int x = 5;

	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		System.out.println(myObj.x);
	}
} 