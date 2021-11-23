package com.genrics;

public class MaximumInt{

	public void FindMaxInt(Integer first,Integer second,Integer third){
		if(first.compareTo(second) >=0 && first.compareTo(third) >=0) {
			System.out.println("First is Maximum :" +first);
		}
		else if(second.compareTo(first) >=0 && second.compareTo(third) >=0) {
			System.out.println("Second is Maximum :" +second);
		}
		else {
			System.out.println("Third is Maximum :" +third);
		}
	}
	
}
