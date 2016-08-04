/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds4.crud.servlet.dao;

import ds4.crud.servlet.conn.ConnectionFactory;
import ds4.crud.servlet.model.GrupoVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vinicius Marcarini
 */
public class GrupoDAO {
    private final Connection conn;

    public GrupoDAO() {
        this.conn = ConnectionFactory.getConnection();
    }
    
    public void insert(GrupoVO grupo) throws SQLException{
        String sql= "INSERT INTO grupo (descricao)VALUES(?)";
        
        PreparedStatement smtp = this.conn.prepareStatement(sql);
        smtp.setString(1, grupo.getDescricao());
        smtp.execute();
        smtp.close();
    }
    
    public void update(GrupoVO grupo) throws SQLException{
        String sql= "UPDATE grupo SET descricao = ? WHERE id = ?";
        
        PreparedStatement smtp = this.conn.prepareStatement(sql);
        smtp.setString(1, grupo.getDescricao());
        smtp.setInt(2, grupo.getId());
        smtp.execute();
        smtp.close();
    }
    
    public void delete(GrupoVO grupo) throws SQLException{
        String sql = "DELETE FROM grupo WHERE id = ?";
        
        PreparedStatement smtp = this.conn.prepareStatement(sql);
        smtp.setInt(1, grupo.getId());
        smtp.execute();
        smtp.close();
    }
    
    public List<GrupoVO> list(){
    
    }
    
    
}
