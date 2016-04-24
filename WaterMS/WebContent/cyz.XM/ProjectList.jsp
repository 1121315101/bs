<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cyz.JavaBean.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../CSS/cyz.style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery-1.7.1.min.js"></script>
<title>Project</title>
<script type="text/javascript">
	function sub(ptype,ppage){
		$.ajax({ 
			url:'../projectList', 
			type:'post', 
			dataType:'html',
			data:{ ptype:ptype,ppage:ppage},
			error: function(){ alert('Error loading document'); }, 
			success: function(msg){ $("#main").html(msg);} 
		}); 
	}
	function datils(pttype,projectid){
		$.ajax({ 
			url:'../project', 
			type:'post', 
			dataType:'html',
			data:{pttype:pttype, projectid:projectid},
			error: function(){ alert('Error loading document'); }, 
			success: function(msg){ $("#main").html(msg);} 
		}); 
	}
</script>
</head>
<body>
<%List<Project> list=(List<Project>)request.getAttribute("list");
String count=request.getAttribute("count").toString(); %>
		

		<div class="formtitle1">
			<span>立项项目</span>
		</div>

		<table class="tablelist">
			<thead>
				<tr>
					<th>立项时间</th>
					<th>项目名</th>
					<th>项目造价</th>
					<th>风险描述</th>
					<th>实施方式</th>
					<th>预计收入</th>
					<th>类型</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			<% for(int i=0;i<list.size();i++){%>
				<tr>
					<td><%=list.get(i).getBuildProjectDate() %></td>
					<td><%=list.get(i).getProjectName() %></td>
					<td><%=list.get(i).getProjectCost() %></td>
					<td><%=list.get(i).getProjectRiskDes() %></td>
					<td><%=list.get(i).getProjectImpID() %></td>
					<td><%=list.get(i).getEsTotalRevenue() %></td>
					<td><%=list.get(i).getProjectTypeID()%></td>
					<td><%=list.get(i).getProjectStateID()%></td>
					<td><a href="#" 
					   onclick="datils('1','<%=list.get(i).getProjectID() %>')"class="tablelink">详细信息</a></td>
				</tr>
			<%}%>
			</tbody>
		</table>

		<div class="pagin">
			<div class="message">
				共<i class="blue"><%=count%></i>条记录，当前显示第&nbsp;<i class="blue"><%=session.getAttribute("ppage") %>&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span sclass="pagepre"></span></a></li>
				<%for(int i=1;i<=Integer.parseInt(count)/2+1;i++){%>
					<li class="paginItem"><a href="javascript:;"  onclick="sub('12','<%=i %>')"><%=i %></a></li>
					
					<!-- <li class="paginItem current"><a href="javascript:;">2</a></li>
					<li class="paginItem"><a href="javascript:;">3</a></li>
					<li class="paginItem"><a href="javascript:;">4</a></li>
					<li class="paginItem"><a href="javascript:;">5</a></li>
					<li class="paginItem more"><a href="javascript:;">...</a></li>
					<li class="paginItem"><a href="javascript:;">10</a></li> -->
				<%}%>
				<li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
			</ul>
		</div>


		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span><a></a>
			</div>

			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>

		</div>

	
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>

</html>