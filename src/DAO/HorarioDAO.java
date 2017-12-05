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
import Model.Horario;

/**
 *
 * @author Gustavo Girardon
 */
public class HorarioDAO extends Conexao {

    public boolean salvarHorario(Horario horario){
        boolean salvou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "INSERT INTO Horario (NomeProfessor, NomeDisciplina, DiaSemana, Aula, Periodo )"
                        + " VALUES('"+horario.getProfessor()+"', "
                        + "'"+horario.getDisciplina()+"', "
                        + "'"+horario.getDiaSemana()+"', "
                        + "'"+horario.getHorario()+"', "
                        + "'"+horario.getPeriodo()+"');";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                salvou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao salvar o horario no BD.");
        } finally {
            fecharConexao(conn);
        }
        return salvou;
    }
    
    public boolean excluirHorario(int codigo){
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String excluir = "DELETE FROM Horario WHERE  HorarioID="+codigo;
                Statement stm = conn.createStatement();
                stm.execute(excluir);
                excluiu = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao excluir o horario no BD.");
        } finally {
            fecharConexao(conn);
        }
        return excluiu;
    }
    
    public boolean atualizarHorario(Horario horario){
        boolean atualizou = false;
        Connection conn = null;
        try {
            conn = abrirConexao();
            if(conn != null){
                String adicionar  = "UPDATE Horario SET NomeProfessor = '"+horario.getProfessor()+"',  "
                        + "NomeDisciplina = '"+horario.getDisciplina()+"', "
                        + "DiaSemana = '"+horario.getDiaSemana()+"', "
                        + "Aula = '"+horario.getHorario()+"', "
                        + "Periodo = '"+horario.getPeriodo()+"' "
                        + "WHERE HorarioID = '"+horario.getHorarioID()+"'";
                Statement stm = conn.createStatement();
                stm.execute(adicionar);
                
                atualizou = true;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao atualizar a horario no BD.");
        } finally {
            fecharConexao(conn);
        }
        
        
        return atualizou;
    }
}
