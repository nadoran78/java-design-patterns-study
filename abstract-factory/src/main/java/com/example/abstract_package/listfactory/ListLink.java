package com.example.abstract_package.listfactory;

import com.example.abstract_package.factory.Link;

public class ListLink extends Link {
  public ListLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
  }
}
