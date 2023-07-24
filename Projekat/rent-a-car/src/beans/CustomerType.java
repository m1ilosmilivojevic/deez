package beans;

public class CustomerType {
	private enum Type {
		Gold, Silver, Bronze;
	}
	
	private Type type;
	private double percent;
	private int requirements;
	
	public CustomerType() {
		super();
	}
	
	public CustomerType(Type type, double percent, int requirements) {
		super();
		this.type = type;
		this.percent = percent;
		this.requirements = requirements;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getRequirements() {
		return requirements;
	}
	public void setRequirements(int requirements) {
		this.requirements = requirements;
	}
	
}
