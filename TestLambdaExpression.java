package features;

/* Functional Interface */
interface Lambda{
	public int calc(int a,int b);
}

public class TestLambdaExpression {

	/* Application 1  retrieve function implementation as a arguments */
	public void retrieveImplementationOfFunction(Lambda a) {
		System.out.println(a.calc(10, 20));
	}
	
	/* Application 2 function implemented inside another function */
	public void functionInsideFunction() {
		Lambda multiply = (int a,int b)->a*b;
		System.out.println(multiply.calc(10,20));
	}
	
	/* Application 3 return fuction implementation */
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
		System.out.println(multiply.calc(1, 2));
		
	}
}
