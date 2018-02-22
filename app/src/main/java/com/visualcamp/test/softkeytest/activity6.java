package com.visualcamp.test.softkeytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity6 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity6);
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
  }
}
