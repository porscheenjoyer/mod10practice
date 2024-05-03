import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        boolean continueYN = true;
        String name = "";

        //Loop
        do {

            name = SafeInput.getNonZeroLenString(in, "Input a name to add");
            myList.add(name);
            continueYN = SafeInput.getYNConfirm(in, "You want to exit?");


        } while (!continueYN);

        for (int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ". ");
            System.out.println(myList.get(i));

        }

        for (int i = 0; i < myList.size(); i ++) {

            name = myList.get(i);

            if (name.length() > 6) {

                myList.remove(i);

            }

        }

        System.out.println("Showing reduced list...");

        for (int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ". ");
            System.out.println(myList.get(i));

        }

    }
}