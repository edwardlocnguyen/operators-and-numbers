package com.nguyen.operatorsandnumbers;

public class OperatorsAndNumbers {

	/*
	 * bullet point one
	 * 
	 * decimal left side = binary right side
	 * 1 = 1
	 * 8 = 1000
	 * 33 = 100001
	 * 78 = 1001110
	 * 787 = 1100010011
	 * 33,987 = 1000010011000011
	 */

	/*
	 * bullet point two
	 * 
	 * binary left side = decimal right side
	 * 0010 = 2
	 * 1001 = 9
	 * 0011 0100 = 52
	 * 0111 0010 = 114
	 * 0010 0001 1111 = 543
	 * 0010 1100 0110 0111 = 11,367
	 */
	
	public void bulletPointThree() {
		
		System.out.println("bullet point three");
		
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
//		predicted decimal: 4
//		predicted binary: 100
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 9;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
//		predicted decimal: 18
//		predicted binary: 10010
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 17;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
//		predicted decimal: 34
//		predicted binary: 100010
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 88;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
//		predicted decimal: 176
//		predicted binary: 10110000
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
	}
	
	public void bulletPointFour() {
		
		System.out.println("bullet point four");
		
		int x = 150;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
//		predicted decimal: 37
//		predicted binary: 00100101
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 225;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
//		predicted decimal: 56
//		predicted binary: 00111000
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 1555;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
//		predicted decimal: 388
//		predicted binary: 00110000100
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
		x = 32456;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 2;
//		predicted decimal: 1970
//		predicted binary: 0011110110010
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		
	}
	
	public void bulletPointFive() {
		
		System.out.println("bullet point five");
		
		int x = 7;
		int y = 17;
		int z;
//		predicted decimal of x & y: 1
//		predicted binary of x & y: 1
		z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
//		predicted decimal of x | y: 23
//		predicted binary of x | y: 10111
		z = x | y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
	}
	
	public void bulletPointSix() {
		
		System.out.println("bullet point six");
		
		int x = 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		
	}
	
	public void bulletPointSeven() {
		
		System.out.println("bullet point seven");
		
		int x = 1;
		System.out.println(x);
		
		x++;
		System.out.println(x);
		
		++x;
		System.out.println(x);
		
		x += 1;
		System.out.println(x);
		
	}
	
	public void bulletPointEight() {
		
		System.out.println("bullet point eight");
		
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println(sum);
		
		x = 5;
		int sum2 = x++ + y;
		System.out.println(sum2);
		
	}
	
}
