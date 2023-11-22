<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>set-cookie</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
    <div class="container">
        <h2>Cookie demo</h2>
        <hr>
        <form action="" name="formColor">
            <label for="">Choose color:</label> <br>
            <select name="color" id="color">
                <option value="red">red</option>
                <option value="green">green</option>
                <option value="blue">blue</option>
                <option value="yellow">yellow</option>
                <option value="orange">orange</option>
            </select> <br> <br>

            <button type="submit" name="btnOK" class="btn btn-danger">submit</button>
        </form>

        <?php
            // doan code PHP nay chi chay khi form duoc submit
            if(isset($_REQUEST["btnOK"])){
                //lay gia tri cua o chon mau
                $mau = $_REQUEST["color"];

                //tao bien cookie chua mau duoc chon, hoat dong trong vong 1 phut
                setcookie("color",$mau, time()+20);

                header("location:d04_getCookie.php");
            }
        ?>

    </div>

</body>

</html>

