package week4code;

import java.util.Scanner;
import java.util.ArrayList;

public class week04code {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		ArrayList<Integer> ages = new ArrayList<>();
        ages.add(3);
        ages.add(9);
        ages.add(23);
        ages.add(64);
        ages.add(2);
        ages.add(8);
        ages.add(28);
        ages.add(93);

     // Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
        int difference = ages.get(ages.size() - 1) - ages.get(0);
        System.out.println("The difference between the first and last element in the ages array is " + difference);

        // Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
        ages.add(100);
        difference = ages.get(ages.size() - 1) - ages.get(0);
        System.out.println("The difference between the first and last element in the ages array is " + difference);

        // Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = sum / ages.size();
        System.out.println("The average age is " + average);
        
     // Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, 
        // “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Use a loop to iterate through the array and calculate the average number of letters per name. Print the result 
        // to the console.
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        int averageLetters = totalLetters / names.length;
        System.out.println("The average number of letters per name is " + averageLetters);

        // Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
        // and print the result to the console.
        String concatenatedNames = "";
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        System.out.println("The concatenated names are " + concatenatedNames);
        
     // Create a new array of int called nameLengths.
        int[] nameLengths = new int[names.length];

        // Iterate over the names array and add the length of each name to the nameLengths array.
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Print the nameLengths array.
        for (int nameLength : nameLengths) {
            System.out.println(nameLength);
        }
        
    

        // Iterate over the names array and add the length of each name to the nameLengths array.
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Calculate the sum of all the elements in the nameLengths array.
        int sum1 = 0;
        for (int nameLength : nameLengths) {
            sum1 += nameLength;
        }

        // Print the sum to the console.
        System.out.println("The sum of the lengths of all the names is " + sum1);
        
        
        String repeatedWord = repeatWord("Hello", 3);
    	System.out.println(repeatedWord);
    	
    	String fullName = getFullName("John", "Doe");
    	System.out.println(fullName);
    	
    	int[] numbers = {10, 20, 30};
    	boolean isSumGreaterThan100 = isSumGreaterThan100(numbers);
    	System.out.println(isSumGreaterThan100);
    	
    	double[] numbers1 = {1.0, 2.0, 3.0};
    	double averages = getAverages(numbers1);
    	System.out.println(average);
    	
    	double[] firstArray = {1.0, 2.0, 3.0};
    	double[] secondArray = {4.0, 5.0, 6.0};
    	boolean isAverageGreaterThan = isAverageGreaterThan(firstArray, secondArray);
    	System.out.println(isAverageGreaterThan);
    	
    	boolean willBuyDrink = willBuyDrink(true, 11.00);
    	System.out.println(willBuyDrink);
		}

	
	public static String repeatWord(String word, int n) {
	    String repeatedWord = "";
	    for (int i = 0; i < n; i++) {
	        repeatedWord += word;
	    }
	    return repeatedWord;
	}
	public static String getFullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	}
	
	public static boolean isSumGreaterThan100(int[] numbers) {
	    int sum = 0;
	    for (int number : numbers) {
	        sum += number;
	    }
	    return sum > 100;
	}
	    
	public static double getAverages(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum / numbers.length;
	}
	
	public static boolean isAverageGreaterThan(double[] firstArray, double[] secondArray) {
	    double firstAverage = getAverages(firstArray);
	    double secondAverage = getAverages(secondArray);
	    return firstAverage > secondAverage;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}
	
	public static boolean isPrime(int number) {
		  // This method checks if the given number is prime.

		  // A prime number is a number that is only divisible by itself and 1.

		  // First, we check if the number is 1. If it is, then it is not prime.
		  if (number == 1) {
		    return false;
		  }

		  // Next, we check if the number is even. If it is, then it is not prime.
		  if (number % 2 == 0) {
		    return false;
		  }

		  // Now, we need to check if the number is divisible by any other number between 2 and the square root of the number.
		  for (int i = 3; i <= Math.sqrt(number); i += 2) {
		    if (number % i == 0) {
		      return false;
		    }
		  }

		  // If we reach this point, then the number must be prime.
		  return true;
		}
	
	
	
	
	
	
}
