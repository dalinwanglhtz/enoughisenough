package com.codewardev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times/train/java

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccur) {
		if(elements.length == 0) return elements;
		
		int max=Arrays.stream(elements).max().getAsInt();
		int[] occur = new int[max+1];
		List<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<elements.length; i++) {
			if(occur[elements[i]] < maxOccur){
				occur[elements[i]]++;
				newList.add(elements[i]);
			}
		}
		return newList.stream().mapToInt(Integer::valueOf).toArray();
	}

}
