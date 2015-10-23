package lb.eth;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

import static lb.eth.ExampleTestOrderFileType.*;



/**
 * @author Leonid Bushuev from JetBrains
 **/
public class ExampleTestOrderFileTypeFactory extends FileTypeFactory {

  @Override
  public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
    fileTypeConsumer.consume(INSTANCE, FILE_NAME_MATCHER);
  }


}
