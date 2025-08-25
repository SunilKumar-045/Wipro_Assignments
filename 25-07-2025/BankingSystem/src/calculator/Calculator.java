package calculator;

public class Calculator {

	public static void main(String[] args) {
		
		//Simple Interest Calculator
		InterestCalculator icalculator = new InterestCalculator() {
				public void simpleInterest(double principle,int years,double rate) {
					double interest = (principle*years*rate)/100;
					System.out.println("Simple Interest: "+interest);			
					}
		};
		icalculator.simpleInterest(80000, 1, 2);
		System.out.println();
		
		
		
		
		//EMI Calculator
		EMICalculator emicalculator = new EMICalculator() {
			public void emiCalculator(double principle,double annualRate,int tenureMonths) {
				double monthlyRate = annualRate / (12 * 100);
				double emi =(principle * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
	                       (Math.pow(1 + monthlyRate, tenureMonths) - 1);
				System.out.println("EMI to be paid per month: "+emi);
			}
		};
		emicalculator.emiCalculator(100000, 3, 12);
		System.out.println();
		
		
		
		
		//Currency converter
		CurrencyConverter currencyconverter = new CurrencyConverter() {
			public void currencyConverter(double rupees) {
				double usd = rupees/86.52;
				System.out.println("Rupees in usd: "+usd);
			}
		};
		currencyconverter.currencyConverter(5000);
		System.out.println();
		
		

	}

}
