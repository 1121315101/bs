<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cost</title>
</head>
<body>
	<%List<Cost> costlist=(List<Cost>)request.getAttribute("costlist"); %>
	<div id="addreport"  >
		<div class="formtitle1" style="margin-top:10px;">
				<span>☆添加用款</span>
			</div>
			<form method="post" action="">
		<table class="ptable">
				<tr>
					<td>项目名&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>费用名&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>用款类型&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>用款总额&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>日期&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>描述&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>审核状态&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>审核人&nbsp;&nbsp;<input type="file" class="pscinput"></td>
				</tr>
		</table>
		<input type="submit" value="上传"/>
		</form>
	</div>
	<%if(costlist!=null){%>
	<div id="reportList">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆用款列表</span>
			</div>
			<div>
			<table class="ptable">
				<thead>
					<td>编号</td>
					<td>用款名</td>
					<td>费用时间</td>
					<td>费用类型</td>
					<td>总额</td>
					<td>审核状态</td>
					<td>审核人</td>
				</thead>
					<%for(int i=0;i<costlist.size();i++){%>
					<tr>
						<td><%=i%></td>
						<td><%=costlist.get(i).getCostname()%></td>
						<td><%=costlist.get(i).getCostDate() %></td>
						<td><%=costlist.get(i).getCostType()%></td>
						<td><%=costlist.get(i).getCostSum() %></td>
						<td><%=costlist.get(i).getCostCheckType() %></td>
						<td><%=costlist.get(i).getCostChecker() %></td>	
					<tr>
					<%}%>
				<%}%>
			</table>
			</div>		
	</div>	
</body>
</html>