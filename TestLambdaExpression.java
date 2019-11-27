package features;


/*Application of Lambda Expression
 * 1) Pass a function as a parameter for other function
 * 2) Implement a function inside another
 * 3) return function implementation from other function
 * 4) reduced code
 * 5) provides multiple implementation of a method in same class using different references of interface
 * 6) Sequential and Parallel Execution Support by passing behavior in methods
 * 7) Higher Efficiency (Utilizing Multicore CPU’s)
 */


/*Advantages of Lambda Expression
 * If you are not use lambda expression for first three applications then
 * create local or Anonymous class
 * */


interface Lambda{
	public int calc(int a,int b);
}

public class TestLambdaExpression {

	/* Application 1 */
	public void retrieveImplementationOfFunction(Lambda a) {
		System.out.println(a.calc(10, 20));
	}
	
	/* Application 2 */
	public void functionInsideFunction() {
		Lambda multiply = (int a,int b)->a*b; 
	}
	
	/* Application 3 */
	public Lambda returnsfunctionImplementation() {
		Lambda multiply = (int a,int b)->a*b; 
		return multiply;
	}
	
	/* Main method */
	public static void main(String[] args) {

		TestLambdaExpression obj = new TestLambdaExpression();
		Lambda add = (a,b)->a+b;
		
		obj.functionInsideFunction();
		obj.retrieveImplementationOfFunction(add);
		Lambda multiply = obj.returnsfunctionImplementation(); 
	
		
	}
}
