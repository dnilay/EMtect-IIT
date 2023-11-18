<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Customer Form</title>
    <link rel='stylesheet' href='form-style.css' type='text/css' />
</head>
<body>
<div class="mail">
    <h2>Customer Management System</h2>
    <form name="form1" action="controller.do" onsubmit="required()">
        <ul>
          Enter Customer Name:  <li><input type='text' name ='t1'/></li>
            <li class="rq">*Required Field</li>
            <li><input type="submit" name="submit" value="Submit" /></li>
        </ul>
    </form>
</div>
<script>
    function required()
    {
        var empt = document.forms["form1"]["t1"].value;
        if (empt == "" || empt==null)
        {
            alert("Please input a Value");
           // return false;
        }
        else
        {
            alert('Code has accepted : you can try another');
            return true;
        }
    }


</script>
</body>
</html>
