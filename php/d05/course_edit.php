<?php
include_once("../db/course.php");
if (isset($_GET["id"]) == false) {
    die("FINISHED!");
}


$ms = intval($_GET["id"]);
$r = CourseDAO::getByID($ms);

if ($r == null) {
    header("location:course_index.php");
    exit();
}


?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>course-edit</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-sm-4">
                <h3>Edit Course</h3>
                <form action="" method="post">
                    <div class="mb-3 mt-3">
                        <label for="id">id : </label>
                        <input type="text" class="form-control" placeholder="Enter course name" id="id" name="id" value="<?php echo $r['id'] ?>" readonly>
                    </div>
                    <div class="mb-3 mt-3">
                        <label for="name">name : </label>
                        <input type="text" class="form-control" placeholder="Enter course name" id="name" name="name" value="<?php echo $r['name'] ?>" required>
                    </div>
                    <div class="mb-3">
                        <label for="year">start year : </label>
                        <input type="number" placeholder="Enter start year" class="form-control" id="year" name="year" value="<?php echo $r['year'] ?>" min="2000" max="2024" required>
                    </div>
                    <div class="mb-3">
                        <label for="fee">fee : </label>
                        <input type="number" placeholder="Enter fee" class="form-control" id="fee" name="fee" value="<?php echo $r['fee'] ?>" min="100" max="5000" required>
                    </div>
                    <hr>
                    <button type="submit" class="btn btn-danger" name="submit">Submit</button>

                    <button type="reset" class="btn btn-info">Reset</button>
                </form>

            </div>

        </div>



    </div>

</body>

</html>


<!-- doan code PHP nay se duoc thi hanh sau khi user bam [submit] -->
<?php


if (isset($_POST["submit"])) {
    //doc du lieu trong cac o name, year, fee duoc goi len server
    $ten = $_POST["name"];
    $nam = intval($_POST["year"]);
    $phi = intval($_POST["fee"]);

    $new_course = new Course(name: $ten, year: $nam, fee: $phi);

    $r = CourseDAO::create($new_course);

    if ($r == false) {
        echo "<h3>Error: Cannot create new course !</h3>";
    } else {
        header("location:course_index.php");
    }
}


?>