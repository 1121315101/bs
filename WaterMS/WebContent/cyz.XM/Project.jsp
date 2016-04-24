<%@page import="cyz.JavaBean.ProjectDatils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../CSS/cyz.style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery-1.7.1.min.js"></script>
<title></title>
</head>
<body>
	<div class="MainDiv">
	<%ProjectDatils pd=(ProjectDatils)request.getAttribute("ProjectDatils");String projectid=(String)session.getAttribute("projectid");%>
	<%if(pd!=null){	%>
	<form action="#" method="post">
		<div class="left1">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆项目一般信息</span>
			</div>
			项目名&nbsp;&nbsp;<input type="text" name="" value=<%=pd.getProjectName()%> disabled="disabled"  class="pscinput1">
			附件下载&nbsp;&nbsp;<a href="#" value=""><%=pd.getProjectUrl()%></a></br>
			客户经理&nbsp;&nbsp;<input type="text" name="" value=<%=pd.getCompanyManger()%> disabled="disable" class="pscinput">
			客户公司名&nbsp;&nbsp;<input type="text" name="" value=<%=pd.getCompany().toString()%>  disabled="disabled"  class="pscinput"></br>
			目前状态&nbsp;&nbsp;<select  disabled="disabled" name="">
				<option selected=<%=pd.getProjectStateID().equals("待审")?"selected":""%>>待审</option>
				<option selected=<%=pd.getProjectStateID().equals("进行中")?"selected":""%>>进行中</option>
				<option selected=<%=pd.getProjectStateID().equals("完成")?"selected":""%>>完成</option>
				</select>
			项目造价&nbsp;&nbsp;<input type="text" name=""  disabled="disabled"  value=<%=pd.getProjectCost()%>  class="pscinput"></br>
			预计收入&nbsp;&nbsp;<input type="text" name=""   disabled="disabled"  value=<%=pd.getEstotalRevenue()%>  class="pscinput">
			项目类型&nbsp;&nbsp;<select   disabled="disabled"  name="">
				<option selected=<%=pd.getProjectTypeID().equals("一级")?"selected":"" %>>一级</option>
				<option  selected=<%=pd.getProjectTypeID().equals("二级")?"selected":"" %>>二级</option>
				<option select=<%=pd.getProjectTypeID().equals("三级")?"selected":"" %> >三级</option>
				</select></br>
			实施方式&nbsp;&nbsp;<select   disabled="disabled"  name="">
				<option selected=<%=pd.getProjectImpID().equals("承包")?"selected":"" %>>承包</option>
				<option  selected=<%=pd.getProjectImpID().equals("内部")?"selected":"" %>>内部</option>
				</select>
		</div>
		<div class="left2">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆客户信息</span>
			</div>
			公司名称<input type="text" name=""  disabled="disabled"  value=<%=pd.getCompany()%> class="pscinput1">
			公司地址<input type="text" name=""  disabled="disabled"  value=<%=pd.getCompanyPlace()%>  class="pscinput"></br>
			负责人<input type="text" name=""  disabled="disabled"  value=<%=pd.getCompanyManger()%>  class="pscinput">
			联系电话<input type="text" name=""   disabled="disabled"  value=<%=pd.getCompanyPhone()%> class="pscinput"></br>
			注册时间<input type="text" name=""  disabled="disabled"   value=<%=pd.getCompanyDate()%> class="pscinput">
			公司等级<select   disabled="disabled"  name="">
				<option selected=<%=pd.getProjectTypeID().equals("一级")?"selected":"" %>>一级</option>
				<option  selected=<%=pd.getProjectTypeID().equals("二级")?"selected":"" %>>二级</option>
				<option select=<%=pd.getProjectTypeID().equals("三级")?"selected":"" %> >三级</option>
				</select></br>
			邮箱地址<input  disabled="disabled"  type="text" name="" value=<%=pd.getCompanymail()%>  class="pscinput"></br>
			<div>
			<input type="submit" name="" value="提交"/>
			</div>
		</div>
	</form>
	<%}else{%>
		<form action="#" method="post">
		<div class="left1">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆项目一般信息</span>
			</div>
				项目名<input type="text" name=""  class="pscinput1">
				附件<a href="#"></td></br>
				客户经理<input type="text" name=""  class="pscinput">
				客户公司名<input type="text" name="" class="pscinput"></br>
				目状态<select  name="">
									<option>待审</option>
									<option>进行中</option>
									<option>完成</option>
									</select>
				项目造价<input type="text" name=""  class="pscinput"></br>
				预计收入<input type="text" name=""   class="pscinput">
				项目类型<select  name="">
							<option>一级</option>
							<option>二级</option>
							<option>三级</option>
						</select></br>
				实施方式<select  name="">
							<option>承包</option>
							<option>内部</option>
						</select>
		</div>
		<div class="left2">
			<div class="formtitle1" style="margin-top:10px;">
				<span>☆客户信息</span>
			</div>
			公司名称<input type="text" name="" class="pscinput1">
			公司地址<input type="text" name="" class="pscinput"></br>
			负责人<input type="text" name=""   class="pscinput">
			联系电话<input type="text" name=""   class="pscinput"></br>
			注册时间<input type="text" name="" class="pscinput">
			公司等级<select  name="">
							<option>一级</option>
							<option>二级</option>
							<option>三级</option>
						</select></br>
			邮箱地址<input type="text" name=""  class="pscinput"></br>
			<div>
			<input type="submit" name="" value="提交"/>
			</div>
		</div>
	</form>
	<%} %>
	</div>
</body>
</html>