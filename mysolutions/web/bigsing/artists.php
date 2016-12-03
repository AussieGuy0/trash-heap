<?php
//$file = file_get_contents('DataFiles/artists.xml');
$xml = simplexml_load_file('DataFiles/artists.xml');


 ?>
 <br>
 <table>
   <thead>
     <caption> List of Artists </caption>
     <tr>
       <th> No. </th>
       <th> Name </th>
       <th> Status </th>
       <th> Manager </th>
       <th> Performers </th>
     </tr>
   </thead>
   <tbody>
<?php foreach ($xml->artist as $artistElement) { ?>
  <tr>
    <td> <?php echo $artistElement->number; ?> </td>
    <td> <?php echo $artistElement->name; ?> </td>
    <td> <?php echo $artistElement->status; ?> </td>
    <td> <?php echo $artistElement->manager; ?> </td>
    <td> <?php foreach ($artistElement->performer as $performer) {
      echo $performer.", "; } ?> </td>
  </tr>
<?php } ?>
</tbody>
<table>
