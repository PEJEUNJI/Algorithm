package com.leedcode.stack;


import java.util.Stack;
/*
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

 */

public class ValidParentheses {
	public static boolean isValid(String s) {
	
    	// I use "stack" because each opener and closer must belong to the same group.
		Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
        	// in opener's cases, push to the stack
             if(c == '(' || c == '{' || c == '['){
                 stack.push(c);
             // in closer's cases or another
                 
             } else {
                 if(stack.isEmpty()){
                     return false;
                 }
                 // Get the last saved opener, after then compare to closer
                 // if they don't match, return false
                 char open = stack.pop();
                 if((c == ')' && open != '(')
                 || (c == '}' && open != '{')
                 || (c == ']' && open != '[')){
                    return false;
                 }
             }
        }
        // if stack is not empty, it's mean stack's value don't match perfectly.
        return stack.isEmpty();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
	}

}
