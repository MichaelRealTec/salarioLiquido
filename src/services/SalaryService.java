package services;

import entities.Employee;

public class SalaryService {
	
	// Forma correta = princípio da inversão de controle!
	// Injeção de independência 
	private TaxService taxService;
	private PensionService pensionService;
	
	/* Criando a classe Salário Serviços */
	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary())	;
	}
	
	/* Crinado o método construtor */
	public SalaryService(TaxService taxService, PensionService pensionService) {
		this.taxService = taxService;
		this.pensionService = pensionService;
	}
}
