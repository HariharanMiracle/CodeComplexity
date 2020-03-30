package com.codeComplexity.model;

public class Stack { 
    static final int MAX = 999999; 
    int top; 
    String a[] = new String[MAX]; // Maximum size of Stack 

    public Stack() 
    { 
        top = -1; 
    } 

    public int getTop(){
    	return top;
    }
    
    public boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    
  
    public boolean push(String x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    public String pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return ""; 
        } 
        else {
        	System.out.println("Stack pop out");
        	String x = a[top--]; 
            return x; 
        } 
    } 
  
    public String peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return ""; 
        } 
        else { 
        	String x = a[top]; 
            return x; 
        } 
    } 
}