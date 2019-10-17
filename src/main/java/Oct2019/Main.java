package Oct2019;

class A {
	static int i=100;
	static {
		i= i-- - --i;
		System.out.println("First"+i);		
	}
	{
		i = i++ + ++i;
		System.out.println("Second"+i);
	}
}

class B extends A{
	static {
		i= i-- - --i;
		System.out.println("Third"+i);		
	}
	{
		i = i++ + ++i;
		System.out.println("Fourth"+i);
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.i);
	}

}
