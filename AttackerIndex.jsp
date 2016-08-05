<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script language="JavaScript">
function ValidateText_processForm()
{
  var parameters = location.search.substring(1).split("&");
  var temp = parameters[0].split("=");
  l = unescape(temp[1]);
  if(l!="Secured")
	  {return true;}
 // alert(l); //Dialog with the text you put on the textbox
  var xhr = new XMLHttpRequest();
  var xhr2 = new XMLHttpRequest();
  
  xhr.open("GET", "http://localhost:8080/SecurityServices/rest/cfs/XmlConfig/", false);
  xhr.send();
  alert("The XSS Scripting Vulnerabilites taken care in web.xml \n" + "Please boot your system to see the change effected..\n"+ xhr.responseText);
    var Firstname =  document.getElementById("FirstName1");
  alert(Firstname.value);
  var fname = Firstname.value;
  fname = fname.replace(/\\/g, '');
  alert(fname);
  xhr2.open("GET", "http://localhost:8080/SecurityServices/rest/cfs/Pass1/"+fname, false);
  xhr2.overrideMimeType("text/plain; charset=x-user-defined");
  xhr2.send();
  alert(xhr2.responseText);
  //document.getElementById("FirstName1").value="";
  //document.getElementById("FirstName1").value=xhr2.responseText;
}

</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="jumbotron">
  <h1>Click Jacking</h1>      
  <p>Attackers are here to demonstrate Click Jacking</p>
</div>
<div class="container">
  <h2>Entry form</h2>
  <form class="form-horizontal" role="form" action="ShowResultinServer.jsp" method="POST">
  <fieldset class="form-group">
    <label for="">First Name</label>
    <input type="Fname" class="form-control" name="Fname1" id="FirstName1" placeholder="Enter First Name"/>
    	<script type="text/javascript">
			document.getElementById("FirstName1").onblur=ValidateText_processForm;
		</script>
    	
    <small class="text-muted">Confidentiality will be maintained.</small>
  </fieldset>
  <fieldset class="form-group">
    <label >Last Name</label>
    <input type="Lname" class="form-control" id="LastName1" placeholder="Enter Last Name">
    <small class="text-muted">Confidentiality will be maintained.</small>
  </fieldset>
  <fieldset class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </fieldset>
  <fieldset class="form-group">
	  <label for="exampleInputEmail1">Email address</label>
	    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
	    <small class="text-muted">We'll never share your email with anyone else.</small>
  </fieldset>
  		<div class="form-group">

			<div class="col-xs-offset-2 col-xs-10">
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="submit" class="btn btn-primary">Reset</button>
			</div>
		</div>
</form>
</div>
</body>
</html>