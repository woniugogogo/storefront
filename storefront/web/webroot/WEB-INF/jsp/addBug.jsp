<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>添加Bug</title>
		<link rel="stylesheet" href="css/blueprint/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container prepend-top">
			<div id="global_messages">
				<div class="success">Success message</div>
				<div class="error">Error message</div>
			</div>
			<div id="bug_form">
			<form action="./submitAddBug" method="post" id="addBugForm">
				<p>
					<label>Title:</label><br />
					<input type="text" name="title"/>
				</p>
				<p>
					<label>Severity:</label><br />
					<select name="severity" form="addBugForm">
						<option>S1</option>
						<option>S2</option>
						<option>S3</option>
						<option>S4</option>
					</select>
				</p>
				<p>
					<label>Assigned To:</label><br />
					<input type="text" name="assign"/>
				</p>
				<p>
					<label>Description:</label><br />
					<textarea name="desc"></textarea>
				</p>
				<input type="submit" value="提交"/>
				<p>
					<a href="bug_list.html" class="button">Submit</a>
					<a href="bug_list.html" class="button">Back</a>
				</p>
			</form>
			</div>
		</div>
	</body>
</html>