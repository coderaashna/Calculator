package in.coderaashna.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btnAdd, btnEql, btn0, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSub, btnDiv, btnMul, btnDot;
    int first_operand , second_operand, first_operand1;
    String operator = null , prev_operator = null ;
    int opd_flag = 0;

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt);
        txt.setText(null);

    }
    public void onClickBtnAdd(View v) {
        if( opd_flag == 1) {
            if(operator == null ) {
                first_operand = Integer.parseInt(txt.getText().toString());
                opd_flag = 2;
                operator = "+";
                return;
            }
            prev_operator = operator;
            second_operand = Integer.parseInt(txt.getText().toString());
            first_operand = evaluate_expression(first_operand , second_operand , prev_operator);
            txt.setText(Integer.toString(first_operand));
            second_operand = 0;
            opd_flag = 2;
            operator = "+";
        }



    }

    public void onClickBtn1(View v) {
        if(opd_flag ==1) {
            if(txt.length()>9)
                return;
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("1");

        }
        if(opd_flag == 2) {
            opd_flag = 1;
            txt.setText("1");
        }
        if(opd_flag == 0) {
            opd_flag = 1;
            txt.setText("1");
        }



    }



    public void onClickBtnSub(View v) {
        if( opd_flag == 1) {
            if(operator == null ) {
                first_operand = Integer.parseInt(txt.getText().toString());
                opd_flag = 2;
                operator = "-";
                return;
            }
            prev_operator = operator;
            second_operand = Integer.parseInt(txt.getText().toString());
            first_operand = evaluate_expression(first_operand , second_operand , prev_operator);
            txt.setText(Integer.toString(first_operand));
            second_operand = 0;
            opd_flag = 2;
            operator = "-";
        }


    }

    public void onClickBtnMul(View v) {
        if( opd_flag == 1) {
            if(operator == null ) {
                first_operand = Integer.parseInt(txt.getText().toString());
                opd_flag = 2;
                operator = "*";
                return;
            }
            prev_operator = operator;
            second_operand = Integer.parseInt(txt.getText().toString());
            first_operand = evaluate_expression(first_operand , second_operand , prev_operator);
            txt.setText(Integer.toString(first_operand));
            second_operand = 0;
            opd_flag = 2;
            operator = "*";
        }



    }

    public void onClickBtnDiv(View v) {
        if( opd_flag == 1) {
            if(operator == null ) {
                first_operand = Integer.parseInt(txt.getText().toString());
                opd_flag = 2;
                operator = "/";
                return;
            }
            prev_operator = operator;
            second_operand = Integer.parseInt(txt.getText().toString());
            first_operand = evaluate_expression(first_operand , second_operand , prev_operator);
            txt.setText(Integer.toString(first_operand));
            second_operand = 0;
            opd_flag = 2;
            operator = "/";
        }


    }



    public void onClickBtn2(View v) {

        if(opd_flag == 1) {

            if(txt.length()>9)
                return;
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("2");

        }
        else {
            opd_flag = 1;
            txt.setText("2");
        }

    }

    public void onClickBtn3(View v) {
        if(txt.length()>9)
            return;
        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("3");

        }
        else {
            opd_flag = 1;
            txt.setText("3");
        }

    }

    public void onClickBtnMod(View v) {
        if( opd_flag == 1) {
            if(operator == null ) {
                first_operand = Integer.parseInt(txt.getText().toString());
                opd_flag = 2;
                operator = "%";
                return;
            }
            prev_operator = operator;
            second_operand = Integer.parseInt(txt.getText().toString());
            first_operand = evaluate_expression(first_operand , second_operand , prev_operator);
            txt.setText(Integer.toString(first_operand));
            second_operand = 0;
            opd_flag = 2;
            operator = "%";
        }



    }

    public void onClickBtn4(View v) {
        if(txt.length()>9)
            return;
        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("4");

        }
        else {
            opd_flag = 1;
            txt.setText("4");
        }

    }

    public void onClickBtn5(View v) {
        if(txt.length()>9)
            return;
        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("5");

        }
        else {
            opd_flag = 1;
            txt.setText("5");
        }

    }

    public void onClickBtn6(View v) {
        if(txt.length()>9)
            return;

        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("6");

        }
        else {
            opd_flag = 1;
            txt.setText("6");
        }

    }

    public void onClickBtn7(View v) {
        if(txt.length()>9)
            return;
        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("7");

        }
        else {
            opd_flag = 1;
            txt.setText("7");
        }

    }

    public void onClickBtn8(View v) {
        if(txt.length()>9)
            return;

        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("8");

        }
        else {
            opd_flag = 1;
            txt.setText("8");
        }

    }

    public void onClickBtn9(View v) {
        if(txt.length()>9)
            return;

        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("9");

        }
        else {
            opd_flag = 1;
            txt.setText("9");
        }

    }

    public void onClickBtn0(View v) {
        if(txt.length()>9)
            return;
        if(opd_flag ==1) {
            //first_operand =  Integer.parseInt(txt.getText().toString());
            txt.append("0");

        }
        else {
            opd_flag = 1;
            txt.setText("0");
        }

    }


    public void onClickBtnEql(View v) {
        second_operand = Integer.parseInt(txt.getText().toString());
        first_operand1 = evaluate_expression(first_operand , second_operand , operator);
        txt.setText(Integer.toString(first_operand1));
        operator = null;


    }

    public void onClickBtnClr(View v) {
         operator = null ;
         prev_operator = null ;
         opd_flag = 0;
         txt.setText("0");

    }

    public int evaluate_expression(int first_optr, int second_optr, String operator) {

        String str;
        int a = 0;
        if (operator.equals("+")) {
            a = first_optr + second_optr;
            str = Integer.toString(a);
            //txt.setText(str);
            //return a;
        }

        if (operator.equals("*")) {
            a = first_optr * second_optr;
            str = Integer.toString(a);
           // txt.setText(str);
        }
        if (operator.equals("/")) {
            a = first_optr / second_optr;
            str = Integer.toString(a);
           // txt.setText(str);
        }
        if (operator.equals("-")) {
            a = first_optr - second_optr;
            str = Integer.toString(a);
           // txt.setText(str);
            //return a;
        }
        if (operator.equals("%")) {
            a = first_optr % second_optr;
            str = Integer.toString(a);
            // txt.setText(str);
            //return a;
        }
        return a;
    }
}