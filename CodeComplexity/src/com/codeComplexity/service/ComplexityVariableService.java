package com.codeComplexity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.codeComplexity.model.SingleLineStatement;
import com.codeComplexity.model.SingleLineVariable;
import com.codeComplexity.model.Stack;
import com.codeComplexity.util.*;

public class ComplexityVariableService {
	
	public List<SingleLineVariable> calculateComplexityDueToVariable(List<SingleLineVariable> singleLinelist) throws Exception{
		System.out.println("calculateComplexityDueToVariable");
		System.out.println("\n\n\n");
		//When stack is empty this statement will be in global state
		Stack stack = new Stack();
		
		for(SingleLineVariable line : singleLinelist) {
			System.out.println("for loop start");
			
			// split the string by spaces in a 
			String a[] = line.getStatement().split(" ");
			
			System.out.println("$$$$$$$$$$$$$$$$  FOR   $$$$$$$$$$$$$$$$$$$");
			// search for pattern in a  
		    for (int i = 0; i < a.length; i++)  
		    {
		    	System.out.println("@@@   " + a[i]);
		    	if ("{".equals(a[i])) { 
		    		System.out.println("Pattern to Check {");
					stack.push("{");
		    	}
		    	if ("}".equals(a[i])) { 
		    		System.out.println("Pattern to Check }");
					stack.pop();
		    	}
		    }
		    System.out.println("$$$$$$$$$$$$$$$$  FOR   $$$$$$$$$$$$$$$$$$$");
			
		    System.out.println("%%%%%%%%%%%%%%%%%  SCOPE   %%%%%%%%%%%%%%%%%");
		    if(stack.getTop() == 0) {
				//global scope
				line.setWvs(2);
				System.out.println("Global scope");
			}
			else {
				//local State
				line.setWvs(1);
				System.out.println("Local scope => " + stack.getTop());
			}
		    System.out.println("%%%%%%%%%%%%%%%%%  SCOPE   %%%%%%%%%%%%%%%%%");
		    
		    int primitiveCount = 0;
		  //Counts of primitive data types
			CommonConstants commonConstants = new CommonConstants();
			List<String> primitiveList = commonConstants.getPrimitiveList();
			
			for(String dtype : primitiveList) {
				// search for pattern
				for (int i = 0; i < a.length; i++)  
			    { 
			    	if (dtype.equals(a[i])) { 
			    		System.out.println("Pattern to Check " + dtype);
			    		primitiveCount++;
			    	}
			    }
			}
			
			line.setNpdtv(primitiveCount);
			
			
			
			
			int compositeCount = 0;
			  //Counts of composite data types
				List<String> compositeList = commonConstants.getCompositeList();
				
				for(String ctype : compositeList) {
					// search for pattern
					for (int i = 0; i < a.length; i++)  
				    { 
				    	if (ctype.equals(a[i])) { 
				    		System.out.println("Pattern to Check " + ctype);
				    		compositeCount++;
				    	}
				    }
				}
				
				line.setNcdtv(compositeCount);
			
			line.calculateCV();
			System.out.println("###################");
			System.out.println("Statement => " + line.getStatement());
			System.out.println("CV => " + line.getCv());
			System.out.println("###################");
		}
		return singleLinelist;
	}
	
}
