package generics.max.element.test;

public class MaximumElement {
	
	public static void main(String[] args) {
		System.out.println("Test Maximum of 3 variables\n");
		
		Integer firstNum = 10;
		Integer secondNum = 20;
		Integer thirdNum = 30;
		Float floatNum1 = 23.2f;
		Float floatNum2 = 11.3f;
		Float floatNum3 = 5.5f;
		
		findMax(firstNum, secondNum, thirdNum);
		findMax(floatNum1, floatNum2, floatNum3);
	}
	
	public static void findMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println(maximumNumber + " is maximum out of "+firstNumber+", "+secondNumber+" and "+thirdNumber);
	}
	
	public static void findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println(maximumNumber + " is maximum out of "+firstNumber+", "+secondNumber+" and "+thirdNumber);
	}
}
