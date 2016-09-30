package builder;

public abstract class Builder {
	protected Product product;
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	
	public Builder(Product p)
	{
		this.product = p;
	}
	
	public Product getResult()
	{
		return product;
	}
}
