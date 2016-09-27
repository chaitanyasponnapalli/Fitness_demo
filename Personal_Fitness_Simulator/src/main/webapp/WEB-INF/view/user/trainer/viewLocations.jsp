<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<script src="js/jquery-1.10.1.js" type="text/javascript"></script>
<link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<style>
	.ui-widget-header,.ui-state-default, ui-button{
	   background:#b9cd6d;
	   border: 1px solid #b9cd6d;
	   color: #FFFFFF;
	   font-weight: bold;
	}
</style>

<script type="text/javascript">
	var myWindow;
	function openAddSchedule(userId){
		$("#mydiv").dialog({autoOpen:false,
			buttons:{
				Submit:function(){
					$.ajax({
						type:"POST",
						url:"../user/processScheduleInsert.htm",
						async:true,
		    			data: $('form', $(this)).serialize()
					});
					$( "#mydiv" ).dialog( "close" );					
				}
			},
			height: 300,width:300,model:true});
		var usId=userId;
		$.ajax({
			type:"Get",
			url:"../user/addSchedule.htm?can_id="+usId,
			success:function(response){
				//alert(response);
				$( "#mydiv" ).dialog( "open" );
				//$("$mydiv").html("<p><font face='Georgia' size='4'>You're using a " + navigator.appName + " browser.</font></p>");
				 $('#mydiv').html(response);
				 $("#mydiv").dialog();
			},
		     error : function(e) {
		      alert('Error: ' + e); 
		     }  
		});
		
	}
	
</script>

<script type="text/javascript">
function openViewSchedule(userId){
	$("#mydiv").dialog({
		autoOpen:false,
		buttons:{
			Close:function(){
				$( "#mydiv" ).dialog( "close" );
			}
		},
		height: 300,width:400,model:true});
	var usId=userId;
	$.ajax({
		type:"Get",
		url:"../user/viewScheduleTrainer.htm?can_id="+usId,
		success:function(response){
			$("#mydiv").dialog("open");
			$("#mydiv").html(response);
			$("#mydiv").dialog();
		},
		error:function(e){
			alert('Error:'+e);
		}
	});
}

</script>

<style>

table{
	border-collapse: collapse;
	width:100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}


/*
table, th, td {
    border: 1px solid black;
}*/
</style>
</head>
<body>
	<div id="mydiv"></div>
	<div id="originaldiv">
		<form method="get">
			<table style="width:50%">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email id</th>
					<th>Contact</th>
					<th>Gender</th>
					<th>Add Schedule</th>
					<th>View Schedule</th>
				</tr>
				<c:forEach items="${users}" var="user">
	    			<tr>
						<td>${user.firstname}</td>
						<td>${user.lastname}</td>
						<td>${user.email}</td>
						<td>${user.contact}</td>
						<td>${user.gender}</td>
						<td><input type="button" value="add schedule" onclick="openAddSchedule(${user.id});"></td>
						<td><input type="button" value="view schedule" onclick="openViewSchedule(${user.id});"></td>
					</tr>
				</c:forEach>
				
			</table>
		</form>
	</div>
</body>