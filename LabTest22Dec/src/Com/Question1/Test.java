package Com.Question1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name = "Saurabh Kumar";
		e1.age = 24;
		e1.phone = "7091410741";
		e1.address = "Gaya";
		e1.salary = 30000;
		e1.specialization = "Computer Science";
		e1.department = "Engineering";
		System.out.println("Employee Details.............");
		System.out.println(e1);
		System.out.println();
		
		Manager m1 = new Manager();
		m1.name = "Shubham Singh";
		m1.age = 34;
		m1.phone = "8360475895";
		m1.address = "Ranchi";
		m1.salary = 90000;
		m1.specialization = "Computer Science";
		m1.department = "Engineering";
		System.out.println("Manager Details................");
		System.out.println(m1);

	}

}
