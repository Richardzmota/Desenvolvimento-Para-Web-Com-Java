<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portoflio 5</title>
    </head>

    <body>
        <h1>Consulta de Produtos</h1>
            <form action="buscarProduto.htm" method="GET">
                ID do Produto: <input type="number" name="idProduto">
            <button type="submit">Buscar</button>
            </form>
<p style="color:red;">${erro}</p>
    </body>
</html>
