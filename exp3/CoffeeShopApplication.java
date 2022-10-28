package exp3;

import java.awt.image.PackedColorModel;
import  java.io.*;
import  java.util.*;

public class CoffeeShopApplication{

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	private CoffeeShop coffeeShop;

	private static final int MIN_NUMBER = 0;
	
	private static final int MAX_NUMBER = 50;

	private static final double MIN_COST = 2.0;
	
	private static final double MAX_COST = 50.0;

	public static void main(String[]  args) throws IOException{

		CoffeeShopApplication application = new  CoffeeShopApplication();

		application.run();
	}

	private void run() throws IOException {

		coffeeShop = new  CoffeeShop();
		int  choice = -1;

		do{
			try { 
				choice = getChoice();
				if (choice == 1)  {
					coffeeShop.addCoffee(readCoffee());
				} else if (choice == 2)  {
					stdOut.println(coffeeShop.toString());
					stdOut.flush();
				} else if (choice == 3)  {
					stdOut.println("Total Cost: " + coffeeShop.getTotalCost());
					stdOut.flush();
				}
			}catch (IOException e) {
				throw e;
			}catch (Exception e) {
				e.printStackTrace();
			}

		}while (choice != 0);
		
				
	}
	
	private int  getChoice() throws IOException,ChoiceException {

		/* PLACE YOUR CODE HERE */
		String noteString="input your choice and press [enter]\n"
				+ "[0]:stop the program\n"
				+ "[1]:add coffee for the shop\n"
				+ "[2]:show all the information of coffees in the shop\n"
				+ "[3]:show all the whole cost of coffees in the shop\n"
				+ "your choice:";
		stdOut.print(noteString);
		stdOut.flush();
		int choice=stdIn.readLine().charAt(0)-'0'; // throws IOException
		if(choice<0||choice>3)
		{
			stdErr.println("please input a number between 0 and 3!");
			throw new ChoiceException(choice);
		}
		return choice; //you need to change it.
	}

	private Coffee readCoffee() throws IOException,NumberFormatException,NumberOfCoffeeInfoException,CoffeeIdException,CoffeeCostException{

		
		/* PLACE YOUR CODE HERE */
		Coffee coffee=null;
		String inputString[]=stdIn.readLine().split("_");
		if(inputString.length!=4)
		{
			stdErr.println("please input the four infomation of the coffee!");
			throw new NumberOfCoffeeInfoException(inputString.length);			
		}
		else
		{
			int id=-1;
			try {
				id=Integer.parseInt(inputString[0]);//throw NumberFormatException
			} catch (NumberFormatException e) {				
				stdErr.println("the id is a integer!");
				throw e;
			}
			String name=inputString[1];
			String taste=inputString[2];
			double cost=-1;
			try {
				cost=Double.parseDouble(inputString[3]);//throw NumberFormatException
			} catch (NumberFormatException e) {
				stdErr.println("the cost is a double!");
				throw e;
			}
			
			if(id<MIN_NUMBER||id>MAX_NUMBER)
			{
				stdErr.println("the id of the coffee is between 0 and 50!");
				throw new CoffeeIdException(id);
			}
			if(cost<MIN_COST||cost>MAX_COST)
			{
				stdErr.println(String.format("the cost of the coffee is between %f and %f!",MIN_COST,MAX_COST));
				throw new CoffeeCostException(cost);
			}
			coffee=new Coffee(id, name, taste, cost);
		}
		return coffee; //you need to change it.
	}
}

class ChoiceException extends Exception{
	private int input;

	/**
	 * @param input 错误输入的数
	 */
	public ChoiceException(int input) {
		super();
		this.input = input;
	}
	@Override
	public String toString() {
		return "ChoiceException [your input=" + input + "]";
	}
	
}

class NumberOfCoffeeInfoException extends Exception{
	private int theNumberOfInput;

	/**
	 * @param theNumberOfInput 错误输入的数量
	 */
	public NumberOfCoffeeInfoException(int theNumberOfInput) {
		super();
		this.theNumberOfInput = theNumberOfInput;
	}

	@Override
	public String toString() {
		return "NumberOfCoffeeInfoException [theNumberOfInput=" + theNumberOfInput + "]";
	}
}

class CoffeeIdException extends Exception{
	private int coffeeId;

	/**
	 * @param coffeeId 错误输入的id
	 */
	public CoffeeIdException(int coffeeId) {
		super();
		this.coffeeId = coffeeId;
	}

	@Override
	public String toString() {
		return "CoffeeIdException [coffeeId=" + coffeeId + "]";
	}
	
}

class CoffeeCostException extends Exception{
	private double cost;

	/**
	 * @param cost 错误输入的成本
	 */
	public CoffeeCostException(double cost) {
		super();
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "CoffeeCostException [cost=" + cost + "]";
	}
	
}