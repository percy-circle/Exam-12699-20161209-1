package com.hand.lkl.Exam_12699_20161209_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 101; i < 201; i++) {
              if (isPrime(i)) {
			    list.add(i);
			}
		}
		System.out.print("101-200间共有"+list.size()+"个素数，分别是：");
		for (Integer integer : list) {
			System.out.print(integer+",");
		}
	}
	public static boolean isPrime(int num) {   
	       for(int i = 2; i <= Math.sqrt(num); i++) {
	           if(num % i == 0) {
	             return false;
	           }
	       }
	       return true;
	    }
}
