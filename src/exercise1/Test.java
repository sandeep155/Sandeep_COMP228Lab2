package exercise1;

import java.security.SecureRandom;
import java.util.ArrayList;

class Questions{
    private String _question;
    private String[] _answers;
    private int _correctAnswer;

    // question constructor
    Questions(String question, String[] answers, int correctAnswer){
        this._question=question;
        this._answers=answers;
        this._correctAnswer=correctAnswer;
    }

    // getter for set question
    public String get_question(){return this._question;}

    // getter for answers
    public String[] get_answers(){return this._answers;}

    // getter for correct answers
    public int get_correctAnswer(){return this._correctAnswer;}
}



/*
	The test class handles the returning of questions, and messages checking
	answers and answers
 */
public class Test {
    private ArrayList<Questions> _testQuestions;
    private SecureRandom _sRandom;
    private String _name;
    private int _numCorrectAns;

    Test(String name){
        this._testQuestions=new ArrayList<Questions>();
        this._sRandom=new SecureRandom();
        this._name=name;
        this._numCorrectAns=0;

        this._testQuestions.add(new Questions("Class declaration uses what keyword?",
                new String[]{"program","class", "java", "int"},1 ));
        this._testQuestions.add(new Questions("When using the Scanner class what does System.in mean?",
                new String[]{"Gets mouse input",
                        "Gets trackpad input",
                        "Gets USB files",
                        "Gets Keyboard input"},3));
        this._testQuestions.add(new Questions("The Default Initial Value for String Variables?",
                new String[]{"nil", "NaN","null", "0"},2));
        this._testQuestions.add(new Questions("The correct way to format a float with two digits of precision?",
                new String[]{"%f.2","%.f2", "f2%","%.2f "},3));
        this._testQuestions.add(new Questions("The correct way to use java's secure random is?",
                new String[]{"import java.security.SecureRandom;",
                        "import java.util.Random;",
                        "import java.security.Random",
                        "import jabba.the.Hut;"},0));
    }

    // returns the number of correct question
    public double get_numCorrectAns(){return this._numCorrectAns;}
    public String get_name(){return this._name;}
    /*
        simulateQuestion
        return a question
     */
    public Questions simulateQuestion(){
        return this._testQuestions.remove(0);
    }


    public boolean checkAnswer(Questions q, int ans){
        if (q.get_correctAnswer()==ans){
            this._numCorrectAns+=1;
            return true;
        }
        else {
            return false;
        }
    }

    public String simulateMessage(boolean goodMessage){
        int randNum=this._sRandom.nextInt(4);
        if (goodMessage){
            switch (randNum){
                case 0:
                    return "Excellent!";
                case 1:
                    return "Good!";
                case 2:
                    return "Keep up the good work!";
                case 3:
                    return "Nice work!";
                default:
                    return "err";
            }
        }
        else {
            switch (randNum){
                case 0:
                    return "No. Please try again";
                case 1:
                    return "Wrong. Try once more";
                case 2:
                    return "Don't give up!";
                case 3:
                    return "No. Keep trying...";
                default:
                    return "err";
            }
        }
    }
}
