package ch10_arrays_demos;

import java.util.Arrays;

public class ArraysApp {

	public static void main(String[] args) {
		int[] scores = {90,85,93,99};
		
		// traditional for loop
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// print 3rd element (index 2)
		System.out.println(scores[2]);
		
		// enhanced for / for each
		for (int i: scores) {
			System.out.println(i);
		}
		
		// Arrays class - sort method
		Arrays.sort(scores);
		System.out.println("sorted array:");
		for (int i: scores) {
			System.out.println(i);
		}
		
		String[] strs = {"m", "f", "s", "o"};
		Arrays.sort(strs);
		
		for (String s: strs) {
			System.out.println(s);
		}
		

	}

}
