package lb.eth;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.ExactFileNameMatcher;
import com.intellij.openapi.fileTypes.FileNameMatcher;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;



/**
 * @author Leonid Bushuev from JetBrains
 **/
public class ExampleTestOrderFileType extends LanguageFileType {

  public static final ExampleTestOrderFileType INSTANCE = new ExampleTestOrderFileType();


  public static final FileNameMatcher FILE_NAME_MATCHER =
    new ExactFileNameMatcher("_order_", true);



  public ExampleTestOrderFileType() {
    super(ExampleTestOrder.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Example Test Order";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Example Test Order";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return ExampleTestIcons.ORDER_ICON;
  }



}
