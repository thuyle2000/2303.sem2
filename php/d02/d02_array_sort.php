<?php
echo "examples for arrays sort \n";
echo "=============================\n";

//khai bao a la mang rong , chua co du lieu
$a = [];
//vong lap khoi tao 1 so ngau nhien cho mang a
for ($i = 0; $i < 10; $i++) {
    $a[$i] = rand(0, 100);
}

print_array($a, false);

sort($a);
echo "\n after sort: ";
print_array($a, false);

rsort($a);
echo "\n after reversed sort: ";
print_array($a, false);

//khai bao b la mang ket hop, chua danh sach ma so, ho ten sinh vien
$ds =
    [
        "S1" => "le min hoo",
        "S10" => "le tan thanh",
        "S9" => "nguyen hung",
        "S5" => "tran khoa",
        "S8" => "nguyen nhung",
        "S20" => "nguyen luong"
    ];

echo "\n\n danh sach sinh vien: \n";
foreach ($ds as $id => $name) {
    printf(" %6s : %s \n", $id, $name);
}

ksort($ds);
echo "\n after sort by id: ";
print_array($ds, true);

arsort($ds);
echo "\n after sort by name: ";
print_array($ds, true);

function print_array($a, $associate)
{
    echo "\n";
    if ($associate) {
        foreach ($a as $key => $value) {
            printf ("%-5s: %s \n",$key,$value);
        }
    }
    else{
        foreach ($a as $value) {
            echo "$value, ";
        }
    }
}
