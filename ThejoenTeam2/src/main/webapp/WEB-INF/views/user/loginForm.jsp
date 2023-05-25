<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>
		
<div class="container">
		<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="Username">Username</label> 
			<input type="text" name="username" class="form-control" placeholder="Enter Username" id="Username">
		</div>
		<div class="form-group">
			<label for="password">Password:</label> 
			<input type="password" name = "password" class="form-control" placeholder="Enter password" id="Password">
		</div>
		
		<button id ="btn-login" class="btn btn-primary">로그인</button>
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=e0367cbe875031d9ec0660715208c3a3&redirect_uri=http://localhost:8080/auth/kakao/callback&response_type=code"><img height="38px" src="/images/kakao_login_medium_narrow.jpg"/></a>
		<a href="/auth/joinForm" class="button fit small">아직 회원이 아니신가요?</a>
	</form>
</div>
		<script src="/js/user.js"></script>
		<%@ include file="../layout/footer.jsp" %>
	</body>
</html>