package Com.Question3;

public class Member {
	public String name;
	public int age;
	public String phone_number;
	public String address;
	public int salary;
	
	void print_salary(int salary)
	{
		System.out.println(salary);
	}

}

class Employee extends Member{
	public String Specialization;
	public String department;
	
}

class Manager extends Member{
	public String Specialization;
	public String department;
	
}
