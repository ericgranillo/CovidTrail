
import java.util.Scanner;
import java.util.Random;

public class aDayAtSchool {

    public static void main(String[] args) {
        Scanner userDecision = new Scanner(System.in);  // Create a Scanner object

        // this is the event that you are presenting to the user
        //in this case it simply 1 or 2
        System.out.println("You are walking to the Cafeteria and you see a large group of people playing frisbee on the lawn");
        System.out.println("What do you want to do?");
        System.out.println("press 1 to keep walking and get food");
        System.out.println("press 2 to jump in the game and have some fun!");


        // reads user input and returns the value they just entered to them

        int userFate = userDecision.nextInt();
        int userRisk = 50;


        //this event would be considered the "safe" event and has a much lower probability of infection

        if (userFate == 1) {
            System.out.println("That's probably a good idea, who plays frisbee in November? ");

            Random chanceOfInfection = new Random();
            userRisk = userRisk - 2;

            //  boolean infected = chanceOfInfection.nextInt(25) == 0;
            // this command generates a random probability between 1 and 25
            // of returning true, or simply put it is a 1/25 chance of infection
            // here we are saying that userRisk starts at 50 and only decreases by
            // 2 if the safe choice is made but decreases by 10 if the risky choice is made
            // essentially increasing the probability of infection with each round.

            boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
            if (infected == true) {
                System.out.println("unfortunately for you, sometimes people get sick for no reason. ");
                System.out.println("you contracted Covid-19, nice knowing you");
            }

            if (infected == false) {
                System.out.println("You avoided infection...for now");
            }

        } else if (userFate == 2) {
            System.out.println("Why would you want to play frisbee in this weather? your going to catch a cold...");
            Random chanceOfInfection = new Random();
            userRisk = userRisk - 10;

            boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
            if (infected == true) {
                System.out.println("Should have just ate your food");
                System.out.println("you contracted Covid-19, nice knowing you");
            }

            if (infected == false) {
                System.out.println("...But not today, you avoided infection ");
            }

        }


        System.out.println("When you finally make it to the cafeteria you notice that many of the tables appear very dirty");
        System.out.println("What do you want to do?");
        System.out.println("press 1: Take your food somewhere else and eat");
        System.out.println("press 2: Sit down and eat your food");

        userFate = userDecision.nextInt();

        if (userFate == 1) {
            System.out.println("Smart, why do you even pay tuition right? ");

            Random chanceOfInfection = new Random();
            userRisk = userRisk - 2;


            boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
            if (infected == true) {
                System.out.println("unfortunately for you, sometimes people get sick for no reason. ");
                System.out.println("you contracted Covid-19, nice knowing you");
            }

            if (infected == false) {
                System.out.println("You avoided infection...for now");
            }

        } else if (userFate == 2) {
            System.out.println("That's kinda gross, but hey it's your life");
            Random chanceOfInfection = new Random();
            userRisk = userRisk - 10;

            boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
            if (infected == true) {
                System.out.println("Should have just ate your food");
                System.out.println("you contracted Covid-19, nice knowing you");
            }

            if (infected == false) {
                System.out.println("The tables germs must have kept you safe from Covid, no infection today ");
            }


        }
        System.out.println("Well, it's time to go to your favorite class...Math! ");
        System.out.println("And lucky for you, today is a group quiz");
        System.out.println("press 1: Sit down with your 4 person group and finish your quiz, don't want to miss another one.");
        System.out.println("press 2: Raise concerns to your instructor about the proximity of group mates.");

        userFate = userDecision.nextInt();

        if (userFate == 2) {
            System.out.println(" The instructor gives you the option to leave but you will fail the quiz. ");

            System.out.println("press 1: I'm out of here, I want to live.");
            System.out.println("press 2: suck it up and get it done");
            userFate = userDecision.nextInt();

            if (userFate == 1) {
                System.out.println("good idea, you were going to fail anyways");
                Random chanceOfInfection = new Random();
                userRisk = userRisk - 2;
                boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
            }

            if (userFate == 2) {
                System.out.println("you do need a better grade in this class, might as well stick it out" );
                Random chanceOfInfection = new Random();
                userRisk = userRisk - 10;
                boolean infected = chanceOfInfection.nextInt(userRisk) == 0;


                if (infected == true) {
                    System.out.println("The things we do for an education... ");
                    System.out.println("you contracted Covid-19, nice knowing you");
                }

                if (infected == false) {
                    System.out.println("By the power of Math! you avoided Covid 19");
                }


            } else if (userFate == 2) {
                System.out.println("What are you going to do, am I right?");
                Random chanceOfInfection = new Random();
                userRisk = userRisk - 10;

                boolean infected = chanceOfInfection.nextInt(userRisk) == 0;
                if (infected == true) {
                    System.out.println("I knew there was a reason I don't like math");
                    System.out.println("you contracted Covid-19, nice knowing you");
                }

                if (infected == false) {
                    System.out.println("Math kept you clear of Covid. thank you Calculus gods. ");
                }


            }
        }

        System.out.println(userRisk);
    }
}

