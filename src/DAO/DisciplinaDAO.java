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
import Model.Disciplina;

/**
 *
 * @author Gustavo Girardon
 */
public class DisciplinaDAO extends Conexao {
    //private String semestre = "123";
    //private String turma = "321";
    public boolean salvarDisciplina(Disciplina disciplina){
        boolean salvou = false;
        Connection conn = null;
        
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "INSERT INTO Disciplina (Nome, NomeCurso, Semestre, Turma)"
                        + " VALUES('"+disciplina.getNome()+"', '"+disciplina.getCurso()+"', '"+disciplina.getSemestre()+"', '"+disciplina.getTurma()+"');";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                salvou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao salvar o disciplina no BD.");            
        } finally {
            fecharConexao(conn);            
        }
        return salvou;
    }    
    public boolean excluirDisciplina(int codigo){
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String excluir = "DELETE FROM Disciplina WHERE  DisciplinaID="+codigo;
                Statement stm = conn.createStatement();
                stm.execute(excluir);
                excluiu = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao excluir o disciplina no BD.");
        } finally {
            fecharConexao(conn);
        }
        return excluiu;
    }
    
    public boolean atualizarDisciplina(Disciplina disciplina){
        boolean atualizou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "UPDATE Disciplina SET Nome = '"+disciplina.getNome()+"', "
                        + "NomeCurso = '"+disciplina.getCurso()+"', "
                        + "Semestre = '"+disciplina.getSemestre()+"', "
                        + "Turma = '"+disciplina.getTurma()+"' "
                        + "WHERE DisciplinaID = '"+disciplina.getDisciplinaID()+"'";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                
                atualizou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao atualizar a disciplina no BD.");
        } finally {
            fecharConexao(conn);
        }
        
        
        return atualizou;
    }
}
