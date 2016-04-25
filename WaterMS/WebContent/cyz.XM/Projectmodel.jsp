<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../CSS/cyz.style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery-1.7.1.min.js"></script>

<title>Insert title here</title>
</head>
<script type="text/javascript">
	window.onload=sub(0,1);
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
	function chaxun() {
		$.ajax({ 
			url:'../projectList', 
			type:'get', 
			dataType:'html',
			data:{ hetong:$("#hetong").val(),xiangmu:$("#xiangmu").val()},
			error: function(){ alert('Error loading document'); }, 
			success: function(msg){ $("#main").html(msg);} 
		}); 
	}
	function datils(pttpye,projectid){
		$.ajax({ 
			url:'../project', 
			type:'post', 
			dataType:'html',
			data:{pttype:pttype, projectid:projectid},
			error: function(){ alert('Error loading document'); }, 
			success: function(msg){ $("#main").html(msg);} 
		}); 
	}
	function quitdatils(){
		$.ajax({ 
			url:'../project', 
			type:'get', 
			dataType:'html',
			data:{quitstr:quitstr},
			error: function(){ alert('Error loading document'); }, 
			success: function(msg){ $("#main").html(msg);} 
		}); 
	}
</script>
<body>
	<div id="qian" >
		<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#" onclick="quitdatils()">项目申报</a></li>
		</ul>
	</div>

	<div class="rightmsg">
		<ul class="project" >
			<li><a href="#"  onclick="sub('11','1')"><b>&nbsp;</b>项目列表</a></li>
			<li><a href="#"  onclick="datils('1','nullstring')" ><b>1</b>项目信息</a></li>
			<li ><a href="#"  onclick="datils('2','nullstring')"><span>&nbsp;</span><b>2</b>合同信息<i>&nbsp;</i></a></li>
			<li ><a href="#" onclick="datils('3','nullstring')" ><span>&nbsp;</span><b>3</b>承包协议<i>&nbsp;</i></a></li>
			<li ><a href="#" onclick="datils('4','nullstring')"><span>&nbsp;</span><b>4</b>成员信息<i>&nbsp;</i></a></li>
			<li><a href="#" onclick="datils('5','nullstring')"><span>&nbsp;</span><b>5</b>项目月报<i>&nbsp;</i></a></li>
			<li><a href="#"  onclick="datils('6','nullstring')"><span>&nbsp;</span><b>6</b>物质采购<i>&nbsp;</i></a></li>
			<li><a href="#"  onclick="datils('7','nullstring')"><span>&nbsp;</span><b>7</b>用款管理<i>&nbsp;</i></a></li>
			<li><a href="#" onclick="datils('8','nullstring')"><span>&nbsp;</span><b>8</b>项目验收<i>&nbsp;</i></a></li>
		</ul>
		<ul class="prosearch">
			<li>
				<label>项目状态：</label>
				<input name="checksure" type="radio" value=""  checked="checked" onclick="sub('0','1')"/>&nbsp;进行中&nbsp;&nbsp;
				<input name="checksure" type="radio" value=""  onclick="sub('1','1')"/>&nbsp;待审&nbsp;&nbsp;
				<input name="checksure" type="radio" value=""  onclick="sub('2','1')"/>&nbsp;完成
			</li>
			<li>
			<label>查询：</label>
			<i>项目查询</i>
				<a><input name="" type="text" class="scinput" id="xiangmu" /></a><i>合同查询</i>
				<a><input name="" type="text" class="scinput" id="hetong"/></a>
				<a onclick="chaxun()"><input name="" type="button" class="sure" value="查询" /></a>
			</li>
			
		</ul>
	</div>
	</div>
	<div id="main">
		
	</div>
</body>
</html>