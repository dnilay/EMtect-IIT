<html>
<head>
    <title>Sample Form</title>
</head>
<body>
<h2>Soccer League Application</h2>
<hr/>
<h3>Add A New League</h3>
<form action="controller.do" method="post">
    Lague Title:<input type="text" name="title"><br/>
    League Season:<select name="season">
    <option value="Unknown">Select...</option>
    <option value="Summer">Summer</option>
    <option value="Winter">Winter</option>
    <option value="Autumn">Autumn</option>
                </select><br/>
    League Year:<input type="text" name="year"><br/>
    <input type="submit" value="Add A New League">

</form>
</body>
</html>