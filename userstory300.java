// importing File class
import java.io.File;

class Main {
  public static void main(String[] args) {
 
  //create a file object for the current location
    File file = new File("newFile.txt");

     try {
  
       //trying to create a file based on the object
         boolean value = file.createNewFile();
         if (value) {
           System.out.println("The new file is created.");
          }
        else {
           System.out.println("The file already exists.");
        }
      }
      Catch(Exception e) {
        e.getStackTrace();
        }
//new code added for hdfc-300 userstory --Mahender
//reads all data from input.txt
   sourcefile.read(array);
    //write all data to newFile
     destFile.write(array);
    System.out.println("The input.txt file is copied to new file"); 
         }
 }


