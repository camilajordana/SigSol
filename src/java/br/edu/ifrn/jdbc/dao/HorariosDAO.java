package br.edu.ifrn.jdbc.dao;

import br.edu.ifrn.jdbc.ConnectionFactory;
import static br.edu.ifrn.jdbc.ConnectionFactory.getConnection;
import br.edu.ifrn.jdbc.modelo.Horarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HorariosDAO {

    //conexão com o banco de dados
    private Connection connection;
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public HorariosDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public List<Horarios> getListaHorarios() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from horarios");
        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            Horarios horario = new Horarios();
            horario.setIdhorarios(rs.getInt("idhorarios"));
            horario.setTipo(rs.getInt("tipo"));
            horario.setNome(rs.getString("nome"));
            horarios.add(horario);
        }

        rs.close();
        stmt.close();
        return horarios;
    }

    public List<Horarios> getListaHorariosTurmas() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from horarios where tipo = 1");
        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            Horarios horario = new Horarios();
            horario.setIdhorarios(rs.getInt("idhorarios"));
            horario.setTipo(rs.getInt("tipo"));
            horario.setNome(rs.getString("nome"));
            horarios.add(horario);
        }

        rs.close();
        stmt.close();
        return horarios;
    }

    public List<Horarios> getListaHorariosProfessores() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from horarios where tipo = 2");
        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            Horarios horario = new Horarios();
            horario.setIdhorarios(rs.getInt("idhorarios"));
            horario.setTipo(rs.getInt("tipo"));
            horario.setNome(rs.getString("nome"));
            horarios.add(horario);
        }

        rs.close();
        stmt.close();
        return horarios;
    }

    public List<Horarios> getListaHorariosMonitoria() throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select * from horarios where tipo = 3");
        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            Horarios horario = new Horarios();
            horario.setIdhorarios(rs.getInt("idhorarios"));
            horario.setTipo(rs.getInt("tipo"));
            horario.setNome(rs.getString("nome"));
            horarios.add(horario);
        }

        rs.close();
        stmt.close();
        return horarios;
    }

    public void adicionarHorario(Horarios horario) throws SQLException {

        //prepared statement para inserir
        PreparedStatement stmt1 = this.connection.prepareStatement("insert into horarios (nome, tipo) values (?, ?)");
        PreparedStatement stmt2 = this.connection.prepareStatement("insert into horariosmanha (idhorario_manha, seg1, seg2, seg3, seg4, seg5, seg6, ter1, ter2, ter3, ter4, ter5, ter6, qua1, qua2, qua3, qua4, qua5, qua6, qui1, qui2, qui3, qui4, qui5, qui6, sex1, sex2, sex3, sex4, sex5, sex6) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        PreparedStatement stmt3 = this.connection.prepareStatement("insert into horariostarde (idhorario_tarde, seg7, seg8, seg9, seg10, seg11, seg12, ter7, ter8, ter9, ter10, ter11, ter12, qua7, qua8, qua9, qua10, qua11, qua12, qui7, qui8, qui9, qui10, qui11, qui12, sex7, sex8, sex9, sex10, sex11, sex12) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        PreparedStatement stmt4 = this.connection.prepareStatement("insert into horariosnoite (idhorario_noite, seg13, seg14, seg15, seg16, ter13, ter14, ter15, ter16, qua13, qua14, qua15, qua16, qui13, qui14, qui15, qui16, sex13, sex14, sex15, sex16) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        stmt1.setString(1, horario.getNome());
        stmt1.setInt(2, horario.getTipo());
        stmt1.execute();
        stmt1.close();

        int id = 0;
        String testeNome = horario.getNome().toLowerCase();
        HorariosDAO dao = new HorariosDAO();
        List<Horarios> getLista = dao.getListaHorarios();
        for (Horarios cont1 : getLista) {
            if (cont1.getNome().equals(testeNome)) {
                id = cont1.getIdhorarios();
            }
        }

        stmt2.setInt(1, id);
        stmt2.setString(2, horario.getSeg1());
        stmt2.setString(3, horario.getSeg2());
        stmt2.setString(4, horario.getSeg3());
        stmt2.setString(5, horario.getSeg4());
        stmt2.setString(6, horario.getSeg5());
        stmt2.setString(7, horario.getSeg6());
        stmt2.setString(8, horario.getTer1());
        stmt2.setString(9, horario.getTer2());
        stmt2.setString(10, horario.getTer3());
        stmt2.setString(11, horario.getTer4());
        stmt2.setString(12, horario.getTer5());
        stmt2.setString(13, horario.getTer6());
        stmt2.setString(14, horario.getQua1());
        stmt2.setString(15, horario.getQua2());
        stmt2.setString(16, horario.getQua3());
        stmt2.setString(17, horario.getQua4());
        stmt2.setString(18, horario.getQua5());
        stmt2.setString(19, horario.getQua6());
        stmt2.setString(20, horario.getQui1());
        stmt2.setString(21, horario.getQui2());
        stmt2.setString(22, horario.getQui3());
        stmt2.setString(23, horario.getQui4());
        stmt2.setString(24, horario.getQui5());
        stmt2.setString(25, horario.getQui6());
        stmt2.setString(26, horario.getSex1());
        stmt2.setString(27, horario.getSex2());
        stmt2.setString(28, horario.getSex3());
        stmt2.setString(29, horario.getSex4());
        stmt2.setString(30, horario.getSex5());
        stmt2.setString(31, horario.getSex6());
        stmt2.execute();
        stmt2.close();

        stmt3.setInt(1, id);
        stmt3.setString(2, horario.getSeg7());
        stmt3.setString(3, horario.getSeg8());
        stmt3.setString(4, horario.getSeg9());
        stmt3.setString(5, horario.getSeg10());
        stmt3.setString(6, horario.getSeg11());
        stmt3.setString(7, horario.getSeg12());
        stmt3.setString(8, horario.getTer7());
        stmt3.setString(9, horario.getTer8());
        stmt3.setString(10, horario.getTer9());
        stmt3.setString(11, horario.getTer10());
        stmt3.setString(12, horario.getTer11());
        stmt3.setString(13, horario.getTer12());
        stmt3.setString(14, horario.getQua7());
        stmt3.setString(15, horario.getQua8());
        stmt3.setString(16, horario.getQua9());
        stmt3.setString(17, horario.getQua10());
        stmt3.setString(18, horario.getQua11());
        stmt3.setString(19, horario.getQua12());
        stmt3.setString(20, horario.getQui7());
        stmt3.setString(21, horario.getQui8());
        stmt3.setString(22, horario.getQui9());
        stmt3.setString(23, horario.getQui10());
        stmt3.setString(24, horario.getQui11());
        stmt3.setString(25, horario.getQui12());
        stmt3.setString(26, horario.getSex7());
        stmt3.setString(27, horario.getSex8());
        stmt3.setString(28, horario.getSex9());
        stmt3.setString(29, horario.getSex10());
        stmt3.setString(30, horario.getSex11());
        stmt3.setString(31, horario.getSex12());
        stmt3.execute();
        stmt3.close();

        stmt4.setInt(1, id);
        stmt4.setString(2, horario.getSeg13());
        stmt4.setString(3, horario.getSeg14());
        stmt4.setString(4, horario.getSeg15());
        stmt4.setString(5, horario.getSeg16());
        stmt4.setString(6, horario.getTer13());
        stmt4.setString(7, horario.getTer14());
        stmt4.setString(8, horario.getTer15());
        stmt4.setString(9, horario.getTer16());
        stmt4.setString(10, horario.getQua13());
        stmt4.setString(11, horario.getQua14());
        stmt4.setString(12, horario.getQua15());
        stmt4.setString(13, horario.getQua16());
        stmt4.setString(14, horario.getQui13());
        stmt4.setString(15, horario.getQui14());
        stmt4.setString(16, horario.getQui15());
        stmt4.setString(17, horario.getQui16());
        stmt4.setString(18, horario.getSex13());
        stmt4.setString(19, horario.getSex14());
        stmt4.setString(20, horario.getSex15());
        stmt4.setString(21, horario.getSex16());
        stmt4.execute();
        stmt4.close();

    }

    public List<Horarios> pesquisarHorarioTurma(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select horariosmanha.idhorariosmanha, horariostarde.idhorariostarde, horariosnoite.idhorariosnoite, horarios.idhorarios, horarios.nome, horarios.tipo, horariosmanha.idhorario_manha, horariostarde.idhorario_tarde, horariosnoite.idhorario_noite, horariosmanha.seg1, horariosmanha.seg2, horariosmanha.seg3, horariosmanha.seg4, horariosmanha.seg5, horariosmanha.seg6, horariosmanha.ter1, horariosmanha.ter2, horariosmanha.ter3, horariosmanha.ter4, horariosmanha.ter5, horariosmanha.ter6, horariosmanha.qua1, horariosmanha.qua2, horariosmanha.qua3, horariosmanha.qua4, horariosmanha.qua5, horariosmanha.qua6, horariosmanha.qui1, horariosmanha.qui2, horariosmanha.qui3, horariosmanha.qui4, horariosmanha.qui5, horariosmanha.qui6, horariosmanha.sex1, horariosmanha.sex2, horariosmanha.sex3, horariosmanha.sex4, horariosmanha.sex5, horariosmanha.sex6, horariostarde.idhorariostarde, horariostarde.idhorario_tarde, horariostarde.seg7, horariostarde.seg8, horariostarde.seg9, horariostarde.seg10, horariostarde.seg11, horariostarde.seg12, horariostarde.ter7, horariostarde.ter8, horariostarde.ter9, horariostarde.ter10, horariostarde.ter11, horariostarde.ter12, horariostarde.qua7, horariostarde.qua8, horariostarde.qua9, horariostarde.qua10, horariostarde.qua11, horariostarde.qua12, horariostarde.qui7, horariostarde.qui8, horariostarde.qui9, horariostarde.qui10, horariostarde.qui11, horariostarde.qui12, horariostarde.sex7, horariostarde.sex8, horariostarde.sex9, horariostarde.sex10, horariostarde.sex11, horariostarde.sex12, horariosnoite.idhorariosnoite, horariosnoite.idhorario_noite, horariosnoite.seg13, horariosnoite.seg14, horariosnoite.seg15, horariosnoite.seg16, horariosnoite.ter13, horariosnoite.ter14, horariosnoite.ter15, horariosnoite.ter16, horariosnoite.qua13, horariosnoite.qua14, horariosnoite.qua15, horariosnoite.qua16, horariosnoite.qui13, horariosnoite.qui14, horariosnoite.qui15, horariosnoite.qui16, horariosnoite.sex13, horariosnoite.sex14, horariosnoite.sex15, horariosnoite.sex16 from horarios, horariosmanha, horariostarde, horariosnoite where horarios.tipo = 1 and horarios.idhorarios = horariosmanha.idhorario_manha and horarios.idhorarios = horariostarde.idhorario_tarde and horarios.idhorarios = horariosnoite.idhorario_noite and horarios.nome like '" + nome + "%'");
        //PreparedStatement stmt = this.connection.prepareStatement("select * from horarios INNER JOIN ");
        // PreparedStatement stmt1 = this.connection.prepareStatement("select * from horarios where tipo = 1 and nome like '"+nome+"%';");
        //PreparedStatement stmt1 = this.connection.prepareStatement("select * from horariosmanha");
        //PreparedStatement stmt2 = this.connection.prepareStatement("select * from horariostarde");
        //PreparedStatement stmt3 = this.connection.prepareStatement("select * from horariosnoite");

        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Horarios h = new Horarios();
            h.setIdhorariosmanha(rs.getInt("idhorariosmanha"));
            h.setIdhorariostarde(rs.getInt("idhorariostarde"));
            h.setIdhorariosnoite(rs.getInt("idhorariosnoite"));
            
            h.setIdhorarios(rs.getInt("idhorarios"));
            h.setNome(rs.getString("nome"));
            h.setTipo(rs.getInt("tipo"));
            h.setIdhorario_manha(rs.getInt("idhorario_manha"));
            h.setIdhorario_tarde(rs.getInt("idhorario_tarde"));
            h.setIdhorario_noite(rs.getInt("idhorario_noite"));
            h.setSeg1(rs.getString("seg1"));
            h.setSeg2(rs.getString("seg2"));
            h.setSeg3(rs.getString("seg3"));
            h.setSeg4(rs.getString("seg4"));
            h.setSeg5(rs.getString("seg5"));
            h.setSeg6(rs.getString("seg6"));
            h.setSeg7(rs.getString("seg7"));
            h.setSeg8(rs.getString("seg8"));
            h.setSeg9(rs.getString("seg9"));
            h.setSeg10(rs.getString("seg10"));
            h.setSeg11(rs.getString("seg11"));
            h.setSeg12(rs.getString("seg12"));
            h.setSeg13(rs.getString("seg13"));
            h.setSeg14(rs.getString("seg14"));
            h.setSeg15(rs.getString("seg15"));
            h.setSeg16(rs.getString("seg16"));
            h.setTer1(rs.getString("ter1"));
            h.setTer2(rs.getString("ter2"));
            h.setTer3(rs.getString("ter3"));
            h.setTer4(rs.getString("ter4"));
            h.setTer5(rs.getString("ter5"));
            h.setTer6(rs.getString("ter6"));
            h.setTer7(rs.getString("ter7"));
            h.setTer8(rs.getString("ter8"));
            h.setTer9(rs.getString("ter9"));
            h.setTer10(rs.getString("ter10"));
            h.setTer11(rs.getString("ter11"));
            h.setTer12(rs.getString("ter12"));
            h.setTer13(rs.getString("ter13"));
            h.setTer14(rs.getString("ter14"));
            h.setTer15(rs.getString("ter15"));
            h.setTer16(rs.getString("ter16"));
            h.setQua1(rs.getString("qua1"));
            h.setQua2(rs.getString("qua2"));
            h.setQua3(rs.getString("qua3"));
            h.setQua4(rs.getString("qua4"));
            h.setQua5(rs.getString("qua5"));
            h.setQua6(rs.getString("qua6"));
            h.setQua7(rs.getString("qua7"));
            h.setQua8(rs.getString("qua8"));
            h.setQua9(rs.getString("qua9"));
            h.setQua10(rs.getString("qua10"));
            h.setQua11(rs.getString("qua11"));
            h.setQua12(rs.getString("qua12"));
            h.setQua13(rs.getString("qua13"));
            h.setQua14(rs.getString("qua14"));
            h.setQua15(rs.getString("qua15"));
            h.setQua16(rs.getString("qua16"));
            h.setQui1(rs.getString("qui1"));
            h.setQui2(rs.getString("qui2"));
            h.setQui3(rs.getString("qui3"));
            h.setQui4(rs.getString("qui4"));
            h.setQui5(rs.getString("qui5"));
            h.setQui6(rs.getString("qui6"));
            h.setQui7(rs.getString("qui7"));
            h.setQui8(rs.getString("qui8"));
            h.setQui9(rs.getString("qui9"));
            h.setQui10(rs.getString("qui10"));
            h.setQui11(rs.getString("qui11"));
            h.setQui12(rs.getString("qui12"));
            h.setQui13(rs.getString("qui13"));
            h.setQui14(rs.getString("qui14"));
            h.setQui15(rs.getString("qui15"));
            h.setQui16(rs.getString("qui16"));
            h.setSex1(rs.getString("sex1"));
            h.setSex2(rs.getString("sex2"));
            h.setSex3(rs.getString("sex3"));
            h.setSex4(rs.getString("sex4"));
            h.setSex5(rs.getString("sex5"));
            h.setSex6(rs.getString("sex6"));
            h.setSex7(rs.getString("sex7"));
            h.setSex8(rs.getString("sex8"));
            h.setSex9(rs.getString("sex9"));
            h.setSex10(rs.getString("sex10"));
            h.setSex11(rs.getString("sex11"));
            h.setSex12(rs.getString("sex12"));
            h.setSex13(rs.getString("sex13"));
            h.setSex14(rs.getString("sex14"));
            h.setSex15(rs.getString("sex15"));
            h.setSex16(rs.getString("sex16"));

            //adicionando objeto à lista
            horarios.add(h);
        }
        rs.close();
        stmt.close();

        //     stmt1.close();
        //   stmt2.close();
        //   stmt3.close();
        return horarios;

    }

    public List<Horarios> pesquisarHorarioProfessor(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select horariosmanha.idhorariosmanha, horariostarde.idhorariostarde, horariosnoite.idhorariosnoite, horarios.idhorarios, horarios.nome, horarios.tipo, horariosmanha.idhorario_manha, horariostarde.idhorario_tarde, horariosnoite.idhorario_noite, horariosmanha.seg1, horariosmanha.seg2, horariosmanha.seg3, horariosmanha.seg4, horariosmanha.seg5, horariosmanha.seg6, horariosmanha.ter1, horariosmanha.ter2, horariosmanha.ter3, horariosmanha.ter4, horariosmanha.ter5, horariosmanha.ter6, horariosmanha.qua1, horariosmanha.qua2, horariosmanha.qua3, horariosmanha.qua4, horariosmanha.qua5, horariosmanha.qua6, horariosmanha.qui1, horariosmanha.qui2, horariosmanha.qui3, horariosmanha.qui4, horariosmanha.qui5, horariosmanha.qui6, horariosmanha.sex1, horariosmanha.sex2, horariosmanha.sex3, horariosmanha.sex4, horariosmanha.sex5, horariosmanha.sex6, horariostarde.idhorariostarde, horariostarde.idhorario_tarde, horariostarde.seg7, horariostarde.seg8, horariostarde.seg9, horariostarde.seg10, horariostarde.seg11, horariostarde.seg12, horariostarde.ter7, horariostarde.ter8, horariostarde.ter9, horariostarde.ter10, horariostarde.ter11, horariostarde.ter12, horariostarde.qua7, horariostarde.qua8, horariostarde.qua9, horariostarde.qua10, horariostarde.qua11, horariostarde.qua12, horariostarde.qui7, horariostarde.qui8, horariostarde.qui9, horariostarde.qui10, horariostarde.qui11, horariostarde.qui12, horariostarde.sex7, horariostarde.sex8, horariostarde.sex9, horariostarde.sex10, horariostarde.sex11, horariostarde.sex12, horariosnoite.idhorariosnoite, horariosnoite.idhorario_noite, horariosnoite.seg13, horariosnoite.seg14, horariosnoite.seg15, horariosnoite.seg16, horariosnoite.ter13, horariosnoite.ter14, horariosnoite.ter15, horariosnoite.ter16, horariosnoite.qua13, horariosnoite.qua14, horariosnoite.qua15, horariosnoite.qua16, horariosnoite.qui13, horariosnoite.qui14, horariosnoite.qui15, horariosnoite.qui16, horariosnoite.sex13, horariosnoite.sex14, horariosnoite.sex15, horariosnoite.sex16 from horarios, horariosmanha, horariostarde, horariosnoite where horarios.tipo = 2 and horarios.idhorarios = horariosmanha.idhorario_manha and horarios.idhorarios = horariostarde.idhorario_tarde and horarios.idhorarios = horariosnoite.idhorario_noite and horarios.nome like '" + nome + "%'");
        //PreparedStatement stmt = this.connection.prepareStatement("select * from horarios INNER JOIN ");
        // PreparedStatement stmt1 = this.connection.prepareStatement("select * from horarios where tipo = 1 and nome like '"+nome+"%';");
        //PreparedStatement stmt1 = this.connection.prepareStatement("select * from horariosmanha");
        //PreparedStatement stmt2 = this.connection.prepareStatement("select * from horariostarde");
        //PreparedStatement stmt3 = this.connection.prepareStatement("select * from horariosnoite");

        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Horarios h = new Horarios();
             h.setIdhorariosmanha(rs.getInt("idhorariosmanha"));
            h.setIdhorariostarde(rs.getInt("idhorariostarde"));
            h.setIdhorariosnoite(rs.getInt("idhorariosnoite"));
            
           
            h.setIdhorarios(rs.getInt("idhorarios"));
            h.setNome(rs.getString("nome"));
            h.setTipo(rs.getInt("tipo"));
            h.setIdhorario_manha(rs.getInt("idhorario_manha"));
            h.setIdhorario_tarde(rs.getInt("idhorario_tarde"));
            h.setIdhorario_noite(rs.getInt("idhorario_noite"));
            h.setSeg1(rs.getString("seg1"));
            h.setSeg2(rs.getString("seg2"));
            h.setSeg3(rs.getString("seg3"));
            h.setSeg4(rs.getString("seg4"));
            h.setSeg5(rs.getString("seg5"));
            h.setSeg6(rs.getString("seg6"));
            h.setSeg7(rs.getString("seg7"));
            h.setSeg8(rs.getString("seg8"));
            h.setSeg9(rs.getString("seg9"));
            h.setSeg10(rs.getString("seg10"));
            h.setSeg11(rs.getString("seg11"));
            h.setSeg12(rs.getString("seg12"));
            h.setSeg13(rs.getString("seg13"));
            h.setSeg14(rs.getString("seg14"));
            h.setSeg15(rs.getString("seg15"));
            h.setSeg16(rs.getString("seg16"));
            h.setTer1(rs.getString("ter1"));
            h.setTer2(rs.getString("ter2"));
            h.setTer3(rs.getString("ter3"));
            h.setTer4(rs.getString("ter4"));
            h.setTer5(rs.getString("ter5"));
            h.setTer6(rs.getString("ter6"));
            h.setTer7(rs.getString("ter7"));
            h.setTer8(rs.getString("ter8"));
            h.setTer9(rs.getString("ter9"));
            h.setTer10(rs.getString("ter10"));
            h.setTer11(rs.getString("ter11"));
            h.setTer12(rs.getString("ter12"));
            h.setTer13(rs.getString("ter13"));
            h.setTer14(rs.getString("ter14"));
            h.setTer15(rs.getString("ter15"));
            h.setTer16(rs.getString("ter16"));
            h.setQua1(rs.getString("qua1"));
            h.setQua2(rs.getString("qua2"));
            h.setQua3(rs.getString("qua3"));
            h.setQua4(rs.getString("qua4"));
            h.setQua5(rs.getString("qua5"));
            h.setQua6(rs.getString("qua6"));
            h.setQua7(rs.getString("qua7"));
            h.setQua8(rs.getString("qua8"));
            h.setQua9(rs.getString("qua9"));
            h.setQua10(rs.getString("qua10"));
            h.setQua11(rs.getString("qua11"));
            h.setQua12(rs.getString("qua12"));
            h.setQua13(rs.getString("qua13"));
            h.setQua14(rs.getString("qua14"));
            h.setQua15(rs.getString("qua15"));
            h.setQua16(rs.getString("qua16"));
            h.setQui1(rs.getString("qui1"));
            h.setQui2(rs.getString("qui2"));
            h.setQui3(rs.getString("qui3"));
            h.setQui4(rs.getString("qui4"));
            h.setQui5(rs.getString("qui5"));
            h.setQui6(rs.getString("qui6"));
            h.setQui7(rs.getString("qui7"));
            h.setQui8(rs.getString("qui8"));
            h.setQui9(rs.getString("qui9"));
            h.setQui10(rs.getString("qui10"));
            h.setQui11(rs.getString("qui11"));
            h.setQui12(rs.getString("qui12"));
            h.setQui13(rs.getString("qui13"));
            h.setQui14(rs.getString("qui14"));
            h.setQui15(rs.getString("qui15"));
            h.setQui16(rs.getString("qui16"));
            h.setSex1(rs.getString("sex1"));
            h.setSex2(rs.getString("sex2"));
            h.setSex3(rs.getString("sex3"));
            h.setSex4(rs.getString("sex4"));
            h.setSex5(rs.getString("sex5"));
            h.setSex6(rs.getString("sex6"));
            h.setSex7(rs.getString("sex7"));
            h.setSex8(rs.getString("sex8"));
            h.setSex9(rs.getString("sex9"));
            h.setSex10(rs.getString("sex10"));
            h.setSex11(rs.getString("sex11"));
            h.setSex12(rs.getString("sex12"));
            h.setSex13(rs.getString("sex13"));
            h.setSex14(rs.getString("sex14"));
            h.setSex15(rs.getString("sex15"));
            h.setSex16(rs.getString("sex16"));

            //adicionando objeto à lista
            horarios.add(h);
        }
        rs.close();
        stmt.close();

        //     stmt1.close();
        //   stmt2.close();
        //   stmt3.close();
        return horarios;

    }

    public List<Horarios> pesquisarHorarioMonitoria(String nome) throws SQLException {
        PreparedStatement stmt = this.connection.prepareStatement("select horariosmanha.idhorariosmanha, horariostarde.idhorariostarde, horariosnoite.idhorariosnoite, horarios.idhorarios, horarios.nome, horarios.tipo, horariosmanha.idhorario_manha, horariostarde.idhorario_tarde, horariosnoite.idhorario_noite, horariosmanha.seg1, horariosmanha.seg2, horariosmanha.seg3, horariosmanha.seg4, horariosmanha.seg5, horariosmanha.seg6, horariosmanha.ter1, horariosmanha.ter2, horariosmanha.ter3, horariosmanha.ter4, horariosmanha.ter5, horariosmanha.ter6, horariosmanha.qua1, horariosmanha.qua2, horariosmanha.qua3, horariosmanha.qua4, horariosmanha.qua5, horariosmanha.qua6, horariosmanha.qui1, horariosmanha.qui2, horariosmanha.qui3, horariosmanha.qui4, horariosmanha.qui5, horariosmanha.qui6, horariosmanha.sex1, horariosmanha.sex2, horariosmanha.sex3, horariosmanha.sex4, horariosmanha.sex5, horariosmanha.sex6, horariostarde.idhorariostarde, horariostarde.idhorario_tarde, horariostarde.seg7, horariostarde.seg8, horariostarde.seg9, horariostarde.seg10, horariostarde.seg11, horariostarde.seg12, horariostarde.ter7, horariostarde.ter8, horariostarde.ter9, horariostarde.ter10, horariostarde.ter11, horariostarde.ter12, horariostarde.qua7, horariostarde.qua8, horariostarde.qua9, horariostarde.qua10, horariostarde.qua11, horariostarde.qua12, horariostarde.qui7, horariostarde.qui8, horariostarde.qui9, horariostarde.qui10, horariostarde.qui11, horariostarde.qui12, horariostarde.sex7, horariostarde.sex8, horariostarde.sex9, horariostarde.sex10, horariostarde.sex11, horariostarde.sex12, horariosnoite.idhorariosnoite, horariosnoite.idhorario_noite, horariosnoite.seg13, horariosnoite.seg14, horariosnoite.seg15, horariosnoite.seg16, horariosnoite.ter13, horariosnoite.ter14, horariosnoite.ter15, horariosnoite.ter16, horariosnoite.qua13, horariosnoite.qua14, horariosnoite.qua15, horariosnoite.qua16, horariosnoite.qui13, horariosnoite.qui14, horariosnoite.qui15, horariosnoite.qui16, horariosnoite.sex13, horariosnoite.sex14, horariosnoite.sex15, horariosnoite.sex16 from horarios, horariosmanha, horariostarde, horariosnoite where horarios.tipo = 3 and horarios.idhorarios = horariosmanha.idhorario_manha and horarios.idhorarios = horariostarde.idhorario_tarde and horarios.idhorarios = horariosnoite.idhorario_noite and horarios.nome like '" + nome + "%'");
        //PreparedStatement stmt = this.connection.prepareStatement("select * from horarios INNER JOIN ");
        // PreparedStatement stmt1 = this.connection.prepareStatement("select * from horarios where tipo = 1 and nome like '"+nome+"%';");
        //PreparedStatement stmt1 = this.connection.prepareStatement("select * from horariosmanha");
        //PreparedStatement stmt2 = this.connection.prepareStatement("select * from horariostarde");
        //PreparedStatement stmt3 = this.connection.prepareStatement("select * from horariosnoite");

        ResultSet rs = stmt.executeQuery();

        List<Horarios> horarios = new ArrayList<Horarios>();

        while (rs.next()) {
            //Criando o objeto Pessoa
            Horarios h = new Horarios();
             h.setIdhorariosmanha(rs.getInt("idhorariosmanha"));
            h.setIdhorariostarde(rs.getInt("idhorariostarde"));
            h.setIdhorariosnoite(rs.getInt("idhorariosnoite"));
            
           
            h.setIdhorarios(rs.getInt("idhorarios"));
            h.setNome(rs.getString("nome"));
            h.setTipo(rs.getInt("tipo"));
            h.setIdhorario_manha(rs.getInt("idhorario_manha"));
            h.setIdhorario_tarde(rs.getInt("idhorario_tarde"));
            h.setIdhorario_noite(rs.getInt("idhorario_noite"));
            h.setSeg1(rs.getString("seg1"));
            h.setSeg2(rs.getString("seg2"));
            h.setSeg3(rs.getString("seg3"));
            h.setSeg4(rs.getString("seg4"));
            h.setSeg5(rs.getString("seg5"));
            h.setSeg6(rs.getString("seg6"));
            h.setSeg7(rs.getString("seg7"));
            h.setSeg8(rs.getString("seg8"));
            h.setSeg9(rs.getString("seg9"));
            h.setSeg10(rs.getString("seg10"));
            h.setSeg11(rs.getString("seg11"));
            h.setSeg12(rs.getString("seg12"));
            h.setSeg13(rs.getString("seg13"));
            h.setSeg14(rs.getString("seg14"));
            h.setSeg15(rs.getString("seg15"));
            h.setSeg16(rs.getString("seg16"));
            h.setTer1(rs.getString("ter1"));
            h.setTer2(rs.getString("ter2"));
            h.setTer3(rs.getString("ter3"));
            h.setTer4(rs.getString("ter4"));
            h.setTer5(rs.getString("ter5"));
            h.setTer6(rs.getString("ter6"));
            h.setTer7(rs.getString("ter7"));
            h.setTer8(rs.getString("ter8"));
            h.setTer9(rs.getString("ter9"));
            h.setTer10(rs.getString("ter10"));
            h.setTer11(rs.getString("ter11"));
            h.setTer12(rs.getString("ter12"));
            h.setTer13(rs.getString("ter13"));
            h.setTer14(rs.getString("ter14"));
            h.setTer15(rs.getString("ter15"));
            h.setTer16(rs.getString("ter16"));
            h.setQua1(rs.getString("qua1"));
            h.setQua2(rs.getString("qua2"));
            h.setQua3(rs.getString("qua3"));
            h.setQua4(rs.getString("qua4"));
            h.setQua5(rs.getString("qua5"));
            h.setQua6(rs.getString("qua6"));
            h.setQua7(rs.getString("qua7"));
            h.setQua8(rs.getString("qua8"));
            h.setQua9(rs.getString("qua9"));
            h.setQua10(rs.getString("qua10"));
            h.setQua11(rs.getString("qua11"));
            h.setQua12(rs.getString("qua12"));
            h.setQua13(rs.getString("qua13"));
            h.setQua14(rs.getString("qua14"));
            h.setQua15(rs.getString("qua15"));
            h.setQua16(rs.getString("qua16"));
            h.setQui1(rs.getString("qui1"));
            h.setQui2(rs.getString("qui2"));
            h.setQui3(rs.getString("qui3"));
            h.setQui4(rs.getString("qui4"));
            h.setQui5(rs.getString("qui5"));
            h.setQui6(rs.getString("qui6"));
            h.setQui7(rs.getString("qui7"));
            h.setQui8(rs.getString("qui8"));
            h.setQui9(rs.getString("qui9"));
            h.setQui10(rs.getString("qui10"));
            h.setQui11(rs.getString("qui11"));
            h.setQui12(rs.getString("qui12"));
            h.setQui13(rs.getString("qui13"));
            h.setQui14(rs.getString("qui14"));
            h.setQui15(rs.getString("qui15"));
            h.setQui16(rs.getString("qui16"));
            h.setSex1(rs.getString("sex1"));
            h.setSex2(rs.getString("sex2"));
            h.setSex3(rs.getString("sex3"));
            h.setSex4(rs.getString("sex4"));
            h.setSex5(rs.getString("sex5"));
            h.setSex6(rs.getString("sex6"));
            h.setSex7(rs.getString("sex7"));
            h.setSex8(rs.getString("sex8"));
            h.setSex9(rs.getString("sex9"));
            h.setSex10(rs.getString("sex10"));
            h.setSex11(rs.getString("sex11"));
            h.setSex12(rs.getString("sex12"));
            h.setSex13(rs.getString("sex13"));
            h.setSex14(rs.getString("sex14"));
            h.setSex15(rs.getString("sex15"));
            h.setSex16(rs.getString("sex16"));

            //adicionando objeto à lista
            horarios.add(h);
        }
        rs.close();
        stmt.close();

   //     stmt1.close();
        //   stmt2.close();
        //   stmt3.close();
        return horarios;

    }
    
    public void removerPeloID(Horarios horario, int id) throws SQLException {
        PreparedStatement s = connection.prepareStatement("delete from horariosmanha, horariostarde, horarios where horariosmanha.idhorario_manha = '"+id+"' and horariostarde.idhorario_tarde = '"+id+"' and horariosnoite.idhorario_noite = '"+id+"' and horarios.idhorarios = '"+id+"'");
        
        
        
        s.setInt(1, horario.getIdhorario_manha());
        s.setInt(2, horario.getIdhorario_tarde());
        s.setInt(3, horario.getIdhorario_noite());
        s.setInt(4, horario.getIdhorarios());
        s.execute();
        s.close();
//PreparedStatement s1 = connection.prepareStatement("delete from horariosmanha where idhorario_manha = '"+id+"'");
        //s1.setInt(1, horario.getIdhorario_manha());
        //PreparedStatement s2 = connection.prepareStatement("delete from horariostarde where idhorario_tarde = '"+id+"'");
        //s2.setInt(1, horario.getIdhorario_tarde());
        //PreparedStatement s3 = connection.prepareStatement("delete from horariosnoite where idhorario_noite = '"+id+"'");
        //s3.setInt(1, horario.getIdhorario_noite());
        //PreparedStatement s4 = connection.prepareStatement("delete from horarios where idhorarios = '"+id+"'");
        //s4.setInt(1, horario.getIdhorarios());
        //s1.execute();
        //s1.close();
        //s2.execute();
        //s2.close();
        //s3.execute();
        //s3.close();
        //s4.execute();
        //s4.close();
    }

    public void removerHorarioManha(Horarios horario) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from horariosmanha where idhorario_manha = ?");
            stmt.setInt(1, horario.getIdhorario_manha());
            stmt.execute();
            stmt.close();
    }
    
    public void removerHorarioTarde(Horarios horario) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from horariostarde where idhorario_tarde = ?");
            stmt.setInt(1, horario.getIdhorario_tarde());
            stmt.execute();
            stmt.close();
    }
    
    public void removerHorarioNoite(Horarios horario) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from horariosnoite where idhorario_noite = ?");
            stmt.setInt(1, horario.getIdhorario_noite());
            stmt.execute();
            stmt.close();
    }
    
    public void removerHorarios(Horarios horario) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("delete from horarios where idhorarios = ?");
            stmt.setInt(1, horario.getIdhorarios());
            stmt.execute();
            stmt.close();
    }
    
    public void alterar(Horarios horario) throws SQLException {
            //PreparedStatement stmt = connection.prepareStatement("UPDATE horariosmanha, horariostarde, horariosnoite, horarios set horarios.nome = ?, horarios.tipo = ?, horariosmanha.seg1 = ?, horariosmanha.seg2 = ?, horariosmanha.seg3 = ?, horariosmanha.seg4 = ?, horariosmanha.seg5 = ?, horariosmanha.seg6 = ?, horariosmanha.ter1 = ?, horariosmanha.ter2 = ?, horariosmanha.ter3 = ?, horariosmanha.ter4 = ?, horariosmanha.ter5 = ?, horariosmanha.ter6 = ?, horariosmanha.qua1 = ?, horariosmanha.qua2 = ?, horariosmanha.qua3 = ?, horariosmanha.qua4 = ?, horariosmanha.qua5 = ?, horariosmanha.qua6 = ?, horariosmanha.qui1 = ?, horariosmanha.qui2 = ?, horariosmanha.qui3 = ?, horariosmanha.qui4 = ?, horariosmanha.qui5 = ?, horariosmanha.qui6 = ?, horariosmanha.sex1 = ?, horariosmanha.sex2 = ?, horariosmanha.sex3 = ?, horariosmanha.sex4 = ?, horariosmanha.sex5 = ?, horariosmanha.sex6 = ?, horariostarde.seg7 = ?, horariostarde.seg8 = ?, horariostarde.seg9 = ?, horariostarde.seg10 = ?, horariostarde.seg11 = ?, horariostarde.seg12 = ?, horariostarde.ter7 = ?, horariostarde.ter8 = ?, horariostarde.ter9 = ?, horariostarde.ter10 = ?, horariostarde.ter11 = ?, horariostarde.ter12 = ?, horariostarde.qua7 = ?, horariostarde.qua8 = ?, horariostarde.qua9 = ?, horariostarde.qu10 = ?, horariostarde.qua11 = ?, horariostarde.qua12 = ?, horariostarde.qui7 = ?, horariostarde.qui8 = ?, horariostarde.qui9 = ?, horariostarde.qui10 = ?, horariostarde.qui11 = ?, horariostarde.qui12 = ?, horariostarde.sex7 = ?, horariostarde.sex8 = ?, horariostarde.sex9 = ?, horariostarde.sex10 = ?, horariostarde.sex11 = ?, horariostarde.sex12 = ?, horariosnoite.seg13 = ?, horariosnoite.seg14 = ?, horariosnoite.seg15 = ?, horariosnoite.seg16 = ?, horariosnoite.ter13 = ?, horariosnoite.ter14 = ?, horariosnoite.ter15 = ?, horariosnoite.ter16 = ?, horariosnoite.qua13 = ?, horariosnoite.qua14 = ?, horariosnoite.qua15 = ?, horariosnoite.qua16 = ?, horariosnoite.qui13 = ?, horariosnoite.qui14 = ?, horariosnoite.qui15 = ?, horariosnoite.qui16 = ?, horariosnoite.sex13 = ?, horariosnoite.sex14 = ?, horariosnoite.sex15 = ?, horariosnoite.sex16 = ? where horarios.idhorarios = ? and horariosmanha.idhorariosmanha = ? and horariostarde.idhorariostarde = ? and horariosnoite.idhorariosnoite = ?");
            PreparedStatement stmt = connection.prepareStatement("update horariosmanha, horariostarde, horariosnoite, horarios set horarios.nome = ?, horariosmanha.seg1 = ?, horariosmanha.seg2 = ?, horariosmanha.seg3 = ?, horariosmanha.seg4 = ?, horariosmanha.seg5 = ?, horariosmanha.seg6 = ?, horariosmanha.ter1 = ?, horariosmanha.ter2 = ?, horariosmanha.ter3 = ?, horariosmanha.ter4 = ?, horariosmanha.ter5 = ?, horariosmanha.ter6 = ?, horariosmanha.qua1 = ?, horariosmanha.qua2 = ?, horariosmanha.qua3 = ?, horariosmanha.qua4 = ?, horariosmanha.qua5 = ?, horariosmanha.qua6 = ?, horariosmanha.qui1 = ?, horariosmanha.qui2 = ?, horariosmanha.qui3 = ?, horariosmanha.qui4 = ?, horariosmanha.qui5 = ?, horariosmanha.qui6 = ?, horariosmanha.sex1 = ?, horariosmanha.sex2 = ?, horariosmanha.sex3 = ?, horariosmanha.sex4 = ?, horariosmanha.sex5 = ?,  horariosmanha.sex6 = ?, horariostarde.seg7 = ?, horariostarde.seg8 = ?, horariostarde.seg9 = ?, horariostarde.seg10 = ?, horariostarde.seg11 = ?, horariostarde.seg12 = ?, horariostarde.ter7 = ?, horariostarde.ter8 = ?, horariostarde.ter9 = ?, horariostarde.ter10 = ?, horariostarde.ter11 = ?, horariostarde.ter12 = ?, horariostarde.qua7 = ?, horariostarde.qua8 = ?, horariostarde.qua9 = ?, horariostarde.qua10 = ?, horariostarde.qua11 = ?, horariostarde.qua12 = ?, horariostarde.qui7 = ?, horariostarde.qui8 = ?, horariostarde.qui9 = ?, horariostarde.qui10 = ?, horariostarde.qui11 = ?, horariostarde.qui12 = ?, horariostarde.sex7 = ?, horariostarde.sex8 = ?, horariostarde.sex9 = ?, horariostarde.sex10 = ?, horariostarde.sex11 = ?, horariostarde.sex12 = ?, horariosnoite.seg13 = ?, horariosnoite.seg14 = ?, horariosnoite.seg15 = ?, horariosnoite.seg16 = ?, horariosnoite.ter13 = ?, horariosnoite.ter14 = ?, horariosnoite.ter15 = ?, horariosnoite.ter16 = ?, horariosnoite.qua13 = ?, horariosnoite.qua14 = ?, horariosnoite.qua15 = ?, horariosnoite.qua16 = ?, horariosnoite.qui13 = ?, horariosnoite.qui14 = ?, horariosnoite.qui15 = ?,  horariosnoite.qui16 = ?, horariosnoite.sex13 = ?, horariosnoite.sex14 = ?, horariosnoite.sex15 = ?, horariosnoite.sex16 = ? where horariosmanha.idhorariosmanha = ? and horariostarde.idhorariostarde = ? and horariosnoite.idhorariosnoite = ? and horarios.idhorarios = ?");
        
            
            stmt.setString(1, horario.getNome());
            stmt.setString(2, horario.getSeg1());
            stmt.setString(3, horario.getSeg2());
            stmt.setString(4, horario.getSeg3());
            stmt.setString(5, horario.getSeg4());
            stmt.setString(6, horario.getSeg5());
            stmt.setString(7, horario.getSeg6());
            stmt.setString(8, horario.getTer1());
            stmt.setString(9, horario.getTer2());
            stmt.setString(10, horario.getTer3());
            stmt.setString(11, horario.getTer4());
            stmt.setString(12, horario.getTer5());
            stmt.setString(13, horario.getTer6());
            stmt.setString(14, horario.getQua1());
            stmt.setString(15, horario.getQua2());
            stmt.setString(16, horario.getQua3());
            stmt.setString(17, horario.getQua4());
            stmt.setString(18, horario.getQua5());
            stmt.setString(19, horario.getQua6());
            stmt.setString(20, horario.getQui1());
            stmt.setString(21, horario.getQui2());
            stmt.setString(22, horario.getQui3());
            stmt.setString(23, horario.getQui4());
            stmt.setString(24, horario.getQui5());
            stmt.setString(25, horario.getQui6());
            stmt.setString(26, horario.getSex1());
            stmt.setString(27, horario.getSex2());
            stmt.setString(28, horario.getSex3());
            stmt.setString(29, horario.getSex4());
            stmt.setString(30, horario.getSex5());
            stmt.setString(31, horario.getSex6());
            stmt.setString(32, horario.getSeg7());
            stmt.setString(33, horario.getSeg8());
            stmt.setString(34, horario.getSeg9());
            stmt.setString(35, horario.getSeg10());
            stmt.setString(36, horario.getSeg11());
            stmt.setString(37, horario.getSeg12());
            stmt.setString(38, horario.getTer7());
            stmt.setString(39, horario.getTer8());
            stmt.setString(40, horario.getTer9());
            stmt.setString(41, horario.getTer10());
            stmt.setString(42, horario.getTer11());
            stmt.setString(43, horario.getTer12());
            stmt.setString(44, horario.getQua7());
            stmt.setString(45, horario.getQua8());
            stmt.setString(46, horario.getQua9());
            stmt.setString(47, horario.getQua10());
            stmt.setString(48, horario.getQua11());
            stmt.setString(49, horario.getQua12());
            stmt.setString(50, horario.getQui7());
            stmt.setString(51, horario.getQui8());
            stmt.setString(52, horario.getQui9());
            stmt.setString(53, horario.getQui10());
            stmt.setString(54, horario.getQui11());
            stmt.setString(55, horario.getQui12());
            stmt.setString(56, horario.getSex7());
            stmt.setString(57, horario.getSex8());
            stmt.setString(58, horario.getSex9());
            stmt.setString(59, horario.getSex10());
            stmt.setString(60, horario.getSex11());
            stmt.setString(61, horario.getSex12());
            stmt.setString(62, horario.getSeg13());
            stmt.setString(63, horario.getSeg14());
            stmt.setString(64, horario.getSeg15());
            stmt.setString(65, horario.getSeg16());
            stmt.setString(66, horario.getTer13());
            stmt.setString(67, horario.getTer14());
            stmt.setString(68, horario.getTer15());
            stmt.setString(69, horario.getTer16());
            stmt.setString(70, horario.getQua13());
            stmt.setString(71, horario.getQua14());
            stmt.setString(72, horario.getQua15());
            stmt.setString(73, horario.getQua16());
            stmt.setString(74, horario.getQui13());
            stmt.setString(75, horario.getQui14());
            stmt.setString(76, horario.getQui15());
            stmt.setString(77, horario.getQui16());
            stmt.setString(78, horario.getSex13());
            stmt.setString(79, horario.getSex14());
            stmt.setString(80, horario.getSex15());
            stmt.setString(81, horario.getSex16());
            
            
            
            
            stmt.setInt(82, horario.getIdhorariosmanha());
            stmt.setInt(83, horario.getIdhorariostarde());
            stmt.setInt(84, horario.getIdhorariosnoite());
            stmt.setInt(85, horario.getIdhorarios());
            
            
      //  stmt.setString(1, horario.getNome());
    //        stmt.setInt(2, horario.getTipo());
  //          stmt.setString(3, horario.getSeg1());
//            stmt.setString(4, horario.getSeg2());
            //stmt.setString(5, horario.getSeg3());
          //  stmt.setString(6, horario.getSeg4());
        //    stmt.setString(7, horario.getSeg5());
      //      stmt.setString(8, horario.getSeg6());
    //        stmt.setString(9, horario.getTer1());
  //          stmt.setString(10, horario.getTer2());
//            stmt.setString(11, horario.getTer3());
        //    stmt.setString(12, horario.getTer4());
           // stmt.setString(13, horario.getTer5());
         //   stmt.setString(14, horario.getTer6());
        //    stmt.setString(15, horario.getQua1());
      //      stmt.setString(16, horario.getQua2());
    //        stmt.setString(17, horario.getQua3());
  //          stmt.setString(18, horario.getQua4());
//            stmt.setString(19, horario.getQua5());
            //stmt.setString(20, horario.getQua6());
            //stmt.setString(21, horario.getQui1());
          //  stmt.setString(22, horario.getQui2());
        //    stmt.setString(23, horario.getQui3());
      //      stmt.setString(24, horario.getQui4());
    //        stmt.setString(25, horario.getQui5());
  //          stmt.setString(26, horario.getQui6());
//            stmt.setString(27, horario.getSex1());
            //stmt.setString(28, horario.getSex2());
          //  stmt.setString(29, horario.getSex3());
        //    stmt.setString(30, horario.getSex4());
      //      stmt.setString(31, horario.getSex5());
    //        stmt.setString(32, horario.getSex6());
  //          stmt.setString(33, horario.getSeg7());
//            stmt.setString(34, horario.getSeg8());
            //stmt.setString(35, horario.getSeg9());
          //  stmt.setString(36, horario.getSeg10());
        //    stmt.setString(37, horario.getSeg11());
      //      stmt.setString(38, horario.getSeg12());
    //        stmt.setString(39, horario.getTer7());
  //          stmt.setString(40, horario.getTer8());
//            stmt.setString(41, horario.getTer9());
            //stmt.setString(42, horario.getTer10());
          //  stmt.setString(43, horario.getTer11());
        //    stmt.setString(44, horario.getTer12());
      //      stmt.setString(45, horario.getQua7());
    //        stmt.setString(46, horario.getQua8());
  //          stmt.setString(47, horario.getQua9());
//            stmt.setString(48, horario.getQua10());
            //stmt.setString(49, horario.getQua11());
          //  stmt.setString(50, horario.getQua12());
        //    stmt.setString(51, horario.getQui7());
      //      stmt.setString(52, horario.getQui8());
    //        stmt.setString(53, horario.getQui9());
  //          stmt.setString(54, horario.getQui10());
//            stmt.setString(55, horario.getQui11());
            //stmt.setString(56, horario.getQui12());
          //  stmt.setString(57, horario.getSex7());
        //    stmt.setString(58, horario.getSex8());
      //      stmt.setString(59, horario.getSex9());
    //        stmt.setString(60, horario.getSex10());
  //          stmt.setString(61, horario.getSex11());
//            stmt.setString(62, horario.getSex12());
            //stmt.setString(63, horario.getSeg13());
          //  stmt.setString(64, horario.getSeg14());
        //    stmt.setString(65, horario.getSeg15());
      //      stmt.setString(66, horario.getSeg16());
    //        stmt.setString(67, horario.getTer13());
  //          stmt.setString(68, horario.getTer14());
//            stmt.setString(69, horario.getTer15());
            //stmt.setString(70, horario.getTer16());
          //  stmt.setString(71, horario.getQua13());
        //    stmt.setString(72, horario.getQua14());
      //      stmt.setString(73, horario.getQua15());
    //        stmt.setString(74, horario.getQua16());
  //          stmt.setString(75, horario.getQui13());
//            stmt.setString(76, horario.getQui14());
            //stmt.setString(77, horario.getQui15());
          //  stmt.setString(78, horario.getQui16());
        //    stmt.setString(79, horario.getSex13());
      //      stmt.setString(80, horario.getSex14());
      //      stmt.setString(81, horario.getSex15());
    //        stmt.setString(82, horario.getSex16());
            
  //          stmt.setInt(83, horario.getIdhorarios());
//            stmt.setInt(84, horario.getIdhorariosmanha());
            //stmt.setInt(85, horario.getIdhorariostarde());
          //  stmt.setInt(86, horario.getIdhorariosnoite());
            
            
            
            stmt.execute();
            stmt.close();
            //PreparedStatement stmt = connection.prepareStatement("update horariosmanha, horariostarde, horariosnoite, horarios set horarios.nome = ?, horarios.tipo = ?, horariosmanha.seg1 = ?, horariosmanha.seg2 = ?, horariosmanha.seg3 = ?, horariosmanha.seg4 = ?, horariosmanha.seg5 = ?, horariosmanha.seg6 = ?, horariosmanha.ter1 = ?, horariosmanha.ter2 = ?, horariosmanha.ter3 = ?, horariosmanha.ter4 = ?, horariosmanha.ter5 = ?, horariosmanha.ter6 = ?, horariosmanha.qua1 = ?, horariosmanha.qua2 = ?, horariosmanha.qua3 = ?, horariosmanha.qua4 = ?, horariosmanha.qua5 = ?, horariosmanha.qua6 = ?, horariosmanha.qui1 = ?, horariosmanha.qui2 = ?, horariosmanha.qui3 = ?, horariosmanha.qui4 = ?, horariosmanha.qui5 = ?, horariosmanha.qui6 = ?, horariosmanha.sex1 = ?, horariosmanha.sex2 = ?, horariosmanha.sex3 = ?, horariosmanha.sex4 = ?, horariosmanha.sex5 = ?, horariosmanha.sex6 = ?, horariostarde.seg7 = ?, horariostarde.seg8 = ?, horariostarde.seg9 = ?, horariostarde.seg10 = ?, horariostarde.seg11 = ?, horariostarde.seg12 = ?, horariostarde.ter7 = ?, horariostarde.ter8 = ?, horariostarde.ter9 = ?, horariostarde.ter10 = ?, horariostarde.ter11 = ?, horariostarde.ter12 = ?, horariostarde.qua7 = ?, horariostarde.qua8 = ?, horariostarde.qua9 = ?, horariostarde.qua10 = ?, horariostarde.qua11 = ?, horariostarde.qua12 = ?, horariostarde.qui7 = ?, horariostarde.qui8 = ?, horariostarde.qui9 = ?, horariostarde.qui10 = ?, horariostarde.qui11 = ?, horariostarde.qui12 = ?, horariostarde.sex7 = ?, horariostarde.sex8 = ?, horariostarde.sex9 = ?, horariostarde.sex10 = ?, horariostarde.sex11 = ?, horariostarde.sex12 = ?, horariosnoite.seg13 = ?, horariosnoite.seg14 = ?, horariosnoite.seg15 = ?, horariosnoite.seg16 = ?, horariosnoite.ter13 = ?, horariosnoite.ter14 = ?, horariosnoite.ter15 = ?, horariosnoite.ter16 = ?, horariosnoite.qua13 = ?, horariosnoite.qua14 = ?, horariosnoite.qua15 = ?, horariosnoite.qua16 = ?, horariosnoite.qui13 = ?, horariosnoite.qui14 = ?, horariosnoite.qui15 = ?, horariosnoite.qui16 = ?, horariosnoite.sex13 = ?, horariosnoite.sex14 = ?, horariosnoite.sex15 = ?, horariosnoite.sex16 = ? where horariosmanha.idhorariosmanha = ? and horariostarde.idhorariostarde = ? and horariosnoite.idhorariosnoite = ? and horarios.idhorarios = ?");
            //stmt.setString(1, horario.getNome());
            //stmt.setInt(2, horario.getTipo());
            
//            stmt.setString(3, horario.getSeg1());
  //          stmt.setString(4, horario.getSeg2());
    //        stmt.setString(5, horario.getSeg3());
      //      stmt.setString(6, horario.getSeg4());
        //    stmt.setString(7, horario.getSeg5());
          //  stmt.setString(8, horario.getSeg6());
            //stmt.setString(9, horario.getTer1());
//            stmt.setString(1, horario.getTer2());
  //          stmt.setString(11, horario.getTer3());
    //        stmt.setString(12, horario.getTer4());
      //      stmt.setString(13, horario.getTer5());
        //    stmt.setString(14, horario.getTer6());
          //  stmt.setString(15, horario.getQua1());
            //stmt.setString(16, horario.getQua2());
//            stmt.setString(17, horario.getQua3());
  //          stmt.setString(18, horario.getQua4());
    //        stmt.setString(19, horario.getQua5());
      //      stmt.setString(20, horario.getQua6());
        //    stmt.setString(21, horario.getQui1());
          //  stmt.setString(22, horario.getQui2());
            //stmt.setString(23, horario.getQui3());
//            stmt.setString(24, horario.getQui4());
  //          stmt.setString(25, horario.getQui5());
    //        stmt.setString(26, horario.getQui6());
      //      stmt.setString(27, horario.getSex1());
        //    stmt.setString(28, horario.getSex2());
          //  stmt.setString(29, horario.getSex3());
            //stmt.setString(30, horario.getSex4());
//            stmt.setString(31, horario.getSex5());
  //          stmt.setString(32, horario.getSex6());
            
    //        stmt.setString(33, horario.getSeg7());
      //      stmt.setString(34, horario.getSeg8());
        //    stmt.setString(35, horario.getSeg9());
          //  stmt.setString(36, horario.getSeg10());
            //stmt.setString(37, horario.getSeg11());
//            stmt.setString(38, horario.getSeg12());
  //          stmt.setString(39, horario.getTer7());
    //        stmt.setString(40, horario.getTer8());
      //      stmt.setString(41, horario.getTer9());
        //    stmt.setString(42, horario.getTer10());
          //  stmt.setString(43, horario.getTer11());
            //stmt.setString(44, horario.getTer12());
//            stmt.setString(45, horario.getQua7());
  //          stmt.setString(46, horario.getQua8());
    //        stmt.setString(47, horario.getQua9());
      //      stmt.setString(48, horario.getQua10());
        //    stmt.setString(49, horario.getQua11());
          //  stmt.setString(50, horario.getQua12());
            //stmt.setString(51, horario.getQui7());
//            stmt.setString(52, horario.getQui8());
  //          stmt.setString(53, horario.getQui9());
    //        stmt.setString(54, horario.getQui10());
      //      stmt.setString(55, horario.getQui11());
        //    stmt.setString(56, horario.getQui12());
          //  stmt.setString(57, horario.getSex7());
            //stmt.setString(58, horario.getSex8());
//            stmt.setString(59, horario.getSex9());
  //          stmt.setString(60, horario.getSex10());
    //        stmt.setString(61, horario.getSex11());
      //      stmt.setString(62, horario.getSex12());
           
        //    stmt.setString(63, horario.getSeg13());
          //  stmt.setString(64, horario.getSeg14());
            //stmt.setString(65, horario.getSeg15());
//            stmt.setString(66, horario.getSeg16());
  //          stmt.setString(67, horario.getTer13());
    //        stmt.setString(68, horario.getTer14());
      //      stmt.setString(69, horario.getTer15());
        //    stmt.setString(70, horario.getTer16());
          //  stmt.setString(71, horario.getQua13());
            //stmt.setString(72, horario.getQua14());
//            stmt.setString(73, horario.getQua15());
  //          stmt.setString(74, horario.getQua16());
    //        stmt.setString(75, horario.getQui13());
      //      stmt.setString(76, horario.getQui14());
        //    stmt.setString(77, horario.getQui15());
          //  stmt.setString(78, horario.getQui16());
            //stmt.setString(79, horario.getSex13());
//            stmt.setString(80, horario.getSex14());
  //          stmt.setString(81, horario.getSex15());
    //        stmt.setString(82, horario.getSex16());
      //      stmt.setInt(83, horario.getIdhorariosmanha());
        //    stmt.setInt(84, horario.getIdhorariostarde());
          //  stmt.setInt(85, horario.getIdhorariosnoite());
            //stmt.setInt(86, horario.getIdhorarios());
            
            
           // stmt.execute();
            //stmt.close();
        }
    
}
