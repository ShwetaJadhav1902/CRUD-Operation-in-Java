
package crud;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(String msg) {
		System.out.println(msg);
	}
}
