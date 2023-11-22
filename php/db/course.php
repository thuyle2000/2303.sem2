<?php
declare (strict_types=1);

// dinh nghia model Course, tuong ung bang tbCourse
class Course{
    public function __construct(
        public int $id = 0,
        public string $name = "ACCP NEW",
        public int $year = 2023,
        public int $fee = 1200
    )
    {
        
    }

    public function __toString()
    {
        return printf("%d, %s, %d, %d", $this->id, $this->name, $this->year, $this->fee);
    }
}


include_once "myConnect.php";
class CourseDAO{
    public static function get() {
        $cn = getConnect_obj();

        //goi lenh doc du lieu trong tbCourse -> db server
        $sql = "SELECT * FROM `tbcourse`";
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


    public static function create(Course $obj){
        $cn = getConnect_obj();

        $sql = "INSERT INTO `tbcourse` (`id`, `name`, `year`, `fee`) VALUES (NULL, '$obj->name', $obj->year, $obj->fee);";

        $r = $cn->execute_query($sql);

        $cn->close();

        return $r;
    }


    public static function delete(int $id) {
        $cn = getConnect_obj();
        $sql = "DELETE FROM `tbcourse` WHERE `id` = $id";

        $r = $cn->execute_query($sql);
        $cn->close();

        return $r;
    }
}


