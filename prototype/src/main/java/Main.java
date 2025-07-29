import com.example.prototype.MessageBox;
import com.example.prototype.UnderlinePen;
import com.example.prototype.framework.Manager;
import com.example.prototype.framework.Product;

public class Main {

  public static void main(String[] args) {
    Manager manager = new Manager();
    UnderlinePen underlinePen = new UnderlinePen('-');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');

    manager.register("strong message", underlinePen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);

    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");

    Product p2 = manager.create("warning box");
    p2.use("Hello, world.");

    Product p3 = manager.create("slash box");
    p3.use("Hello, world.");
  }
}
