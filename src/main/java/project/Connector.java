package project;

import com.google.gson.Gson;
import project.Dao.DaoConnect;
import project.Model.ModelConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Controller",urlPatterns = "/getModelConnect")
public class Connector extends HttpServlet {
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        DaoConnect daoConnect = new DaoConnect();
        ModelConnection m1 = daoConnect.getModelConnection(id);

        String alienJson = this.gson.toJson(m1);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();


        out.print(alienJson);
        out.flush();

//
//        HttpSession session = req.getSession();
//        session.setAttribute("modelconnect", m1);
//
//        resp.sendRedirect("showConnect.jsp");
    }
}
