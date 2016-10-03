
public class HelloWorld { //class body for class HelloWorld

	private String message;//class HelloWorld has a private String field "message"
	
	public HelloWorld() //HelloWorld constructor creates a new HelloWorld object
	{
		message = "Hello World!";//constructor sets message to "Hello World!"
	}
	
	public void printMessage() //public method printMessage prints instance's message to console
	{
		System.out.println(message);
	}
	
	public static void main(String[] args) //main function - first in program execution
	{
		HelloWorld test = new HelloWorld(); // create new HelloWorld object "test"
		HelloWorld test2 = new HelloWorld(); //create another HelloWorld object "test2"
		test.printMessage(); //print messages
		test2.printMessage(); 
	}
	
}
