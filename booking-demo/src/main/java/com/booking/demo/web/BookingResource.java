package com.booking.demo.web;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/jobs")
public class BookingResource {

	@POST  
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	@Produces({MediaType.APPLICATION_JSON})
	public String addJob(@FormParam("username") String username,@FormParam("pwd") String pwd) throws IOException 	
	{	
		System.out.println("username:");
		System.out.println(username);
		System.out.println("pwd:");
		System.out.println(pwd);
		String result =username+" "+pwd;  
		System.out.println("result: " + result);
		byte[] buff=new byte[]{};  
		FileOutputStream out = null;
		try   
        {   
            buff=result.getBytes();  
            out=new FileOutputStream("/WorkSpace/Neusoft/practice/booking-demo/output/result.txt", true);  
            out.write(buff,0,buff.length); 
            out.write("\r\n".getBytes());// 写入一个换行  
              
        }   
		catch (Exception e) {     
            e.printStackTrace();     
        } finally {     
            try {     
                if(out != null){  
                    out.close();     
                }  
            } catch (IOException e) {     
                e.printStackTrace();     
            }   
        }   
	
			
	
        
		
		return result;  
		//    return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).entity(str).build();
	}


	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJob() {

		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).build();

	}
}

