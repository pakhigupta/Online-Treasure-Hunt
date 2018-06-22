
package actions;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.Leaderboard;

public class CreateLeaderboard {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Leaderboard.class);
        cfg.configure();
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true,true);
        System.out.println("Table created!");
    }
}
