package com.booking.demo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/JqueryAjaxServlet")
@Produces(MediaType.APPLICATION_JSON)
public class JqueryAjaxServlet extends HttpServlet {
	 
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        String name = request.getParameter("name");
 
        String personJSON = "{\"name" + "\":\"" + name + "\"," + "\"age"
                + "\":" + age + "}";
        System.out.println(personJSON);
        response.getWriter().write(personJSON);
    }
 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        doGet(request, response);
 
    }
 
}