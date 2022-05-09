CREATE TABLE produto (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome varchar(200) NOT NULL,
    valor decimal(18,2) NOT NULL,
    tipo_cobranca varchar(100) NOT NULL,
    data_criacao timestamp NOT NULL
);