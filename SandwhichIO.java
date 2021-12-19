import java.io.*;
import java.util.ArrayList;

public class SandwichIO {
public static void writeOrderToFile(Order o) throws IOException{
File file =new File("orderline.txt");
if(file.exists()==false){
file.createNewFile();
}
  
ArrayList<String> list=new ArrayList<String>();

  
BufferedReader objReader = null;

String strCurrentLine;

try {
objReader = new BufferedReader(new FileReader(file));
while ((strCurrentLine = objReader.readLine()) != null) {
list.add(strCurrentLine);
}
  
objReader.close();
  
} catch (FileNotFoundException ex) {
System.out.print("File not found");
}
catch (IOException ex) {
System.out.print("File read error");
}

  
list.add(o.toString());
  
  
PrintWriter printWriter = new PrintWriter( new FileWriter(file));
  
  
for(int i=0;i<list.size();i++){
printWriter.print(list.get(i));
  

  
if(i<=list.size()-1){
printWriter.println();
}
}
  
printWriter.close();
}
}