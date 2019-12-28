package com.codewardev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times/train/java

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccur) {
		if(elements.length == 0) return elements;
		
		int[] occur = new int[Arrays.stream(elements).max().getAsInt()+1];
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int x: elements) {
			if(occur[x] < maxOccur){
				occur[x]++;
				newList.add(x);
			}
		}
		return newList.stream().mapToInt(Integer::valueOf).toArray();
	}

}
