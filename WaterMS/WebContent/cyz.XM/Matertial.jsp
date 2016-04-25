<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%MaterialBuy material=(MaterialBuy)request.getAttribute("materialbuy"); %>
	<%if(material!=null) {%>
		<div id="left">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆物质采购</span>
			</div>
			<form method="post" action="">
				<table class="ptable">
						<tr>
							<td>项目名&nbsp;&nbsp;<input type="text" name="" disabled="disabled" value=<%=session.getAttribute("projectname") %> class="pscinput"></td>
						</tr>
						<tr>
							<td>上传者&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=material.getMaupload() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>时间&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=material.getMaterialdate() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>设备&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=material.getEquipment()%> class="pscinput"></td>
						</tr>
						
						<tr>
							<td>材料&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=material.getMaterial() %>class="pscinput"></td>
						</tr>
						<tr>
							<td>审核者&nbsp;&nbsp;<input type="text" name=""  disabled="disabled" value=<%=material.getMachecker() %> class="pscinput"></td>
						</tr>
						<tr>
							<td>审核状态&nbsp;&nbsp;<select  disabled="disabled" ><option selected=<%=material.getMacheckType().equals("审核中")?"selected":"" %> >审核中</option>
							<option selected=<%=material.getMacheckType().equals("完成")?"selected":""%>>完成</option></select></td>
						</tr>
						<tr>
							<td>合同附件&nbsp;&nbsp;<a href=<%=material.getMaUrl()%>><%=material.getMaUrlName() %></a>(点击下载)</td>
						</tr>
				</table>
				<input type="submit" value="上传"/>
			</form>
		</div>
	<%}else{%>
		<div id="left">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆物质采购</span>
			</div>
			<form method="post" action="">
				<table class="ptable">
						<tr>
							<td>项目名&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>上传者&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>时间&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>设备&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						
						<tr>
							<td>材料&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>审核者&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
						</tr>
						<tr>
							<td>审核状态&nbsp;&nbsp;<select><option selected="selected" >审核中</option><option>完成</option></select></td>
						</tr>
						<tr>
							<td>合同附件&nbsp;&nbsp;<input type="file" class="pscinput"></td>
						</tr>
				</table>
				<input type="submit" value="上传"/>
			</form>
		</div>
	<%}%>
</body>
</html>