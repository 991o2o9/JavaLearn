import java.io.*;

public class Main {
  public static void main(String[] args){
    // Writer
    String filePath = "text.txt";
    String textContent = """
            Roses are blue
            Violets are blue
            BOOTY BOOTY BOOTY
            ROCKING EVERYWHERE
            """;

    try(FileWriter writer = new FileWriter(filePath);) {$
      writer.write(textContent);
      System.out.println("File has been written");
    }
    catch (FileNotFoundException e){
      System.out.println("Could not locate file location");
    }
    catch (IOException e){
      System.out.println("Could not write a file: " + e.getMessage());
    }


  // Reader
  String filePathRe = "text.txt";


  try(BufferedReader reader = new BufferedReader(new FileReader(filePathRe))){

    String line;
    while ((line = reader.readLine()) != null){
      System.out.println(line);
    }
  }
  catch(FileNotFoundException e){
    System.out.println("Could not locate file location"+ e.getMessage());
  }
  catch(IOException e){
    System.out.println("Something went wrong");
  }
  }
}