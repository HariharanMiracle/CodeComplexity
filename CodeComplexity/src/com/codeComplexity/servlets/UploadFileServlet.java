package com.codeComplexity.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.codeComplexity.model.FileToAnalyze;
import com.codeComplexity.model.SingleLineStatement;
import com.codeComplexity.service.ComplexitySizeService;
import com.codeComplexity.service.ReadFileService;

/**
 * Servlet implementation class UploadFileServlet
 */
@WebServlet("/UploadFileServlet")
@MultipartConfig(maxFileSize = 16177215) 
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("working...");
        
		try {
			String submitBtn = request.getParameter("submitBtn");
			
			
			InputStream inputStream = null; // input stream of the upload file
	         
	        // obtains the upload file part in this multipart request
	        Part filePart = request.getPart("uploadFile");
	        if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	        }

		   	//creating an InputSreamRteader object
		   	InputStreamReader isReader = new InputStreamReader(inputStream);
		 
		   	BufferedReader reader = new BufferedReader(isReader);
		   	StringBuffer sb = new StringBuffer();
		   	String str;
		      
		   	while((str = reader.readLine())!= null){
		   		sb.append(str);
	    	}
		   	
		   	System.out.println(sb.toString());
		   	byte[] byteArray = sb.toString().getBytes();
		   	
		   	System.out.println("Bytes array : " + byteArray);
		   	String str1 = new String(byteArray);
		   	System.out.println("String : " + str1);
		   	
		   	FileToAnalyze fileToAnalyze = new FileToAnalyze();
		   	fileToAnalyze.setFile(byteArray);
		   	fileToAnalyze.setFileName(filePart.getName());
			
		   	ReadFileService readFileService = new ReadFileService();
		   	
			if ("By Variable".equals(submitBtn)) {
			    System.out.println("Variable");
			    
			    
			    
			    
			    
			    
			    
			    
			} else if ("By Statement".equals(submitBtn)) {
			    System.out.println("Statement");
			    
			    List<SingleLineStatement> singleLines = readFileService.readFile(fileToAnalyze);
			    ComplexitySizeService complexitySizeService = new ComplexitySizeService();
			    singleLines = complexitySizeService.calculateComplexityDueToStatmentSize(singleLines);
			    request.setAttribute("statementList", singleLines);
			    request.getRequestDispatcher("resultStatement.jsp").forward(request, response);

			} else if ("By Methods".equals(submitBtn)) {
			    System.out.println("Methods");
			     
			    
			    
			    
			    
			    
			}
			else {
			    System.out.println("Error");
			    
			    
			    
			    
			    
			    
			    
			}
			
			
		   	
//		   	request.setAttribute("fileToAnalyze", fileToAnalyze);
//		   	request.getRequestDispatcher("analyze.jsp").forward(request, response);
		}
		catch(Exception e) {
			System.out.println("Exception => UploadFileServlet");
			e.printStackTrace();
			
			request.setAttribute("msg", "Error Uploading");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
