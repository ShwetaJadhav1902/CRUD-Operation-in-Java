package crud;

public class SalesExecutive extends Employee{
	private double TravAllo;

	public SalesExecutive(int empId,String empName,double basicSal,double hra,double da,double travallo) {
		super(empId,empName,basicSal,hra,da);
		this.TravAllo = travallo;
	}
public double calculateSalary() {
		
		return super.calculateSalary()+TravAllo;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Salexe travaler alowance:"+TravAllo);
		System.out.println("Salexe total Salary:"+calculateSalary());
	}
	public double getTravAllo() {
		return TravAllo;
	}
	public void setTravAllo(double travAllo) {
		TravAllo = travAllo;
	}
	

}
