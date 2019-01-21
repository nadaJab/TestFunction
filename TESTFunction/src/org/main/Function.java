package org.main;

import java.util.ArrayList;
import java.util.List;

public class Function {
	
	public List<List<Integer>> partition(List<Integer> list, int taille){
		int count = 0;
		List<Integer> sousList = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();

		for(int i=0; i<list.size(); i++) {

			sousList.add(list.get(i));
			count++;

			if(count == taille || i == list.size() -1) {
				result.add((ArrayList<Integer>) sousList);
				count=0;
				sousList = new ArrayList<>();
			}

		}

		return result;

	}

}
