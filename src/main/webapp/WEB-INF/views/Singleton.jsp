<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="joon.cs.pattern.Singleton.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Singleton</title>
</head>
<script src="js/jquery-3.7.1.min.js"></script>

<script type="text/javascript">
	function SecondPage() {
		location.href="/Second.do";
	}
</script>

	<%
        // 설정 객체를 가져옵니다.
        Settings settings = Settings.getSettings();

        // 만약 다크 모드가 활성화되어 있다면 body 태그에 dark-mode 클래스를 추가합니다.
        String darkModeClass = settings.getDarkMode() ? "dark-mode" : "";

        // 설정된 글꼴 크기를 가져옵니다.
        int fontSize = settings.getFontSize();
    %>
   
    
    <style>
        /* 다크 모드일 때 배경색을 검은색으로 변경합니다. */
        .dark-mode {
            background-color: black;
            color: white;
        }

        /* 글꼴 크기를 설정합니다. */
        body {
            font-size: <%= fontSize %>px;
        }
    </style>
    
<body>

	<div class="<%= darkModeClass %>">
		<h1>Dark Mode Test</h1>
		<p>This is a test page for dark mode.</p>
		<button onclick="return SecondPage()">SecondPage</button>
	</div>
</body>
</html>