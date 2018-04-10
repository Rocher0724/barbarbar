package com.visualcamp.test.softkeytest.customView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by visualcamp on 2018. 1. 29..
 * Written by Dean.
 *
 * 몰입형 액티비티.
 *
 * 상태바, 타이틀바, 소프트키가 전부 보이지 않는 액티비티이다.
 * 화면 하단으로부터 스와이프 할 때 투명하게 소프트키와 상태바가 생긴다.
 * Setting, Profile Activity에서 전체화면을 만들기위해 구성함.
 */

public class ImmersiveActivity extends AppCompatActivity {

  private View decorView;
  private int	uiOption;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    decorView = getWindow().getDecorView();
    uiOption = getWindow().getDecorView().getSystemUiVisibility();

    uiOption ^= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    uiOption ^= View.SYSTEM_UI_FLAG_FULLSCREEN;
    uiOption ^= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
  }

  @Override
  public void onWindowFocusChanged(boolean hasFocus) {
    if( hasFocus ) {
      decorView.setSystemUiVisibility( uiOption );
    }
  }
}
// 스테이터스바 삭제
// 액션바 삭제
// 스테이터스바, 액션바 삭제