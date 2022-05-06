CREATE TABLE conta (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    documento_titular varchar(100),
    nome_titular varchar(100),
    abertura timestamp,
    agencia int,
    numero bigint,
    saldo decimal(18,2)
);