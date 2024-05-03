import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Bengals");
        myList.add("Cowboys");
        myList.add("Packers");
        myList.add("Lakers");
        myList.add("Browns");
        myList.add("Steelers");
        myList.add("49ers");
        myList.add("Bills");

        Collections.shuffle(myList);

        System.out.println("Let's start the playoffs!");
        for (int i = 0; i < myList.size(); i ++) {

            System.out.print(i + 1 + ". ");
            System.out.println(myList.get(i));

        }

        //First Round
        SafeInput.prettyHeader("Round One");
        System.out.println();

        //1 plays 8
        playGame(6, 7, myList);

        //2 plays 7
        playGame(4, 5, myList);

        //3 plays 6
        playGame(2, 3, myList);

        //4 plays 5
        playGame(0, 1, myList);


        //Second round
        SafeInput.prettyHeader("Round Two");
        System.out.println();

        //1 plays 4
        playGame(2, 3, myList);

        //2 plays 3
        playGame(0, 1, myList);


        //Third round
        SafeInput.prettyHeader("Finals");
        System.out.println();

        //1 plays 2
        playGame(0, 1, myList);

        System.out.println("The " + myList.get(0) + " are the Champions!");

    }

    public static void playGame(int teamA, int teamB, ArrayList<String> teams) {

        System.out.println(teams.get(teamA) + " vs " + teams.get(teamB));

        Random rnd = new Random();

        int teamAScore = rnd.nextInt(21) + 7;
        int teamBScore = rnd.nextInt(21) + 7;

        if (teamAScore > teamBScore) {

            System.out.println("The " + teams.get(teamA) + " defeat the " + teams.get(teamB));
            System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
            System.out.println();
            teams.remove(teamB);

        }

        else if (teamBScore > teamAScore) {

            System.out.println("The " + teams.get(teamB) + " defeat the " + teams.get(teamA));
            System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
            System.out.println();
            teams.remove(teamA);

        }

        else {

            System.out.println("Going to OT. The score is tied " + teamAScore + " - " + teamBScore);

            do {

                int OTscoreA = rnd.nextInt(10);
                int OTscoreB = rnd.nextInt(10);

                teamAScore = OTscoreA;
                teamBScore = OTscoreB;

                if (teamAScore > teamBScore) {

                    System.out.println("The " + teams.get(teamA) + " defeat the " + teams.get(teamB));
                    System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
                    System.out.println();
                    teams.remove(teamB);
                    break;

                }

                else if (teamBScore > teamAScore) {

                    System.out.println("The " + teams.get(teamB) + " defeat the " + teams.get(teamA));
                    System.out.println("Final Score: " + teamAScore + " - " + teamBScore);
                    System.out.println();
                    teams.remove(teamA);
                    break;

                }

            } while (true);

        }

    }

}
