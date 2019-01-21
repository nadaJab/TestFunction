package org.main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.main.Function;

public class FunctionTest {

	protected Function op;

	@Before
	public void setUp() throws Exception {
		op = new Function();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws Exception{

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		
		
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)3,(Integer)4)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)5))); 
		
		//result.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
		
		assertEquals(result, op.partition(list, 2));
		
	}
	
	@Test
	public void test2() throws Exception{

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2, (Integer)3)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)4,(Integer)5)));
		
		assertEquals(result, op.partition(list, 3));
		
	}
	
	@Test
	public void test3() throws Exception{

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)1)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)2)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)3)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)4)));
		result.add(new ArrayList<Integer>(Arrays.asList((Integer)5)));
		
		assertEquals(result, op.partition(list, 1));
		
	}

}
