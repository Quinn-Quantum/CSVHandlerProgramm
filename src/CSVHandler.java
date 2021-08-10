/**
 * @author dariush
 *
 */
import java.io.*;
import java.util.*;


public class CSVHandler {
  
  private String file = "studentNameCSV.csv";    //muss sich im aktuellen Ordner befinden!
  private String delimiter =    ";";
  private String line = "";
  
  // Constructor 1
  public CSVHandler() {
  }
  
  // Constructor 2
  public CSVHandler(String delimiter, String file) {
    super();
    this.delimiter = delimiter;
    this.file = file;
  }
  
  
  // Begin Methods
  
  public List<Schueler> getAll() throws IOException {
    Schueler s = null;
    List<Schueler> students = new ArrayList<Schueler>();
    int joker = 0;
    int blamiert= 0;
    int fragen = 0;
    	 try {
             BufferedReader reader = new BufferedReader(new FileReader("studentNameCSV.csv"));
             String zeile="";
             zeile = reader.readLine();

           while((zeile = reader.readLine()) != null){
               String[] token = zeile.split(";");
               //System.out.println(token[0] + " | "+ token[1]+ " | "+ token[2]+ " | "+ token[3] + "|" + token[4]);
               s = new Schueler ((token[0] + token[1]) ,joker = Integer.parseInt(token[2]), blamiert = Integer.parseInt(token[3]), fragen= Integer.parseInt(token[4]));
               } 
students.add(s);
           //System.out.print(s);
               
         } catch (IOException e){
             e.printStackTrace();
         }
    
    return students;
  }
  
  public void printAll(List<Schueler> students) {
	  System.out.println("Name\tJoker\tBlamiert\tFrage");
    for (Schueler s : students) {
      System.out.println(s.getName()+"\t"+ s.getJoker()+"\t"+ s.getBlamiert()+"\t"+ s.getFragen());
    }
  }
}