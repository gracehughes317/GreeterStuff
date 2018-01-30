package greeterProj;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter joe = new Greeter();
		System.out.println(joe.toString());
		
		Greeter[] arr = new Greeter[5];
		arr[0] = new Greeter("Sally",20);
		arr[1] = new Greeter("Jamie",11);
		arr[2]= new Greeter("Mark",23);
		arr[3]= new Greeter("Edna",57);
		arr[4]= joe;
		
		for(int c = 0; c<5; c++)
		{
			System.out.println(arr[c].toString());
		}
		
		
	}

}
