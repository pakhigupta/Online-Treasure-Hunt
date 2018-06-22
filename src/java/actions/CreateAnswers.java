
package actions;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.Answers;

public class CreateAnswers {
    public static void main(String[] args) {
        /*Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Answers.class);
        cfg.configure();
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true,true);
        System.out.println("Table created!");
        
        String ans0="sherlock";
        String insert0 ="insert into Answers values(0,'"+ans0+"')";
        jdbc.DAOLayer.updateData(insert0);
        String ans1="10:10";
        String insert1 ="insert into Answers values(1,'"+ans1+"')";
        jdbc.DAOLayer.updateData(insert1);
        String ans2="rahat";
        String insert2 ="insert into Answers values(2,'"+ans2+"')";
        jdbc.DAOLayer.updateData(insert2);
        String ans3="java";
        String insert3 ="insert into Answers values(3,'"+ans3+"')";
        jdbc.DAOLayer.updateData(insert3);*/
        String ans4="harsha suryanarayana";
        String insert4 ="insert into Answers values(4,'"+ans4+"')";
        jdbc.DAOLayer.updateData(insert4);
    }
}
