//package com.example.androidprojectcollection;
//
//import androidx.appcompat.app.AppCompatActivity;
//import org.mariuszgromada.math.mxparser.*;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//
//public class CalculatorExercise extends AppCompatActivity implements View.OnClickListener{
////    TextView resultTv, solutionTv;
////    MaterialButton btnC, btnOpen, btnClose;
////    MaterialButton btnDivide, btnMultiply, btnMinus, btnAdd, btnEquals;
////    MaterialButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
////    MaterialButton btnAC, btnDot;
//
//    private EditText display;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calculator);
//        display = findViewById(R.id.solutionTv);
//        if (display != null) {
//            display.setShowSoftInputOnFocus(false);
//
//            display.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (getString(R.string.).equals(display.getText().toString())) {
//                        display.setText("");
//                    }
//                }
//            });
//        }
//    }
//
//    private void updateText(String strToAdd){
//        String oldStr = display.getText().toString();
//        int cursorPos = display.getSelectionStart();
//
//        if ((isOperator(strToAdd) || strToAdd.equals(".")) && !oldStr.isEmpty() &&
//                (isOperator(String.valueOf(oldStr.charAt(oldStr.length() - 1))) || String.valueOf(oldStr.charAt(oldStr.length() - 1)).equals("."))) {
//            // Remove the last character in oldStr
//            oldStr = oldStr.substring(0, oldStr.length() - 1);
//            cursorPos--; // Adjust cursor position since a character is removed
//        }
//
//        String leftStr = oldStr.substring(0, cursorPos);
//        String rightStr = oldStr.substring(cursorPos);
//
//        if (getString(R.string.display).equals(display.getText().toString())) {
//            display.setText(strToAdd);
//        } else {
//            if ((isOperator(strToAdd) || strToAdd.equals(".")) && (isOperator(rightStr) || rightStr.contains("."))) {
//                // Replace the existing operator or decimal point
//                if (!leftStr.isEmpty()) {
//                    display.setText(String.format("%s%s", leftStr.substring(0, leftStr.length() - 1), strToAdd));
//                } else {
//                    // Handle the case when leftStr is empty
//                    display.setText(strToAdd);
//                }
//            } else {
//                display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
//            }
//        }
//        display.setSelection(cursorPos + 1);
//    }
//
//    private boolean isOperator(String str) {
//        return str.equals("+") || str.equals("-") || str.equals("x") || str.equals("/");
//    }
//    public void BTN0(View view){
//        updateText("0");
//    }
//
//    public void BTN1(View view){
//        updateText("1");
//    }
//    public void BTN2(View view){
//        updateText("2");
//    }
//    public void BTN3(View view){
//        updateText("3");
//    }
//    public void BTN4(View view){
//        updateText("4");
//    }
//    public void BTN5(View view){
//        updateText("5");
//    }
//    public void BTN6(View view){
//        updateText("6");
//    }
//    public void BTN7(View view){
//        updateText("7");
//    }
//    public void BTN8(View view){
//        updateText("8");
//    }
//    public void BTN9(View view){
//        updateText("9");
//    }
//    public void BTNdivide(View view){
//        updateText("/");
//    }
//    public void BTNminus(View view){
//        updateText("-");
//    }
//    public void BTNplus(View view){
//        updateText("+");
//    }
//    public void BTNmultiply(View view){
//        updateText("x");
//    }
//    public void BTNdecimal(View view){
//        updateText(".");
//    }
//    public void BTNequal(View view){
//        String userExp = display.getText().toString();
//
//        userExp = userExp.replaceAll("÷", "/");
//        userExp = userExp.replaceAll("x", "*");
//
//        Expression = new Expression(userExp);
//
//        String result = String.valueOf(exp.calculate());
//
//        display.setText(result);
//        display.setSelection(result.length());
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
////        resultTv = findViewById(R.id.resultTv);
////        solutionTv = findViewById(R.id.solutionTv);
////
////        assignID(btnC, R.id.buttonC);
////        assignID(btnOpen, R.id.buttonOpen);
////        assignID(btnClose, R.id.buttonClose);
////        assignID(btnDivide, R.id.buttonDivide);
////        assignID(btnMultiply, R.id.buttonMultiply);
////        assignID(btnMinus, R.id.buttonMinus);
////        assignID(btnAdd, R.id.buttonAdd);
////        assignID(btnEquals, R.id.buttonEquals);
////        assignID(btn0, R.id.button0);
////        assignID(btn1, R.id.button1);
////        assignID(btn2, R.id.button2);
////        assignID(btn3, R.id.button3);
////        assignID(btn4, R.id.button4);
////        assignID(btn5, R.id.button5);
////        assignID(btn6, R.id.button6);
////        assignID(btn7, R.id.button7);
////        assignID(btn8, R.id.button8);
////        assignID(btn9, R.id.button9);
////        assignID(btnAC, R.id.buttonAC);
////        assignID(btnDot, R.id.buttonDot);
////    }
//
//
//
////    void assignID(MaterialButton btn, int id){
////        btn = findViewById(id);
////        btn.setOnClickListener(this);
////    }
////
////    @Override
////    public void onClick(View view) {
////        MaterialButton btn =(MaterialButton) view;
////        String buttonText = btn.getText().toString();
////        String dataToCalculate = solutionTv.getText().toString();
////
////        if(buttonText.equals("AC")){
////            solutionTv.setText("");
////            resultTv.setText("0");
////            return;
////        }
////        if(buttonText.equals("=")){
////            solutionTv.setText(resultTv.getText());
////        }
////        if(buttonText.equals("C")){
////            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length()-1);
////        }
////        else{
////            dataToCalculate = dataToCalculate+buttonText;
////        }
////
////        dataToCalculate = dataToCalculate+buttonText;
////        solutionTv.setText(dataToCalculate);
////
////
////    }
//}


package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        display = findViewById(R.id.input);
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


    private void updateText(String strToAdd) {
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
        updateText("x");
    }
    public void BTNdecimal(View view){
        updateText(".");
    }
//    public void BTNequal(View view){
//        String userExp = display.getText().toString();
//
//        userExp = userExp.replaceAll("÷", "/");
//        userExp = userExp.replaceAll("x", "*");
//
//        Expresssion exp = new Expression(userExp);
//
//        String result = String.valueOf(exp.calculate());
//
//        display.setText(result);
//        display.setSelection(result.length());
//    }
}