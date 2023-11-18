package org.example.controller;

import org.example.model.League;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeagueController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> errors=new ArrayList<String>();
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String title=request.getParameter("title");
        if(title.length()<=0)
        {
            errors.add("title field can not be blank");

        }


        int y=0;
        try {
            y= Integer.parseInt(request.getParameter("year"));
        }
        catch (Exception e)
        {
            errors.add("year field must be numeric");
        }
        String season=request.getParameter("season");
        if(season.equals("Unknown"))
        {
            errors.add("select a valid season");
        }
        League league=new League(title,season,y);
        if(!errors.isEmpty())
        {
            RequestDispatcher view=request.getRequestDispatcher("index.jsp");
            view.forward(request,response);
        }
        else
        {
            out.println("<table><tr><td>"+"League Title"+"</td><td>"+league.getLeagueTitle()+"</td></tr>");
            out.println("<table><tr><td>"+"League Season"+"</td><td>"+league.getSeason()+"</td></tr>");
            out.println("<table><tr><td>"+"League Year"+"</td><td>"+league.getYear()+"</td></tr></table>");

        }


    }

}
