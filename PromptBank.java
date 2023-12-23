import java.util.Random;

public class PromptBank {

    String[] questions;
    String[] statements;

    Random r = new Random();

    public PromptBank() {
        questions = new String[5];
        statements = new String[5];
        getRandomStatementTrunk();
        getRandomQuestionTrunk();
        
    }

    public void populateStatementsArray() {
        statements[0] = "Tell me more about BLANK1 and BLANK2";
        statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
        statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
        statements[3] = "BLANK1 and BLANK2 seem to be on one's mind. Let's not talk about it lol kidding.";
        statements[4] = "ok im not kidding BLANK1 and BLANK2 needs to be on your mind. Let's talk.";
    }

    public void populateQuestionsArray() {
        questions[0] = "Is there anything else about BLANK1 and BLANK2?";
        questions[1] = "Does BLANK1 bother you? How about BLANK2?";
        questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
        questions[3] = "Does BLANK1 is something relates to you? How about BLANK2?";
        questions[4] = "no no im not kidding, does BLANK1 bother you? as well as BLANK2?";
    }

    public String getRandomStatementTrunk() {
        int i = r.nextInt(statements.length);
        return statements[i];
    }

    public String getRandomQuestionTrunk() {
        int i = r.nextInt(questions.length);
        return questions[i];
    }
    
    
}
