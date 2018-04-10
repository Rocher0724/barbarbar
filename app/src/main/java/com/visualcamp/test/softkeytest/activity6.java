package com.visualcamp.test.softkeytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity6 extends AppCompatActivity implements View.OnClickListener{

  private Button button9;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity6);

    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

    button9 = (Button) findViewById(R.id.button9);
    button9.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
  }
}
