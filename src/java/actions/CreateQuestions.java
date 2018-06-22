
package actions;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.Questions;

/**
 *
 * @author pakhi
 */
public class CreateQuestions {
    public static void main(String[] args) {
        /*Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Questions.class);
        cfg.configure();
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true,true);
        System.out.println("Table created!");*/
        
        String url1="What is the time?";
        String comment1="Focus on Image Name";
        String image1="level1 New Clock.jpeg";
        String query1="insert into Questions(questionNumber,url,comment,image) values(1,'"+url1+"','"+comment1+"','"+image1+"')";
       jdbc.DAOLayer.updateData(query1);
    }
}
