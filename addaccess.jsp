<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body
        {
            background-image: url(https://media.licdn.com/dms/image/D4D12AQHceTnUZCgQCA/article-cover_image-shrink_720_1280/0/1685451751403?e=2147483647&v=beta&t=UZs1-48EhGRoNqucUsl4gytM1ARTUJByRMKtHSURlYA);
            background-repeat: no-repeat;
            background-size: 1500px 750px;
        }
        form
        {
            margin-top:250px;
            color: aqua;
            font-size: 25px;
            font-family: 'Courier New', Courier, monospace;
            animation-name: para;
            animation-duration: 3s;
            animation-timing-function: linear;
        }
        h1
        {
            font-size: 25px;
            color: red;
            margin-top: 150px;
            animation-name: para;
            animation-duration: 3s;
            animation-timing-function: linear;
            margin-left: 50px;
            font-family: 'Times New Roman', Times, serif;
            box-shadow: 5px 5px 10px white;
            display: inline-block;
        }
        #butt
        {
       		height: 50px;
            width: 100px;
            font-size: 25px;
            border-radius: 50px;
            background-color: rgb(255, 145, 0);
            color: white;
        }
        input
        {
            background-color: cyan;
            color: black;
            box-shadow: 5px 5px 10px white;
            display: inline-block;
            height: 25px;
            width: 250px;
        }

        @keyframes para {

            0%
            {
                margin-left: 1500px;
            }
            100%
            {
                margin-left: 50px;
            }
            
        }
    </style>
</head>
<body>
	 <h1>Enter the employee detail to grand access</h1>
    <form action="data" method="post">
        <label style=" margin-left: 50px;" for="id">id: </label>
        <input type="number" name="id"><br><br>
        <label style=" margin-left: 70px;" for="name">name: </label>
        <input type="text" name="name"><br><br>
        <label style=" margin-left: 80px;" for="email">email: </label>
        <input type="email" name="email"><br><br>
        <label style=" margin-left: 90px;" for="contact">contact: </label>
        <input type="number" name="contact"><br><br>
        <label style=" margin-left: 100px;" for="pasword">password: </label>
        <input type="password" name="password"><br><br>
         <label style=" margin-left: 101px;" for="code">Reference code: </label>
        <input type="password" name="code"><br><br>
        <input id="butt" style=" margin-left: 450px;" type="submit">
        </form>
</body>
</html>