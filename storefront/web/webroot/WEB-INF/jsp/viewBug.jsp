<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%!
	public String getDate(){
		String dateTime = new SimpleDateFormat("yyyy-MM-dd hh:mm").format(Calendar.getInstance().getTime()); 
		return dateTime;	
	}
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>展示Bug</title>
		<link rel="stylesheet" href="resources/css/blueprint/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="resources/css/blueprint/plugins/link-icons/screen.css" />
		<link rel="stylesheet" href="resources/css/app.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_info">
				<fieldset>
					<legend>Bug Information</legend>
					
					<div id="bug_form">
						<p>
							<label>Title:</label> <br />
							<span>${ bugData.title }</span>
						</p>
						<p>
							<label>Severity:</label> <br />
							<span>${ bugData.severity }</span>
						</p>
						<p>
							<label>Assigned To:</label> <br />
							<span>${ bugData.assign }</span>
						</p>
						<p>
							<label>Description:</label><br />
							<textarea readonly="readonly"> ${ bugData.desc }</textarea>
						</p>
					</div>
				</fieldset>
				<fieldset>
					<legend>Comments</legend>
					<div id="comment_list">
						<c:forEach var="commentItem" items="${commentList }">
							<div class="comment prepend-top">
								<div class="comment_head">
									"${commentItem.getDate() }" Admin 
								</div>
								<div class="comment_body">
									"${commentItem.getCommentContent() }"
								</div>
							</div>
						</c:forEach>
					</div>
				</fieldset>
				
				<fieldset>
					<legend>Add A Comment</legend>
					<div id="comment_form">
						<form action="../${bugData.title}/addComment" method="post">
							<textarea name="commentContent"></textarea> <br>
							<input type="text" value="<%= getDate() %>" name="date" style="display:none;">
							<input type="submit" value="Submit">
						</form>
						<a class="button" href="bugList.jsp">Back</a>
					</div>
				</fieldset>
			</div>
		</div>
	</body>
</html>