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
		//Whole Code
		CommonConstants common = new CommonConstants();
		System.out.println("___________________________________Start___________________________________\n\n\n");
		
		//Check this line is global or local
		Stack stack = new Stack();
		Stack controlStructureStack = new Stack();
		boolean controlStructureStatus = false;
				
		for(SingleLineVariable line : singleLinelist) {
			boolean status = false;
			//Each line
					
			System.out.println("\nLine: " + line.getLineNumber() + " ||| Statement: " + line.getStatement());
			// split the string by spaces in a 
			String a[] = line.getStatement().split(" ");
					
			for (int i = 0; i < a.length; i++) {
				System.out.println("@@@: " + a[i]);
				if(a[i].contains("{")) {
					stack.push("{");
				}
				if(a[i].contains("}")) {
					stack.pop();
				}
			}
					
			if(stack.getTop() <= 0) {
				//global scope
				line.setWvs(2);
				System.out.println("Global scope => " + stack.getTop());
			}
			else {
				//local State
				line.setWvs(1);
				System.out.println("Local scope => " + stack.getTop());
			}
		
			//Checking the control structure
			
			//first check whether the line has a control structure
			for(String control : common.getControlStructures()) {
				if(line.getStatement().contains(control)) {
					//this line has a control structure
					status = true;
					controlStructureStatus = true;
				}
			}
			
			if(status == true && controlStructureStatus == true) {
				for (int i = 0; i < a.length; i++) {
				    if(a[i].contains("{")) {
						controlStructureStack.push("{");
				    }
				    if(a[i].contains("}")) {
				    	controlStructureStack.pop();
				    }
				}
			}
			else if(status == false && controlStructureStatus == true) {
				for (int i = 0; i < a.length; i++) {
				    if(a[i].contains("{")) {
						controlStructureStack.push("{");
				    }
				    if(a[i].contains("}")) {
				    	controlStructureStack.pop();
				    }
				}
			}
			
//			System.out.println("stack => " + controlStructureStack.getTop());
//			System.out.println("status => " + status + ", controlStatus => " + controlStructureStatus);
			
			if(controlStructureStack.getTop() == -1) {
				controlStructureStatus = false;
				System.out.println("$$$ This line is not inside a control structure");
			}
			
			if(controlStructureStatus == true) {
				//We dont consider this line
				line.setNpdtv(0);
				line.setNcdtv(0);
				System.out.println("$$$ In control structure");
			}
			else {
				int primitiveCount = 0;
				//Counts of primitive data types
				CommonConstants commonConstants = new CommonConstants();
				List<String> primitiveList = commonConstants.getPrimitiveList();
				
				for(String dtype : primitiveList) {
					// search for pattern
					for (int i = 0; i < a.length; i++) {
						if(stack.getTop() <= 1) {
							if(a[i].contains(dtype)) {
//					    		System.out.println("Pattern to Check " + dtype);
					    		primitiveCount++;
							}
						}
				    }
				}
				
				line.setNpdtv(primitiveCount);
				
				int compositeCount = 0;
				//Counts of composite data types
				List<String> compositeList = commonConstants.getCompositeList();
					
				for(String ctype : compositeList) {
					// search for pattern
					for (int i = 0; i < a.length; i++) { 
						if(stack.getTop() <= 1) {
							if(a[i].contains(ctype)) {	
//								System.out.println("Pattern to Check " + ctype);
					    		compositeCount++;
							}
						}	
				    }
				}
					
				line.setNcdtv(compositeCount);
			}
			
			line.calculateCV();
			System.out.println("CV => " + line.getCv());
			System.out.println("wvs: " + line.getWvs() + ", npdtv: " + line.getNpdtv() + ", ncdtv: " + line.getNcdtv());
			
			System.out.println("");
			
		}
		System.out.println("\n\n\n___________________________________End___________________________________");
		return null;
	}
}
