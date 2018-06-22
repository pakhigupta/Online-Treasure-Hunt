
package tables;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Answers implements Serializable{
    @Id
    private int questionNumber;
    String answer;

    public Answers() {
    }

    
    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    
}
