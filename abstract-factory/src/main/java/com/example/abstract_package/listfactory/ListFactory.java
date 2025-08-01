package com.example.abstract_package.listfactory;

import com.example.abstract_package.factory.Factory;
import com.example.abstract_package.factory.Link;
import com.example.abstract_package.factory.Page;
import com.example.abstract_package.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }
}
