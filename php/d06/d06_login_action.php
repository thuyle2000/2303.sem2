<!-- day la trang doc du lieu tren form dang nhap cua page [d03_login.php] va xu ly -->

<?php
include_once "../db/myConnect.php";
include_once "../db/user.php";

// error_reporting(0);
if (isset($_REQUEST["submit"]) == false) {
    //neu chua thuc hien dang nhap -> quay ve trang logon
    header("location:d06_login.php");
    exit;
}
//doc du lieu nhap trong o email
$email = $_REQUEST["email"];

//doc du lieu nhap trong o password
$pwd = $_REQUEST["pwd"];

//kiem tra TK dang nhap co hop le ko ?
$acc = UserDAO::getByEmail($email, $pwd);

if($acc != null){
    //lay password cua tai khoan trong danh sach $acc so sanh voi password dang nhap [$pwd]
    if($acc["password"] == $pwd){
        echo "<h4>Welcome to Our WEBSITE !</h4>";
    }
    else{
        echo "<h4>Error: Invalid email or password !</h4>";
        echo "<a href='javascript:history.back();'>Plz re-login !</a>";
    }
}
else{
    echo "<h4>Error: Invalid email or password !</h4>";
        echo "<a href='javascript:history.back();'>Plz re-login !</a>";
    }






?>