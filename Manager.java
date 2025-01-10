package crud;

public class Manager extends Employee {
	private double inc;

	public Manager(int empId, String empName, double basicSal, double hra, double da,double inc) {
		super(empId, empName, basicSal, hra, da);
		this.inc=inc;
	}
	
	public double calculateSalary() {
		
		return super.calculateSalary()+inc;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Manager insentive:"+inc);
		System.out.println("Manager total Salary:"+calculateSalary());
	}

	public double getInc() {
		return inc;
	}

	public void setInc(double inc) {
		this.inc = inc;
	}

}
