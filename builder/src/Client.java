package builder;

public class Client {
	public static void main(String []args)
	{
		// client 1
		Product raw = new Product();
		Builder b = new ConcreteBuilder(raw);
		Director d = new Director();
		d.setBuilder(b);
		Product manu = d.Construct();
		//***************************
		
		
		
	
	}

}
