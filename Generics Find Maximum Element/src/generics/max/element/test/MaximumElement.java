package generics.max.element.test;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement <T extends Comparable<T>> {
	
	T variable1;
	T variable2;
	T variable3;
	T variable4;
	T variable5;
	T variable6;
	
	
	public MaximumElement(T variable1, T variable2, T variable3, T variable4, T variable5, T variable6) {
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
		this.variable1 = variable4;
		this.variable2 = variable5;
		this.variable3 = variable6;
	}

	public void findMax() {
		MaximumElement.findMax(this.variable1, this.variable2, this.variable3, this.variable4, this.variable5, this.variable6);
	}
	
	public static <E> void printmax(E maximum, ArrayList<E> list) {
		System.out.println();
		System.out.println(maximum + " is the maximum out of " + list);
	}
	
	public static void main(String[] args) {
		System.out.println("Test Maximum of 3 variables\n");
		
		Integer int1 = 10;
		Integer int2 = 20;
		Integer int3 = 30;
		Integer int4 = 99;
		Integer int5 = 47;
		Integer int6 = 11;
		Float floatNum1 = 23.2f;
		Float floatNum2 = 11.3f;
		Float floatNum3 = 5.5f;
		Float floatNum4 = 0.4213f;
		Float floatNum5 = 65.983f;
		Float floatNum6 = 7.892f;
		String string1 = "Leopard";
		String string2 = "Zebra";
		String string3 = "Chimpanzee";
		String string4 = "Giraffe";
		String string5 = "Yak";
		String string6 = "Deer";
		
		findMax(int1, int2, int3, int4, int5, int6);
		findMax(floatNum1, floatNum2, floatNum3, floatNum4, floatNum5, floatNum6);
		findMax(string1, string2, string3, string4, string5, string6);
	}
	
	public static <E extends Comparable<E>> void findMax(E firstVariable, E secondVariable, E thirdVariable, E fourthVariable, E fifthVariable, E sixthVariable) {
		ArrayList<E> variableList = new ArrayList<>();
		
		variableList.add(firstVariable);
		variableList.add(secondVariable);
		variableList.add(thirdVariable);
		variableList.add(fourthVariable);
		variableList.add(fifthVariable);
		variableList.add(sixthVariable);

		printmax(Collections.max(variableList) , variableList);
	}
}
