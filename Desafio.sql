create database desafio;

DROP TABLE Servicos;
DROP TABLE Clientes;

CREATE TABLE Clientes (
    id_cliente VARCHAR(10),
    nome_completo TEXT,
    telefone INT
);


INSERT INTO Clientes (id_cliente, nome_completo, telefone) VALUES
('JOAO', ' joao silva', 99887766),
('maria', 'Maria (vizinha)', 88776655),
('PEDRO', 'PEDRO SOUZA', 77665544),
('JOAO', 'Joao Silva', 99887766),
('ana', 'Ana C.', NULL);

CREATE TABLE Servicos (
    servico_id INT,
    id_cliente_ref VARCHAR(50),
    equipamento VARCHAR(100),
    defeito_relatado TEXT,
    data_entrada VARCHAR(20),
    valor_servico VARCHAR(50)
);

INSERT INTO Servicos (servico_id, id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico) VALUES
(1, 'JOAO', 'Notbook Dell', 'nao liga', '05/10/2024', '150.00'),
(2, 'maria', 'Celular Sansung', 'Tela quebrada', '06/10/2024', 'R$ 300,00'),
(3, 'PEDRO', 'PC Gamer', 'fonte keimada', '06-10-2024', 'R$ 100,00'),
(4, 'JOAO', 'Notbook Dell', 'formatar', '07/10/2024', '120'),
(5, 'paulo', 'Tablet', 'nao carrega', '08/10/2024', 'N/A');

CREATE TABLE Clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_completo VARCHAR(255) NOT NULL,
    telefone VARCHAR(20)
);

-- Tabela de serviços corrigida
CREATE TABLE Servicos (
    servico_id INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente_ref INT,
    equipamento VARCHAR(100),
    defeito_relatado VARCHAR(255),
    data_entrada DATE,
    valor_servico DECIMAL(10,2),
    FOREIGN KEY (id_cliente_ref) REFERENCES Clientes(id_cliente)
);

INSERT INTO Clientes (nome_completo, telefone) VALUES
('João Silva', '99887766'),
('Maria', '88776655'),
('Pedro Souza', '77665544'),
('Ana C.', NULL),
('Paulo', NULL);

INSERT INTO Servicos (id_cliente_ref, equipamento, defeito_relatado, data_entrada, valor_servico) VALUES
(1, 'Notebook Dell', 'Não liga', '2024-10-05', 150.00),
(2, 'Celular Samsung', 'Tela quebrada', '2024-10-06', 300.00),
(3, 'PC Gamer', 'Fonte queimada', '2024-10-06', 100.00),
(1, 'Notebook Dell', 'Formatar', '2024-10-07', 120.00),
(5, 'Tablet', 'Não carrega', '2024-10-08', 0.00);

SELECT * FROM Clientes;
SELECT * FROM Servicos;