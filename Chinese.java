/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmajorassignment;

//Import the scanner for the user to input and give values
import java.io.IOException;


/**
 *The Chinese class is a child class of Person class
 * It is used to compare the user's idea of the look of a Chinese person
 * 
 * @author Katherine Luo Liu
 * @version 1.0
 * @since 2022-1-20
 */
public final class Chinese extends Person {//Start of Chinses class
    
    /**
     * This is a constructor with three parameters called Chinese. 
     * It is used to play give information or recent news about racism towards the Chinese
     * @param eyes This is the first parameter which stores the color of the eyes
     * @param hair This is the second parameter which stores the color of the hair
     * @param skin This is the third parameter which stores the color of the skin
     * @throws IOException
     * @throws InterruptedException 
     */
    public Chinese (String eyes, String hair, String skin)throws IOException, InterruptedException{
        //Outputs the news/information of Chinese racism
        news();
        //Give values to eyes, hair and skin so that the program can run properly
        Chinese.eyes = eyes;
        Chinese.hair = hair;
        Chinese.skin = skin;
    }
    
     /**
     * This is a constructor with no parameters called Chinese. 
     * It is used to play give information or recent news about racism towards the Chinese
     * @throws IOException
     * @throws InterruptedException 
     */
    public Chinese()throws IOException, InterruptedException{
        //Outputs the news/information of Chinese racism
        news();
        //Play a game with them
        System.out.println("*****************");
        System.out.println("*   The  game   *");
        System.out.println("*****************");
        System.out.println("In this game, you will be describing the looks/appearance of a Chinese person. Please answer the following questions with ONLY\n"
                    + "ONE word.\n");
        
        //Question 1:
        System.out.println("What colour of eyes do the Chinese have?");
        eyes = in.nextLine();//Get the color of the eyes
        eyes = check(eyes).toLowerCase();//Check if the colour of eyes is only one word, if not, store the new value in eyes
        
        //Question 2:
        System.out.println("What colour of hair do the Chinese have?");
        hair = in.nextLine();//Get the color of the hair
        hair = check(hair).toLowerCase();//Check if the colour of hair is only one word, if not, store the new value in hair
        
        //Question 3:
        System.out.println("What colour of skin do the Chinese have?");
        skin = in.nextLine();//Get the color of the skin
        skin = check(skin).toLowerCase();//Check if the colour of skin is only one word, if not, store the new value in skin
    }
    
