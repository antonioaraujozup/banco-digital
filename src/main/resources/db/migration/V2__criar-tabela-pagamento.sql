CREATE TABLE pagamento (
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    data_pagamento timestamp NOT NULL,
    codigo_barras varchar(100) NOT NULL,
    valor decimal(18,2) NOT NULL,
    codigo_confirmacao varchar(100) NOT NULL,
    id_conta bigint
);
