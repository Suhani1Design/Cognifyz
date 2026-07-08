import java.util.Scanner;
public class TextBasedGame{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int score = 0;
        System.out.print(" ======= JAVA QUIZ ======\n");
        System.out.println("Q1. Which Language Is Platform Independent ?\n");
        System.out.println("A. C");
        System.out.println("B. Java");
        System.out.println("C. HTML");
        System.out.println("D. CSS");
        System.out.println("Enter your answer : ");
        char answer = sc.next().charAt(0);
        if(answer == 'B' || answer == 'b'){
            score++;
            System.out.println("Correct!\n");
        }
        else{
            System.out.println("Wrong!\n");
        }
        System.out.println("Q2. Which keyword is used to create a class in Java?");
        System.out.println("A. class");
        System.out.println("B. object");
        System.out.println("C. method");
        System.out.println("D. main");

        System.out.print("Enter your answer: ");
        char answer2 = sc.next().charAt(0);
        if(answer2 == 'A' || answer2 == 'a'){
             score++;
             System.out.println("Correct!");
           }
        else{
               System.out.println("Wrong!");
            }
            System.out.println("Q3. Which method is used to take integer input in Java?");
            System.out.println("A. nextLine()");
            System.out.println("B. next()");
            System.out.println("C. nextInt()");
            System.out.println("D. nextDouble()");
            System.out.print("Enter your answer: ");
            char answer3 = sc.next().charAt(0);

            if(answer3 == 'C' || answer3 == 'c'){
                      score++;
                      System.out.println("Correct!");
                } 
            else{
                     System.out.println("Wrong!");
                }
            System.out.println("Q4. Which symbol is used for single-line comments in Java?");
            System.out.println("A. /*");
            System.out.println("B. //");
            System.out.println("C. <!--");
            System.out.println("D. ##");
            System.out.print("Enter your answer: ");
            char answer4 = sc.next().charAt(0);
            if(answer4 == 'B' || answer4 == 'b'){
                     score++;
                     System.out.println("Correct!");
            }
            else{
                    System.out.println("Wrong!");
            }
        System.out.println("Q5. Which keyword is used to create an object in Java?");
        System.out.println("A. class");
        System.out.println("B. object");
        System.out.println("C. new");
        System.out.println("D. static");
        System.out.print("Enter your answer: ");
        char answer5 = sc.next().charAt(0);
        if(answer5 == 'C' || answer5 == 'c'){
                score++;
                System.out.println("Correct!");
        }
        else{
                System.out.println("Wrong!");
        }
            System.out.println("Final Score = " + score + "/5" );
            if(score == 5){
                System.out.println("Excellent!\n");
            }
            else if(score >=3){
                System.out.println("Good Job!\n");
            }
            else{
                System.out.println("Keep Practicing!\n");
            }
            sc.close();
    }
}

