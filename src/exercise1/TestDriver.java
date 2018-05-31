package exercise1;

import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Questions q;
        Test test;
        int answer;
        boolean ansCorrect;

        System.out.println("Welcome to the to the java test.");
        System.out.print("Please enter your full name: ");
        test=new Test(scanner.nextLine());

        for (int i=0; i<5; i++){
            q=test.simulateQuestion();
            System.out.println("\n"+q.get_question());

            for (int j = 0; j < q.get_answers().length; j++) {
                System.out.println(j+") "+q.get_answers()[j]);
            }
            System.out.print("Enter and option from 0-3: ");
            answer=Integer.parseInt(scanner.nextLine());

            ansCorrect=test.checkAnswer(q,answer);
            System.out.println(test.simulateMessage(ansCorrect));
        }

        System.out.printf("%n%nThanks for taking the test %s%nYour score is %.0f/5 or %.0f%%",
                test.get_name(), test.get_numCorrectAns(), test.get_numCorrectAns()/5.0*100);

    }
}

