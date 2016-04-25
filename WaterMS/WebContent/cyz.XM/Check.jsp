<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check</title>
</head>
<body>
	<%Check check=(Check)request.getAttribute("check"); %>
	<%if(check!=null) {%>
		<div id="left">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆项目验收</span>
			</div>
				<table class="ptable">
						<tr>
							<td>项目名&nbsp;&nbsp;<input type="text" name="" disabled="disabled" value=<%=session.getAttribute("projectname") %> class="pscinput"></td>
						</tr>
						<tr>
							<td>确定时间&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckDate() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>验收人员&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckMan() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>验收时间&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckDateTime() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>验收结果&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckResult()%> class="pscinput"></td>
						</tr>

						<tr>
							<td>描述&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckDescribe() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>确认者&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=check.getCheckManger() %> class="pscinput"></td>
						</tr>
						
				</table>
	</div>
	<%}else{%>
		<div id="left">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆项目验收</span>
			</div>
			<form method="post" action="">
				<table class="ptable">
						<tr>
							<td>项目名&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
						</tr>
						<tr>
							<td>确定时间&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
						</tr>
						<tr>
							<td>验收人员&nbsp;&nbsp;<input type="text" name=""   class="pscinput"></td>
						</tr>
						<tr>
							<td>验收时间&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>验收结果&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
						</tr>

						<tr>
							<td>描述&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>确认者&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
						</tr>
						
				</table>
				<input type="submit" value="上传"/>
			</form>
		</div>
	<%}%>
</body>
</html>