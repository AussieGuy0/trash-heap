<h2> Search Performances </h2>
<?php
if (!isset($_GET['artist']) || !isset($_GET['venue'])) { ?>
<form method="GET" name="searchForm" /*ACTION = "<?php echo "$self" ?>" */>
  <input type = "hidden" name="k" value="performances">
  <label> Artist: </label> <input TYPE="text" id="art" name="artist">
  <br>
  <label> Venue: </label> <input TYPE="text" id="ven" name="venue">
  <input TYPE="SUBMIT" VALUE="Find">
</form>
<?php } else {
  $final = [];
if (($_GET['artist']) !== "" && $_GET['venue'] != "") {
  $artist = $_GET['artist'];
  $venue = $_GET['venue'];
  $artistLines = getMatchedLines($artist, "artist");
  $venueLines = getMatchedLines($venue, "venue");
  $final = array_intersect($artistLines, $venueLines);
  echo "<p>Searched using terms:<br> Artist: $artist <br> Venue: $venue </p>";
} else if ($_GET['artist'] != "") {
  $artist = $_GET['artist'];
  $artistLines = getMatchedLines($artist,"artist");
  $final = $artistLines;
  echo "<p>Searched using terms:<br> Artist: $artist</p>";
} else if ($_GET['venue'] != "") {
  $venue = $_GET['venue'];
  $venueLines = getMatchedLines($venue,"venue");
  $final = $venueLines;
  echo "<p>Searched using terms:<br> Venue: $venue</p>";
} else {
  echo "<p>Didn't search with anything! </p>";
}
  echo "<table>
  <tr>
  <th> Code </th>
  <th> Artist </th>
  <th> Time and Date </th>
  <th> Duration </th>
  <th> Classification </th>
  </tr>";
  for ($i = 0; $i < count($final); $i++) {
    $split = explode(":",$final[$i]);
    echo "<tr>";
    $count = 0;
    foreach ($split as $element) {
      echo "<td>";
      echo $element;
      if ($count == 4) {
         if ($element == 'G'){
           echo " BUY";
         }
         if ($element == 'X' && isset($_SESSION['user']) ) {
            echo " BUY";
         }
         if ($element == 'S' && isset($_SESSION['user'])) {
           echo " REQUEST";
         }
      }
      echo "</td>";
      $count++;
    }
    $count = 0;
    echo "</tr>";
  }
  echo "</table>";
  if (empty($final)) {
    echo "<br>No results found with those search terms!";
  }
}

function getMatchedLines($name, $option) {
  $output = array();
  $name = strtolower($name);
  if ($option == "venue"){
   $name = convertVenueToCode($name);
   $option = "code";
  }
  if (!$file = fopen("DataFiles/performances.txt",'r')) return false;
  while (!feof($file)) {
    $line = trim(fgets($file));
    if ($line == "") {
      //do nothing
    }
    else {
      $lineEntity = explodeLine($line, $option);
      if (strpos($lineEntity,$name) !== false) {
        array_push($output,$line);
      }
    }
  }
  fclose($file);
  return $output;
}
function explodeLine($line, $option){
  list($code,$fileArtist,$timedate,$duration,$classification) = explode(':',$line);
  switch($option) {
    case "code":
        return substr($code,0,2);
        break;
    case "artist":
        return $fileArtist;
        break;
    case "timedate":
        return $timedate;
        break;
    case "duration":
        return $duration;
        break;
    case "class":
        return $duration;
        break;
    default:
        return "How'd you end up here?";
        break;
  }
}

function convertVenueToCode($venue) {
  $venues = ["fowlers live", "the gov", "thebarton theatre", "hq"];
  $venueCode = ["FL","TG","TT","HQ"];
  $pointer = array_search($venue,$venues);
  if ($pointer != false || $pointer == 0 ) {
    $code = $venueCode[$pointer];
  } else {
    $code = "wrong";
  }
  return $code;
}
?>
