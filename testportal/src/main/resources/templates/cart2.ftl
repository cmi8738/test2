<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#--cs:是一个存入request的集合-->
  <#list cs as item>
      ${item.name}-----${item.num}
  </#list>
</body>
</html>