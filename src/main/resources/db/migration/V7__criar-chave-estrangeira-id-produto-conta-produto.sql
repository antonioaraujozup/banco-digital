ALTER TABLE conta_produto
ADD CONSTRAINT fk_id_produto_conta_produto
FOREIGN KEY (id_produto) REFERENCES produto(id);