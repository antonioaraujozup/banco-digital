CREATE TABLE conta_produto (
    id_conta bigint NOT NULL,
    id_produto bigint NOT NULL,
    primary key(id_conta, id_produto)
);