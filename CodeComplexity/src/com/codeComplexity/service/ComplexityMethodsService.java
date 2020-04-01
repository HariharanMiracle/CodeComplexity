package com.codeComplexity.service;

import java.util.List;

import com.codeComplexity.model.SingleLineMethods;
import com.codeComplexity.model.SingleLineStatement;
import com.codeComplexity.model.SingleLineVariable;
import com.codeComplexity.model.Stack;
import com.codeComplexity.util.CommonConstants;

public class ComplexityMethodsService {
	public List<SingleLineMethods> calculateComplexityDueToMethods(List<SingleLineMethods> statementList) throws Exception{
		System.out.println("==============Start==============\n\n\n");
		
		//Initialization of variables
		Stack stackClass = new Stack();
		boolean statusClass = false;
		Stack stackControlStructure = new Stack();
		boolean statusControlStructure = false;
		boolean status = false;
		CommonConstants common = new CommonConstants();
		List<String> dtypePrimListCommons = common.getPrimitiveList();
		
		for(String x : dtypePrimListCommons) {
			System.out.println(x);
		}
		
		//Implementation starts here
		//Whole code
		for(SingleLineMethods line : statementList) {
			//Each line
			System.out.println("\nline => " + line.getStatement());	
			String a[] = line.getStatement().split(" ");
			
			if(line.getStatement().contains("class")) {
				//Class Implementation starts from here
				//Now we have to keep a count of the { & }
				statusClass = true;
//				System.out.println("#Class");
			}
			
			if(statusClass == true) {
				for (int i = 0; i < a.length; i++) {
					if(a[i].contains("{")) {
						stackClass.push("{");
					}
					if(a[i].contains("}")) {
						stackClass.pop();
					}
				}
//				System.out.println("#Track '{'" + stackClass.getTop());
			}
			
			if(statusClass == true) {
				//That means class implementation has already started
				//Any curly brackets after this will be either a control structure
				//OR
				//Method
				
				//First check this line has a control structure and come out of that
				
				for(String control : common.getControlStructures()) {
					if(line.getStatement().contains(control)) {
						//this line has a control structure
						status = true;
						statusControlStructure = true;
//						System.out.println("This line has a control structure");
					}
				}
				
				if(status == true && statusControlStructure == true) {
					for (int i = 0; i < a.length; i++) {
					    if(a[i].contains("{")) {
							stackControlStructure.push("{");
					    }
					    if(a[i].contains("}")) {
					    	stackControlStructure.pop();
					    }
					}
				}
				else if(status == false && statusControlStructure == true) {
					for (int i = 0; i < a.length; i++) {
					    if(a[i].contains("{")) {
					    	stackControlStructure.push("{");
					    }
					    if(a[i].contains("}")) {
					    	stackControlStructure.pop();
					    }
					}
				}
			}
			
			if(statusControlStructure == true) {
				//Inside control structure
				System.out.println("$$$ In control structure");
				
			}
			
			if(stackControlStructure.getTop() == -1) {
				//Not inside control structure
				statusControlStructure = false;
//				System.out.println("$$$ This line is not inside a control structure");
				
				//In this part we have to check with methods
				/*
				 * #1 public return_type methodname(no of parameters){
				 * */
				
				if(line.getStatement().contains("public")) {
					//This has a method declared
					System.out.println("This has a method");
					
					int x = 0;
					for(int i = 0; i < a.length; i++) {
						if(a[i].contains("public")) {
							x=i;
						}
					}
					
					if(a[x+1].contains("static")) {
						System.out.println("It is a static method");
						
						//Implementation of code x001
						boolean dtypeStatusx = false;
						boolean voidType = false;
//						List<String> primList = common.getPrimitiveList();
						for(String dtype : dtypePrimListCommons) {
							if(a[x+2].contains(dtype)) {
								dtypeStatusx = true;
							}
							else if(a[x+2].contains("void")) {
								voidType = true;
							}
						}
						
						if(dtypeStatusx == true) {
//							System.out.println("Primitive return type");
							line.setWmrt(1);
						}
						else if(voidType == true) {
//							System.out.println("Void return type");
							line.setWmrt(0);
						}
						else {
//							System.out.println("Composite return type");
							line.setWmrt(2);
						}
						
						//Check for number of parameters and count it
						int primCount = 0;
						int complexCount = 0;
//						String stra = "public static main void(String[] args){";
						int index001 = line.getStatement().indexOf("(");
						int index002 = line.getStatement().indexOf(")");
						String subStr = line.getStatement().substring(index001+1, index002);
						List<String> primitiveListX = common.getPrimitiveList(); 
						
						for(String x001 : dtypePrimListCommons) {
							System.out.println(x001);
						}
						
						String strX[] = subStr.split(",");
						//This seperates between identifier
						for(int i = 0; i < strX.length; i++) {
							System.out.println("strx: " + strX[i]);
//							String paras[] = strX[i].split(" ");
							for(String dtype : dtypePrimListCommons) {
//								System.out.println("paras[0]" + paras[0]);
								if(strX[i].contains(dtype)) {
									
									primCount++;
									System.out.println("strX[1]" + strX[1]);
									System.out.println("primitive" + dtype);
								}
								//Check the primtive count and substr count and minus to get complex
							}
							int total = strX.length;
							complexCount = total - primCount;
							line.setNcdtp(complexCount);
							line.setNpdtp(primCount);
						}

						System.out.println("strX.length => " + strX.length);
						if(strX.length == 1) {
							int cnt1 = 0;
							for(String dtype : primitiveListX) {
								if(subStr.contains(dtype)) {
									primCount++;
									cnt1++;
								}
							}
							System.out.println("cnt1 = " + cnt1);
							if(cnt1 == 0) {
								complexCount++;
							}
						}
						
						line.setNcdtp(complexCount);
						line.setNpdtp(primCount);
					}
					else {
						System.out.println("It is a normal method");
						
						boolean dtypeStatusx = false;
						boolean voidType = false;
						//Implementation of code x001
						List<String> primList = common.getPrimitiveList();
						for(String dtype : primList) {
							if(a[x+1].contains(dtype)) {
								dtypeStatusx = true;
							}
							else if(a[x+1].contains("void")) {
								voidType = true;
							}
						}
						
						if(dtypeStatusx == true) {
//							System.out.println("Primitive return type");
							line.setWmrt(1);
						}
						else if(voidType == true) {
//							System.out.println("Void return type");
							line.setWmrt(0);
						}
						else {
//							System.out.println("Composite return type");
							line.setWmrt(2);
						}
					}
				}
				else {
					boolean methodS = false;
					boolean methodV = false;
					List<String> primList = common.getPrimitiveList();
					for(String dtype : primList) {
						if(line.getStatement().contains(dtype) && line.getStatement().contains("{") && line.getStatement().contains("(")){
							methodS = true;
//							System.out.println("true => " + line.getStatement());
						}
						else if(line.getStatement().contains("void") && line.getStatement().contains("{") && line.getStatement().contains("(")) {
							methodV = true;
						}
					}
					
					if(methodS == true) {
						//Has a method
						System.out.println("##This has a method");
						//Implementation of code x001
						line.setWmrt(1);
					}
					else {
						if(methodV == true) {
							//Has a method
							System.out.println("##This has a method Void");
							//Implementation of code x001
							line.setWmrt(0);
						}
					}
					
					
				}
			}
			
			line.calculateCM();
			System.out.println("CM => " + line.getCm());
			System.out.println("wmrt: " + line.getWmrt() + ", npdtp: " + line.getNpdtp() + ", ncdtp: " + line.getNcdtp());
			System.out.println("");
		}
		
		
		System.out.println("\n\n\n==============End==============");
		return null;
	}
	
}
