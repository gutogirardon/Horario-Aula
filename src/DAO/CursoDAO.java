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
import Model.Curso;

/**
 *
 * @author Gustavo Girardon
 */
public class CursoDAO extends Conexao {

    public boolean salvarCurso(Curso curso){
        boolean salvou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "INSERT INTO curso (Nome, Periodo, Duracao)"
                        + " VALUES('"+curso.getNome()+"', "
                        + "'"+curso.getPeriodo()+"', "
                        + "'"+curso.getDuracao()+"');";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                salvou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao salvar o curso no BD.");
        } finally {
            fecharConexao(conn);
        }
        return salvou;
    }
    
    public boolean excluirCurso(int codigo){
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String excluir = "DELETE FROM curso WHERE CursoID = "+codigo;
                Statement stm = conn.createStatement();
                stm.execute(excluir);
                excluiu = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao excluir o curso no BD.");
        } finally {
            fecharConexao(conn);
        }
        return excluiu;
    }
    
    public boolean atualizarCurso(Curso curso){
        boolean atualizou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "UPDATE curso SET Nome = '"+curso.getNome()+"', "
                        + "Periodo = '"+curso.getPeriodo()+"', "
                        + "Duracao = '"+curso.getDuracao()+"' "
                        + "WHERE CursoID = '"+curso.getCursoID()+"'";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                
                atualizou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao atualizar a curso no BD.");
        } finally {
            fecharConexao(conn);
        }
        
        
        return atualizou;
    }
}
