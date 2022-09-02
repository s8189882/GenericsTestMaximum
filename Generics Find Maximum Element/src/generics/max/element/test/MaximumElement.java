package generics.max.element.test;

public class MaximumElement {
	
	public static void main(String[] args) {
		System.out.println("Test Maximum of 3 variables\n");
		
		Integer firstNum = 10;
		Integer secondNum = 20;
		Integer thirdNum = 30;
		
		findMax(firstNum, secondNum, thirdNum);
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
}
