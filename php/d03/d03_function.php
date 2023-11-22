<?php
declare (strict_types=0);

function div(int $a=100, int $b=3): int{
    return  intdiv($a, $b);
}

$x=215; $y=13;
$z=23.456;
echo "x = $x, y = $y, z=$z \n";
echo "div(x, y) = ". div($x, $y) . "\n";
echo "div() = " . div() . "\n";
echo "div(b:30, a:259) = " . div(b:30, a:259) . "\n";
echo "div(x, z) = ". div($x, $z) . "\n";

