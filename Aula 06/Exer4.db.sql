-- Exercicio 04
CREATE TABLE vendas (
    id_venda INTEGER PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
  	produto VARCHAR(100) NOT NULL,
    quantidade INTEGER NOT NULL,
    preco_unitario DECIMAL(5,2) NOT NULL
);

INSERT INTO vendas (id_venda, nome_cliente, produto, quantidade, preco_unitario) VALUES
(1, 'João Silva', 'Camiseta Básica', 2, 29.99),
(2, 'Maria Oliveira', 'Tênis Esportivo', 1, 199.90),
(3, 'Carlos Souza', 'Fone de Ouvido Bluetooth', 3, 150.00),
(4, 'Ana Costa', 'Smartphone X1', 1, 1299.99),
(5, 'Lucas Pereira', 'Relógio de Pulso', 2, 120.00),
(6, 'Patrícia Santos', 'Cadeira de Escritório', 1, 350.00),
(7, 'Gabriel Almeida', 'Notebook HP', 1, 2500.00),
(8, 'Fernanda Lima', 'Cerveja Artesanal', 6, 9.99),
(9, 'Juliana Rocha', 'Sofá 3 Lugares', 1, 1200.00),
(10, 'Roberto Silva', 'Aspirador de Pó', 1, 299.90);


SELECT CONCAT (nome_cliente,' comprou um(a) ', produto) AS descricao_venda FROM vendas;

SELECT CONCAT (nome_cliente,' comprou ',quantidade, ' ', produto) AS descricao_venda FROM vendas;