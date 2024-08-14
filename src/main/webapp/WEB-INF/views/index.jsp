<!DOCTYPE html>
<html>
<head>
    <title>Link Shortener</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Link Shortener</h1>
        <form action="/shorten" method="post">
            <label for="longUrl">Enter the long URL:</label>
            <input type="text" id="longUrl" name="longUrl" required>
            <input type="submit" value="Shorten">
        </form>

        <form action="/expand" method="post">
            <label for="shortUrl">Enter the short URL:</label>
            <input type="text" id="shortUrl" name="shortUrl" required>
            <input type="submit" value="Expand">
        </form>
    </div>
</body>
</html>




