package decorative.design.pattern;

abstract public class ToppingDecorator implements Pizza{
	 Pizza pizza;
	public ToppingDecorator(Pizza pizza) {
		this.pizza =pizza;
	}

	
	public String getDescription() {
		System.out.println("ToppingDecorator");
		return pizza.getDescription();
	}

	
	public double getCost() {
		
		return pizza.getCost();
	}
	
}
