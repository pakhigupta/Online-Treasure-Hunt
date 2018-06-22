
package tables;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Questions implements Serializable{
    @Id
    private int questionNumber;
    private String url;
    private String comment;
    private String image;
    
}
