package app;
import java.util.Locale;
import java.util.Scanner;

import services.TaxService;

public class Program {

	public static void main(String[] args) {
		// Programa para calcular o salário liquido de um funcionário
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TaxService taxService = new TaxService();
		
		System.out.println(taxService.tax(4000.00));
		
		/*
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Salário bruto: ");
		double grossSalary = sc.nextDouble();
		
		double netSalary = grossSalary * 0.7;
		System.out.printf("Salário líquido = %.2f%n", netSalary);
		*/
		sc.close();
	}

}
