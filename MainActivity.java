package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText personname1;
    EditText personname2;
    EditText displayname1 = findViewById(R.id.editText);
    EditText displayname2 = findViewById(R.id.editText2);

    int[][] arr = new int[3][3];
    int a = 0;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            final Button bt2;
            bt2 = findViewById(R.id.button10);
            bt2.setOnClickListener(new OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           if(a%2!=0)
                                              {arr[0][1]=0;
                                                  bt2.setText("X");}
                                           else
                                               {arr[0][1]=1;
                                               bt2.setText("0");}
                                           a++;
                                           check();
                                       }

                                       });
            personname1 = findViewById(R.id.textView1);
        personname2 = findViewById(R.id.textView2);

        final Button bt1;
        bt1=findViewById(R.id.button6);
        bt1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(a%2!=0)
                {arr[0][0]=0;
                    bt1.setText("X");}
                else
                {arr[0][0]=1;
                    bt1.setText("0");}
                a++;
                check();
            }
        });

        final Button bt3;
        bt3=findViewById(R.id.button2);
        bt3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a%2!=0)
                {arr[0][2]=0;
                    bt3.setText("X");}
                else
                {arr[0][2]=1;
                    bt3.setText("0");}
                a++;
                check();
            }
        });

        final Button bt4;
        bt4=findViewById(R.id.button12);
        bt4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a%2!=0)
                {arr[1][0]=0;
                    bt4.setText("X");}
                else
                {arr[1][0]=1;
                    bt4.setText("0");}
                a++;
                check();
            }
        });

            final Button bt5;
            bt5=findViewById(R.id.button7);
            bt5.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a%2!=0)
                    {arr[1][1]=0;
                        bt5.setText("X");}
                    else
                    {arr[1][1]=1;
                        bt5.setText("0");}
                    a++;
                    check();
                }
            });

            final Button bt6;
            bt6=findViewById(R.id.button4);
            bt6.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a%2!=0)
                    {arr[1][2]=0;
                        bt6.setText("X");}
                    else
                    {arr[1][2]=1;
                        bt6.setText("0");}
                    a++;
                    check();
                }
            });

            final Button bt7;
            bt7=findViewById(R.id.button8);
            bt7.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a%2!=0)
                    {arr[2][0]=0;
                        bt7.setText("X");}
                    else
                    {arr[2][0]=1;
                        bt7.setText("0");}
                    a++;
                    check();
                }
            });

            final Button bt8;
            bt8=findViewById(R.id.button11);
            bt8.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a%2!=0)
                    {arr[2][1]=0;
                        bt8.setText("X");}
                    else
                    {arr[2][1]=1;
                        bt8.setText("0");}
                    a++;
                    check();
                }
            });

            final Button bt9;
            bt9=findViewById(R.id.button5);
            bt9.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a%2!=0)
                    {arr[2][2]=0;
                        bt9.setText("X");}
                    else
                    {arr[2][2]=1;
                        bt9.setText("0");}
                    a++;
                    check();
                }
            });
    }
    public void buttonpress(View view) {
        String s1 = personname1.getText().toString();
        String s2 = personname2.getText().toString();
        displayname1.setText(s1);
        displayname2.setText(s2);

    }
    void check()
    {
        EditText displaytextf=findViewById(R.id.editText3);
        String s1 = personname1.getText().toString();
        String s2 = personname2.getText().toString();
        int i=0,j=0;
        for(i=0;i<3;i++) {
            if (arr[i][0] + arr[i][1] + arr[i][2] == 0) {
                j = 1;
            }
            if (arr[i][0] + arr[i][1] + arr[i][2] == 3)
            {
                j=2;
            }
            if (arr[0][i] + arr[1][i] + arr[2][i] == 0)
            {
                j=1;
            }
            if (arr[0][i] + arr[1][i] + arr[2][i] == 3)
            {
                j=2;
            }
        }
        if(arr[0][0]+arr[1][1]+arr[2][2]==0)
        {
            j=1;
        }
        if(arr[0][0]+arr[1][1]+arr[2][2]==3)
        {
            j=2;
        }
        if(j==1)
        {
            displaytextf.setText(s1);
        }
        if(j==2)
        {
            displaytextf.setText(s2);
        }
        if(a==9&&j==0)
        {

            displaytextf.setText("");

        }
    }
}


