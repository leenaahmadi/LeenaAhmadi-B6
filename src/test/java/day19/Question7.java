package day19;

public class Question7 {

	//non static String return type with one parameter
	String helloTo(String strOne) {
		
		//using result because non void return
		String result = "Hello " + strOne;

		//print result which is hello plus the parameter provided
		System.out.println(result);

		return result;

	}

	public static void main(String[] args) {
		
	//created a new object since we are accessing a non static method
	Question7 obj = new Question7();
	
	obj.helloTo("Denis");
	obj.helloTo("Malek");
	obj.helloTo("Sara");
	
	}

}
