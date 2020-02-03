package com.viva;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ravi", 34344.34);
		Employee e2 = new Employee(2, "Priya", 44344.34);

		System.out.println(e1);
//		incrementSalary(e1, 5000);
		System.out.println(e1);
		System.out.println(e2);
		
		
		Manager m1 = new Manager(1, "Amit", 34344.34, 2);
		
		
		
		System.out.println(m1);
//		m1.incrementSalary(6000);
//		incrementSalary(m1, 6000);
		System.out.println(m1);
		m1.approveLeave();
		
		Employee employees[] = {e1,e2,m1};
		for(Employee e : employees){
			incrementSalary(e, 5000);
		}
		
	}
	
	static double incrementSalary(Employee e, double incrementAmount){
		e.salary += incrementAmount;
		return e.salary;
	}

}
