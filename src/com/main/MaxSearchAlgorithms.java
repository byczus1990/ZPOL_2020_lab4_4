package com.main;

import java.util.ArrayList;
import java.util.List;

public class MaxSearchAlgorithms {
	
	private List<Integer> givenList = new ArrayList<>();

	public MaxSearchAlgorithms(int[] list)
	{
		for (int i : list) 
		{
			givenList.add(Integer.valueOf(i));
		}
	}
	public List<Integer> fromRightScan()
	{
		List<Integer> outputList = new ArrayList<Integer>();
		outputList.add(givenList.get(givenList.size() - 1 ));
		Integer localMax = givenList.get(givenList.size() - 1 );
		for(int i = givenList.size()-2; i >= 0; i--)
		{
			if(givenList.get(i) > localMax)
			{
				localMax = givenList.get(i);
				outputList.add(localMax);
			}
		}
		
		return outputList;
	}
	
	public List<Integer> fromLeftScan()
	{
		List<Integer> outputList = new ArrayList<Integer>();
		outputList.add(givenList.get(0));
		Integer localMax = givenList.get(0);
		for(int i = 1; i < givenList.size(); i++)
		{
			if(givenList.get(i) > localMax)
			{
				localMax = givenList.get(i);
				outputList.add(localMax);
			}
		}
		
		return outputList;
	}
	
	public List<Integer> evenOddScan()
	{
		List<Integer> outputList = new ArrayList<Integer>();
		outputList.add(givenList.get(0));
		Integer localMax = givenList.get(0);
		
		for(int i = 0; i < givenList.size(); i++) 
		{
		    if (i % 2 == 0 && givenList.get(i) > localMax) 
		    { // Even
		    	outputList.add(givenList.get(i));
		    	localMax = givenList.get(i);
		    }
		}
	    for(int j = 1; j < givenList.size(); j++)
	    {
	    	if (j % 2 == 1 && givenList.get(j) > localMax) 
		    { // Odd
		    	outputList.add(givenList.get(j));
		    	localMax = givenList.get(j);
		    }
	    }
		return outputList;
	}
}
