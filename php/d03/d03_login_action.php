<!-- day la trang doc du lieu tren form dang nhap cua page [d03_login.php] va xu ly -->

<?php
// error_reporting(0);
if (isset($_REQUEST["submit"]) == false) {
    //neu chua thuc hien dang nhap -> quay ve trang logon
    header("location:d03_login.php");
    exit;
}
//doc du lieu nhap trong o email
$email = $_REQUEST["email"];

//doc du lieu nhap trong o password
$pwd = $_REQUEST["pwd"];

//kiem tra TK dang nhap co hop le ko ?
$acc = [
    "abc@gmail.com" => "123",
    "aptech@gfpt.edu.vn" => "abc",
    "student@fpt.edu.vn" => "123",
    "guest@gmail.com" => "guest"
];

if(array_key_exists($email,$acc)){
    //lay password cua tai khoan trong danh sach $acc so sanh voi password dang nhap [$pwd]
    if($acc[$email] == $pwd){
        echo "<h4>Welcome to Our WEBSITE !</h4>";
    }
    else{
        echo "<h4>Error: Invalid password !</h4>";
        echo "<a href='javascript:history.back();'>Plz re-login !</a>";
    }
}
else{
    echo "<h4>Error: Invalid email !</h4>";
    echo "<a href='javascript:history.back();'>Plz re-login !</a>";
}




?>