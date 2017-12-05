/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import BD.Conexao;
import Model.Professor;

/**
 *
 * @author Gustavo Girardon
 */
public class ProfessorDAO extends Conexao {

    public boolean salvarProfessor(Professor professor){
        boolean salvou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "INSERT INTO Professor (Nome, Email, Telefone, DataNascimento)"
                        + " VALUES ('"+professor.getNome()+"', "
                        + "'"+professor.getEmail()+"', "
                        + "'"+professor.getTelefone()+"', "
                        + "'"+professor.getDataNascimento()+"');";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                salvou = true;
            }
        } catch (SQLException ex){
            System.out.println(ex);
            System.out.println("Erro ao salvar o professor no BD.");
        } finally {
            fecharConexao(conn);
        }
        return salvou;
    }
    
    public boolean excluirProfessor(int codigo){
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String excluir = "DELETE FROM Professor WHERE  ProfessorID="+codigo;
                Statement stm = conn.createStatement();
                stm.execute(excluir);
                excluiu = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao excluir o professor no BD.");
        } finally {
            fecharConexao(conn);
        }
        return excluiu;
    }
    
    public boolean atualizarProfessor(Professor professor){
        boolean atualizou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "UPDATE Professor SET Nome = '"+professor.getNome()+"', "
                        + "Email = '"+professor.getEmail()+"', "
                        + "Telefone = '"+professor.getTelefone()+"', "
                        + "DataNascimento = '"+professor.getDataNascimento()+"' "
                        + "WHERE ProfessorID = '"+professor.getProfessorId()+"'";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                
                atualizou = true;
            }
        } catch (SQLException ex){
            System.out.println(ex);
            System.out.println("Erro ao atualizar a professor no BD.");
        } finally {
            fecharConexao(conn);
        }
        
        
        return atualizou;
    }
}
