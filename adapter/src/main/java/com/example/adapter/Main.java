package com.example.adapter;

import com.example.adapter.delegation.PrintBannerForDelegation;
import com.example.adapter.delegation.PrintClass;
import com.example.adapter.extend.PrintInterface;
import com.example.adapter.extend.PrintBannerForImpl;

public class Main {

  public static void main(String[] args) {
    PrintInterface p = new PrintBannerForImpl("Hello");
    p.printWeak();
    p.printStrong();

    System.out.println();

    PrintClass p2 = new PrintBannerForDelegation("Hello");
    p2.printWeak();
    p2.printStrong();
  }

}
