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

//new code changes done by vivek for the userstory hdfc-301
public static void sampleMethod(int a, int b) throws ArithmeticException{
System.out.ptintln("Hello, this is sample method");
int c = a/b ; // int c = 4/2 which gets calculated as 2
System.out.println("c:"+c); // c: 2
}
       }
//new code added for hdfc-300 userstory --Mahender
//reads all data from input.txt
   sourcefile.read(array);
    //write all data to newFile
     destFile.write(array);
    System.out.println("The input.txt file is copied to new file");
    public static void main (String[] args){
      DemoClass.sampleMethod(4,2);
    }
     
         }

 }


