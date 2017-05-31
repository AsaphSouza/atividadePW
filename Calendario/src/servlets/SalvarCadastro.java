package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SalvarCadastro
 */

@WebServlet("/SalvarCadastro")
public class SalvarCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public SalvarCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//captura os dados do formulário
		String nome = req.getParameter("nome");
		Integer idade = new Integer(req.getParameter("idade"));
		String tipoCiclo = req.getParameter("tipoCiclo");
		String data = req.getParameter("data");
		
		//quebra a string da data em ano, mes e dia
		Integer ano = new Integer(data.substring(0, 4));
		Integer mes = new Integer(data.substring(5, 7));
		Integer dia = new Integer(data.substring(8, 10));
		
		//cria uma tipo calendar que serve para guardar datas e seta os valores
		//de dia, mes, ano além de já calcular a data da proxima mesntruação
		Calendar calendario = Calendar.getInstance();
		calendario.set(ano, mes, dia);
		calendario.add(calendario.DATE, 28);
		
		//pega os valores do dia, mes e ano
		int novoAno = calendario.get(Calendar.YEAR);
		int novoMes = calendario.get(Calendar.MONTH);
		int novoDia = calendario.get(Calendar.DAY_OF_MONTH);
		
		//cria a data final e cria um objeto do tipo Mulher já com todos os
		//seus atributos inicializados
		String dataFinal = (novoDia + " / " + novoMes + " / " + novoAno);
		Mulher mulher = new Mulher(nome, idade, dataFinal, tipoCiclo);
		
		//cria a session e pega os valores do objeto mulher e salva na session
		//para que esse valores possam ser utilizados no formularioResposta
		HttpSession session = req.getSession();
		session.setAttribute("nome", mulher.getNome());
		session.setAttribute("idade",  mulher.getIdade());
		session.setAttribute("data", mulher.getUltimoCiclo());
		session.setAttribute("tipoCiclo", mulher.getTipoCiclo());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("formularioResposta.jsp");
		dispatcher.forward(req, resp);
		
	}
}


