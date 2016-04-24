<%@ page language="java" contentType="text/html; charset=UTF-8" import="cyz.JavaBean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../CSS/cyz.style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery-1.7.1.min.js"></script>
<title>Contract</title>
</head>
<body>
<%Contract contract=(Contract)request.getAttribute("contract"); %>
	<%if(contract!=null){%>
		<div class="left">
		<form action="">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆合同信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>合同编号&nbsp;&nbsp;<input type="text" name=""  value=<%=contract.getContractID()%>  disabled="disabled" class="pscinput"></td>
					<td>合同状态&nbsp;&nbsp;<select disabled="disabled" name="">
									<option selected=<%=contract.getContractState().equals("审核中")?"selected":"" %> >审核中</option>
									<option selected=<%=contract.getContractState().equals("完成")?"selected":"" %>>完成</option>
									</select ></td>
				</tr>
				<tr>
					<td>客户经理&nbsp;&nbsp;<input disabled="disabled"type="text" name="" value=<%=contract.getContractManger() %> class="pscinput"></td>
					<td>联系电话&nbsp;&nbsp;<input disabled="disabled"type="text" name="" value=<%=contract.getContractPhone() %> class="pscinput"></td>
				</tr>
				<tr>
					<td>签订时间&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=contract.getContractDate() %> class="pscinput"></td>
					<td>合同金额&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=contract.getContractFee() %> class="pscinput"></td>
				</tr>
				<tr>
					<td>工期要求&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=contract.getContractDatetime()%> class="pscinput"></td>
					<td>质量等级&nbsp;&nbsp;<input disabled="disabled" type="text" name=""  value=<%=contract.getQuality()%> class="pscinput"></td>
				<tr>
					<table>
					<tr><span>合同附件&nbsp;&nbsp;<a href=""><%=contract.getContractUrlName()%></a>(点击下载)</span></tr>
					</table>
				</tr>
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
		</form>
	</div>	
	<% }else{%>
		<div class="left">
		<form action="">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆合同信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>合同编号&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
					<td>合同状态&nbsp;&nbsp;<select  name="">
									<option>待审中</option>
									<option>完成</option>
									</select></td>
				</tr>
				<tr>
					<td>客户经理&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
					<td>联系电话&nbsp;&nbsp;<input type="text" name=""class="pscinput"></td>
				</tr>
				<tr>
					<td>签订时间&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
					<td>合同金额&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<td>工期要求&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
					<td>质量等级&nbsp;&nbsp;<input type="text" name="" class="pscinput"></td>
				</tr>
				<tr>
					<table>
					<tr>合同附件&nbsp;&nbsp;<input type="file" class="pscinput"></tr>
					</table>
				</tr>
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
		</form>
	</div>	
	<%} %>
</body>
</html>