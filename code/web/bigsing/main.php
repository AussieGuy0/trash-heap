<div class="content">
	<div class="left-col">
        <h2> WELCOME </h2>
	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc venenatis ex sit amet tortor posuere facilisis. Integer feugiat ligula in dolor finibus, in malesuada nisl convallis. Suspendisse malesuada accumsan dui eget sodales. Pellentesque ornare a turpis et facilisis. Morbi id egestas metus. Cras eget mauris nibh. Duis sit amet enim leo. Fusce suscipit ipsum nec sollicitudin mollis. Maecenas laoreet sem nec consequat posuere. Vestibulum eu iaculis velit. Praesent non tortor eget leo scelerisque tempor eget nec velit. Ut ac libero at augue gravida varius et scelerisque sapien. Curabitur at velit sit amet dolor porttitor eleifend. Vestibulum mollis commodo enim in pulvinar. </p>

 <p>Nunc faucibus mauris a lacinia porta. Cras sit amet mauris sit amet ipsum auctor porta eget eget lacus. Nulla elementum risus non congue vehicula. Aenean at aliquet nisi. Ut ultrices leo elit, nec interdum lacus tincidunt vitae. Praesent congue quis mi non volutpat. Etiam elementum semper lacus a iaculis. Ut vel magna purus. Sed nec interdum mauris. In augue sapien, luctus eget venenatis ut, vulputate lobortis metus. Nullam sit amet justo ultrices, hendrerit velit at, sodales quam. </p>
	</div>
	<div class="right-col">
        <h2> Featured Artist </h2>
        <?php
        $xml = simplexml_load_file('DataFiles/artists.xml');
        $numArtists = 0;
        foreach ($xml->artist as $artistElement) {
          $numArtists++;
        }
        $random = rand(0,$numArtists-1);
        $count = 0;
        foreach ($xml->artist as $artistElement) {
          if ($count == $random) {
          echo "<p><b>Name: </b>".$artistElement->name."</p>";
        echo "<p><b>Manager: </b>" .$artistElement->manager."<br></p>";
          echo "<p><b>Bio: </b>" .$artistElement->promo."<br></p>";

          break;
          } else {
            //donothing
          }
          $count++;
        }
         ?>
	</div>
</div>
