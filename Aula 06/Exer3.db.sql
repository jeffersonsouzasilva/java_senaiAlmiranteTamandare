-- Exercicio 03
CREATE TABLE produtos (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(5,2) NOT NULL,
    quantidade INTEGER NOT NULL,
  	categoria VARCHAR NOT NULL
);

INSERT INTO produtos (id, nome, preco, quantidade, categoria) VALUES
(1, 'Camiseta Básica', 29.99, 100, 'Vestuário'),
(2, 'Escova Eletrica', 199.90, 50, 'Higiene Pessoal'),
(3, 'Fone de Ouvido Bluetooth', 150.00, 30, 'Acessórios'),
(4, 'Smartphone X1', 1299.99, 20, 'Eletrônicos'),
(5, 'Relógio de Pulso', 120.00, 80, 'Acessórios'),
(6, 'Cadeira de Escritório', 350.00, 15, 'Móveis'),
(7, 'Notebook HP', 2500.00, 10, 'Eletrônicos'),
(8, 'Escova dental', 9.99, 200, 'Higiene Pessoal'),
(9, 'Sofá 3 Lugares', 1200.00, 8, 'Móveis'),
(10, 'Aspirador de Pó', 299.90, 25, 'Eletrodomésticos'),
(11, 'Mesa de Jantar', 600.00, 12, 'Móveis'),
(12, 'Blusa de Frio', 89.90, 120, 'Vestuário'),
(13, 'Cafeteira Elétrica', 180.00, 40, 'Eletrodomésticos'),
(14, 'Bicicleta Aro 29', 999.99, 15, 'Esportes'),
(15, 'Caderno Universitário', 15.50, 500, 'Papéis e Materiais');

SELECT * FROM produtos;
--DROP TABLE produtos;
SELECT * FROM produtos WHERE categoria = 'Higiene Pessoal';
SELECT * FROM produtos WHERE preco <= 10.00;
SELECT * FROM produtos WHERE preco >= 50.00;


SELECT id, nome, preco, quantidade, 
       (preco * quantidade) AS valor_totalEstoque
FROM produtos;


