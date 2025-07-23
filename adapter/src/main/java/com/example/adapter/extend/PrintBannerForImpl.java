package com.example.adapter.extend;

import com.example.adapter.Banner;

public class PrintBannerForImpl extends Banner implements PrintInterface {

  public PrintBannerForImpl(String string) {
    super(string);
  }

  @Override
  public void printWeak() {
    showWithParen();
  }

  @Override
  public void printStrong() {
    showWithAster();
  }
}
