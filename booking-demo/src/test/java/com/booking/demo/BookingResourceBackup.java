package com.booking.demo;
//package com.booking.demo;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.StringWriter;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.FormParam;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//
//@Path("/jobs")
//public class BookingResource {
//
//	//	@POST
//	//	@Produces(MediaType.APPLICATION_JSON)
//	//	public Response addJob() {
//	//		
//	//		Map<String,Object> map = new HashMap<String,Object>();
//	//		map.put("resp_json_data", "mock-up Booking Successful!");
//	//		
//	//	//	results = model.getResults(data);
//	//		StringWriter writer = new StringWriter();
//	//		JsonDataWriter jsonWriter = new JsonDataWriter();
//	//		try {
//	//			//jsonWriter.writeOne(results, writer);
//	//			
//	//			jsonWriter.writeOne(map, writer);
//	//		} catch (IOException e) {
//	//			// TODO Auto-generated catch block
//	//			e.printStackTrace();
//	//		}
//	//
//	//		String str = writer.toString();
//	//		System.out.println(str);
//	//		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).entity(str).build();
//	//
//	//		
//	//	}
//
//
//	@POST  
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)  //接受的参数类型为表单信息  
//	@Produces({MediaType.APPLICATION_JSON}) //返回的数据类型为JSON类型  
//	public String addJob(@FormParam("username") String username,@FormParam("pwd") String pwd) 		//接受了两个表单参数；
//	{	
//		System.out.println("username:");
//		System.out.println(username);
//		String result =username;    
//		return result;  
//		//    return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).entity(str).build();
//	}
//
//
//	
//	
//
//	//	public Response addJob(@Context Request req) {
//	//		
//	//		
//	//		//MultivaluedMap<String, String> queryParams = ui.getQueryParameters();  
//	//		MappingData map1 = req.getMappingData();
//	//		
//	//		String strTemp = map1.toString();
//	//		
//	//		
//	//	//	String strTemp = request.getParameter("req_json_data");
//	//		System.out.println(strTemp);
//	//		Map<String, Object> map = new HashMap<String,Object>();
//	//		map.put("resp_json_data", "Test hardcoding post method Successful");
//	//	//	map.put("resp_json_data", request.getParameter("req_json_data"));
//	//		
//	//	//	results = model.getResults(data);
//	//		StringWriter writer = new StringWriter();
//	//		JsonDataWriter jsonWriter = new JsonDataWriter();
//	//		try {
//	//			//jsonWriter.writeOne(results, writer);
//	//			
//	//			jsonWriter.writeOne(map, writer);
//	//		} catch (IOException e) {
//	//			// TODO Auto-generated catch block
//	//			e.printStackTrace();
//	//		}
//	//
//	//		String str = writer.toString();
//	//		System.out.println(str);
//	//		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).entity(str).build();
//	//		
//
//
//
//	//}
//
//	@GET
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getJob() {
//
//		return Response.status(200).header("Content-Type", MediaType.APPLICATION_JSON).build();
//
//	}
//}
//
