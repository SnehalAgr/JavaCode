package exception;

public class ThrowsDemo {

	public static void main(String[] args) throws Throwable {
		System.out.println("Main Started ");
		test();
		System.out.println("Main Ended ");
		
	}


	public static void test() throws InterruptedException
	{
		System.out.println("I'm in test method");
		Thread.sleep(5000);
	}

	}

