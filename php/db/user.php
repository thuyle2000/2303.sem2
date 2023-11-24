<?php
declare (strict_types=1);

// dinh nghia model User, tuong ung bang tbUser
class User{
    public function __construct(
        public string $email = "0",
        public string $name = "nhat truong",
        public int $role = 1,
        public string $password = "123"
    )
    {
    }

    public function __toString()
    {
        return "$this->email, $this->name, $this->password, $this->role";
    }
}


include_once "myConnect.php";

class UserDAO{
    public static function get() {
        $cn = getConnect_obj();

        //goi lenh doc du lieu trong tbUser 
        $sql = "SELECT * FROM `tbuser`";
        $rs = $cn->query($sql);
        if($rs==false){
            die ("Error: ". $cn->error);
        }

        //doc het du lieu: luu vo mang '$a'
        $a  = $rs->fetch_all(MYSQLI_BOTH);
        
        //dong ket noi
        $cn->close();

        //tra ket qua cho chuong trinh goi ham
        return $a;
        
    }


    public static function getByEmail(string $email, string $password) {
        $cn = getConnect_obj();

        //goi lenh doc du lieu trong tbUser -> db server
        $sql = "SELECT * FROM `tbuser` WHERE `email` LIKE '$email' ";
        $rs = $cn->query($sql);

        if($rs==false){
            die ("Error: ". $cn->error);
        }

        //kiem tra tiep password
        $a = null;

        //kiem tra co tk nao trong he thong trung voi account dang nhap ko?
        if($rs->num_rows){
            $a  = $rs->fetch_array();
            if($a["password"] === $password) {
                return $a;
            }
        }
        
        //dong ket noi
        $cn->close();

        //tra ket qua cho chuong trinh goi ham
        return $a;
    }



    public static function create(User $obj){
        $cn = getConnect_obj();

        $sql = "INSERT INTO `tbUser` (`email`, `name`, `role`, `password`) VALUES ($obj->email, '$obj->name', $obj->role, $obj->password);";

        $r = $cn->execute_query($sql);

        $cn->close();

        return $r;
    }


    public static function delete(int $email) {
        $cn = getConnect_obj();
        $sql = "DELETE FROM `tbUser` WHERE `email` = $email";

        $r = $cn->execute_query($sql);
        $cn->close();

        return $r;
    }


    public static function update(User $obj){
        $cn = getConnect_obj();

        $sql = "UPDATE `tbUser` 
            SET `name`=$obj->name WHERE `email` LIKE $obj->email";

        $r = $cn->execute_query($sql);

        $cn->close();

        return $r;
    }
}



//test

// $a = UserDAO::getByemail(23);
// var_dump($a);
