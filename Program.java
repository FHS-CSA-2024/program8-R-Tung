//import stuff here
import java.util.Scanner;
//Your code here
public class Program8{
    public static void main(String[] args){
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number_1 = number1.nextInt();
        
        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter another number: ");
        int number_2 = number2.nextInt();
        
        System.out.println("Original numbers are: " + number_1 + " and " + number_2); 
        System.out.println("Sum = " + sum(number_1, number_2));
        System.out.println("Difference = " + difference(number_1, number_2));
        System.out.println("Product = " + product(number_1, number_2));
        System.out.println("Average = " + average(number_1, number_2));
        System.out.println("Absolute value = " + absoluteValue(number_1, number_2));
        System.out.println("Maximum value = " + max(number_1, number_2));
        System.out.println("Minimum value = " + min(number_1, number_2));
    }
    
    static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }
    
    static int difference(int x, int y){
        int difference = x - y;
        return difference; 
    }
    
    static int product(int x, int y){
        int product = x*y;
        return product;
    }
    
    static double average(int x, int y){
        double average = (double)(x + y) / 2;
        return average;
    }
    
    static int absoluteValue(int x, int y){
        int absoluteValue = Math.abs(x - y);
        return absoluteValue;
    }
    
    static int max(int x, int y){
        int maximum = 0;
        if (x > y){
            maximum = x;        }
        else{
            maximum = y;
        }
        return maximum;
    }
    
    static int min(int x, int y){
        int minimum = 0;
        if (x > y){
            minimum = y;        }
        else{
            minimum = x;
        }
        return minimum;
    }
    
}
//Paste console output below:
/*
Enter a number: 
13
Enter another number: 
20
Original numbers are: 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum value = 20
Minimum value = 13
*/
