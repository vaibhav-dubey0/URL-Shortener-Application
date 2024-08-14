<!DOCTYPE html>
<html>
<head>
    <title>Link Shortener</title>
</head>
<body>
    <h1>Link Shortener</h1>
    <form action="/shorten" method="post">
        <label for="longUrl">Enter the long URL:</label><br>
        <input type="text" id="longUrl" name="longUrl" required><br><br>
        <input type="submit" value="Shorten">
    </form>

    <form action="/expand" method="post">
        <label for="shortUrl">Enter the short URL:</label><br>
        <input type="text" id="shortUrl" name="shortUrl" required><br><br>
        <input type="submit" value="Expand">
    </form>
</body>
</html>



