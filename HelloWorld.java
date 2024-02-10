package helloworld;

public class HelloWorld {

	public static void main(String[] args) {
			helloWorld("print");
	}

	public static void helloWorld(String str) {
		if (str.equals("print")) {
			System.out.println("hello world");
		} else
			System.out.println(str);
	}

}
