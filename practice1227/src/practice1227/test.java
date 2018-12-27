
package practice1227;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int order_menu[];
	    order_menu = new int[4];
	    Scanner in = new Scanner(System.in);
	    	    
	    for(int i=0; i<order_menu.length; i++){
	    	int order = in.nextInt();
	    	order_menu[i] = order;
	    }
	    
		int calories = 0;
		
		switch(order_menu[0]) {
		case 1: calories += 461;
			break;
		case 2: calories += 431;
			break;
		case 3: calories += 420;
			break; 
		case 4: calories += 0;
			break;
		}

		switch(order_menu[1]) {
		case 1: calories += 130;
			break;
		case 2: calories += 160;
			break;
		case 3: calories += 118;
			break; 
		case 4: calories += 0;
			break;
		}
		
		switch(order_menu[2]) {
		case 1: calories += 100;
			break;
		case 2: calories += 57;
			break;
		case 3: calories += 70;
			break; 
		case 4: calories += 0;
			break;
		}

		switch(order_menu[3]) {
		case 1: calories += 167;
			break;
		case 2: calories += 266;
			break;
		case 3: calories += 75;
			break; 
		case 4: calories += 0;
			break;
		}

		System.out.println("your total Calorie count is " + calories);
	}

}
