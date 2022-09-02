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
		String string1 = "Leopard";
		String string2 = "Zebra";
		String string3 = "Chimpanzee";
		
		findMax(firstNum, secondNum, thirdNum);
		findMax(floatNum1, floatNum2, floatNum3);
		findMax(string1, string2, string3);
	}
	
	public static <E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable) {
		E maximumVariable;
		
		if(firstVariable.compareTo(secondVariable)>0 && firstVariable.compareTo(thirdVariable)>0) {
			maximumVariable = firstVariable;
		}
		else if(secondVariable.compareTo(firstVariable)>0 && secondVariable.compareTo(thirdVariable)>0) {
			maximumVariable = secondVariable;
		}
		else {
			maximumVariable = thirdVariable;
		}
		
		System.out.println(maximumVariable + " is maximum out of "+firstVariable+", "+secondVariable+" and "+thirdVariable);
	}
}
