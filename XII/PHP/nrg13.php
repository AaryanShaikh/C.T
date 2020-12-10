<?php
	$a=0;
	$b=1;
	echo "the first 10 fibonacci numbers are<br>";
	echo "$a<br>";
	echo "$b<br>";
	$i=1;
	while($i<=8)
	{
		$c=$a+$b;
		echo "$c<br>";
		$a=$b;
		$b=$c;
		$i++;
	}
	?>
	

		the first 10 fibonacci numbers are
		0
		1
		1
		2
		3
		5
		8
		13
		21
		34
