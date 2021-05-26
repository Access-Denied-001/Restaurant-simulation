import java.io.*;

public class TestCase1 {
    public static void main(String[] args){

        try{
            PrintStream o = new PrintStream(new File("StudentAnswer1.txt"));
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
            mm.setK(3);
            mm.setM(6);
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 0
        try{
            // Customer 1 arrives
            mm.arriveCustomer(1, 0, 3);
            // Customer 2 arrives
            mm.arriveCustomer(2, 0, 4);
            // Customer 3 arrives
            mm.arriveCustomer(3, 0, 5);
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 1
        try{
            // Query customer state
            System.out.println(mm.customerState(2, 1));
            // Query griddle state
            System.out.println(mm.griddleState(1));
            System.out.println(mm.griddleWait(1));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 2
        try{
            // Query griddle state
            System.out.println(mm.griddleState(2));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 3
        try{
            // Query customer state
            System.out.println(mm.customerState(1, 3));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 7
        try{
            // Query customer state
            System.out.println(mm.customerState(2, 7));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 10
        try{
            // Query griddle wait time
            System.out.println(mm.griddleWait(10));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 14
        try{
            // Query griddle state
            System.out.println(mm.griddleState(14));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 21
        try{
            // Query griddle state
            System.out.println(mm.griddleState(21));
            System.out.println(mm.isEmpty());
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // t = 23
        try{
            // Advance time
            mm.advanceTime(23);
            System.out.println(mm.isEmpty());
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

        // End of simulation
        System.out.println("--End of simulation--");
        

        // Query wait times
        try{
            System.out.println(mm.customerWaitTime(1));
            System.out.println(mm.customerWaitTime(2));
            System.out.println(mm.customerWaitTime(3));
            System.out.println(String.format("%.2f", mm.avgWaitTime()));
        }
        catch(IllegalNumberException e){
            System.out.println(e);
        }

    }
}
