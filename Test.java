package com.java8;

public class Test
{

	public static void main(String[] args)
	{
		System.out.println("Arithmatic operations using traditional way");
		ArithmaticOperation addition = new ArithmaticOperation() {
			@Override
			public long operation(long a, long b) {
				return a+b;
			}
		};

		ArithmaticOperation subtraction = new ArithmaticOperation() {
			@Override
			public long operation(long a, long b) {
				return a-b;
			}
		};

		ArithmaticOperation multiplication = new ArithmaticOperation() {
			@Override
			public long operation(long a, long b) {
				return a*b;
			}
		};

		ArithmaticOperation division = new ArithmaticOperation() {
			@Override
			public long operation(long a, long b) {
				return a/b;
			}
		};
		System.out.println("Addition is : "+addition.operation(1, 2));
		System.out.println("Subtraction is : "+subtraction.operation(1, 2));
		System.out.println("Multiplication is : "+multiplication.operation(1, 2));
		System.out.println("Division is : "+division.operation(5, 2));
		
		System.out.println("Arithmatic operations using lamda expression");
		ArithmaticOperation addition1 = (long a, long b) -> {return a+b;};
		ArithmaticOperation subtraction1 = (long a, long b) -> {return a-b;};
		ArithmaticOperation multiplication1 = (long a, long b) -> {return a*b;};
		ArithmaticOperation division1 = (long a, long b) -> {return a/b;};

		System.out.println("Addition is : "+addition1.operation(1, 2));
		System.out.println("Subtraction is : "+subtraction1.operation(1, 2));
		System.out.println("Multiplication is : "+multiplication1.operation(1, 2));
		System.out.println("Division is : "+division1.operation(5, 2));
		
		System.out.println("Arithmatic operations using lamda expression");
		ArithmaticOperation addition2 = (a, b) -> a+b;
		ArithmaticOperation subtraction2 = (a, b) -> a-b;
		ArithmaticOperation multiplication2 = (a, b) -> a*b;
		ArithmaticOperation division2 = (a, b) -> a/b;

		System.out.println("Addition is : "+addition2.operation(1, 2));
		System.out.println("Subtraction is : "+subtraction2.operation(1, 2));
		System.out.println("Multiplication is : "+multiplication2.operation(1, 2));
		System.out.println("Division is : "+division2.operation(5, 2));
	}
}
