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
SELECT * FROM vendor where nome = 'Ana Clara';
-- DROP TABLE vendor;

SELECT SUM(valortotal_vendas) 
AS valortotal_vendas 
FROM vendor; -- valor total de todas as vendas


