	<?php
	if (!isset($_POST["user"]) || !isset($_POST["pass"])) { ?>
<form action="" method="post">
	<h2> Login </h2>
	<label> Username: </label>
	<input id="user" name="user" placeholder="username" type="text">
	<label> Password: </label>
	<input id="pass" name="pass" placeholder="password" type="password">
	<input name="submit" type="submit" value="enter">
</form>

<?php }
else {
	if (!isset($_SESSION)) {
	session_start(); }
	$user = $_POST["user"];
	$pass = $_POST["pass"];
	if (checkPass($user,$pass)) {
		echo "Welcome back, ".$user."!";
		$_SESSION["user"] = $user;
		$_SESSION["pass"] = $pass;
		echo "<br> Redirecting back to home page in: 3 seconds";
		header("Refresh:3; url=index.php");
	} else {
		echo "Wrong username or password!";
	}
   }


function checkPass($login,$pass){
  /* Checks password hosted in the password file.
  */

  if(!$fd = fopen("DataFiles/passwords.txt","r")) return false;
       while(!feof($fd)){
       $line = trim(fgets($fd));
			 if (empty($line)) { //do nothing
			 }
			 else {
			 explode(",",$line);
       list($fileUser, $filePass) = explode(",",$line); //split line into user and password
       if ($login == $fileUser && md5($pass) == $filePass)
       {
        return true;
       }
		 }
     }
  fclose($fd);
  return false;
} ?>
