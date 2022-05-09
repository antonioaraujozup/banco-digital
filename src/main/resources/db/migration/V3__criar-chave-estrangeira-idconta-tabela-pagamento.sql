ALTER TABLE pagamento
ADD CONSTRAINT fk_id_conta_pagamento
FOREIGN KEY (id_conta) REFERENCES conta(id);