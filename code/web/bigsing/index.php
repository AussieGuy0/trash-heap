<?php
if (!isset($_SESSION)) {
session_start(); }?>
<html>
<head>
<title> Big Sing Homepage </title>
<link rel="stylesheet" type=text/css  href="style.css">
</head>

<body>
<div class="main">
	<div class = "title">
			Big Sing 
	</div>
	<div class="menu">
		<a href="index.php">Home</a> | <a href="index.php?k=performances"> Performances </a>| <a href="index.php?k=artists"> Artists </a> | <a href="index.php?k=venues">Venues</a>
		<?php if(!isset($_SESSION["user"])) { ?>
		<div class="members"> <span id="login"> <a href="index.php?k=login"> Login</span></a> | <a href="index.php?k=signup"> Signup </a> </div>
		<?php } else { ?>
		<div class="members"> <a href="index.php?k=userpage"> User Page </a> | <a href = "index.php?k=logout">Logout</a></div>
			<?php } ?>
	</div>
<?php if(isset($_GET['k'])) {
	$k = $_GET['k'];
	if ($k == "login") {
		include("login.php");
} else if ($k == "logout") {
	unset($_SESSION["user"]);
	unset($_SESSION["pass"]);
	echo "Successfully signed out!";
	$_SESSION["refresh"] = false;
	header("Refresh:1; url=index.php");
	include_once("main.php");
} else if ($k == "artists") {
	include_once("artists.php");
} else if ($k == "performances") {
	include("performances.php");
} else if ($k == "userpage") {
	include("userpage.php");
} else if ($k == "venues") {
	include("venues.php");
} else if ($k == "signup") {
	include("signup.php");
}
}else {
	include_once("main.php");
} ?>
</div>
</body>
<footer>
&copy 2015 Anthony Bruno. All rights reserved.
</footer>

</html>
