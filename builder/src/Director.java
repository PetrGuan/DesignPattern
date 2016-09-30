package builder;

public class Director {
	private Builder pbuilder;
	
	public void setBuilder(Builder builder)
	{
		this.pbuilder = builder;
	}
	
	public Product Construct()
	{
		pbuilder.buildPartA();
		pbuilder.buildPartB();
		pbuilder.buildPartC();
		
		return pbuilder.getResult();
	}
}
