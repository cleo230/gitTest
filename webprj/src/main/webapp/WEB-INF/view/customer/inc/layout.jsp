<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>

<head>
    <title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>
    <meta charset="UTF-8">
    <title>공지사항목록</title>
    
    <link href="/css/customer/layout.css" type="text/css" rel="stylesheet" />
    <style>
    
        #visual .content-container{	
            height:inherit;
            display:flex; 
            align-items: center;
            
            background: url("../../images/customer/visual.png") no-repeat center;
        }
    </style>
</head>

<body>
    <!-- header 부분 -->
	<tiles:insertAttribute name="header"></tiles:insertAttribute>

	<!-- visual 부분 -->	
	<tiles:insertAttribute name="visual"></tiles:insertAttribute>
	
	<!-- --------------------------- <body> --------------------------------------- -->
	<div id="body">
		<div class="content-container clearfix">

			<!-- aside 부분-->
			<tiles:insertAttribute name="aside"></tiles:insertAttribute>
			
			<!-- main 부분-->
			<tiles:insertAttribute name="body"></tiles:insertAttribute>	
				
		</div>
	</div>

    <!-- footer 부분 -->
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>


      
    </body>
    
    </html>