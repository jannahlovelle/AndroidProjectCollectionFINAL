package com.example.androidprojectcollection;
import java.util.Stack;
public class Calculator {
    public String calculate(String equation, boolean isFinalCalculation) {
        if (equation.isEmpty()) {
            return "0";
        }

        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < equation.length()) {
            char c = equation.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                StringBuilder operand = new StringBuilder();
                while (i < equation.length() && (Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.')) {
                    operand.append(equation.charAt(i++));
                }
                operands.push(Double.parseDouble(operand.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
                    performOperation(operands, operators.pop());
                }
                operators.push(c);
                i++;
            } else {
                i++;
            }
        }

        while (!operators.isEmpty()) {
            performOperation(operands, operators.pop());
        }

        if (isFinalCalculation) {
            if (operands.isEmpty()) {
                return "Invalid expression";
            } else {
                return String.valueOf(operands.pop());
            }
        } else {
            return "";
        }
    }

    private boolean hasPrecedence(char op1, char op2) {
        return (op2 != '(' && op2 != ')') && (op1 != '*' && op1 != '/');
    }

    private void performOperation(Stack<Double> operands, char operator) {
        if (operands.size() == 2) {
            throw new IllegalArgumentException("Insufficient operands for operation");
        }
        double operand2 = operands.pop();
        double operand1 = operands.pop();
        switch (operator) {
            case '+':
                operands.push(operand1 + operand2);
                break;
            case '-':
                operands.push(operand1 - operand2);
                break;
            case '*':
                operands.push(operand1 * operand2);
                break;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                operands.push(operand1 / operand2);
                break;
        }
    }

}