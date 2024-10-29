<%-- 
    Document   : Register
    Created on : Oct 19, 2024, 12:55:27 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Registration Form</title>
        <!---Custom CSS File--->
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif;
            }
            body{
                min-height: 100vh;
                width: 100%;
                background: #000000;
            }
            .container{
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%,-50%);
                max-width: 430px;
                width: 100%;
                background: #fff;
                border-radius: 7px;
                box-shadow: 0 5px 10px rgba(0,0,0,0.3);
            }
            .container .login{
                display: none; /* Đảm bảo form đăng nhập không hiển thị */
            }
            .container .form{
                padding: 2rem;
            }
            .form header{
                font-size: 2rem;
                font-weight: 500;
                text-align: center;
                margin-bottom: 1.5rem;
            }
            .form input{
                height: 60px;
                width: 100%;
                padding: 0 15px;
                font-size: 17px;
                margin-bottom: 1.3rem;
                border: 1px solid #ddd;
                border-radius: 6px;
                outline: none;
            }
            .form input:focus{
                box-shadow: 0 1px 0 rgba(0,0,0,0.2);
            }
            .form a{
                font-size: 16px;
                color: #009579;
                text-decoration: none;
            }
            .form a:hover{
                text-decoration: underline;
            }
            .form input.button{
                color: #fff;
                background: #000000;
                font-size: 1.2rem;
                font-weight: 500;
                letter-spacing: 1px;
                margin-top: 1.7rem;
                cursor: pointer;
                transition: 0.4s;
            }
            .form input.button:hover{
                background: #808080;
            }
            .signup{
                font-size: 17px;
                text-align: center;
            }
            .signup label{
                color: #009579;
                cursor: pointer;
            }
            .signup label:hover{
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="registration form">
                <header>Sign up</header>
                <form action="RegisterController">
                    <input type="text" placeholder="Create a username" name="username" required>
                    <input type="password" placeholder="Create a password" name="password" required>
                    <input type="password" placeholder="Confirm your password" required>
                    <input type="submit" class="button" value="Sign up">
                </form>
                <div class="signup">
                    <span class="signup">Already have an account?
                        <a href="Login.jsp">Login</a>
                    </span>
                </div>
            </div>
        </div>
    </body>
</html>
