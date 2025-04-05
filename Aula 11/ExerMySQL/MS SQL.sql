-- create a table
CREATE TABLE usuario (
    id INTEGER PRIMARY KEY,
  	cpf VARCHAR(11) NOT NULL,
    nome TEXT NOT NULL,
    email TEXT NOT NULL ,
    pontosFidelidade INTEGER NOT NULL
);

INSERT INTO usuario (id,cpf, nome, email, pontosFidelidade) VALUES
(123,'23456789012' ,'João Silva', 'joao.silva@email.com', 150);


INSERT INTO usuario (cpf, nome, email, pontosFidelidade) VALUES
(1231, 'João Silva', 'joao.silva@email.com', 150),
(23456789012, 'Maria Oliveira', 'maria.oliveira@email.com', 230),
(34567890123, 'Carlos Pereira', 'carlos.pereira@email.com', 75),
(45678901234, 'Ana Souza', 'ana.souza@email.com', 310),
(56789012345, 'Pedro Costa', 'pedro.costa@email.com', 95),
(67890123456, 'Juliana Santos', 'juliana.santos@email.com', 180),
(78901234567, 'Lucas Ferreira', 'lucas.ferreira@email.com', 420),
(89012345678, 'Fernanda Alves', 'fernanda.alves@email.com', 60),
(90123456789, 'Ricardo Lima', 'ricardo.lima@email.com', 275),
(11223344556, 'Amanda Rocha', 'amanda.rocha@email.com', 140);

SELECT * FROM usuario ;
