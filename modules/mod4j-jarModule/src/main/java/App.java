import java.util.Properties;

/**
 * Hello world! TODO Remove this class.
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  public String getEnviromentValues() {

    Properties props = System.getProperties();
    return props.values().toString();
  }
}
