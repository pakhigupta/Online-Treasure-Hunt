
package actions;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import tables.QuestionUrl;

/**
 *
 * @author pakhi
 */
public class CreateQuestionUrl {
    public static void main(String[] args) {
        /*Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(QuestionUrl.class);
        cfg.configure();
        
        SchemaExport se = new SchemaExport(cfg);
        se.create(true,true);
        System.out.println("Table created!");*/
        
        String url0="Ques0.jsp";
        String query0="insert into QuestionUrl values(0,'"+url0+"')";
        jdbc.DAOLayer.updateData(query0);

        String url1="Ques1.jsp?What_is_the_time?";
        String query1="insert into QuestionUrl values(1,'"+url1+"')";
        jdbc.DAOLayer.updateData(query1);

        String url2="Ques2.jsp";
        String query2="insert into QuestionUrl values(2,'"+url2+"')";
        jdbc.DAOLayer.updateData(query2);

        String url3="Ques3.jsp?Pepper";
        String query3="insert into QuestionUrl values(3,'"+url3+"')";
        jdbc.DAOLayer.updateData(query3);

        String url4="Ques4.jsp";
        String query4="insert into QuestionUrl values(4,'"+url4+"')";
        jdbc.DAOLayer.updateData(query4);
    }
}
