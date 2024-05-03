import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);

        //Variables
        double userNum = 0;
        double total = 0;
        double average = 0;

        for (int i = 0; i < 5; i ++) {

            userNum = SafeInput.getDouble(in);
            myList.add(userNum);

        }

        System.out.println(myList);

        for (int i = 0; i < myList.size(); i ++) {

            total += myList.get(i);

        }

        average = total / myList.size();

        System.out.println("Total: " + total + "\nAverage: " + average);

    }

}
