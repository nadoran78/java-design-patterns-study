package com.example.factory_method;

import com.example.factory_method.framework.Factory;
import com.example.factory_method.framework.Product;
import com.example.factory_method.idcard.IDCardFactory;

public class Main {

  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("홍길동");
    Product card2 = factory.create("김철수");
    Product card3 = factory.create("박영희");

    card1.use();
    card2.use();
    card3.use();
  }

}
