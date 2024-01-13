package CodePractice;

import java.util.EmptyStackException;
import java.util.Stack;

public class Program {
	/*
	This method is to check the password
	 */
//	public static boolean passwordCheck(String s){
//		return s.chars().anyMatch(Character::isUpperCase)&&
//				s.chars().anyMatch(Character::isLowerCase)&&
//				s.chars().anyMatch(Character::isDigit);
//	}

	// perform "3 4 +"
//	public static boolean isNumber(String n){
//		try {
//			double d=Double.parseDouble(n);
//			return true;
//		}catch (NumberFormatException e){
//			return false;
//		}
//	}
//	static boolean isOprator(String op){
//		return "+-*/".contains(op);
//	}
//	static double performOperation(String operator, double op1, double op2){
//		switch (operator){
//			case "+":
//				return op1+op2;
//			case "-":
//				return op1-op2;
//			case "*":
//				return op1*op2;
//			case "/":
//				return op1/op2;
//			default :
//				throw new IllegalArgumentException("Invalid operator "+operator);
//		}
//	}
//public static double evaluateRPN(String expression){
//		Stack<Double>stack= new Stack<>();
//		String [] tokens=expression.split(" ");
//		for (String token:tokens){
//			if(isNumber(token)){
//				stack.push(Double.parseDouble(token));
//			}else {
//				if(isOprator(token)){
//						double op2 = stack.pop();
//						double op1 = stack.pop();
//						double result = performOperation(token, op1, op2);
//						stack.push(result);
//				}
//			}
//		}
//		return stack.pop();
//	}
}
