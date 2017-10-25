package decorative.design.pattern;

public class Tomato extends ToppingDecorator{

	public Tomato(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Tomato");
	}

	@Override
	public String getDescription() {
		System.out.println("Tomato");
		return pizza.getDescription()+", Tomato";
	}

	@Override
	public double getCost() {
		
		return pizza.getCost() +8;
	}
	

}
