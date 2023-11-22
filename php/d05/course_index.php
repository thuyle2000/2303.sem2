<?php
include_once "../db/course.php";

if(isset($_GET["id"])){
    //link remove da duoc click
    $ms = intval($_GET["id"]);
    $r = CourseDAO::delete($ms);
    if($r==false){
        echo "javascript: alert('cannot delete course !')";
    }
}

//doc du lieu trong bang tbcourse ->bien $ds
$ds = CourseDAO::get();
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>course</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
    <div class="container">
        <h3>Course List</h3>
        <p><a href="course_create.php">Create New Course</a></p>
        <hr>
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th>id</th>
                    <th>course name</th>
                    <th>start year</th>
                    <th>fee </th>
                    <th>action</th>
                </tr>
            </thead>

            <tbody>
                <?php
                foreach ($ds as $item) {
                    $s = "<tr> 
                    <td>{$item['id']}</td>
                    <td>{$item['name']}</td>
                    <td>{$item['year']}</td>
                    <td>{$item['fee']}</td>
                    <td>
                    <a href='course_edit.php?id=".$item['id']. "'>Edit</a> |
                    <a href='course_index.php?id=".$item['id']. "' onclick='return yesno()'>Remove</a>
                    </td>
                    </tr>";
                    echo $s;
                }
                ?>
            </tbody>

        </table>
    </div>
    <script>
        function yesno(){
            return confirm("are u sure ?")
        }
    </script>
</body>

</html>

