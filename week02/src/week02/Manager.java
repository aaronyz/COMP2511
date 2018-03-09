package week02;

public class Manager extends Employee {
	private String hiredate;
	

	public Manager(String name, int salary,String hiredate) {
		super(name, salary);
		this.hiredate = hiredate;
	}

	public String getHiredate() {
		return hiredate;
	}

	public String getName() {
		return super.getName();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
