package exam06;

import exam06.cal.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int result = 0;
		result = calculator.addTwoNumber(2, 1);
		System.out.println(result);
		
		
		result = calculator.subTwoNumber(2, 1);
		System.out.println(result);
		
		calculator.showOperationTimes();
	}

}
