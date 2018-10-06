package creational_patterns.builder;

public abstract class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
