package tables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leaderboard {
    @Id
    private int userid;
    private String username;
    private int level;

    public Leaderboard() {
    }

    
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
