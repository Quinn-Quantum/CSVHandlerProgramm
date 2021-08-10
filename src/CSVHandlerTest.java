/**
 * @author dariush
 *
 */
import java.io.IOException;
import java.util.List;

public class CSVHandlerTest {

  public static void main(String[] args) throws IOException {
    CSVHandler csv = new CSVHandler();
    
    List<Schueler> students = csv.getAll();
    
    csv.printAll(students);
    
  }
}
