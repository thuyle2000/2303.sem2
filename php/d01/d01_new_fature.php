<?php
echo "Example Function With Named Arguments \n";
function add($n1 = 100, $n2 =200){
    $tong = $n1 + $n2;
    echo $n1 . " + " . $n2 . " = " . $tong . "\n";
}

add();
add(200, 300);
add(15);
add(n2:45, n1:490);
add(n2:500);
$a = 20; $b = 80;
add($a, $b);
add(n2:$a, n1:$b);
