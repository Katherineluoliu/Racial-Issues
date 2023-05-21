/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalmajorassignment;

//Import the scanner for the user to input and give values
import java.util.Scanner; 


/**
 *The Clothing class is a has-a relationship with the Person class
 * It is used to assign clothing to a person
 * 
 * @author Katherine Luo Liu
 * @version 1.0
 * @since 2022-1-21
 */
public class Clothing {//Start of clothing class
    
    //Make variables for the user to be able to input values
    //Make them public so that the Person class can also use them
    public static String tops;
    public static String pants;
    public static String headcovering;
    
    //Make a global scanner for all methods to use
    //This way, we don't have to keep declaring the variable in every method
    public static Scanner in = new Scanner (System.in);
    
    /**
     * This is a constructor with no parameters called Chinese. 
     * It is used to play give information or recent news about racism towards the Chinese
     */
    public Clothing(){
        //Ask them about their clothing
        System.out.println("Please answer the following questions. If it doesn't apply, please enter n/a. ");
        
        //Question 1:
        System.out.println("What type of tops are you wearing? For example, shirt, blouson top... ");
        tops = in.nextLine();//Get the clothing they're wearing
        
        //Question 2:
        System.out.println("What type of pants are you wearing? For example, jeans, shorts... ");
        pants = in.nextLine();//Get the clothing they're wearing
        
        //Question 3:
        System.out.println("Do you have any head covering? For example, head scarfs, Hijab...");
        headcovering = in.nextLine();//Get the color of the skin
        
    }
    
    /***************************************************************************
     * Mutator
     **************************************************************************/
    //three pics, in tang dynasty... people had ..... 
    //NOW many wear jeans... blous...
    
    /**
     * This mutator is called setTops and it allows the programmer to change the value of tops
     * @param tops This is the type of top a person is wearing
     */
    public void setTops(String tops){
        Clothing.tops = tops;
    }//end of setTops method
    
    /**
     * This mutator is called setPants and it allows the programmer to change the value of pants
     * @param pants This is the type of pants a person is wearing
     */
    public void setPants(String pants){
        Clothing.pants = pants;
    }//end of sePants method
    
    /**
     * This mutator is called setHeadCovering and it allows the programmer to change the value of HeadCovering
     * @param hc This is the type of head covering a person is wearing
     */
    public void setHeadCovering(String hc){
        Clothing.headcovering = hc;
    }//end of setHeadCovering method
    
    
    /***************************************************************************
     * Accessors
     **************************************************************************/
    /**
     * This accessor method is called getTop and will return the value of the user's top clothing
     * @return Returns the values of tops
     */
    public String getTops(){//Start of getTops 
        return tops; //Return the value of tops
    }//End of getTops
    
    /**
     * This accessor method is called getPants and will return the value of the user's pants
     * @return Returns the values of pants
     */
    public String getPants(){//start of getPants
        return pants;//Return the value of pants
    }//End of getPants
    
    /**
     * This accessor method is called getHeadCovering and will return the value of the user's head covering
     * @return Returns the values of headcovering
     */
    public String getHeadCovering(){//Start of getHeadCovering
        return headcovering; //return the value of headcovering
    }//End of getHeadCovering
    
    //Override so that the program will not crash due to another toString method in Chinese class
    @Override
    
    /**
     * This method is called the toString method. 
     * @return The return type is string. It is used to return a message of the variety of pieces of clothing as a metaphor for racism issues
     */
    public String toString(){//Start of toString method
        //Modify the message
        String message = "      Through your clothing, we can see a lot of variety. Take a look at your environment, everyone wears different types of\n"
                + "clothing. If different clothing can be accepted, and can be worn on different people, so can races. People of different race should be\n"
                + "accepted just like how everyone accepts diffent types of clothing. It's just the appearance that makes a difference. So when people\n"
                + "argue over racial issues, give them an easy example. Ask them to put themselves in the other person's shoes. Be brave, stand up for \n"
                + "the problem. Tell them the victim that it's okay to be different. Tell the attackers that they should accept peoples' differences\n"
                + "just like how they would accept their own pieces of different clothing.\n";
        
        //more aware of your thoughts. 
        return message;  //displays the final output with the name and the age in a sentence
    }//End of toString method
    
}//End of the Clothing class
