package week02;

public class Employee implements Cloneable{
	private String name;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "name is" + name + "salary is " + salary;
	}
	
	@Override
	public Employee clone throws CloneNotSupportedException() {
		return (Employee) super.clone();
	}
}
