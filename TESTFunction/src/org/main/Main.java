package org.main;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main (String[] args) {

		Function test = new Function();

		int[] ids = {1, 2, 3, 4, 5, 6};

		List<Integer> list1 = new ArrayList <Integer>();

		for(int i : ids) {
			list1.add(i);
		}

		System.out.println(list1);

		System.out.println(test.partition(list1, 5));

	}

}
