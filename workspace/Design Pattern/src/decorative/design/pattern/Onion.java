package decorative.design.pattern;

public class Onion extends ToppingDecorator{

	public Onion(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Base");
		System.out.println("Adding Onion");
	}

	@Override
	public String getDescription() {
		System.out.println("Onion");
		return pizza.getDescription() +", onion";
	}

	@Override
	public double getCost() {
		
		return pizza.getCost() +7;
	}





}
