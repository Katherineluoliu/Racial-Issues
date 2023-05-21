
package finalmajorassignment;

//Import the scanner for the user to input and give values
import java.io.IOException;
import java.util.Scanner; 

/**
* Person class is used to address the problems of racism in the world.
*
* @author  Katherine Luo Liu
* @version 1.0
* @since   2022-01-17
*/
public class Person {//Start of Person class
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Declaration of variables
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Make a global scanner for all methods to use
    //This way, we don't have to keep declaring the variable in every method
    public static Scanner in = new Scanner (System.in);
    
    //Make variables that are required in answering questions
    //Make static variables so the values can be received by the user
    //Make public so the child class can also access the value
    public static String eyes;
    public static String hair;
    public static String skin;
    
    /**
     * This is the main method. It is used to output all the other classes
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException{//Start of main method
        /***************
        *    Title     *
        ****************/
        //Outputs the title
        System.out.println("=====================================================================================================================================================================  ");
        System.out.println("===========================================================   R  a  c  i  a  l        i  s  s  u  e  s   ============================================================  ");
        System.out.println("=====================================================================================================================================================================  ");
        System.out.println();
        
        /****************
        *  Introduction  *
        *****************/
        //Outputs the information 
        //Introduction of the racism issue
        System.out.println("        Racism is an important issue which needs to be addressed regulary, whether it's for reminder purposes, or in a call to\n"
                + "action. Racism is discrimination against an individual or a group of person due to their racial backgrounds. Many of those who\n"
                + "experienced racism also felt hate, lonely, helpless and all other negative emotions. Racism is bullying, and it is also harrasment.\n"
                + "This negative action cause people to not want to go out because they are in a constant fear of being hurt. It tortures the person\n"
                + "mentally and physically with on going feelings like anger and depression. Racism creates a society where people don't trust in each\n"
                + "other.\n ");
        //Alllow the user to control the time to read, so when he/she presses enter, it will move forward
        enter();
        //Delay for 300 seconds for the user to get a feel of the pause
        delay(300);
        
        //Actions to deal with racism
        System.out.println("        People often don't stand up for each other because the witnesses are also afraid that they will get targetted. This feeling"
                + "of not wanting to help is understandable. However, there must be actions. You don't have to stop and fight against criminals.\n"
                + "According to VicHealth, you can call \"000\" for help. Not only that, you can also give a helping hand by reporting the incident\n"
                + "to The Victorian Equal Opportunity and Human Rights Commission. Some other helpful acts may be recording the situatoin, supporting\n"
                + "others who step up, and always be mindful of your own actions and causes.\n");
        //Only continue when the user presses enter, so that the user gets enough time to read
        enter();
        //Delay for 300 seconds for the user to get a feel of the pause
        delay(300);
        
        //Play a easy game
        System.out.println("Please answer the following questions.");
        
        //Question 1:
        System.out.println("What colour of eyes do you have?");
        eyes = in.nextLine();//Get the color of the eyes
        eyes = check(eyes).toLowerCase();//Check if the colour of eyes is only one word, if not, store the new value in eyes
        
        //Question 2:
        System.out.println("What colour of hair do you have?");
        hair = in.nextLine();//Get the color of the hair
        hair = check(hair).toLowerCase();//Check if the colour of hair is only one word, if not, store the new value in hair
        
        //Question 3:
        System.out.println("What colour of skin do you have?");
        skin = in.nextLine();//Get the color of the skin
        skin = check(skin).toLowerCase();//Check if the colour of skin is only one word, if not, store the new value in skin
        
        //Question 3:
        System.out.println("Have you experienced racism? Please answer with Yes or No and the explanation. For example, Yes, because...");
        String feeling = in.nextLine();//Get the reply from the user
        
        //Make the user's answer become lower case
        feeling = feeling.toLowerCase();
        
        //Respond to the user's answer/explanation
        //If they have experienced racism, comfort them
        if(feeling.contains("yes")){
            System.out.println("I'm sorry about your encounter. I hope that it never happens again, and I hope you are alright.\n");
        }
        //If they have't experienced, comment about their life
        else if(feeling.contains("no")){
            System.out.println("You are very fortunate. I hope that it will never happen in the future either.\n");
        }
        //If they entered without saying yes or no, then no comment
        else{}
        
        /*****************
        * Clothing class *
        *****************/
        //Let the user play the clothing class
        Clothing cl = new Clothing();
        //Print out the final message in Clothing class which is the toString method
        System.out.println(cl);
        
        /****************
        * Chinese class *
        *****************/
        //Ask if the user wants to play a game? 
        System.out.println("Do you want to play another answering game? Please enter yes or no only.");
        String answer = in.nextLine();
        
        //If the user wants to play the game, use the second constructor in the Chinese class
        if (answer.equalsIgnoreCase("Yes")){
            //Let the user play the Chinese class with no parameters
            Chinese ch = new Chinese ();
            //Print out the final message in Chinese class which is the toString method
            System.out.println(ch);
        }
        //Otherwise, use the first constructor with three parameters
        else {
            //Let the user play the Chinese class
            Chinese ch2 = new Chinese ("black","black","yellow");
            //Print out the final message in Chinese class which is the toString method
            System.out.println(ch2);
        }
        
        
    }//End of method
    
  
    /**This method is called check and it is used to check the input from the user
     * If the user enters more than one word, then it will loop for the user to 
     * enter the values again.
     *
     * @param word this is the input from the user
     * @return This would return the final correct ONE WORD value from the user
     */
    public static String check(String word){//start of check
        //If the word has a space, then it's more than one word
        //Use a while loop to check until the the input only has one word
        while(word.contains(" ")){//Start of while loop
            System.out.println("Invalid answer. Please enter again. Reminder: Only one word is accepted.");
            word = in.nextLine();//Get the new word and store it
        }//End of while loop
        return word;//Give the new answer back
        
    }//End of enter
    
    /**This method is called enter, it makes sure that the user gets enough time to 
     *read so they can press enter to continue. 
     */
    public static void enter(){//start of enter
        //Tell the user to press enter to continue.
        System.out.println("Please press enter to continue---------------------");
        //When the user presses enter, it might be stored into a variable
        //So we need to use in.nextLine to get rid of the enter
        in.nextLine();
    }//End of enter
    
    /**This method is called clear and it is used to clear the screen to make 
     *outputs look neater.
     * @throws java.io.IOException
     */
    public static void clear () throws IOException{//Start of clear
        //The clear consol in Java uses the escape code of \033[H\033[2J
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        Runtime.getRuntime().exec("cls");
        //The commands on the top doesn't work so insert blanks instead
        
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //The "\n"s make the page look very messy so I didn't include it

    }//End of clear

    /**This method is called delay and it is used to delay the speed of the 
     * output screen to allow the user to take some time to read the informations.
     * @param sec is the number of seconds that should be delayed
     * @throws java.lang.InterruptedException
     */
    public static void delay(int sec)throws InterruptedException{//Start of delay
        //The Thread.sleep is used to pause for the number of required seconds
        Thread.sleep(sec);
    }//End of delay
    
}//End of Person Class
