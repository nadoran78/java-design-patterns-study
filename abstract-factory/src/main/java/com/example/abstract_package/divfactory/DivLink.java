package com.example.abstract_package.divfactory;

import com.example.abstract_package.factory.Link;

public class DivLink extends Link {

  public DivLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    return "<div class=\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
  }
}
