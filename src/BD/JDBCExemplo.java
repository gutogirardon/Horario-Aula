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
public class JDBCExemplo {

    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/poo", "root", "");
        System.out.println("Conectado!");
        conexao.close();

    }
}
