import java.util.Scanner;

class Person
{
	void getFirstName(String fname)
	{
		System.out.println("First Name - "+fname);
	}
	void getLastName(String lname,String jobtitle)
	{
		System.out.println("Last Name - "+lname);
		System.out.println("Job Title - "+jobtitle);
	}
}

class Employee extends Person
{
	void employeeid(int id)
	{
		System.out.println("Employee ID - "+id);
	}
}

class Persons
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		String lname = sc.nextLine();
		String jobtitle = sc.nextLine();
		int id = sc.nextInt();
		Person p = new Person();
		Employee e = new Employee();
		p.getFirstName(fname);
		p.getLastName(lname);
		p.getLastName(jobtitle);
		e.employeeid(id);
	}
}