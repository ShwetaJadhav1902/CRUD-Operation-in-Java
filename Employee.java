package crud;

public class Employee {
	private int empId;
	private String empName;
	private double basicSal;
	private double hra;
	private double da;
	public Employee(int empId, String empName, double basicSal, double hra, double da) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}
	
	public double calculateSalary() {
		return basicSal+hra+da;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public void printInfo() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Basic Salary"+basicSal);
		System.out.println("Employee hra"+hra);
		System.out.println("Employee da"+da);
	}
}
