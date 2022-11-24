package Com.Question3;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.name = "Saurabh Kumar";
		emp.age = 24;
		emp.phone_number = "8360475895";
		emp.address = "Gaya";
		emp.department = "BTECH";
		emp.Specialization = "CSE";
		//printing details
		System.out.println("Name :"+emp.name);
		System.out.println("Age :"+emp.age);
		System.out.println("Contact :"+emp.phone_number);
		System.out.println("Address :"+emp.address);
		System.out.print("Salary :");
		emp.print_salary(40000);
		System.out.println("Department :"+emp.department);
		System.out.println("Specialization :"+emp.Specialization);
		
		Manager man = new Manager();
		man.name = "Rohit";
		man.age= 35;
		man.phone_number = "456789";
		man.address= "Delhi";
		man.department = "Management";
		man.Specialization = "CSE";
		
		System.out.println("Name :"+man.name);
		System.out.println("Age :"+man.age);
		System.out.println("Contact :"+man.phone_number);
		System.out.println("Address :"+man.address);
		System.out.print("Salary :");
		man.print_salary(55000);
		System.out.println("Department :"+man.department);
		System.out.println("Specialization :"+man.Specialization);
		

	}

}

