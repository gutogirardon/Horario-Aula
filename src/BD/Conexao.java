/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Girardon
 */
public class Conexao {
    
    public Connection abrirConexao(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/poo", "root", "");
            System.out.println("Conexão criada com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o bd");
        } catch (ClassNotFoundException ex){
            System.out.println("Erro ao criar o driver do BD");
        }
        return conn;
    }
        
    public void fecharConexao( Connection conn ){
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar a conexão com o BD");
        }
    }
    
}
