package com.example.adapter.delegation;

import com.example.adapter.Banner;

public class PrintBannerForDelegation extends PrintClass{

  private Banner banner;

  public PrintBannerForDelegation(String string) {
    this.banner = new Banner(string);
  }

  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
