package com.visualcamp.test.softkeytest.customView;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by visualcamp on 2018. 2. 22..
 */

public class ContentView extends View implements View.OnSystemUiVisibilityChangeListener {

  int mLastSystemUiVis;
  Runnable mNavHider = new Runnable() {

    @Override
    public void run() {
      // TODO Auto-generated method stub
      setNavVisibility(false);
    }

  };

  public ContentView(Context context, AttributeSet attrs) {
    super(context, attrs);
    // TODO Auto-generated constructor stub
    setOnSystemUiVisibilityChangeListener(this);
    setNavVisibility(false);
  }

  @Override
  public void onSystemUiVisibilityChange(int visibility) {
    // TODO Auto-generated method stub
    int diff = mLastSystemUiVis ^ visibility;
    mLastSystemUiVis = visibility;
    if ((diff & SYSTEM_UI_FLAG_HIDE_NAVIGATION) != 0
        && (visibility & SYSTEM_UI_FLAG_HIDE_NAVIGATION) == 0) {
      setNavVisibility(true);
    }
  }

  void setNavVisibility(boolean visible) {
    int newVis = SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        | SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        | SYSTEM_UI_FLAG_LAYOUT_STABLE;
    if (!visible) {
      newVis |= SYSTEM_UI_FLAG_LOW_PROFILE
          | SYSTEM_UI_FLAG_FULLSCREEN
          | SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    }

    if (visible) {
      Handler handler = getHandler();
      if (handler != null) {
        handler.removeCallbacks(mNavHider);
        handler.postDelayed(mNavHider, 2000);
      }
    }
    setSystemUiVisibility(newVis);
  }
}