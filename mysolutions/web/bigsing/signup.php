<h3> Signup form </h3>
<?php if (!isset($_POST["username"])) { ?>
<form method = 'POST' name='signupform'>
<label> Username: </label> <input TYPE = "text" name="username" required> <br>
<label> Password: </label><input TYPE = "password" name="password" required> <br>
<label> First Name: </label><input TYPE = "text" name="firstname" required> <br>
<label> Email: </label><input TYPE = "text" name="email" required> <br>
<label> Home Address:</label> <input TYPE = "text" name="homeaddress" required> <br>
<label> Homephone:</label> <input TYPE = "text" name="homephone" required> <br>
<label> Mobilephone:</label> <input TYPE = "text" name="mobiles"> <br>
<input type="submit" name="register">
</form>
<?php } else {
  $_POST["password"] = md5($_POST["password"]);
 $passwordsLine = $_POST["username"].",".$_POST["password"];
 if (isset($_POST["mobiles"])) {
 $userinfomationLine = $_POST["username"].":".$_POST["firstname"].":".$_POST["email"].":".$_POST["homeaddress"].":".$_POST["homephone"].":".$_POST["mobiles"];
 } else {
 $userinfomationLine = $_POST["username"].":".$_POST["firstname"].":".$_POST["email"].":".$_POST["homeaddress"].":".$_POST["homephone"].":";
 }
 $pFile = "DataFiles/passwords.txt";
 $uFile = "DataFiles/userinfomation.txt";
 file_put_contents($pFile, $passwordsLine, FILE_APPEND);
 file_put_contents($uFile, $userinfomationLine, FILE_APPEND);
 echo "Created account! Please login";
} ?>
