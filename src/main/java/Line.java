import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Line {
    static Queue<Integer> peopleWaiting = new LinkedList<Integer>();
    static Integer[] tables = new Integer[2];
    
    static public void addOrRemove(){
        Scanner sc = new Scanner(System.in);
        tables[0] = 0;
        tables[1] = 0;
        for (Integer i = 0; i < 10; i++){
            System.out.println("Check someone in or out?" + " Type in for in or out for out");
            String input = sc.nextLine();
            if((input.equals("in")) && (tables[0] == (null))){
                tables[0] = i;
            }
            else if((input.equals("in")) && (tables[1] == (null))){
                tables[1] = i;
            }
            else if(input.equals("in")){
                peopleWaiting.add(i);
            } else {
                //clear table
                //assign table to next person on people waiting queue
                if(tables[0] > 0){
                    peopleWaiting.remove();
                    tables[0] = i;
                } else {
                    peopleWaiting.remove();
                    tables[1] = i;
                }
            } 
        }
        System.out.println("Tables: " + tables.toString() + "Line: "+ peopleWaiting);
    }

    @Override
    public String toString() {
        return "Line [peopleWaiting=" + peopleWaiting + "]";
    }
    
    
}
