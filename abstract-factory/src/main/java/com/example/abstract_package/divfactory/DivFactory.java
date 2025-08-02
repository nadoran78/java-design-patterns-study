package com.example.abstract_package.divfactory;

import com.example.abstract_package.factory.Factory;
import com.example.abstract_package.factory.Link;
import com.example.abstract_package.factory.Page;
import com.example.abstract_package.factory.Tray;

public class DivFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new DivLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new DivTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new DivPage(title, author);
  }
}
