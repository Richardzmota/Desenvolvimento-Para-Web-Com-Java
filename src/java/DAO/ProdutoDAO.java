package DAO;

import java.sql.*;
import model.Produto;

public class ProdutoDAO {
    // Configurações de acesso ao banco de dados MySQL
    private final String URL = "jdbc:mysql://localhost:3306/loja_eletronicos?useTimezone=true&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASS = "admin"; // Coloque sua senha do MySQL aqui se houver

    public Produto buscarPorId(int id) {
        Produto p = null;
        try {
            // Carrega o driver de conexão do MySQL            
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelece a conexão com o schema específico
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            
            // Prepara a query SQL com parâmetro para evitar SQL Injection
            PreparedStatement ps = con.prepareStatement("SELECT * FROM produto WHERE id = ?");
            ps.setInt(1, id);
            
            // Executa a consulta
            ResultSet rs = ps.executeQuery();

            // Se houver registro, preenche o objeto de modelo (Produto)
            if (rs.next()) {
                p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
            }
            // Fecha a conexão para liberar recursos
            con.close();
        } catch (Exception e) {
            // Imprime erros de conexão ou SQL no console
            e.printStackTrace();
        }
        return p; // Retorna o produto ou null
    }
}