  import java.io.File;
    import java.util.Scanner;
    
    public class SummingSeveralNumbersFromAnyFile {
    
        public static void main(String[] args) throws Exception {
        
            String file;
            int total = 0;
            
            Scanner k = new Scanner(System.in);
            
            System.out.print("\nWhich file would you like to read numbers from: ");
            file = k.next();
            System.out.println("Reading numbers from \"" + file + "\"");
            System.out.println();
            
            Scanner fileReader = new Scanner(new File(file));
            
            while(fileReader.hasNext()) {
                int number = fileReader.nextInt();
                System.out.print(number + " ");
                total = number + total;
            }
            
            System.out.println("\nTotal is " + total + "\n");
            fileReader.close();
        }
    }