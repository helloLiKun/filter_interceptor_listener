package servlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by likun on 2018/2/12 0012.
 */
public class JspServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----------JspServlet  service-------------");
        String log=req.getParameter("log");
        if(log !=null){
            if(log.equals("logout")){
                req.removeAttribute("log");
            }else if(log.equals("login")){
                req.setAttribute("log","");
            }
        }
        ServletContext ctx = req.getSession().getServletContext();
        System.out.println("-----count-----"+ctx.getAttribute("count"));
        //解决上传参数中文乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("WEB-INF/views/hello.jsp").forward(req, resp);
    }
}
