package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		Double grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		Double tax = sc.nextDouble();
		
		Employee emp = new Employee(name, grossSalary, tax);
		System.out.println("Employee " + emp);
		
		System.err.println();
		
		System.out.print("Which percentage to increase salary: ");
		Double percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		System.out.println(emp);
		
		sc.close();
	}

}
