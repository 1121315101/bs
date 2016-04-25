<%@page import="cyz.JavaBean.MonthReport,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../CSS/cyz.style.css" rel="stylesheet" type="text/css" />
<title>MonthReport</title>
<script type="text/javascript">
	function addreport() {
	}
</script>
</head>
<body>
	<%List<MonthReport> list=(List<MonthReport>)request.getAttribute("monthreport"); %>
	<div id="addreport"  >
		<div class="formtitle1" style="margin-top:10px;">
				<span>☆添加月报</span>
			</div>
			<form method="post" action="">
		<table class="ptable">
				<tr>
					<td>项目名&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>填写时间&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>上传者&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>审核状态&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>合同附件&nbsp;&nbsp;<input type="file" class="pscinput"></td>
				</tr>
		</table>
		<input type="submit" value="上传"/>
		</form>
	</div>
	<div id="reportList">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆项目月报</span>
			</div>
			<div>
			<table class="ptable">
				<%if(list!=null){
					for(MonthReport mon:list){%>
					<tr>
						<h1><a href=<%=mon.getMonreportUrl() %> style="float: left;" >1.&nbsp;&nbsp;<%=mon.getMonUrlName()%></a>&nbsp;&nbsp;<span style="float: left;" ><%=mon.getMonChecker()%> &nbsp;&nbsp;<%=mon.getMonDate()%> </span><h1>
					<tr>
				<%}%>
				<%}%>
			</table>
			</div>		
	</div>	
</body>
</html>