<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .registration-form {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            width: 350px;
        }
        .registration-form h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        .registration-form label {
            display: block;
            font-size: 14px;
            margin-bottom: 5px;
            color: #555;
        }
        .registration-form input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }
        .registration-form button {
            width: 100%;
            padding: 10px;
            background: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        .registration-form button:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
    <div class="registration-form">
        <h2>Registration</h2>
        <form action="backLog" method="POST">
            <label for="id">Id</label>
            <input type="number" id="id" name="id" >

            <label for="accno">Account Number</label>
            <input type="number" id="accno" name="accno" >

            <label for="name">Full Name</label>
            <input type="text" id="name" name="name" >

            <label for="uname">Username</label>
            <input type="text" id="uname" name="uname" >
            
            <label for="balence">Balance</label>
            <input type="text" id="balence" name="balence" >

            <label for="pass">Password</label>
            <input type="password" id="pass" name="pass" >

            <label for="mobile">Mobile Number</label>
            <input type="tel" id="mobile" name="mobile"  >

            <label for="city">City</label>
            <input type="text" id="city" name="city" >

            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
