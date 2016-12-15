<%@page import="de.hybris.platform.storefront.data.BugData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="css/blueprint/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_list">
				<div id="bug_nav">
					<a class="button" href="add_bug.jsp">Create A Bug</a>	
				</div>
				
				<table>
					<thead>
						<tr>
							<th>
								Assignee
							</th>
							<th>
								Title
							</th>
							<th>
								Severity
							</th>
							<th>
								Description
							</th>
							<th>
								Created Date
							</th>
							<th>
								Actions
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="bug" items="${ bugs }" >
							<tr>
								<td>${bug.assign }</td>
								<td>${bug.title }</td>
								<td>${bug.severity }</td>
								<td>${bug.desc }</td>
								<td>
									<a href="view_bug.html">View</a>
									<a href="add_bug.html">Edit</a>
									<a href="javascript:void()">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>