package br.edu.ifpb;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/servletlogin.do")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Properties mapa;
    
    public void init() throws ServletException
    {
    	this.mapa = new Properties();
    	
    	try
    	{
    		    		
    		String arquivo = this.getServletContext().getInitParameter("caminho_arquivo_senhas");
    		
    		this.mapa.load(this.getServletContext().getResourceAsStream(arquivo));
    	    		
    	} catch (IOException e)
    	{
    		e.printStackTrace();
    		
    	}
	}
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("edtLogin");
		String senha = request.getParameter("edtSenha");
		
		if (this.validarSenha (login,senha)) {
			response.sendRedirect("Arquivos.html");
		} else response.sendRedirect("erro.html");
			
	}//doPost
	
	private boolean validarSenha(String login, String senha)
	{
	return this.mapa.getProperty(login).equals(senha);
	
	}

}
