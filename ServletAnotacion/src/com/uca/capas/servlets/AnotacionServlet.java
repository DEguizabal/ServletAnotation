package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String usuario="diego";
		String contrasena="root";
		String usuarioparametro= request.getParameter("usuario");
		String contrasenaparametro = request.getParameter("contrasena");
		
		PrintWriter salida = response.getWriter();
		
		if(usuario.equals(usuarioparametro) && contrasena.equals(contrasenaparametro)) {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"Inicio Sesion Correctamente "+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
			
		}else {
			salida.println("<html>");
			salida.println("<body>");
			salida.println("<h3>"+"El usuario o contraseña son incorrectos"+"</h3>");
			salida.println("</body>");
			salida.println("</html>");
				
		}
	}

}
