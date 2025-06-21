
public class FinancialForecasting {
	
	public static float futureGrowth(int year, float annualGrowthRate, int initialInvestment) {
//		System.out.printf("%d %f %d\n",year, annualGrowthRate, initialInvestment);
		if(year == 0) {
			return initialInvestment;
		}
		return futureGrowth(year - 1, annualGrowthRate, initialInvestment) * (annualGrowthRate + 1);
	}
	
	
	public static void main(String[] args) {
		
		int initialInvestment = 1000, year = 8;
		float annualGrowthRate = 0.25f;
		
		float futureValue = futureGrowth(year, annualGrowthRate, initialInvestment);
		System.out.printf("Future value after %d years: %.2f\n", year, futureValue);

	}

}
