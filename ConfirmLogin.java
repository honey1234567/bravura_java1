package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Exception;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfirmLogin
 */
@WebServlet("/ConfirmLogin")
public class ConfirmLogin extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                //response.getWriter().append("Served at: ").append(request.getContextPath());
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                //doGet(request, response);
                response.setContentType("Text/HTML");
                PrintWriter printWriter=response.getWriter();
                Cookie c[]=request.getCookies();
                printWriter.write(c[0].getValue()+"<br><br> "+ "Password:-"+c[1].getValue()+""+ "</h3></body></html>");
                
        }

}

