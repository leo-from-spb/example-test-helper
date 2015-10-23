package lb.eth;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;



/**
 * @author Leonid Bushuev from JetBrains
 **/
public class ExampleTestOrder extends Language {

  public static final String LANGUAGE_ID = "ExampleTestOrder";

  public static final ExampleTestOrder INSTANCE = new ExampleTestOrder();


  public ExampleTestOrder() {
    super(LANGUAGE_ID);
  }
}
