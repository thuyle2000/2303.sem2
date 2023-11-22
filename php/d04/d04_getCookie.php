<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="refresh" content="10" >
    <title>get-cookie</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <style>
        div.cirle {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            background-color: antiquewhite;
        }
    </style>
</head>

<body>
    <div class="container">
        <h2>Cookies Demo</h2>
        <hr>
        <?php
        $mau = 'antiquewhite';
        if (isset($_COOKIE['color'])) {
            $mau = $_COOKIE['color'];
        }
        echo "<div class='cirle' style='background-color:$mau;'></div>";
        ?>

        
    </div>
</body>

</html>