import java.io.*;

public class TestCase4 {
    public static void main(String[] args){

        try{
            PrintStream o = new PrintStream(new File("StudentAnswer4.txt"));
            PrintStream console = System.out;
       
            // Assign o to output stream
            System.setOut(o);
            }
        catch (FileNotFoundException ex)  
        {
             // insert code to run when exception occurs
        }

        MMBurgersInterface mm = new MMBurgers();
        System.out.println("--Started simulation--");

        // Set number of counters and griddle capacity
        try{
            mm.setK(0);
        }
        catch(IllegalNumberException e){
            System.out.println("Exception");
	    System.out.println("Exception");
        }


		// Set number of counters and griddle capacity
        try{
            mm.setM(0);
        }
        catch(IllegalNumberException e){
            System.out.println("Exception");
	    System.out.println("Exception");
        }

    }
}
