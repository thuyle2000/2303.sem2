<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>php-intro</title>
</head>
<body>
    <h2>PHP Demo</h2>
    <hr>
    <?php
        echo "Hello, PHP is running with HTML.<br/>";
        echo "<ol>";
        for ($i=0; $i < 10; $i++) { 
            echo "<li> How r u today ? </li>";
        }
        echo "</ol>";
    ?>
</body>
</html>