// https://youtu.be/TxjPniJxJmo


import java.util.Scanner;

public class ProjectEliza {

    public static void main(String[] args) {
    	
        Scanner scnr = new Scanner(System.in);
        
        PromptBank pb = new PromptBank();

        System.out.println("Hello, my name is Eliza. What is your name?");
        String name = scnr.nextLine();
        System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");

        while (true) {
        	
            String input = scnr.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
            	
                System.out.println("Do you want to run the session again?");
                String restart = scnr.nextLine();

                if (restart.equalsIgnoreCase("No")) {
                	
                    System.out.println("Goodbye, until next time");
                    break;
                    
                } 
                else if (restart.equalsIgnoreCase("Yes")) {
    
                    System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");
                } 
                else {
                    break;
                }
            } 
            else {
            	String[] s = input.split(" ");
            	
            	String fw = s[0];
            	String lw = s[s.length - 1];
            	
            	String output;
            	
            	
            	if (input.endsWith("?")) {
            		
            		output = pb.getRandomQuestionTrunk();
            		
            	} else if (input.endsWith("!")) {
            		
            		output = "WOW! Dramatic! " + pb.getRandomStatementTrunk();
            		
            	} 
            	else {
            		
            		output = pb.getRandomStatementTrunk();
            		
            	}
            	
            	output = output.replace("BLANK1", fw);
            	output = output.replace("BLANK2", lw);
            	
            	System.out.println(output);
            	
            	
            	
            }
        }

        
    }

 
    
}
