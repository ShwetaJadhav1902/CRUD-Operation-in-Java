package crud;

import java.util.Comparator;

public class SortedBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getBasicSal()>o2.getBasicSal()) {
			return 1;
		}else if(o1.getBasicSal()<o2.getBasicSal()) {
			return -1;
		}else {
			return 0;
		}
	}

	
}