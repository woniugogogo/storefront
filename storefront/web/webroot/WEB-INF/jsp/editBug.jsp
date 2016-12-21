<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>编辑Bug</title>
		<link rel="stylesheet" href="resources/css/blueprint/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container prepend-top">
			<div id="global_messages">
				<div class="success">Success message</div>
				<div class="error">Error message</div>
			</div>
			<div id="bug_form">
			<form action="../submitEditBug" method="post" id="editBugForm" >
				<p>
					<label>Title:</label><br />
					<input type="text" name="title" value="${bugData.title}"/>
				</p>
				<p>
					<label>Severity:</label><br />
					<select name="severity" form="editBugForm">
						<c:if test="${bugData.severity.equals('S1')}">
							<option value="S1" selected="selected">S1</option>
							<option value="S2" >S2</option>
							<option value="S3" >S3</option>
							<option value="S4" >S4</option>
						</c:if>
						<c:if test="${bugData.severity.equals('S2')} ">
							<option value="S1" >S1</option>
							<option value="S2" selected="selected">S2</option>
							<option value="S3" >S3</option>
							<option value="S4" >S4</option>
						</c:if>
						<c:if test="${bugData.severity.equals('S3') }">
							<option value="S1" >S1</option>
							<option value="S2" >S2</option>
							<option value="S3" selected="selected">S3</option>
							<option value="S4" >S4</option>
						</c:if>
						<c:if test="${bugData.severity.equals('S4')} ">
							<option value="S1" >S1</option>
							<option value="S2" >S2</option>
							<option value="S3" >S3</option>
							<option value="S4" selected="selected">S4</option>
						</c:if>
					</select>
					
				</p>
				<p>
					<label>Assigned To:</label><br />
					<input type="text" name="assign" value="${bugData.assign}" />
				</p>
				<p>
					<label>Description:</label><br />
					<textarea name="desc" >${bugData.desc}</textarea>
				</p>
				<input type="submit" value="提交"/>
				
			</form>
			</div>
		</div>
	</body>
</html>