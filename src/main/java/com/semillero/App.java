package com.semillero;

import javax.servlet.Servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.semillero.controladores.HolaMundo;
import com.semillero.controladores.PersonaController;

public class App 
{
    public static void main( String[] args )
    {
        Server server = new Server(8080);
        server.setHandler(new DefaultHandler());

        ServletContextHandler context = new ServletContextHandler();

        context.setContextPath("/");
        // context.addServlet(HolaMundo.class, "/hola/*");
        context.addServlet(PersonaController.class, "/persona/*");

        server.setHandler(context);

        try{
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
