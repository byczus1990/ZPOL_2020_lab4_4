package com.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SbStarter {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		int[] testArray = {4, 10, 3, 7, 4, 1, 6, 2};
		MaxSearchAlgorithms searchAlgh = new MaxSearchAlgorithms(testArray);
		
		Method[] methods = MaxSearchAlgorithms.class.getMethods();

		for(Method method : methods){
			if(method.getName().contains("Scan"))
			{
				List<Integer> lList = new ArrayList<Integer>();
				lList = (List<Integer>) method.invoke(searchAlgh);
			    System.out.println(method.getName() + ": " +lList);
			}
		}
		
//		System.out.println(searchAlgh.fromLeftScan());
//		System.out.println(searchAlgh.fromRightScan());
//		System.out.println(searchAlgh.evenOddScan());

	}

}
