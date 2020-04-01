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
		
		//Implementation starts here
		//Whole code
		
		for(SingleLineMethods line : statementList) {
			//Each line
			System.out.println("\nline => " + line.getStatement());	
			String a[] = line.getStatement().split(" ");
			
//			for (int i = 0; i < a.length; i++) {
//			    System.out.println("@@@" + a[i]);
//			}
			
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
//				System.out.println("$$$ In control structure");
			}
			else {
				//This is not a control structure
				//This might have a method
				if(line.getStatement().contains("public")) {
					//Method statement
					System.out.println("Method here");
					
					int var1 = 0;
					for(int i = 0; i < a.length; i++) {
						if(a[i].contains("public")) {
							var1=i;
						}
					}
					
					if(a[var1+1].contains("static")) {
						System.out.println("It is a static method");
						//To get the return type
						boolean statusPrim = false;
						for(String dtype : common.getPrimitiveList()) {
							if(a[var1+2].contains(dtype)) {
								statusPrim = true;
							}
						}
						
						if(statusPrim == true) {
							//Primitive return type
							line.setWmrt(1);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						else if(a[var1+2].contains("void")) {
							line.setWmrt(0);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
							else {
								boolean primStatus002 = false;
								for(String dtypev01 : common.getPrimitiveList()) {
									if(subStr.contains(dtypev01)) {
										primStatus002 = true;
									}
								}
								
								if(primStatus002 == true) {
									line.setNpdtp(1);
								}
								else {
									line.setNcdtp(1);
								}
							}
						}
						else {
							line.setWmrt(2);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						
					}
					else {
						System.out.println("It is a normal method");
						boolean statusPrim = false;
						for(String dtype : common.getPrimitiveList()) {
							if(a[var1+1].contains(dtype)) {
								statusPrim = true;
							}
						}
						
						if(statusPrim == true) {
							//Primitive return type
							line.setWmrt(1);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						else if(a[var1+1].contains("void")) {
							line.setWmrt(0);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						else {
							line.setWmrt(2);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
							
						}
						
					}
				}
				else {
					//Method might be there
					
					if(line.getStatement().contains("(") && line.getStatement().contains(")")) {
						//This is a method
						System.out.println("This is a method");
						boolean statusPrim = false;
						for(String dtype : common.getPrimitiveList()) {
							if(a[0].contains(dtype)) {
								statusPrim = true;
							}
						}
						
						if(statusPrim == true) {
							//Primitive return type
							line.setWmrt(1);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						else if(a[0].contains("void")) {
							line.setWmrt(0);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
						else {
							line.setWmrt(2);
							
							//Have to check for parameters
							int index001 = line.getStatement().indexOf("(");
							int index002 = line.getStatement().indexOf(")");
							String subStr = line.getStatement().substring(index001+1, index002);
							System.out.println("sbstring: " + subStr);
							
							if(subStr.contains(",")) {
								//Contains 2 or more parameters
								System.out.println("Contains 2 or more parameters");
								
								String splitComma[]  = subStr.split(",");
								for(int var2 = 0; var2 < splitComma.length; var2++) {
									System.out.println("splicomma => " + splitComma[var2]);
								}
								
								//Hariharan Working fine
								int primCount = 0;
								for(int var3 = 0; var3 < splitComma.length; var3++) {
									//Primitive check
									System.out.println("Primitive check");
									if(splitComma[var3].contains("boolean") || splitComma[var3].contains("byte") || splitComma[var3].contains("char") || splitComma[var3].contains("short") || splitComma[var3].contains("int") || splitComma[var3].contains("long") || splitComma[var3].contains("float") || splitComma[var3].contains("double")) {
										primCount++;
									}
								}
								
								line.setNpdtp(primCount);
								line.setNcdtp(splitComma.length - primCount);
							}
						}
					}
				}
			}
			
			if(stackControlStructure.getTop() == -1) {
				//Not inside control structure
				statusControlStructure = false;
//				System.out.println("$$$ This line is not inside a control structure");
			}
			
			line.calculateCM();
			System.out.println("CM => " + line.getCm());
			System.out.println("wmrt: " + line.getWmrt() + ", npdtp: " + line.getNpdtp() + ", ncdtp: " + line.getNcdtp());
			System.out.println("");
		}
		
		System.out.println("\n\n\n==============End==============");
		return statementList;
	}
	
}
