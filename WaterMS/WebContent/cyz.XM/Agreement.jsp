<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agree</title>
</head>
<body>
	<%Agreement agree=(Agreement)request.getAttribute("agreement"); %>
	<%if(agree!=null){%>
		<div class="left">
		<form action="" method="get">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆协议信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>协议编号&nbsp;&nbsp;<input type="text" name=""  value=<%=agree.getAgreementID()%>  disabled="disabled" class="pscinput"></td>
					<td>协议状态&nbsp;&nbsp;<select disabled="disabled" name="">
									<option selected=<%=agree.getAgreeState().equals("审核中")?"selected":"" %> >审核中</option>
									<option selected=<%=agree.getAgreeState().equals("完成")?"selected":"" %>>完成</option>
									</select ></td>
				</tr>
				<tr>
					<td>负责人&nbsp;&nbsp;<input disabled="disabled"type="text" name="" value=<%=agree.getAgreementMan() %> class="pscinput"></td>
					<td>联系电话&nbsp;&nbsp;<input disabled="disabled"type="text" name="" value=<%=agree.getAgreePhone() %> class="pscinput"></td>
				</tr>
				<tr>
					<td>等级&nbsp;&nbsp;<select disabled="disabled" name="">
									<option selected=<%=agree.getAquality().equals("高")?"selected":"" %> >高</option>
									<option selected=<%=agree.getAquality().equals("中等")?"selected":"" %>>中等</option>
									<option selected=<%=agree.getAquality().equals("低")?"selected":"" %>>低</option>
									</select ></td>
					<td>签订时间&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=agree.getAgreeDate() %> class="pscinput"></td>
				</tr>
				<tr>
					<td>保证金&nbsp;&nbsp;<input disabled="disabled" type="text" name=""  value=<%=agree.getAgreeDpFee()%> class="pscinput"></td>
					<td>协议金额&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=agree.getAgreeFee()%> class="pscinput"></td>
				</tr>
				<tr>
					<td>管理费&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=agree.getAgreeMgFee().toString()%> class="pscinput"></td>
					<td>质量保证金&nbsp;&nbsp;<input disabled="disabled" type="text" name=""  value=<%=agree.getAgreeQtFee()%> class="pscinput"></td>
				</tr>
				<tr>
					<td>项目安全保证金&nbsp;&nbsp;<input disabled="disabled" type="text" name="" value=<%=agree.getAgreeSfFee()%> class="pscinput"></td>
					<td><span>合同附件 &nbsp;&nbsp;<a href=""><%=agree.getAgreeUrlName()%></a>(点击下载)</span></td>
				</tr>
	
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
			</form>
		</div>	
	<% }else{%>
		<div class="left">
		<form action="">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆协议信息</span>
			</div>
				<table class="ptable">
				<tr>
					<td>协议编号&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
					<td>协议状态&nbsp;&nbsp;<select disabled name="">
									<option selected="selected" >审核中</option>
									<option >完成</option>
									</select ></td>
				</tr>
				<tr>
					<td>负责人&nbsp;&nbsp;<input type="text" name=""  class="pscinput"></td>
					<td>联系电话&nbsp;&nbsp;<input type="text" name=""   class="pscinput"></td>
				</tr>
				<tr><td>等级&nbsp;&nbsp;<select   name="">
									<option  >高</option>
									<option  >中等</option>
									<option selected="selected">低</option>
									</select ></td>
					<td>签订时间&nbsp;&nbsp;<input  type="text" name=""  class="pscinput"></td>
				</tr>
				<tr>
					<td>保证金&nbsp;&nbsp;<input  type="text" name=""    class="pscinput"></td>
					<td>协议金额&nbsp;&nbsp;<input   type="text" name=""   class="pscinput"></td>
				</tr>
				<tr>
					<td>管理费&nbsp;&nbsp;<input  type="text" name=""   class="pscinput"></td>
					<td>质量保证金&nbsp;&nbsp;<input  type="text" name=""  class="pscinput"></td>
				</tr>
				<tr>
					<td>项目安全保证金&nbsp;&nbsp;<input  type="text" name=""   class="pscinput"></td>
					<td>添加附件&nbsp;&nbsp;<input  type="file" name=""  value="附件上传"  class="pscinput"></td>
				</tr>
				</table>
				<input  type="submit" value="提交" name="contractupload"/>
		</form>
		</div>	
	<%} %>
</body>
</html>