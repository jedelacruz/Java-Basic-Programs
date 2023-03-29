import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        /*
        
        Write a program that reads in 5 test scores and outputs the average score and corresponding letter grade based on the following scale:

        90-100: A
        80-89: B
        70-79: C
        60-69: D
        Below 60: F
        
        */
      
        Scanner sc = new Scanner(System.in);

        int score1,score2,score3,score4,score5;
        double ave;

        System.out.print("Enter score 1: ");
        score1 = sc.nextInt();

        System.out.print("Enter score 2: ");
        score2 = sc.nextInt();

        System.out.print("Enter score 3: ");
        score3 = sc.nextInt();

        System.out.print("Enter score 4: ");
        score4 = sc.nextInt();

        System.out.print("Enter score 5: ");
        score5 = sc.nextInt();

        ave = (score1 + score2 + score3 + score4 + score5) / 5.0;

        System.out.printf("Average score: %.2f\n", ave);

        if(ave >= 90 && ave <= 100){
            System.out.print("Letter grade: A");
        }
        else if(ave >= 80 && ave <= 89){
            System.out.print("Letter grade: B");
        }
        else if(ave >= 70 && ave <= 79){
            System.out.print("Letter grade: C");
        }
        else if(ave >= 60 && ave <= 69){
            System.out.print("Letter grade: D");
        }
        else if(ave < 60){
            System.out.print("Letter grade: F");
        }
        
        
        
    }
}
