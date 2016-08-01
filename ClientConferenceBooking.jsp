<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Registration Page For The Attackers</title>

<link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script type='text/javascript'>
function openWin() {
    myWindow = window.open("http://localhost:8080/AttackerSite/AttackerIndex.jsp");   // Opens a new window
}
function openWin2() {
    myWindow = window.open("http://localhost:8080/AttackerSite/AttackerIndex.jsp?Mode=Secured");   // Opens a new window
}
</script>
</head>

<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="javascript:openWin();">XSS - Cross Site Scripting</a></li>
      <li class="active"><a href="javascript:openWin2();">XSS - With Secured Services</a></li>
    </ul>
  </div>
</nav>
<div class="container-fluid">
   		<div class="jumbotron">
			<h1>Application Security Awareness</h1>
			<p>
				This DEMO is just to provide an insight to some vulnerabilites and
				to some remedial measures . At <a
				href="https://www.owasp.org/index.php/Top_10_2013-Top_10" target="_blank">OWASP.org</a>
				I intent to put remedies of some of the attacks in here and use my webservices to consue it 
				with real life practice example, so that you can create our own
				website with low vulnerabilities .
			</p>
			<p>
				<a href="https://www.owasp.org/index.php/Top_10_2013-Top_10" target="_blank"
					class="btn btn-success btn-lg">Get started today - OWASP TOP 10</a>
			</p>
		</div>
   
</div>

	<form class="form-horizontal" Action="ZapClient" name="Registration"
		>
			<h1>An Application Security Page</h1>

		<div class="form-group has-success">
			<label class="col-xs-2 control-label" for="inputSuccess">URL - web address</label>
			<div class="col-xs-10">
				<input type="text" name="Url" id="Url" class="form-control"
					placeholder="Input with success">
			</div>
		</div>

			<div class="col-xs-offset-2 col-xs-10">
				<button type="submit" class="btn btn-primary">Test Vulnerabilities</button>
				<button type="submit" class="btn btn-primary">Reset</button>
			</div>
		</div>

	</form>
	<script src="Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
