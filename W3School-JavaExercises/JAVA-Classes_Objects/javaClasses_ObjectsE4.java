/**
 *	from JAVA Classes/Objects: Exercise 4 ( https://www.w3schools.com/java/exercise.asp?filename=exercise_classes4 )
 *
 *	question:
 *	Call myMethod on the object.
 *
 *	public class MyClass {
 *		public void myMethod() {
 *			System.out.println("Hello World");
 *		}
 *
 *		public static void main(String[] args) {
 *			MyClass myObj = new MyClass();
 *			_____.________();
 *		}
 *	}
 *
 */
public class MyClass {
	public void myMethod() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		myObj.myMethod();
	}
}