package entities;

public class Employee {
	/* Criando a Classe Employee = Funcionários */
	
	/* Criando os atributos */
	private String name;
	private Double grossSalary;
	
	/* Criando os métodos Getters e Setters */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getGrossSalary() {
		return grossSalary;
	}
	
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	/* Criando os métodos construtores */
	public Employee() {
		
	}
	
	public Employee(String name, Double grossSalary) {
		super();
		this.name = name; 
		this.grossSalary = grossSalary;
	}
	


}
