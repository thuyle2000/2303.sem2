<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
    <div class="container-fluid p-5 bg-primary text-white text-center">
        
    </div>

    <div class="container mt-5">
        <div class="row">
            <div class="col-sm-4">
                <h3>Sign-in</h3>
                <form action="d06_login_action.php" method="get" >
                    <div class="mb-3 mt-3">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" placeholder="Enter email" 
                        name="email" value="abc@123.com" required>
                    </div>
                    <div class="mb-3">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" id="pwd" placeholder="Enter password" 
                        name="pwd" value="123" required>
                    </div>
                    
                    <button type="submit" class="btn btn-danger" name="submit">Submit</button>
                </form>

            </div>

        </div>
    </div>
</body>

</html>