<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Analyze your code by statements or variables or methods</title>
    </head>
  
    <body> 
        <div>
            <h3> Choose File to Upload in Server </h3>
            <form action="UploadFileServlet" method="post" enctype="multipart/form-data">
                <input type="file" name="uploadFile" />
                <br/>
                <input name = "submitBtn" type="submit" value="By Variable" />
                <input name = "submitBtn" type="submit" value="By Statement" />
                <input name = "submitBtn" type="submit" value="By Methods" />
            </form>          
        </div>
       
    </body>
</html>