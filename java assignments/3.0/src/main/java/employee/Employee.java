package employee;

public class Employee {
	private int eid;
	private double salary;
	private String name;
	private double pfper;
	public Employee(int eid, double salary, String name, double pfper) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.pfper = pfper;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPfper() {
		return pfper;
	}
	public void setPfper(double pfper) {
		this.pfper = pfper;
	}
	public double calNetPay()
	{
		if(pfper<=5)
		{
			return salary;
			
		}
		else
			return salary-salary*(pfper/100);
	}
}
