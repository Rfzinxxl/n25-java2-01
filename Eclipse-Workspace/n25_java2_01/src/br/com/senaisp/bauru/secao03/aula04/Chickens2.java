package br.com.senaisp.bauru.secao03.aula04;

public class Chickens2 {

	public static void main(String[] args) {
		double dailyAverage = 0, monthlyAverage = 0, monthlyProfit = 0;
		int totalEggs = 0;
		totalEggs = 100;
		totalEggs += 121;
		totalEggs += 117;
		dailyAverage = totalEggs / 3.;
		monthlyAverage = dailyAverage * 30;
		monthlyProfit = monthlyAverage * 0.18;
		

      System.out.println("Daily Average:   " +dailyAverage);
      System.out.println("Monthly Average: " +monthlyAverage);
      System.out.println("Monthly Profit:  $" +monthlyProfit);

	}

}
