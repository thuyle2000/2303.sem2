<?php
echo "Example Constructor Property Promotion \n";

//version PHP 7.0
class Student{
    public String $id, $name;
    public float $mark;

    //ham dung
    public function __construct($ma='S01', $ten='Truong', $diem=70.89)
    {
        $this->id = $ma;
        $this->name = $ten;
        $this->mark = $diem;
    }

    public function __toString()
    {
        return "[ id: $this->id,  ten: $this->name, diem: $this->mark ]";
    }
}

$sv1 = new Student;
echo "sinh vien 1: $sv1 \n";
$sv2 = new Student('S02', 'Anh Tuan', 97.28);
echo "sinh vien 2: $sv2 \n";
$sv3 = new Student(ma:'S03', diem:45.89, ten:'hung');
echo "sinh vien 3: $sv3 \n";



//PHP version 8.0
class Member{
    public function __construct(
        public String $id="M01",
        public String $name = "Le min Hoo",
        public bool $active = true
    )
    {
        
    }  
    public function __toString()
    {
        return "[ id: $this->id,  ten: $this->name, active: $this->active ]";
    }
    
}

$m1 = new Member;
echo "thanh vien 1: $m1 \n";
$m2 = new Member('M02', 'Ngoc hung', false);
echo "thanh vien 2: $m2 \n";
$m3 = new Member(id:'M03', active:true, name:'Anh Khoa');
echo "thanh vien 3: $m3 \n";