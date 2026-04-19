<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portfolio 5</title>
    </head>
    <body>
        <h1>Informações do Produto</h1>
            <p>ID: ${produto.id}</p>
            <p>Nome: ${produto.nome}</p>
            <p>Descrição: ${produto.descricao}</p>
            <p>Preço: R$ ${produto.preco}</p>
            <a href="index.htm">Voltar</a>
    </body>
</html>
