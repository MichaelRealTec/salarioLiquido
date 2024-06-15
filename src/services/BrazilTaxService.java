package services;

public class BrazilTaxService extends TaxService{
	
	// Sobrescrever o método TaxService
	@Override
	public double tax(double amount) {
		return amount * 0.3; // imposto de 30%
	}
}


