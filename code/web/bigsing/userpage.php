<h3> User page for  <?php echo $_SESSION["user"]; ?> </h3>
<?php

$userInfoLine = findUserInfo($_SESSION["user"]);
list($username,$name,$address,$email,$homephone,$mobile) = explode(':',$userInfoLine);
echo "<p>Name: ".$name. "</p>";
echo "<p>Address: ".$address."</p>";
echo "<p>Email: ".$email."<br></p>";
echo "<p>Homephone: ".$homephone."<br></p>";
if (!empty($mobile)) {
echo "<p>Mobile: ".$mobile."</p>"; }



function findUserInfo($username){
if (!$file = fopen("DataFiles/userinfomation.txt",'r')) return false;
while (!feof($file)) {
  $line = trim(fgets($file));
  $fileUser = substr($line,0,strpos($line,':'));
  if ($fileUser == $username) {
    return $line;
  }
}
} ?>
