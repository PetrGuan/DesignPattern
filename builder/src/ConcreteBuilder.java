package builder;

public class ConcreteBuilder extends Builder{
	
	public ConcreteBuilder(Product p) {
		super(p);
	}

	public void buildPartA() {
		this.product.setLength(10);
	}

	public void buildPartB() {
		this.product.setWidth(10);
	}

	public void buildPartC() {
		this.product.setPower(100);
		
	}

}
