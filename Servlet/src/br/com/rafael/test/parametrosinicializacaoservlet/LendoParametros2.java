package br.com.rafael.test.parametrosinicializacaoservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/lerParametros2" }, initParams = {
		@WebInitParam(name = "parametro1", value = "primeiro parametro"),
		@WebInitParam(name = "parametro2", value = "segundo parametro") })
public class LendoParametros2 extends HttpServlet {

	public LendoParametros2() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// lendo parametros
		ServletConfig config = this.getServletConfig();
		String p1 = config.getInitParameter("parametro1");
		String p2 = config.getInitParameter("parametro2");

		try (PrintWriter out = response.getWriter()) {
			response.setContentType("text/html");

			// agora podemos retorna os dados
			out.print("<!DOCTYPE html>\r\n");
			out.print("<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Parametros</title>\r\n" + "</head>\r\n" + "<body>\r\n");
			out.print("<p>Primeiro parametro: " + p1 + "</p>\r\n");
			out.print("<p>Segundo parametro: " + p2 + "</p>\r\n");
			out.print("</body>\r\n" + "</html>");
		}
	}
}
