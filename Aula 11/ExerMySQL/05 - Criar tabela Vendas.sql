CREATE TABLE vendas (
    data VARCHAR(10) NOT NULL,
    cod_cliente INT NOT NULL,
    cod_produto INT NOT NULL,
    quantidade INT NOT NULL,
    valor DECIMAL(10,2) NOT NULL
);

DROP TABLE vendas;

CREATE TABLE cliente (
    cod_cliente INT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    estado VARCHAR(50) NOT NULL
);

CREATE TABLE produto (
    cod_produto INT PRIMARY KEY,
    desc_produto VARCHAR(100) NOT NULL,
    segmento_produto VARCHAR(50) NOT NULL
);

INSERT INTO cliente (cod_cliente, nome_cliente, estado) VALUES
(1, 'Ana Oliveira', 'São Paulo'),
(2, 'Bruno Souza', 'Rio de Janeiro'),
(3, 'Carlos Santos', 'Minas Gerais'),
(4, 'Daniel Lima', 'Bahia'),
(5, 'Eduarda Almeida', 'Paraná'),
(6, 'Fernanda Ribeiro', 'Santa Catarina'),
(7, 'Gabriel Costa', 'Rio Grande do Sul'),
(8, 'Helena Nunes', 'Pernambuco'),
(9, 'Isabel Martins', 'Ceará'),
(10, 'João Pereira', 'Distrito Federal'),
(11, 'Kamila Rocha', 'Mato Grosso'),
(12, 'Lucas Araújo', 'Mato Grosso do Sul'),
(13, 'Mariana Barros', 'Goiás'),
(14, 'Nicolas Teixeira', 'Pará'),
(15, 'Olivia Mendes', 'Amazonas'),
(16, 'Pedro Torres', 'Acre'),
(17, 'Quintina Carvalho', 'Rondônia'),
(18, 'Rafaela Silva', 'Tocantins'),
(19, 'Samuel Melo', 'Amapá'),
(20, 'Thiago Monteiro', 'Roraima');



INSERT INTO produto (cod_produto, desc_produto, segmento_produto) VALUES
(1, 'Pneu All-Terrain', 'automobilistico'),
(2, 'Óleo para Motor', 'automobilistico'),
(3, 'Bateria Veicular', 'automobilistico'),
(4, 'Painel Solar Residencial', 'energia'),
(5, 'Gerador a Diesel', 'energia'),
(6, 'Carregador de Baterias', 'energia'),
(7, 'Televisão LED 55"', 'varejo'),
(8, 'Geladeira Duplex', 'varejo'),
(9, 'Smartphone 5G', 'varejo'),
(10, 'Notebook Ultrafino', 'varejo');



INSERT INTO vendas (data, cod_cliente, cod_produto, quantidade, valor) VALUES
('2025-01-01', 1, 1, 2, 900.00),
('2025-01-02', 2, 3, 1, 1250.00),
('2025-01-03', 4, 5, 3, 8700.00),
('2025-01-04', 5, 7, 2, 4500.00),
('2025-01-05', 3, 2, 4, 320.00),
('2025-01-06', 8, 10, 1, 3000.00),
('2025-01-07', 10, 8, 6, 16800.00),
('2025-01-08', 6, 4, 3, 8700.00),
('2025-01-09', 9, 9, 2, 2400.00),
('2025-01-10', 7, 6, 1, 480.00),
('2025-01-11', 1, 3, 5, 2000.00),
('2025-01-12', 2, 1, 3, 1350.00),
('2025-01-13', 4, 5, 2, 5800.00),
('2025-01-14', 5, 7, 3, 4500.00),
('2025-01-15', 8, 9, 1, 1200.00),
('2025-01-16', 10, 2, 4, 1600.00),
('2025-01-17', 3, 4, 2, 2900.00),
('2025-01-18', 9, 10, 1, 3000.00),
('2025-01-19', 6, 8, 3, 9000.00),
('2025-01-20', 7, 6, 1, 480.00),
('2025-01-21', 2, 7, 5, 7500.00),
('2025-01-22', 8, 9, 2, 2400.00),
('2025-01-23', 4, 5, 3, 8700.00),
('2025-01-24', 10, 10, 1, 3000.00),
('2025-01-25', 1, 2, 4, 320.00),
('2025-01-26', 5, 8, 6, 16800.00),
('2025-01-27', 3, 3, 2, 1250.00),
('2025-01-28', 6, 1, 1, 450.00),
('2025-01-29', 7, 5, 4, 11600.00),
('2025-01-30', 9, 7, 2, 3000.00),
('2025-02-01', 1, 1, 2, 1900.00),
('2025-02-02', 2, 3, 1, 11250.00),
('2025-02-03', 4, 5, 3, 18700.00),
('2025-02-04', 5, 7, 2, 14500.00),
('2025-02-05', 3, 2, 4, 1320.00),
('2025-02-06', 8, 10, 1, 13000.00),
('2025-02-07', 10, 8, 6, 116800.00),
('2025-02-08', 6, 4, 3, 18700.00),
('2025-02-09', 9, 9, 2, 12400.00),
('2025-02-10', 7, 6, 1, 1480.00),
('2025-02-11', 1, 3, 5, 12000.00),
('2025-02-12', 2, 1, 3, 11350.00),
('2025-02-13', 4, 5, 2, 15800.00),
('2025-02-14', 5, 7, 3, 14500.00),
('2025-02-15', 8, 9, 1, 11200.00),
('2025-02-16', 10, 2, 4, 11600.00),
('2025-02-17', 3, 4, 2, 12900.00),
('2025-02-18', 9, 10, 1, 13000.00),
('2025-02-19', 6, 8, 3, 19000.00),
('2025-02-20', 7, 6, 1, 1480.00),
('2025-02-21', 2, 7, 5, 17500.00),
('2025-02-22', 8, 9, 2, 12400.00),
('2025-02-23', 4, 5, 3, 18700.00),
('2025-02-24', 10, 10, 1, 13000.00),
('2025-02-25', 1, 2, 4, 1320.00),
('2025-02-26', 5, 8, 6, 116800.00),
('2025-02-27', 3, 3, 2, 11250.00),
('2025-02-28', 6, 1, 1, 1450.00),
('2025-02-29', 7, 5, 4, 111600.00),
('2025-02-30', 9, 7, 2, 13000.00);


SELECT quantidade
FROM vendas 
WHERE cod_cliente = 1;


