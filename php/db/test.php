<?php

include_once 'myConnect.php';

function test(){
    $cn = getConnect();

    //doc du lieu tu bang tbCourse
    $mysql = "select * from tbcourse";
    $rs = mysqli_query($cn, $mysql);
    if($rs){
        echo "<pre>";
        print_r(mysqli_fetch_all($rs));
        echo "</pre>";
    }
    
    mysqli_close($cn);
}

function test_obj(){
    echo "<h3>Test Object Connection</h3>";
    $cn = getConnect_obj();

    //doc du lieu tu bang tbCourse
    $mysql = "select * from tbcourse";
    // $rs = mysqli_query($cn, $mysql);
    $rs = $cn->query($mysql);

    if($rs){
        echo "<pre>";

        // print_r(mysqli_fetch_all($rs));
        print_r($rs->fetch_all());

        echo "</pre>";
    }
    
    mysqli_close($cn);
}

test_obj();
