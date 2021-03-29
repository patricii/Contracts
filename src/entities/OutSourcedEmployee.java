package entities;

public class OutSourcedEmployee extends Employee {
	
	private Double AddicionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
		super(name, hours, valuePerHour);
		AddicionalCharge = addicionalCharge;
	}

	public Double getAddicionalCharge() {
		return AddicionalCharge;
	}

	public void setAddicionalCharge(Double addicionalCharge) {
		AddicionalCharge = addicionalCharge;
	}

	
}
