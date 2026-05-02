import java.util.*;
import javax.swing.JOptionPane;

//Main Function
public class Encoded {

    public static void main(String[] args) {

        //Variable declaration
        String inputText;
        int charCount;
        String resultText;
        String groupID = "G02/SE";

        //User input String
        inputText = JOptionPane.showInputDialog("Enter your full name in lowercase:");

        if (checkStringValidity(inputText)){
            charCount = countCharacters(inputText);
            JOptionPane.showMessageDialog(null, "Total number of characters are " + charCount);
        }
        else 
            JOptionPane.showMessageDialog(null, "Your input is not a String in lowercase!");
    }


//Subclass: To validate String Characters - Only accepts lowercase letters and whitespace
public static boolean checkStringValidity(String inputText){
    String input = inputText.replaceAll(" ", ""); //To remove whitespace from the String

    //To loop through each character in the String
    for (char str : input.toCharArray()){
        //Condition: Check if characters are lower than 'a' and larger than 'z'
        if (str < 'a' || str > 'z'){
            return false;
        }
        //Otherwise, it is lowercase letters!
        else
            continue;
    }
    return true;
}

// Subclass: Count Characters
public static int countCharacters(String inputText){
    //Count characters in String excluding the whitespace
    int count = inputText.replace(" ", "").length();
    return count;
}

}
