package cl.controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet.do"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //No se accede por GET
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, String> mapMensajes = new HashMap<>();
        String usuario = request.getParameter("txt_usuario");
        String password = request.getParameter("txt_password");

        if (usuario.equals("")) {
            mapMensajes.put("txt_usuario", "Ingrese un usuario");
        }

        if (password.equals("")) {
            mapMensajes.put("txt_password", "Ingrese una password");
        }

        request.setAttribute("mapMensajes", mapMensajes);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
