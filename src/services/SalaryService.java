package services;

import entities.Employee;

public class SalaryService {
	
	// Forma errada!
	TaxService taxService = new TaxService();
	PensionService pensionService = new PensionService();
	
	/* Criando a classe Salário Serviços */
	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary())	;
	}
}
