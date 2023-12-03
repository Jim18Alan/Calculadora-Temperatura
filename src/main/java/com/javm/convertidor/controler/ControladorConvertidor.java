package com.javm.convertidor.controler;

import java.io.*;

import com.javm.convertidor.model.Convertidor;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( value = "/lista")
public class ControladorConvertidor extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setContentType("text/html;charset=UTF-8");
        String url = "/index.jsp";

        String action = req.getParameter("action");
        if (action == null){
            action = "agregar";
        }

        if (action.equals("agregar")) {
            url = "/index.jsp";
        } else if (action.equals("calcular")) {
            String gradosC = req.getParameter("gradosC");

            Convertidor convertidor = new Convertidor(gradosC);
            convertidor.calcular();
            String gradosF = ""+ convertidor.getGradosF();

            req.setAttribute("gradosC",gradosC);
            req.setAttribute("gradosF",gradosF);
            url = "/mostrarConversion.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    public void destroy() {
    }
}