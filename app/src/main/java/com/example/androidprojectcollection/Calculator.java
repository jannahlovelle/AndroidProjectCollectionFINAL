package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class Calculator extends AppCompatActivity {
    private EditText display;
    private TextView output;

    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        display = findViewById(R.id.tvInput);
        output = findViewById(R.id.tvOutput);
        if (display != null) {
            display.setShowSoftInputOnFocus(false);

            // Set a click listener for the display, for example, to clear the text
            display.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (getString(R.string.display).equals(display.getText().toString())) {
                        display.setText("");
                    }
                }
            });
        }
    }

    private void updateText (String strToAdd){
            String oldStr = display.getText().toString();
            int cursorPos = display.getSelectionStart();

            // Check if both the new input and the last character in oldStr are operators
            if ((isOperator(strToAdd) || strToAdd.equals(".")) && !oldStr.isEmpty() &&
                    (isOperator(String.valueOf(oldStr.charAt(oldStr.length() - 1))) || String.valueOf(oldStr.charAt(oldStr.length() - 1)).equals("."))) {
                // Remove the last character in oldStr
                oldStr = oldStr.substring(0, oldStr.length() - 1);
                cursorPos--; // Adjust cursor position since a character is removed
            }

            String leftStr = oldStr.substring(0, cursorPos);
            String rightStr = oldStr.substring(cursorPos);

            if (getString(R.string.display).equals(display.getText().toString())) {
                display.setText(strToAdd);
            } else {
                if ((isOperator(strToAdd) || strToAdd.equals(".")) && (isOperator(rightStr) || rightStr.contains("."))) {
                    // Replace the existing operator or decimal point
                    if (!leftStr.isEmpty()) {
                        display.setText(String.format("%s%s", leftStr.substring(0, leftStr.length() - 1), strToAdd));
                    } else {
                        // Handle the case when leftStr is empty
                        display.setText(strToAdd);
                    }
                } else {
                    display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
                }
            }
            display.setSelection(cursorPos + 1);
        }
        private boolean isOperator(String str) {
            return str.equals("+") || str.equals("-") || str.equals("x") || str.equals("/");
        }

        public void BTN0(View view){
            updateText("0");
        }

        public void BTN1(View view){
            updateText("1");
        }
        public void BTN2(View view){
            updateText("2");
        }
        public void BTN3(View view){
            updateText("3");
        }
        public void BTN4(View view){
            updateText("4");
        }
        public void BTN5(View view){
            updateText("5");
        }
        public void BTN6(View view){
            updateText("6");
        }
        public void BTN7(View view){
            updateText("7");
        }
        public void BTN8(View view){
            updateText("8");
        }
        public void BTN9(View view){
            updateText("9");
        }
        public void BTNdivide(View view){
            updateText("/");
        }
        public void BTNminus(View view){
            updateText("-");
        }
        public void BTNplus(View view){
            updateText("+");
        }
        public void BTNmultiply(View view){
            updateText("*");
        }
        public void BTNdecimal(View view){
            updateText(".");
        }

        public void BTNequal(View view){
            String userExp = display.getText().toString();

            String result = Double.toString(calculate(String.valueOf(infixToPostfix(userExp))));
            output.setText(result);
            display.setSelection(userExp.length());
        }

        public void BTNAC(View view){
            display.setText("");
            output.setText("");
        }

        public void BTNC(View view){
            display.setText("");
            output.setText("");
        }
        int prec(char c){
            if (c=='^'){
                return 3;
            }
            else if(c=='*' || c=='/' || c=='%'){
                return 2;
            }
            else if(c=='+' || c=='-'){
                return 1;
            }
            else{
                return -1;
            }
        }

        char associativity(char c){
            if(c=='^'){
                return 'R';
            }
            return 'L';
        }

    StringBuilder infixToPostfix(String exp){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        //traverse
        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(c>='0' && c<='9'){
                result.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                }
                //pop '('
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && (prec(exp.charAt(i)) < prec(stack.peek()) ||
                        prec(exp.charAt(i)) == prec(stack.peek()) && associativity(exp.charAt(i))=='L')){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result;
    }

    double calculate(String exp){
        Stack<Double> stack = new Stack<>();
        double num1=0, num2=0;
        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);
            //pushing and typecasting char to double
            if(Character.isDigit(c)){
                stack.push((double)(c-'0'));
            }

            //calculating
            switch (c){
                case '+': num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1+num2);
                    break;
                case '-': num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1-num2);
                    break;
                case '*': num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1*num2);
                    break;
                case '/': num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1/num2);
                    break;
            }
        }
        return stack.pop();
    }

    }