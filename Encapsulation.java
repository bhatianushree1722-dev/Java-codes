package jpl_b;

class Employee
{
	String name;
	String address;
	double salary;
	String jobTitle;
	
	public Employee(String name, String address, double salary, String jobTitle)
	{
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	public double calculateBonus()
	{
		return salary * 0.05;
	}
	public void generatePerformaceReport()
	{
		System.out.println("Performace report for : "+name);
		System.out.println("Job title : "+jobTitle);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
		System.out.println("Bonus : "+calculateBonus());
	}
	public void manageProject()
	{
		System.out.println(name+" is working on general company projects.");
	}
}

class Manager extends Employee
{
	public Manager(String name, String address, double salary)
	{
		super(name, address, salary, "Manager");
	}
	public double calculateBonus()
	{
		return salary * 0.15;
	}
	public void manageProject()
	{
		System.out.println(name+" is managing multiple company projects and leading teams.");
	}
}

class Developer extends Employee
{
	public Developer(String name, String address, double salary)
	{
		super(name, address, salary, "Developer");
	}
	public double calculateBonus()
	{
		return salary * 0.10;
	}
	public void manageProject()
	{
		System.out.println(name+" is developing software modules and fixing bugs.");
	}
}
class Programmer extends Employee
{
	public Programmer(String name, String address, double salary)
	{
		super(name, address, salary, "Programmer");
	}
	public double calculateBonus()
	{
		return salary * 0.08;
	}
	public void manageProject()
	{
		System.out.println(name+" is writing code and assisting in testing.");
	}
}
public class EmployeeHierarchy {
	public static void main(String args[])
	{
		Manager mgr = new Manager("Alice", "Mumbai", 90000);
		Developer dev = new Developer("Bob", "Pune", 70000);
		Programmer prog = new Programmer("Charlie", "Nagpur", 60000);
		
		Employee[] employees = {mgr, dev, prog};
		for(Employee emp : employees)
		{
			System.out.println("==================");
			emp.generatePerformaceReport();
			emp.manageProject();
			System.out.println();
		}
	}
}