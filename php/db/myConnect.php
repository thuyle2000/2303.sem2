<?php

// $host = "localhost:3306";
// $username = "root";
// $password = "";
// $dbName = "db2303.m0";

function getConnect(
    $host = "localhost:3306",
    $username = "root",
    $password = "",
    $dbName = "db2303.m0"
) {
    $cn = mysqli_connect($host, $username, $password, $dbName);

    if ($cn == null) {
        die("<h3>Cannot connect to Database $dbName !</h3>" . mysqli_connect_error());
    }

    return $cn;
}


function getConnect_obj(
    $host = "localhost:3306",
    $username = "root",
    $password = "",
    $dbName = "db2303.m0"
) {
    $cn = new mysqli($host, $username, $password, $dbName);

    if ($cn == null) {
        die("<h3>Cannot connect to Database $dbName !</h3>" . 
        $cn->connect_error );
    }

    return $cn;
}
