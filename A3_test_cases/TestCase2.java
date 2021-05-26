import java.io.*;
public class TestCase2 {
    public static void main(String[] args){

        try{
            PrintStream o = new PrintStream(new File("StudentAnswer2.txt"));
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
            mm.setK(2);
            mm.setM(8);
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 0
        try{
            // Customer 1 arrives
            mm.arriveCustomer(1, 0, 5);
            // Customer 2 arrives
            mm.arriveCustomer(2, 0, 6);
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 1
        try{
            // Customer 3 arrives
            mm.arriveCustomer(3, 1, 4);
            // Customer 4 arrives
            mm.arriveCustomer(4, 1, 5);
            // Query customer state
            System.out.println(mm.customerState(3, 1));
            // Query customer state
            System.out.println(mm.customerState(4, 1));
            // Query griddle state
            System.out.println(mm.griddleState(1));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 5
        try{
            System.out.println(mm.customerState(1, 5));
            // Query griddle state
            System.out.println(mm.griddleState(5));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 6
        try{
            // Query customer state
            System.out.println(mm.customerState(2, 6));
            // Query griddle state
            System.out.println(mm.griddleWait(6));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 12
        try{
            // Query griddle state
            System.out.println(mm.griddleWait(12));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 25
        try{
            // Query griddle state
            System.out.println(mm.griddleState(25));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

         // t = 32
         try{
            // Query griddle state
            mm.advanceTime(32);
            System.out.println(mm.isEmpty());
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // End of simulation
        System.out.println("--End of simulation--");
        System.out.println(mm.isEmpty());

        // Query wait times
        try{
            System.out.println(mm.customerWaitTime(1));
            System.out.println(mm.customerWaitTime(2));
            System.out.println(mm.customerWaitTime(3));
            System.out.println(mm.customerWaitTime(4));
            System.out.println(String.format("%.2f", mm.avgWaitTime()));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

    }
}
