import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
class Aaryash{
    public static void main(String []args){
        ResultSet s = null;
        Connection c = null;
        PreparedStatement p = null;
        try{
        }
        catch(Exception e){
        }
        finally{
            try{
                s.close();
            }
            catch(SQLException e){
                System.out.println("Exception 1 "+e);
            }
            try{
                c.close();
            }
            catch(SQLException e){
                System.out.println("Exception 2 "+e);
            }
            try{
                p.close();
            }
            catch(SQLException e){
                System.out.println("Exception 3 "+e);
            }
        }
    }

}