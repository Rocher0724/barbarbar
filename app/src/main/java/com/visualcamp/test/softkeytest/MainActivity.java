package com.visualcamp.test.softkeytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button btn1, btn2, btn3, btn4;
  private Button btn5, btn6, btn7, btn8;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btn1 = (Button) findViewById(R.id.button1);
    btn2 = (Button) findViewById(R.id.button2);
    btn3 = (Button) findViewById(R.id.button3);
    btn4 = (Button) findViewById(R.id.button4);
    btn5 = (Button) findViewById(R.id.button5);
    btn6 = (Button) findViewById(R.id.button6);
    btn7 = (Button) findViewById(R.id.button7);
    btn8 = (Button) findViewById(R.id.button8);
    btn1.setOnClickListener(this);
    btn2.setOnClickListener(this);
    btn3.setOnClickListener(this);
    btn4.setOnClickListener(this);
    btn5.setOnClickListener(this);
    btn6.setOnClickListener(this);
    btn7.setOnClickListener(this);
    btn8.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    Intent intent = null;
    switch (v.getId()) {
      case R.id.button1:
        intent = new Intent(MainActivity.this, activity1.class);
        break;

      case R.id.button2:
        intent = new Intent(MainActivity.this, activity2.class);

        break;

      case R.id.button3:
        intent = new Intent(MainActivity.this, activity3.class);

        break;

      case R.id.button4:
        intent = new Intent(MainActivity.this, activity4.class);

        break;
      case R.id.button5:
        intent = new Intent(MainActivity.this, activity5.class);
        break;

      case R.id.button6:
        intent = new Intent(MainActivity.this, activity6.class);

        break;

      case R.id.button7:
        intent = new Intent(MainActivity.this, activity7.class);

        break;

      case R.id.button8:
        intent = new Intent(MainActivity.this, activity8.class);

        break;
    }
    startActivity(intent);
  }
}