    /**
     * This is a method called news
     * It stores all the important messages on news and information about racism towards the Chinese
     * @throws IOException
     * @throws InterruptedException 
     */
    public void news()throws IOException, InterruptedException{
        /***************
        *    Title     *
        ****************/
        //Outputs the title
        System.out.println("\n\n====================================================================================================================================================================  ");
        System.out.println("==============================================   R a c i a l   i s s u e s   t o w a r d s   t h e   C h i n e s e   ===============================================  ");
        System.out.println("====================================================================================================================================================================  ");
        System.out.println();
        
        /****************
        *  The problem  *
        *****************/
        //Outputs the information 
        //Introduction of the racism issue towards the Chinese
        System.out.println("        Through out 2019 to 2022, the COVID-19 Pandemic has been and still is a huge issue aound the world. Many people with a \n"
                + "Chinese background has been targeted and hurt because the massive Covid outbreak was first discovered in Wuhan, China. There\n"
                + "were many negative emotions thrown at the Chinese because many individuales believed that it was the fault of the Chinese nation\n"
                + "who made such massive outbreak. At the blink of an eye, the Chinese nation has been targeted globally by other races, and\n"
                + "governments from different countries.\n");
        //Alllow the user to control the time to read, so when he/she presses enter, it will move forward
        enter();
        //Delay for 300 seconds for the user to get a feel of the pause
        delay(300);
        
        //Statistics and examples of the racism issues during the pandemic
        System.out.println("        Xenophobia towards the Chinese has been a great issue during the pandemic. According to Angus Reid Institute, half of \n"
                + "the 500 interviewed Chinese Canadians admit that they have been called names, blamed, insulted and/or bullied because of the racial\n"
                + "issues. Even worse, some of them experienced assults, grafitti, and verbal threats. 30% of Canadians had to change their daily\n"
                + "routine to make sure of their own safety. 31% has experienced discriminaton at least once. This is not okay, in front of viruses,\n"
                + "we should not be blaming others, but instead, work together to figure out a solution as fast as possible. We should do our work\n"
                + "as good citizens, wear out masks, wash our hands, keep social distance, etc. We shouldn't go out there, arguing about the problem.\n");
        //Only continue when the user presses enter, so that the user gets enough time to read
        enter();
        //Delay for 300 seconds for the user to get a feel of the pause
        delay(300);
        
        //Other ways of Chinese racism
        System.out.println("        Recently, the company called \"Three Squirrels\" were targetted by China and other Chinese people. The problem was caused\n"
                + "due to one of their advertisment posters. It had a Chinese person sitting unsightly on a sofa with heavy make-up emphasizing the\n"
                + "small eyes. Many Chinese commented that it was okay to have Asian eyes, but it was not okay to advertise and symbolize Asians in\n"
                + "that way because the majority of Asians have noraml sized eyes. A few days later, the model on the poster was also caught doing\n"
                + "dispising actions like lifting up the end of the eyes. In 1980s, Prince Phillip ridiculed a Chinese student for having small eyes\n"
                + "and he was critizied in the UK. In 2008, the Spanish basketball team in Beijing Olympics has collectivly squited their eyes for a\n"
                + "group photo which caused a racist controversy. The action of lifting the eyes were also done by other racist players and this was\n"
                + "seen racist action towards the Chinses.\n");
        //Only continue when the user presses enter, so that the user gets enough time to read
        enter();
        //Delay for 300 seconds so the user to get a feel of the pause
        delay(300);
        
        System.out.println("\n*****************");
        System.out.println("*  The problem  *");
        System.out.println("*****************");
        //Outputs the information 
        //Introduction of the racism issue
        System.out.println("        People in general, should understand the restrictions and actions are seen as being racist. People should be more aware of\n"
                + "racist issues to avoid getting into trouble. Sometimes, we might also unconciously be sterotypical, so let's play a for ourselfs\n"
                + "to recognize the problem.\n");
        //Only continue when the user presses enter, so that the user gets enough time to read
        enter();
        //Delay for 300 seconds for the user to get a feel of the pause
        delay(300);
    }
    
    //Override so that the Person class does not crash with the Chinese Class
    @Override
    
    /**
     * This method is called the toString method. 
     * @return It is used to return a message of the Chinese class
     */
    public String toString(){
        //Modify the message
        System.out.println("\n*****************");
        System.out.println("*  Conclusion   *");
        System.out.println("*****************");
        String message = "      A Chinese person has "+eyes+" eyes, "+hair+" hair, and "+skin+" colour skin. \n"
                + "Although that might be very true, we still shoudn't assume because not all Chinese people look like that. The purpose of the game\n"
                + "is the help you realize that everyone has an overall idea or sterotypical thought of different race's looks. For example, when we\n"
                + "talk about Indigeous peoples, some of us will relate to them with big feathers on the head. The idea of looks will change when we\n"
                + "get more in touch with a certain person of a certain race, so the thought iself is normal, and absolutly acceptable. However,\n"
                + "what's not acceptable is the fact that people are made fun of because of a certain characteristic. So I would like to encourage\n"
                + "you, please think before you talk. Please stand up to racism and show that it is not okay. Even small things like showing dislike\n"
                + "towards racism can make a difference.\n";
        //more aware of your thoughts. 
        return message;  //displays the final output with the name and the age in a sentence
    }
  
}//End of Chinese class

