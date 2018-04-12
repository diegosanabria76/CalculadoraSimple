package com.example.diegosanabriabecerra.calculadorasimple;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TextView txt;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private TextView info;
    private TextView result;
    private Button clear;


    private final char ADDITION = '+';
    private final char SUBSTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUALS = 0;


    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        //This prints number 0 on the sceren
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "0");
            }
        });

        //This prints number 1 on the sceren
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "1");
            }
        });

        //This prints number 2 on the sceren
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "2");
            }
        });

        //This prints number 3 on the sceren
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "3");
            }
        });
        //This prints number 4 on the sceren
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "4");
            }
        });

        //This prints number 5 on the sceren
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "5");
            }
        });
        //This prints number 6 on the sceren
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "6");
            }
        });

        //This prints number 7 on the sceren
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "7");
            }
        });
        //This prints number 8 on the sceren
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "8");
            }
        });

        //This prints number 9 on the sceren
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString()+  "9");
            }
        });

        //This prints number 9 on the sceren
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) +  "+");
                info.setText(null);
            }
        });

        //This prints number 9 on the sceren
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBSTRACTION;
                result.setText(String.valueOf(val1) +  "-");
                info.setText(null);
            }
        });



        //This prints number 9 on the sceren
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) +  "*");
                info.setText(null);
            }
        });
        //This prints number 9 on the sceren
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) +  "/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();

                ACTION = EQUALS;
                result.setText(result.getText().toString()+ String.valueOf(val2)+"="+ String.valueOf(val1));
                // 8 + 5  = 13
                info.setText(null);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length()>0)
                {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));

                }else
                {
                    val1= Double.NaN;
                    val2= Double.NaN;

                    info.setText(null);
                    result.setText(null);

                }
            }
        });
















    }

    private void setupUIViews()
    {
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        mul = (Button) findViewById(R.id.btnmulti);
        div = (Button) findViewById(R.id.btndivide);
        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvResult);
        equal = (Button) findViewById(R.id.btnequal);
        clear = (Button) findViewById(R.id.btnclear);
    }

    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(info.getText().toString());
            switch (ACTION){

                case ADDITION:
                    val1 =  val1+ val2;
                    break;

                case SUBSTRACTION:
                    val1 =  val1 - val2;
                    break;

                case MULTIPLICATION:
                    val1 =  val1 * val2;
                    break;

                case DIVISION:
                    val1 =  val1 / val2;
                    break;


                case EQUALS:

                    break;
            }
        }
        else {
            val1 =Double.parseDouble( info.getText().toString());
        }
    }
}
