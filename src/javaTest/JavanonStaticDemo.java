package javaTest;

public class JavanonStaticDemo {

	
	private JavanonStaticDemo() {
		
	}
	static {
		System.out.println("hi");
	}
	{
		System.out.println("non-static-block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("from main method");
	JavanonStaticDemo jnsd1=new JavanonStaticDemo();
		Car car = new Car();
		System.out.println(car.manufacturer);
		System.out.println(Car.wheels);
	}

}
