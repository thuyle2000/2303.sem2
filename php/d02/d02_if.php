<?php
date_default_timezone_set("Asia/Ho_Chi_Minh");
echo "Current time is ".date("h:i:s a") . "\n";
$hour = date("H:i:s");

if($hour<12){
    echo "good morning";
}
else if($hour<16){
    echo "good afternoon";
}
else if ($hour<21){
    echo "good evening";
}
else{
    echo "good night";
}