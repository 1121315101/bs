<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../CSS/skin.css" />
<title>Insert title here</title>
</head>
<body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!-- 头部开始 -->
            <tr>
                <td width="17" valign="top" background="../Images/mail_left_bg.gif">
                    <img src="../Images/left_top_right.gif" width="17" height="29" />
                </td>
                <td valign="top" background="../Images/content_bg.gif">
                    <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" background="../Images/content_bg.gif">
                        <tr><td height="31"><div class="title">添加栏目</div></td></tr>
                    </table>
                </td>
                <td width="16" valign="top" background="../Images/mail_right_bg.gif"><img src="../Images/nav_right_bg.gif" width="16" height="29" /></td>
            </tr>
            <!-- 中间部分开始 -->
            <tr>
                <!--第一行左边框-->
                <td valign="middle" background="../Images/mail_left_bg.gif">&nbsp;</td>
                <!--第一行中间内容-->
                <td valign="top" bgcolor="#F7F8F9">
                    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <!-- 空白行-->
                        <tr><td colspan="2" valign="top">&nbsp;</td><td>&nbsp;</td><td valign="top">&nbsp;</td></tr>
                        <tr>
                            <td colspan="4">
                                <table>
                                    <tr>
                                        <td width="100" align="center"><img src="../Images/mime.gif" /></td>
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">在这里，您可以根据您的需求，填写网站参数！</h3></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 一条线 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 添加栏目开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <form action="" method="">
                                                <table width="100%" class="cont">
                                                    <tr>
                                                        <td width="10%">&nbsp;</td>
                                                        <td>身份证号：</td>
                                                        <td width="35%"><input class="text" type="text" id="idnumber" name="idnumber" value="" /></td>
                                                        <td>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
                                                        <td width="35%"><input class="text" type="text" id="name" name="name" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
                                                        <td>
                                                            <select id="jobtitle">
                                                                <option selected="true">请选择...</option>
                                                                <option>初级</option>
                                                                <option>中级</option>
                                                                <option>副高</option>
                                                                <option>正高</option>
                                                            </select>
                                                        </td>
                                                        <td>评定时间：</td>
                                                        <td><input class="text" type="text" id="evaluationtime" name="evaluationtime" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
                                                        <td>
                                                            <input type="radio" id="sex" name="sex" value="1" /> 男 
                                                            <input type="radio" id="sex" name="sex" value="0" /> 女
                                                        </td>
                                                        <td>职&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;务</td>
                                                        <td><input class="text" type="text" id="post" name="post" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>岗&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位：</td>
                                                        <td><input class="text" type="text" id="job" name="job" value="" /></td>
                                                        <td>第一学历：</td>
                                                        <td><input class="text" type="text" id="firstdegree" name="firstdegree" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>毕业学校：</td>
                                                        <td><input class="text" type="text" id="graduatedschool" name="graduatedschool" value="" /></td>
                                                        <td>最高学历：</td>
                                                        <td><input class="text" type="text" id="highesteducation" name="highesteducation" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>最高学历毕业学校：</td>
                                                        <td><input class="text" type="text" id="highestEducationSchools" name="highestEducationSchools" value="" /></td>
                                                        <td>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位：</td>
                                                        <td><input class="text" type="text" id="bachelorofScience" name="bachelorofScience" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>出生日期：</td>
                                                        <td><input class="text" type="text" id="dateofbirth" name="dateofbirth" value="" /></td>
                                                        <td>参加工作日期：</td>
                                                        <td><input class="text" type="text" id="workDate" name="workDate" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>到公司日期：</td>
                                                        <td><input class="text" type="text" id="datecompany" name="datecompany" value="" /></td>
                                                        <td>离职日期：</td>
                                                        <td><input class="text" type="text" id="dateofseparation" name="dateofseparation" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>离职原因：</td>
                                                        <td><input class="text" type="text" id="reasonforleaving" name="reasonforleaving" value="" /></td>
                                                        <td>籍&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;贯：</td>
                                                        <td><input class="text" type="text" id="birthplace" name="birthplace" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>政治面貌：</td>
                                                        <td><input class="text" type="text" id="politicalstatus" name="politicalstatus" value="" /></td>
                                                        <td>办公电话：</td>
                                                        <td><input class="text" type="text" id="officePhone" name="officePhone" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>家庭电话：</td>
                                                        <td><input class="text" type="text" id="homephone" name="homephone" value="" /></td>
                                                        <td>家庭住址：</td>
                                                        <td><input class="text" type="text" id="homeaddress" name="homeaddress" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机：</td>
                                                        <td><input class="text" type="text" id="phone" name="phone" value="" /></td>
                                                        <td>email：</td>
                                                        <td><input class="text" type="text" id="email" name="email" value="" /></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>照片：</td>
                                                        <td><input class="text" type="text" id="photo" name="photo" value="" /></td>
                                                    </tr>
                                                    <!-- <tr>
                                                        <td>&nbsp;</td>
                                                        <td>栏目位置：</td>
                                                        <td>
                                                            <input type="checkbox" name="pos" value="0" /> 顶部 
                                                            <input type="checkbox" name="pos" value="1" /> 底部
                                                        </td>
                                                        <td>设置栏目的显示的范围与位置</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>浏览器标题(title)：</td>
                                                        <td><input class="text" style="width:200px;" type="text" name="bro_name" value="" /></td>
                                                        <td>浏览器标题(Title)，有利于SEO</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>关键字(Meta Keywords):：</td>
                                                        <td><textarea></textarea></td>
                                                        <td>Keywords 项出现在页面头部的 Meta 标签中，有利于SEO，多个关键字间请用半角逗号 "," 隔开</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>描述(Meta Description):：</td>
                                                        <td><textarea></textarea></td>
                                                        <td>Description 出现在页面头部的 Meta 标签中，有利于SEO</td>
                                                        <td>&nbsp;</td>
                                                    </tr> -->
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td colspan="3"><input class="btn" type="submit" value="提交" /></td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                </table>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 添加栏目结束 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
                <td background="../Images/mail_right_bg.gif">&nbsp;</td>
            </tr>
            <!-- 底部部分 -->
            <tr>
                <td valign="bottom" background="../Images/mail_left_bg.gif">
                    <img src="../Images/buttom_left.gif" width="17" height="17" />
                </td>
                <td background="../Images/buttom_bgs.gif">
                    <img src="../Images/buttom_bgs.gif" width="17" height="17">
                </td>
                <td valign="bottom" background="../Images/mail_right_bg.gif">
                    <img src="../Images/buttom_right.gif" width="16" height="17" />
                </td>           
            </tr>
        </table>
    </body>
</html>