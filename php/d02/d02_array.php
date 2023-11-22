<?php
echo "examples for arrays \n";
echo "=============================\n";

//khai bao a la mang rong , chua co du lieu
$a = []; 
//vong lap khoi tao 1 so ngau nhien cho mang a
for ($i=0 ; $i<10  ; $i++) { 
    $a[$i] = rand(0,100);
}

print_r($a);
echo " * min(a[]) = " . min($a) . "\n";
echo " * max(a[]) = " . max($a) . "\n";


//khai bao b la mang ket hop, chua danh sach ma so, ho ten sinh vien
$ds = 
[
    "S1"=>"le min hoo",
    "S10"=>"le tan thanh",
    "S9"=> "nguyen hung",
    "S5"=>"tran khoa",
    "S8"=>"nguyen nhung",
    "S20"=> "nguyen luong"
];

print_r($ds);

echo "\n\n day so ngau nhien: ";
foreach ($a as $number) {
    printf("%d ", $number);
}

echo "\n\n danh sach sinh vien: \n";
foreach ($ds as $id => $name) {
    printf(" %6s : %s \n", $id, $name);
}
