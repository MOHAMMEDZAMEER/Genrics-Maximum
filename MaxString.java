package com.genrics;

public class MaxString {
	public void MaxString(String first,String second,String third){
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
