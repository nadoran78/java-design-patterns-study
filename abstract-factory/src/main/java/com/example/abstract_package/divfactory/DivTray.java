package com.example.abstract_package.divfactory;

import com.example.abstract_package.factory.Item;
import com.example.abstract_package.factory.Tray;

public class DivTray extends Tray {

  public DivTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<p><b>");
    sb.append(caption);
    sb.append("</b></p>\n");
    sb.append("<div class=\"TRAY\">");
    for (Item item : tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</div>\n");
    return sb.toString();
  }
}
