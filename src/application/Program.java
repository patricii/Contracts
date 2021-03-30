package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		String name;
		int hour;
		double value;
		for (int i = 1; i <= n; ++i) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsorced y / n ? :");
			char sn = sc.nextLine().charAt(0);
			sc.nextLine();
			System.out.print("Name :");
			name = sc.nextLine();
			System.out.print("Hours :");
			hour = sc.nextInt();
			System.out.print("Value per hour: ");
			value = sc.nextDouble();
			if (sn == 'y') {
				System.out.print("Addicional Charge :");
				double charge = sc.nextDouble();
				list.add(new OutSourcedEmployee(name, hour, value, charge));
			} else {
				list.add(new Employee(name, hour, value));
			}

		}

		sc.close();

	}

}
