import java.util.Scanner;
public class hello {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Hello Welcome to the simple calculator!");
    	System.out.println("This caculator output the sum, minus, division, and multiplication of two integer");
    	System.out.println("Give the first number:");
    	int first = Integer.valueOf(scanner.nextLine());
    	System.out.println("Give the second number:");
    	int second = Integer.valueOf(scanner.nextLine());
    	
    	System.out.println(first +"+"+ second+"=" + (first + second));
    	System.out.println(first +"-"+ second+"=" + (first - second));
    	System.out.println(first +"*"+ second+"=" + (first * second));
    	System.out.println(first +"/"+ second+"=" + (first / second));
    	
    	
    }
	}
