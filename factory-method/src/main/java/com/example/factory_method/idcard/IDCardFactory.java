package com.example.factory_method.idcard;

import com.example.factory_method.framework.Factory;
import com.example.factory_method.framework.Product;

public class IDCardFactory extends Factory {

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product + "을 등록했습니다.");
  }
}
