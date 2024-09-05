<<<<<<< HEAD
package LearningJava1.OwnPractice.arbitrary;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args){
        Scanner input;
        String c;
        String question;
        String feedback;

        input = new Scanner(System.in);
        System.out.println("Magic 8Ball \n");
        
        
        System.out.println("Will you decide the 8Ball to determine your fortune (yes, no)? ");
        c = input.nextLine();
        System.out.println();

        if (!c.equalsIgnoreCase("yes")){
            System.out.println("Goodbye");
            return;
        }
        System.out.println("What will you ask the Magic 8Ball? \n");
        question = input.nextLine();

        if (!ValidQuestion(question)){
            System.out.println("Try again in a moment. ");
            return;
        }

        feedback = randomanswer();

        System.out.printf( "Question: %s\n", question);
        System.out.printf( "Answer:  %s\n", feedback);

    }

    public static boolean ValidQuestion(String question){
        boolean valid;
        if (question.length() > 100){
            System.out.println("I cannot understand your question, be more concise. ");
            valid = false;
        }else{
            valid = true;
        }
        return valid; 
    }
    
    public static String randomanswer(){
        String randanswer;
        int ansindex;

        ansindex = (int) (Math.random() * 20 + 1); 

        switch(ansindex){
            case 1:
                randanswer = " It is certain";
                break;
            case 2:
                randanswer= " As I see it, yes.";
                break;
            case 3: 
                randanswer = " It is decidely so. ";
                break;
            case 4:
                randanswer = " Most likely. ";
                break;
            case 5:
                randanswer = " Without a doubt";
                break;
            case 6:
                randanswer = " Outlook Good.";
                break;
            case 7:
                randanswer = " Yes definitely. ";
                break;
            case 8:
                randanswer = " Yes.";
                break;
            case 9:
                randanswer = " Signs point to yes. ";
                break;
            case 10:
                randanswer = " You may rely on it. ";
                break;
            case 11:
                randanswer = " Reply hazy, try again. ";
                break;
            case 12:
                randanswer = " Ask again later. ";
                break;
            case 13:
                randanswer = " Better not tell you now. ";
                break;
            case 14:
                randanswer = " Cannot predict now. ";
                break;
            case 15:
                randanswer = " Concentrate and ask again. ";
                break;
            case 16:
                randanswer = " Don't count on it. ";
                break;
            case 17:
                randanswer = " My reply is no. ";
                break;
            case 18:
                randanswer = " My sources is no. ";
                break;
            case 19:
                randanswer = " Outlook not so good. ";
                break;
            case 20:
                randanswer = " Very doubtful. ";
                break;
            default:
                randanswer = " what?"; 
                break;
        }
        return randanswer;
    }
}
=======
package arbitrary;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args){
        Scanner input;
        String c;
        String question;
        String feedback;

        input = new Scanner(System.in);
        System.out.println("Magic 8Ball \n");
        
        
        System.out.println("Will you decide the 8Ball to determine your fortune (yes, no)? ");
        c = input.nextLine();
        System.out.println();

        if (!c.equalsIgnoreCase("yes")){
            System.out.println("Goodbye");
            return;
        }
        System.out.println("What will you ask the Magic 8Ball? \n");
        question = input.nextLine();

        if (!ValidQuestion(question)){
            System.out.println("Try again in a moment. ");
            return;
        }

        feedback = randomanswer();

        System.out.printf( "Question: %s\n", question);
        System.out.printf( "Answer:  %s\n", feedback);

    }

    public static boolean ValidQuestion(String question){
        boolean valid;
        if (question.length() > 100){
            System.out.println("I cannot understand your question, be more concise. ");
            valid = false;
        }else{
            valid = true;
        }
        return valid; 
    }
    
    public static String randomanswer(){
        String randanswer;
        int ansindex;

        ansindex = (int) (Math.random() * 20 + 1); 

        switch(ansindex){
            case 1:
                randanswer = " It is certain";
                break;
            case 2:
                randanswer= " As I see it, yes.";
                break;
            case 3: 
                randanswer = " It is decidely so. ";
                break;
            case 4:
                randanswer = " Most likely. ";
                break;
            case 5:
                randanswer = " Without a doubt";
                break;
            case 6:
                randanswer = " Outlook Good.";
                break;
            case 7:
                randanswer = " Yes definitely. ";
                break;
            case 8:
                randanswer = " Yes.";
                break;
            case 9:
                randanswer = " Signs point to yes. ";
                break;
            case 10:
                randanswer = " You may rely on it. ";
                break;
            case 11:
                randanswer = " Reply hazy, try again. ";
                break;
            case 12:
                randanswer = " Ask again later. ";
                break;
            case 13:
                randanswer = " Better not tell you now. ";
                break;
            case 14:
                randanswer = " Cannot predict now. ";
                break;
            case 15:
                randanswer = " Concentrate and ask again. ";
                break;
            case 16:
                randanswer = " Don't count on it. ";
                break;
            case 17:
                randanswer = " My reply is no. ";
                break;
            case 18:
                randanswer = " My sources is no. ";
                break;
            case 19:
                randanswer = " Outlook not so good. ";
                break;
            case 20:
                randanswer = " Very doubtful. ";
                break;
            default:
                randanswer = " what?"; 
                break;
        }
        return randanswer;
    }
}
>>>>>>> d6f526c51a0267859233adc45da94e8a1c176324
