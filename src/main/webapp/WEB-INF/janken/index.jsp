<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>janken app</title>
  </head>
  <body>
    <h1>じゃんけんの手を入力してください。</h1>
    <form action="JankenServlet" method="post" class="form-content">
      <table class="table-content" class="table-content">
        <tr>
          <td><label for="gu">グー</label></td>
          <td>
            <input id="gu" type="radio" name="janken" value="0" checked />
          </td>
        </tr>
        <tr>
          <td><label for="chi">チョキ</label></td>
          <td>
            <input id="chi" type="radio" name="janken" value="1" />
          </td>
        </tr>
        <tr>
          <td><label for="pa">パー</label></td>
          <td>
            <input id="pa" type="radio" name="janken" value="2" />
          </td>
        </tr>
      </table>
      <input type="submit" value="ぽん" class="submit-button" />
    </form>
  </body>
</html>
<style>
  .form-content {
    margin: 20px;
  }
  .table-content tr,
  .table-content td {
    border: none;
    padding: 4px;
  }
  .submit-button {
    margin-top: 10px;
  }
</style>
