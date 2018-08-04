package com.demo;

public class StaticDemo {
	
	
	
	static{
		
		System.out.println("Staic Block Executed successfully");
		
	      }
	
    /*static{
		
		System.out.println("Staic2 Block Executed successfully");
		
	      }*/
	
	//SIB executed only once even though we created 2 objects but IIB executed  2 times
	
	{
		
		System.out.println("Instance initialization block 1 executed successfully");
	}
	
    {
		
		System.out.println("Instance initialization block 2 executed successfully");
	}
	
	/*private StaticDemo(){
		
		System.out.println("Constructor is executed successfully");
	}*/
	
    public StaticDemo(){
		
		System.out.println("Constructor is executed successfully");
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo SD = new StaticDemo();
		
		
		
	}

}
