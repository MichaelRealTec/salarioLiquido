package app;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;


public class Program {

	public static void main(String[] args) {
		// Programa para calcular o salário liquido de um funcionário
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário bruto: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		TaxService taxService = new TaxService();
		
		PensionService pensionService = new PensionService();
		
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		double netSalary = salaryService.netSalary(employee);
				
		System.out.printf("Salário líquido = %.2f%n", netSalary);
		
		sc.close();
	}

}
