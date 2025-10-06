<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home - JSPs</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
  <div class="d-flex align-items-center justify-content-center vh-100">
    <div class="card shadow p-4 rounded-4" style="width: 100%; max-width: 400px;">
      <form action="login" method="post">
        <fieldset>
          <legend class="fw-bold text-center mb-4">LbStore</legend>

          <div class="mb-3">
            <label for="login" class="form-label">Login</label>
            <input type="text" class="form-control" name="login" id="login">
          </div>


          <div class="mb-3">
            <label for="senha" class="form-label">Senha</label>
            <input type="password" class="form-control" name="senha" id="senha">
          </div>
          
		  <div class="d-flex gap-2">
          <button type="submit" class="btn btn-primary w-50">Entrar</button><br>
          <button type="submit" class="btn btn-primary w-50">Esqueceu a senha?</button>
          </div>
          
        </fieldset>
      </form>
    </div>
  </div>
<%@ include file="footer.jsp" %>
</body>
</html>