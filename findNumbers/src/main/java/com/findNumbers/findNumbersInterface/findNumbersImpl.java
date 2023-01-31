package com.findNumbers.findNumbersInterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//Declare the path 
@Path("/findNumbers")
public class findNumbersImpl implements findNumbersInterface {
    
	List<Integer> listOfIntegers = Arrays.asList(1,2,5,7,4,9,3);
	int size =listOfIntegers.size(); //size of the integers
	List<Integer> findNum ;
	@Path("/min")
	//Find the minimum number of a given list
	public List<Integer> minNumber() {
		
		  findNum = new ArrayList<>(listOfIntegers);
		  Collections.sort(findNum);
		  findNum.add(size);
		  findNum.get(0);
		  return findNum;

}   
	@GET
	@Path("/max")
	//Find the maximum number of a given list

	public List<Integer> maxNumber(){
			findNum = new ArrayList<>(listOfIntegers);
			Collections.sort(findNum);
			findNum.add(size);
			findNum.get(findNum.size()-1);
			
		return findNum;
	}
		
	@Path("/avg")
	//Find the average number of a given list

	public int avgNumber(){
			int sum = 0;
		      for (int i=0; i< listOfIntegers.size(); i++) {
		            sum += i;
		      }
		
		     return sum / listOfIntegers.size();
				
		}
	@Path("/median")
	//Find the middle number of a given list

	public int medianNumber() {
		 
		 for(int i=0; i<=listOfIntegers.size(); i++){
			 findNum.add(i);
		 }
		 
		 int middle = findNum.size()/2;
         return middle;
	}
	
	}
