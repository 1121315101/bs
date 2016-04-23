<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../Scripts/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	function data2Table(data) {
		var value = data.value, name = data.name;
		var table = document.createElement("table");
		for (var i = 0; i < value.length; ++i) {
			var tr = document.createElement("tr");
			for (var j = 0; j < name.length; ++j) {
				var td = document.createElement("td");
				td.innerHTML = value[i].name[j];
				tr.appendChild(td);
			}
			table.appendChild(tr);
		}
		return table;
	}
	$(function() {
		$.ajax({
			type : "post",
			url : "../cm/GetData",
			data : {
				data : "recDoc"
			},
			success : function(data) {
				$("#div_recDoc").html(data2Table(data));
			},
			error : function(xhr, sta, err) {
				alert(err);
			}
		});
	});
</script>
<title>公文管理</title>
</head>
<body>
	<h2>我的收文</h2>
	<div id="div_recDoc">显示自己接收且已审核的公文</div>
	<h2>待审收文</h2>
	<div id="div_checkDoc">显示需要自己接收但未审核的公文</div>
	<h2>我的发文</h2>
	<div id="id_sendDoc">显示自己发送且已审核的公文</div>
	<h2>在拟发文</h2>
	<div id="id_draftDoc">显示自己在拟或未审核的发文</div>
</body>
</html>