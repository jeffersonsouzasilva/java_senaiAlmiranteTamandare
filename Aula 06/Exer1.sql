-- -- create a table
-- CREATE TABLE students (
--   id INTEGER PRIMARY KEY,
--   name TEXT NOT NULL,
--   gender TEXT NOT NULL
-- );
-- -- insert some values
-- INSERT INTO students VALUES (1, 'Ryan', 'M');
-- INSERT INTO students VALUES (2, 'Joanna', 'F');
-- -- fetch some values
-- SELECT * FROM students WHERE gender = 'M';



-- Exercicio 01
-- Criando a Tabela
-- CREATE TABLE usuario (
--     cpf VARCHAR (14) PRIMARY KEY, -- chave primaria da tabela
--     nome VARCHAR(100) NOT NULL,
--     email VARCHAR(100) NOT NULL,
--     pontos_fidelidade INTEGER NOT NULL DEFAULT 0 -- inicializo por padrão como zero
    
-- );

-- -- inserir 10 usuarios
-- INSERT INTO usuario (cpf, nome, email, pontos_fidelidade) VALUES
-- ('123.456.789-00', 'João Silva', 'joao.silva@example.com', 1),
-- ('234.567.890-11', 'Maria Oliveira', 'maria.oliveira@example.com', 25),
-- ('345.678.901-22', 'Carlos Souza', 'carlos.souza@example.com', 30),
-- ('456.789.012-33', 'Ana Costa', 'ana.costa@example.com', 40),
-- ('567.890.123-44', 'Lucas Pereira', 'lucas.pereira@example.com', 50),
-- ('678.901.234-55', 'Patrícia Santos', 'patricia.santos@example.com', 4),
-- ('789.012.345-66', 'Gabriel Almeida', 'gabriel.almeida@example.com', 0),
-- ('890.123.456-77', 'Fernanda Lima', 'fernanda.lima@example.com', 15),
-- ('901.234.567-88', 'Roberto Silva', 'roberto.silva@example.com', 20),
-- ('012.345.678-99', 'Juliana Rocha', 'juliana.rocha@example.com', 35);


-- -- consulta e query são a mesma coisa
-- -- query para retornar os clientes com 5 ou mais pontos de fidelidades
-- SELECT * FROM usuario WHERE pontos_fidelidade >= 5;




-- Exercicio 02 (primeira opção)
-- CREATE TABLE vendor (
--     cpf VARCHAR(14) PRIMARY KEY,
--     nome VARCHAR(100) NOT NULL,
--     email VARCHAR(100) NOT NULL,
--     total_vendas INTEGER NOT NULL DEFAULT 0
-- );

-- INSERT INTO vendor (cpf, nome, email, total_vendas) VALUES
-- ('123.456.789-00', 'Carlos Mendes', 'carlos.mendes@example.com', 150),
-- ('234.567.890-11', 'Ana Clara', 'ana.clara@example.com', 200),
-- ('345.678.901-22', 'Lucas Oliveira', 'lucas.oliveira@example.com', 120),
-- ('456.789.012-33', 'Patrícia Almeida', 'patricia.almeida@example.com', 300),
-- ('567.890.123-44', 'Marcos Souza', 'marcos.souza@example.com', 250),
-- ('678.901.234-55', 'Fernanda Costa', 'fernanda.costa@example.com', 80),
-- ('789.012.345-66', 'Juliano Ribeiro', 'juliano.ribeiro@example.com', 400),
-- ('890.123.456-77', 'Beatriz Lima', 'beatriz.lima@example.com', 180),
-- ('901.234.567-88', 'Rodrigo Pires', 'rodrigo.pires@example.com', 50),
-- ('012.345.678-99', 'Gabriela Martins', 'gabriela.martins@example.com', 220);

-- SELECT * FROM vendor WHERE total_vendas;


-- Exercicio 02 (segunda opção)
-- CREATE TABLE vendor (
--     cpf VARCHAR(14) PRIMARY KEY,
--     nome VARCHAR(100) NOT NULL,
--     email VARCHAR(100) UNIQUE NOT NULL,
--     valorTotal_vendas INTEGER NOT NULL DEFAULT 0
-- );

-- INSERT INTO vendor (cpf, nome, email, valorTotal_vendas) VALUES
-- ('123.456.789-00', 'Carlos Mendes', 'carlos.mendes@example.com', 15000),
-- ('234.567.890-11', 'Ana Clara', 'ana.clara@example.com', 20000),
-- ('345.678.901-22', 'Lucas Oliveira', 'lucas.oliveira@example.com', 12000),
-- ('456.789.012-33', 'Patrícia Almeida', 'patricia.almeida@example.com', 30000),
-- ('567.890.123-44', 'Marcos Souza', 'marcos.souza@example.com', 25000),
-- ('678.901.234-55', 'Fernanda Costa', 'fernanda.costa@example.com', 8000),
-- ('789.012.345-66', 'Juliano Ribeiro', 'juliano.ribeiro@example.com', 40000),
-- ('890.123.456-77', 'Beatriz Lima', 'beatriz.lima@example.com', 500),
-- ('901.234.567-88', 'Rodrigo Pires', 'rodrigo.pires@example.com', 250),
-- ('012.345.678-99', 'Gabriela Martins', 'gabriela.martins@example.com', 220);

-- SELECT * FROM vendor WHERE valorTotal_vendas >= 1000;
-- SELECT * FROM vendor WHERE valorTotal_vendas;



-- Exercicio 02 (CORREÇÃO)
CREATE TABLE vendor (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    valorTotal_vendas DECIMAL(5,2) NOT NULL DEFAULT 0.00
);

INSERT INTO vendor (cpf, nome, email, valorTotal_vendas) VALUES
('123.456.789-00', 'Carlos Mendes', 'carlos.mendes@example.com', 15000.00),
('234.567.890-11', 'Ana Clara', 'ana.clara@example.com', 20000.00),
('345.678.901-22', 'Lucas Oliveira', 'lucas.oliveira@example.com', 12000.00),
('456.789.012-33', 'Patrícia Almeida', 'patricia.almeida@example.com', 30000.00),
('567.890.123-44', 'Marcos Souza', 'marcos.souza@example.com', 25000.00),
('678.901.234-55', 'Fernanda Costa', 'fernanda.costa@example.com', 8000.00),
('789.012.345-66', 'Juliano Ribeiro', 'juliano.ribeiro@example.com', 40000.00),
('890.123.456-77', 'Beatriz Lima', 'beatriz.lima@example.com', 500.00),
('901.234.567-88', 'Rodrigo Pires', 'rodrigo.pires@example.com', 250.00),
('012.345.678-99', 'Gabriela Martins', 'gabriela.martins@example.com', 220.00);

SELECT * FROM vendor WHERE valorTotal_vendas >= 1000.00;
SELECT * FROM vendor;


