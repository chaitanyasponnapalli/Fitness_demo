<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Personal Fitness Simulator</title>
    </head>
    <body>
    	<form action="./user/processLogin.htm" method="POST">
        <header>
            <nav>                
                <div class="hero-text-box">
                    <h1 style="text-align:center">Gold Gym Fitness Center</h1>
                    <div class="table1">
                        <table align="center">
                            <tr>
                                <td><label for="email" class="l1"><font color="black">Email</font></label></td>
                                <td><input type="text" name="email" style="width:200px;"></td>
                            </tr>
                            <tr>
                                <td><label for="password" class="l1"><font color="black">Password</font></label></td>
                                <td><input type="password" name="password" style="width:200px;"></td>
                            </tr>
                            <tr>
                            	<td colspan="2" style="text-align:center"><input type="submit" value="Login"></td>
                            </tr>
                        </table>
                        </div>                    
                </div>
            </nav>            
        </header>        
    </body>
</html>