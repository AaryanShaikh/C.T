<?php
	$n=15;
	echo "$n<br>";
	$n1=$n;
	$a=$n%10;
	$n=$n/10;
	$b=$n%10;
	$n=$n/10;
	$c=($a*$a*$a)+($b*$b*$b)+($n*$n*$n);
	if($c==$n1)
		echo "number is an armstrong no";
	else
		echo "number is not an armstrong no";
	?>
	
	15
	number is not an armstrong no