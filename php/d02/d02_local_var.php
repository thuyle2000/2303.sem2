<?php
echo "example local variable \n";

function fn_factorial($n=5){
    $r = 1;
    for ($i=2; $i<=$n ; $i++) { 
        $r *= $i;
    }
    printf(" %d! = %d \n", $n, $r );
}

fn_factorial();
fn_factorial(9);
$n = 10;
fn_factorial($n);

printf(" Giai thua cua $n = %d \n", $r ); // ==> loi !