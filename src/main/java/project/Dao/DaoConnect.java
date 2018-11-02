package project.Dao;

import project.Model.ModelConnection;

import java.sql.*;

public class DaoConnect {

    public ModelConnection getModelConnection(int id){
        ModelConnection mod = new ModelConnection();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from users where id=" + id);

            if(rs.next()){
                mod.setId(rs.getInt(1));
                mod.setName(rs.getString(2));
                mod.setPassword(rs.getString(3));
            }
        }catch (Exception e){
            System.out.println("нет соединения");
        }





        return mod;
    }

}
