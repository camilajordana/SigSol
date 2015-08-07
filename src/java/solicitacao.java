
import br.edu.ifrn.jdbc.dao.SolicitacaoDAO;
import br.edu.ifrn.jdbc.modelo.Solicitacao;
import br.edu.ifrn.jdbc.servlets.GerenciarMateriais;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class solicitacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        String usuario = request.getParameter("usuario");
        String matricula = usuario.trim();

        if (acao.equals("lista")) {
            try {
                SolicitacaoDAO dao = new SolicitacaoDAO();
                Solicitacao s = new Solicitacao();
                s.setMatricula(matricula);
                try {
                    List lista = dao.getLista(matricula);
                    request.setAttribute("sessaoLista", lista);

                    RequestDispatcher rd = request.getRequestDispatcher("/minhasSolicitacoes.jsp");
                    rd.forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(GerenciarMateriais.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception e) {

            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
