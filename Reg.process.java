<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Form</title>
</head>
<body>
    <form action="registration_process.php" method="POST" enctype="multipart/form-data">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="confirm_password">Confirm Password:</label>
        <input type="password" id="confirm_password" name="confirm_password" required><br>

        <label for="dob">Date of Birth:</label>
        <input type="text" id="dob" name="dob" placeholder="dd/mm/yyyy" required><br>

        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select><br>

        <label for="photo">Insert your photo:</label>
        <input type="file" id="photo" name="photo"><br>

        <label for="resume">Insert your resume:</label>
        <input type="file" id="resume" name="resume"><br>

        <label for="security_question">Security Question:</label>
        <select id="security_question" name="security_question" required>
            <option value="1">What is your pet's name?</option>
            <option value="2">What city were you born in?</option>
            <option value="3">What is your mother's maiden name?</option>
        </select><br>

        <input type="checkbox" id="terms" name="terms" required>
        <label for="terms">I agree to the terms and conditions</label><br>

        <input type="submit" value="Register">
    </form>
</body>
</html>