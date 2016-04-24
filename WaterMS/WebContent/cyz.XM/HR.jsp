<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HR</title>
</head>
<body>
	<%HR hr=(HR)request.getAttribute("hr"); %>
	<%if(hr!=null){%>
		<div class="left">
		<form action="" method="get">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆人员信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>人事编号&nbsp;&nbsp;<input type="text" name=""  value=<%=hr.getHRID()%>  disabled="disabled" class="pscinput"></td>
					
				</tr>
				<tr>
					<td>人事状态&nbsp;&nbsp;<select disabled="disabled" name="">
									<option selected=<%=hr.getHRCheckType().equals("审核中")?"selected":"" %> >审核中</option>
									<option selected=<%=hr.getHRCheckType().equals("完成")?"selected":"" %>>完成</option>
									</select ></td>
				</tr>
				<tr>
					<td>项目经理&nbsp;&nbsp;<input type="text" name=""  value=<%=hr.getProjectManger()%>  disabled="disabled" class="pscinput"></td>
				</tr>
				<tr>
					<td>会计&nbsp;&nbsp;<input type="text" name=""  value=<%=hr.getAccounting()%>  disabled="disabled" class="pscinput"></td>
				</tr>
				<tr>
					<td>采购人员&nbsp;&nbsp;<input type="text" name=""  value=<%=hr.getMaterialByer()%>  disabled="disabled" class="pscinput"></td>
				</tr>
				<tr>
					<td>工作人员&nbsp;&nbsp;<input type="text" name=""  value=<%=hr.getWorker()%>  disabled="disabled" class="pscinput"></td>
					
				</tr>
	
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
			</form>
		</div>	
	<% }else{%>
		<div class="left">
		<form action="" method="get">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆人员信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>人事编号&nbsp;&nbsp;<input type="text" name=""   class="pscinput"></td>
					
				</tr>
				<tr>
					<td>人事状态&nbsp;&nbsp;<select name="">
									<option selected="selected"> 审核中</option>
									<option selected="">完成</option>
									</select ></td>
				</tr>
				<tr>
					<td>项目经理&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
				</tr>
				<tr>
					<td>会计&nbsp;&nbsp;<input type="text" name=""   class="pscinput"></td>
				</tr>
				<tr>
					<td>采购人员&nbsp;&nbsp;<input type="text" name=""   class="pscinput"></td>
				</tr>
				<tr>
					<td>工作人员&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
					
				</tr>
	
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
			</form>
		</div>	
	<%} %>
</body>
</html>