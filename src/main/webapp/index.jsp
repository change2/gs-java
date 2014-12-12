<%--
 User: changejava
 Date: 2014/11/14
 Time: 14:59
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
  <title></title>
</head>
<script type="text/javascript" language="JavaScript">
  function myHandler() {
    alert('do something useful here')
    window.location.href = "http://www.bing.com"
  }
  //  document.body.onload = myHandler();
  window.onload = myHandler();
</script>
<style type="text/css">
  table {
    border-spacing: 4px;
    border-collapse: separate;
  }

  td {
    padding: 4px;
  }
</style>
<body>
<h1>111222</h1>

<table cellspacing="4" cellpadding="4">
  <tr>
    <td>Column 1</td>
    <td>Column 2</td>
  </tr>
</table>
</body>
</html>
<%--<script lang="JavaScript" type="application/javascript">--%>

<%--function myHandler(){--%>
<%--alert('Do something useful here!');--%>
<%--window.location.href="http://www.baidu.com";--%>
<%--}--%>
<%--</script>--%>