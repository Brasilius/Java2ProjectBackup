/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {
	public static double divide(double numerator, double denominator){
		double answer = numerator / denominator;
		return answer;
	}
public static int divide(int numerator, int denominator){
	int answer = numerator/denominator;
	return answer;
}
public static boolean isDivisibleBy7(int number){
	if(number % 7 == 0){
		return true;
	}
	else{
		return false;
	}
}
public static String main(String input){
	return ("Overloaded main method was passed \""+input+"\".");
}
public static int findMin(int a, int b, int c){
	int result = 0;
	if(a < b && a < c){
		result = a;
	}
	else if(b < a && b < c){
		result = b;
	}
	else{
		result = c;
	}
	return result;
}
public static int findMin(int[] array){
	int result = array[0];
	for(int j = 0; j<array.length; j++){
		if (array[j] < result){
			result = array[j];
		}
	}
	return result;
}
public static double average(int[] array){
	double average = 0;
	for(int i = 0; i<array.length;i++){
		average += array[i];
	}
	average = average/array.length;
	return average;
}
public static void toLowerCase(String[] input){
	for(int i = 0; i<input.length;i++){
		input[i] = input[i].toLowerCase();
	}
}
public static String[] toLowerCaseCopy(String[] input){
String[] result = new String[input.length];
for(int i = 0; i<input.length;i++){
	result[i] = input[i].toLowerCase();
}
return result;
}
public static void removeDuplicates(int[] input){
for(int i = 0; i < input.length; i++){
	boolean duplicate = false;
	for(int j = 0; j < input.length; j++){
		if(input[i] == input[j] && i != j){
			input[j]=0;
			duplicate = true;
		}
		
	}
	if(duplicate == true){
		input[i] = 0;
	}
}
} 
public static void main(String[] args) {
		
	}
}


