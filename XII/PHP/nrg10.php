<?php
	$a=2;
	$b=100;
	echo "the prime numbers between $a and $b are<br>";
	$i=$a;
	while($i<=$b)
	{
		$flag=0;
		$j=2;
		while($j<$i)
		{
			$r=$i%$j;
			if($r==0)
			{
				$flag=1;
			}
			$j++;
		}
		if($flag==0)
		{
			echo "$i<br>";
		}
		$i++;
	}
	?>
		
		the prime numbers between 2 and 100 are
		2
		3
		5
		7
		11
		13
		17
		19
		23
		29
		31
		37
		41
		43
		47
		53
		59
		61
		67
		71
		73
		79
		83
		89
		97
