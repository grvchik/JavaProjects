package July;

public class Knap {

	public void getClassName() {
		// TODO Auto-generated method stub
		Class<?> enclosingClass = getClass().getEnclosingClass();
		if (enclosingClass != null) {
		  System.out.println(enclosingClass.getName());
		} else {
		  System.out.println(this.getClass().getSimpleName());
		}		
	}
	
	public static void main(String[] args) {

		Knap nap = new Knap();
		nap.getClassName();
		
		System.out.println("something");
	}

}
