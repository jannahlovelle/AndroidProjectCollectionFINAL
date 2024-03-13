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

//
//package com.example.androidprojectcollection;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import org.mariuszgromada.math.mxparser.Expression;
//
//public class CalculatorExercise extends AppCompatActivity {
//    private EditText display;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calculator);
//        display = findViewById(R.id.input);
//        if (display != null) {
//            display.setShowSoftInputOnFocus(false);
//
//            // Set a click listener for the display, for example, to clear the text
//            display.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (getString(R.string.display).equals(display.getText().toString())) {
//                        display.setText("");
//                    }
//                }
//            });
//        }
//    }
//
//    private void updateText(String strToAdd) {
//        String oldStr = display.getText().toString();
//        int cursorPos = display.getSelectionStart();
//
//        // Check if both the new input and the last character in oldStr are operators
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
//
//    public void BTN0(View view) {
//        updateText("0");
//    }
//
//    public void BTN1(View view) {
//        updateText("1");
//    }
//
//    public void BTN2(View view) {
//        updateText("2");
//    }
//
//    public void BTN3(View view) {
//        updateText("3");
//    }
//
//    public void BTN4(View view) {
//        updateText("4");
//    }
//
//    public void BTN5(View view) {
//        updateText("5");
//    }
//
//    public void BTN6(View view) {
//        updateText("6");
//    }
//
//    public void BTN7(View view) {
//        updateText("7");
//    }
//
//    public void BTN8(View view) {
//        updateText("8");
//    }
//
//    public void BTN9(View view) {
//        updateText("9");
//    }
//
//    public void BTNdivide(View view) {
//        updateText("/");
//    }
//
//    public void BTNminus(View view) {
//        updateText("-");
//    }
//
//    public void BTNplus(View view) {
//        updateText("+");
//    }
//
//    public void BTNmultiply(View view) {
//        updateText("x");
//    }
//
//    public void BTNdecimal(View view) {
//        updateText(".");
//    }
//
//    public void BTNequal(View view) {
//        String userExp = display.getText().toString();
//
//        // Replace symbols for proper evaluation
//        userExp = userExp.replaceAll("÷", "/");
//        userExp = userExp.replaceAll("x", "*");
//
//        // Evaluate expression
//        Expression exp = new Expression(userExp);
//        String result = String.valueOf(exp.calculate());
//
//        // Display result
//        display.setText(result);
//        display.setSelection(result.length());
//    }
//}

package com.example.androidprojectcollection;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;
public class CalculatorExercise extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initButtons();
        textResult = findViewById(R.id.tvResult);
        equationString = findViewById(R.id.solLayout);
        setButtonOnClicks();
    }
    private Button btnAC;
    private Button btnC;
    private Button btnPercent;
    private Button btnEquate;
    private Button btnAdd;
    private Button btnMultiply;
    private Button btnMinus;
    private Button btnDivide;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDecimal;
    private TextView textResult;
    private TextView equationString;
    private boolean hasDecimal;
    public Calculator calculator = new Calculator();

    private void initButtons() {
//        btnAC = findViewById(R.id.acBTN);
//        btnC = findViewById(R.id.clear);
        //btnPercent = findViewById(R.id.btnPercent);
        btnDivide = findViewById(R.id.BTNdivide);
        btnAdd = findViewById(R.id.BTNplus);
        btnMinus = findViewById(R.id.BTNminus);
        btnMultiply = findViewById(R.id.BTNmultiply);
        btnDecimal = findViewById(R.id.BTNdecimal);
        btnEquate = findViewById(R.id.BTNequal);
        btn0 = findViewById(R.id.BTN0);
        btn1 = findViewById(R.id.BTN1);
        btn2 = findViewById(R.id.BTN2);
        btn3 = findViewById(R.id.BTN3);
        btn4 = findViewById(R.id.BTN4);
        btn5 = findViewById(R.id.BTN5);
        btn6 = findViewById(R.id.BTN6);
        btn7 = findViewById(R.id.BTN7);
        btn8 = findViewById(R.id.BTN8);
        btn9 = findViewById(R.id.BTN9);
    }
    private void setButtonOnClicks() {
        btnAC.setOnClickListener(v -> {
            textResult.setText("");
            equationString.setText("");
            hasDecimal = false;
        });
        btnC.setOnClickListener(v -> {
            String temp = String.valueOf(equationString.getText());
            if(!temp.isEmpty()) {
                if(temp.charAt(temp.length() - 1) == '.') {
                    hasDecimal = false;
                }
                temp = temp.substring(0, temp.length() - 1);
                equationString.setText(temp);
            }
        });
        // btnPercent.setOnClickListener(v -> {
        // Context context = getApplicationContext();
        //String featureNotAdded = "Feature not added.";
        // Toast toast = Toast.makeText(context, featureNotAdded, Toast.LENGTH_SHORT);
        //toast.show();
        //});
        btnDivide.setOnClickListener(v -> {
            opChecker("/");
        });
        btnMinus.setOnClickListener(v -> {
            opChecker("-");
        });
        btnAdd.setOnClickListener(v -> {
            opChecker("+");
        });
        btnMultiply.setOnClickListener(v -> {
            opChecker("*");
        });
        btnDecimal.setOnClickListener(v -> {
            if(!hasDecimal) {
                textResult.append(".");
                hasDecimal = true;
            } else {
                Context context = getApplicationContext();
                String invalidFormat = "Invalid format.";
                Toast toast = Toast.makeText(context, invalidFormat, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btn0.setOnClickListener(v -> {
            equationString.append("0");
        });
        btn1.setOnClickListener(v -> {
            equationString.append("1");
        });
        btn2.setOnClickListener(v -> {
            equationString.append("2");
        });
        btn3.setOnClickListener(v -> {
            equationString.append("3");
        });
        btn4.setOnClickListener(v -> {
            equationString.append("4");
        });
        btn5.setOnClickListener(v -> {
            equationString.append("5");
        });
        btn6.setOnClickListener(v -> {
            equationString.append("6");
        });
        btn7.setOnClickListener(v -> {
            equationString.append("7");
        });
        btn8.setOnClickListener(v -> {
            equationString.append("8");
        });
        btn9.setOnClickListener(v -> {
            equationString.append("9");
        });
        btnEquate.setOnClickListener(v -> {
            String evaluate = String.valueOf(equationString.getText());
            String last = evaluate.substring(evaluate.length() - 1, evaluate.length());
            if(last.equals("/") || last.equals("+") || last.equals("-") || last.equals("*")) {
                Context context = getApplicationContext();
                String invalidFormat = "Invalid format.";
                Toast toast = Toast.makeText(context, invalidFormat, Toast.LENGTH_SHORT);
                toast.show();
            } else {
                textResult.setText(calculator.calculate(evaluate, true));
            }
        });
    }
    private void opChecker(String op) {
        String temp =  String.valueOf(equationString.getText());
        StringBuilder sb = new StringBuilder();
        if(temp.isEmpty()) {
            return;
        }
        String last = temp.substring(temp.length() - 1, temp.length());
        if(last.equals("/") || last.equals("+") || last.equals("*") || last.equals("-")) {
            temp = temp.substring(0, temp.length() - 1);
        } else {
            hasDecimal = false;
        }
        sb.append(temp);
        sb.append(op);
        equationString.setText(sb);
        textResult.setText(calculator.calculate(temp, false));
    }
}