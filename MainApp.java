package crud;
import java.util.Scanner;
import compiletimeexception.EmailException;
import java.util.Comparator;
import java.util.Collections;


import java.util.*;
public class MainApp{
public static void main(String[] args) {
	
	String username="Seed";
	String password="Infotech";
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("UserName ");
	String un=sc.next();
	System.out.println("Password ");
	String pass=sc.next();
	
	if(username.equals(un)) {
		if(password.equals(pass)) {
			System.out.println("Hello.. You are successfully Loged In");
		}
	}else {
		System.out.println("Username and PassWord are incorrect... Please try again later...");
	}

	int choice5;
	
	ArrayList<Employee> a =new ArrayList<Employee>();
	do{
		   System.out.println("Welcome To Employee Portal...");
		    System.out.println("-------------------------------------------------------");
		    System.out.println("Select from following options: ");
	    	System.out.println("1.Add new Employee");
		    System.out.println("2.Update Employee Details");
	    	System.out.println("3.Delete Perticular Employee");
	    	System.out.println("4.Display All Employees");
	    	System.out.println("5.Display Employee Detail by ID");
	    	
	     	int choice1 = sc.nextInt();
	    	switch (choice1)
	    	{
	    	case 0:
	    		System.out.println("You Have Been Logged Out");
	    		
	    		break;
	    	case 1: 
	    		 System.out.println("Enter Employee ID: ");
	    	     int empID= sc.nextInt();
	    	     sc.nextLine();   
	    	     System.out.println("---------------------------------------------------------------------------------------------------------");
	             System.out.println("Enter Employee Name:");
	             String empName = sc.nextLine();

	   	         System.out.println("---------------------------------------------------------------------------------------------------------");
	   	         System.out.println("Enter Employee Basic Salary:");
	   	         int basicSal = sc.nextInt();

	   	         System.out.println("---------------------------------------------------------------------------------------------------------");
	    	     System.out.println("Enter Employee Home Rent Allowance (HRA):");
	             double hra = sc.nextDouble();
 
	             System.out.println("---------------------------------------------------------------------------------------------------------");
	  	         System.out.println("Enter Employee Dearness Allowance (DA):");
	   	         double da = sc.nextDouble();
    	         System.out.println("---------------------------------------------------------------------------------------------------------");
	             System.out.println("Choose Designation of the Employee:"
	                         + "\n1. Manager"
	    	                 + "\n2. Sales Executive"
	    	                 + "\n3. Developer");
	    	     int choice2=sc.nextInt();
	    	     switch(choice2)
	    	     {
	             case 1: 
	    	       	System.out.println("Enter Manager Incentives: ");
	    	       	double inc= sc.nextDouble();
	    	       	a.add(new Manager(empID, empName, basicSal, hra, da,inc));
	    	       	break;
	    	     case 2:
	    	       	System.out.println("Enter Sales Executive Travle Allowances: ");
	    	       	double ta= sc.nextDouble();
	    	       	a.add(new SalesExecutive( empID, empName, basicSal, hra, da,ta ));
	            	break;
	             case 3:
	   	        	System.out.println("Enter Devloper Night Allownces: ");
	   	        	double na= sc.nextDouble();
	   	        	a.add(new Developer(empID, empName, basicSal, hra, da,na));
    	        	break;
	    	     default :
    	        	System.out.println("You Have Entered Wrong Choice...!");
    	        	break;
	    	     }
	    	     break;
	    	case 2:
	    	try {
	    		System.out.println("Enter EmployeeID you want to update the details");
	    		int id = sc.nextInt();
	    		int found =0;
	    		for (Employee o:a)
	    		{
	    			if(id==o.getEmpId())
	    			{
	    			    if(o instanceof Manager)
	    			    {
	    			    	System.out.println("Select Which detail you want to update.");
	    			    	System.out.println("\n1.Employee Name "
	    			    			+ "\n2.Employee Basic Salary "
	    			    			+ "\n3.Home Rental Allowances"
	    			    			+"\n4.Dearness Allowances \n5.Incentives");
	    			    	int choice3 = sc.nextInt();
	    			    	switch(choice3)
	    			    	{
	    			    	case 1:
	    			    		System.out.println("Enter Employee Name:");
	    			    		sc.nextLine();
	    			             String EmpName = sc.nextLine();
	    			             ((Manager) o).setEmpName(EmpName);
	    			             break;
	    			    	case 2:
	    			    		System.out.println("Enter Employee Basic Salary:");
	    			   	         int basicSal1 = sc.nextInt();
	    			   	         ((Manager) o).setBasicSal(basicSal1);
	    			   	         break;
	    			    	case 3:
	    			    		System.out.println("Enter Employee Home Rent Allowance (HRA):");
	    			             double hra1 = sc.nextDouble();
	    			             ((Manager) o).setHra(hra1);
	    			             break;
	    			    	case 4:
	    			    		System.out.println("Enter Employee Dearness Allowance (DA):");
	    			   	         double Da = sc.nextDouble();
	    			    		((Manager) o).setDa(Da);
	    			    		break;
	    			    	case 5:
	    			    		System.out.println("Enter Manager Incentives: ");
	    		    	       	double inc= sc.nextDouble();
	    		    	       	((Manager) o).setInc(inc);
	    		    	       	break;
	    		    	    default:
	    		    	    	System.out.println("You have entered wrong choice");
	    		    	    	break;
	    			    	}
	    			    }else if(o instanceof SalesExecutive)
	    			    {
	    			    	System.out.println("Select Which detail you want to update.");
	    			    	System.out.println("\n1.Employee Name "
	    			    			+ "\n2.Employee Basic Salary "
	    			    			+ "\n3.Home Rental Allowances"
	    			    			+"\n4.Dearness Allowances \n5.Travle Allowances");
	    			    	int choice3 = sc.nextInt();
	    			    	switch(choice3)
	    			    	{
	    			    	case 1:
	    			    		System.out.println("Enter Employee Name:");
	    			    		sc.nextLine();
	    			             String EmpName = sc.nextLine();
	    			             ((SalesExecutive) o).setEmpName(EmpName);
	    			             break;
	    			    	case 2:
	    			    		System.out.println("Enter Employee Basic Salary:");
	    			   	         int BasicSal = sc.nextInt();
	    			   	        ((SalesExecutive) o).setBasicSal(BasicSal);
	    			   	         break;
	    			    	case 3:
	    			    		System.out.println("Enter Employee Home Rent Allowance (HRA):");
	    			             double HRA = sc.nextDouble();
	    			             ((SalesExecutive) o).setHra(HRA);
	    			             break;
	    			    	case 4:
	    			    		System.out.println("Enter Employee Dearness Allowance (DA):");
	    			   	         double DA = sc.nextDouble();
	    			    		((SalesExecutive) o).setDa(DA);
	    			    		break;
	    			    	case 5:
	    			    		System.out.println("Enter Sales Exicutives Travle Allowances: ");
	    		    	       	double TA= sc.nextDouble();
	    		    	       	((SalesExecutive) o).setTravAllo(TA);
	    		    	       	break;
	    			    	default:
	    		    	    	System.out.println("You have entered wrong choice");
	    		    	    	break;
	    			    	}
	    			    }else if(o instanceof Developer)
	    			    {
	    			    	System.out.println("Select Which detail you want to update.");
	    			    	System.out.println("\n1.Employee Name "
	    			    			+ "\n2.Employee Basic Salary "
	    			    			+ "\n3.Home Rental Allowances"
	    			    			+"\n4.Dearness Allowances \n5.Night Allowances");
	    			    	int choice3 = sc.nextInt();
	    			    	switch(choice3)
	    			    	{
	    			    	case 1:
	    			    		System.out.println("Enter Employee Name:");
	    			             String EmpName = sc.nextLine();
	    			             sc.nextLine();
	    			             ((Developer) o).setEmpName(EmpName);
	    			             break;
	    			    	case 2:
	    			    		System.out.println("Enter Employee Basic Salary:");
	    			   	         int BasicSal = sc.nextInt();
	    			   	        ((Developer) o).setBasicSal(BasicSal);
	    			   	         break;
	    			    	case 3:
	    			    		System.out.println("Enter Employee Home Rent Allowance (HRA):");
	    			             double HRA = sc.nextDouble();
	    			             ((Developer) o).setHra(HRA);
	    			             break;
	    			    	case 4:
	    			    		System.out.println("Enter Employee Dearness Allowance (DA):");
	    			   	         double DA = sc.nextDouble();
	    			    		((Developer) o).setDa(DA);
	    			    		break;
	    			    	case 5:
	    			    		System.out.println("Enter Developers Night Allowances: ");
	    		    	       	double nightshift= sc.nextDouble();
	    		    	       	((Developer) o).setNightShift(nightshift);
	    		    	       	break;
	    			    	default:
	    		    	    	System.out.println("You have entered wrong choice");
	    		    	    	break;
	    			    	}
	    			    }
	    			    found = 1;
	    			}
	    		}
	    		if(found == 0)
	    		{
	    			throw new EmployeeNotFoundException("Employee not Found...");
	    		}
	    	      }catch(Exception e)
	    	       {
	    		        System.out.println(e.getMessage());
			            e.printStackTrace();
	    	       }
	    	      break;
	    	case 3:
	    		try
	    		{
	    			int found = 0;
	    		    System.out.println("Enter Employee ID you want to remove.");
	    		    int id = sc.nextInt();
	    		    for (Employee e:a)
	    		    {
	    		    	if (id == e.getEmpId())
	    		    	{
	    		    		a.remove(id);
	    		    		found = 1;
	    		    	}
	    		    }
	    		    if (found == 0)
	    		    {
	    		    	throw new EmployeeNotFoundException("Employee not found");
	    		    }
	    		}catch(Exception e)
	    		{
	    			System.out.println(e.getMessage());
		            e.printStackTrace();
	    		}
	    		break;
	    	case 4:
	    		System.out.println("Enter How you want to sort the list"
	    				+"\n1.By Employee ID"
	    				+"\n2.By Employee Name"
	    				+"\n3.By Employee Basic Salary");
	    		int choice4 = sc.nextInt();
	    		switch (choice4)
	    		{
	    		case 1:
	    			Collections.sort(a,new ShortedById());
	    			for(Employee e:a)
		    		{
		    			System.out.println(e);
		    		}
		    		break;
	    		case 2:
	    			Collections.sort(a,new ShortedByName());
	    			for(Employee e:a)
		    		{
		    			System.out.println(e);
		    		}
		    		break;
	    		case 3:
	    			Collections.sort(a,new SortedBySal());
	    			for(Employee e:a)
		    		{
		    			System.out.println(e);
		    		}
		    		break;
		    	default:
		    		System.out.println("You have entered wrong choice");
		    		break;
	    		}
	    		break;
	    	case 5:
	    		try
	    		{
	    			int found = 0;
	    			System.out.println("Enter employee ID");
		    		int id = sc.nextInt();
		    		for(Employee e:a)
		    		{
		    			if (id==e.getEmpId())
		    			{
		    				System.out.println(e);
		    				found = 1;
		    				break;
		    			}
		    		}
		    		if(found == 0)
		    		{
		    			throw new EmployeeNotFoundException("Employee Not Found.");
		    		}
	    		}catch (Exception e)
	    		{
	    			System.out.println(e.getMessage());
		            e.printStackTrace();
	    		}
	    	default:
	    		System.out.println("You have entered wrong choice");
	    			
		}
	    	System.out.println("Press 1 To continue and 0 to exit");	    	
	    	choice5 = sc.nextInt();
      }while(choice5 != 0);
      }
   }