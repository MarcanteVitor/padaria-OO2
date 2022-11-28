------------------------------- DROPS -------------------------------

DROP SEQUENCE public.cliente_id_seq;
-- DROP SEQUENCE public.pedido_id_seq;
-- DROP SEQUENCE public.produto_pedido_id_seq;
DROP SEQUENCE public.produto_venda_id_seq;
DROP SEQUENCE public.produto_id_seq;
-- DROP SEQUENCE public.produto_composicao_id_seq;
DROP SEQUENCE public.venda_id_seq;
-- DROP SEQUENCE public.lancamento_id_seq;


-- ALTER TABLE public.produto_composicao DROP CONSTRAINT fk_produto_composicao_produto_id;
-- ALTER TABLE public.produto_composicao DROP CONSTRAINT fk_produto_pedido_pedido_id;
-- DROP TABLE public.produto_composicao;

-- ALTER TABLE public.produto_pedido DROP CONSTRAINT fk_produto_pedido_produto_id;
-- DROP TABLE public.produto_pedido;

-- ALTER TABLE public.produto_venda DROP CONSTRAINT fk_produto_venda_produto_id;
-- ALTER TABLE public.produto_venda DROP CONSTRAINT fk_produto_venda_venda_id;
DROP TABLE public.produto_venda;

-- ALTER TABLE public.lancamento DROP CONSTRAINT fk_lancamento_venda_id;
-- ALTER TABLE public.lancamento DROP CONSTRAINT fk_lancamento_cliente_id;
-- DROP TABLE public.lancamento;

-- ALTER TABLE public.pedido DROP CONSTRAINT fk_pedido_cliente_id;
-- DROP TABLE public.pedido;

-- ALTER TABLE public.venda DROP CONSTRAINT fk_venda_cliente_id;
-- ALTER TABLE public.venda DROP CONSTRAINT fk_venda_pedido_id;
DROP TABLE public.venda;

DROP TABLE public.produto;

DROP TABLE public.cliente;

------------------------------- CREATES -------------------------------

CREATE SEQUENCE public.cliente_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
	
	
-- CREATE SEQUENCE public.pedido_id_seq
-- 	INCREMENT BY 1
-- 	MINVALUE 1
-- 	MAXVALUE 9223372036854775807
-- 	START 1
-- 	CACHE 1
-- 	NO CYCLE;
	
	
	
-- CREATE SEQUENCE public.produto_pedido_id_seq
-- 	INCREMENT BY 1
-- 	MINVALUE 1
-- 	MAXVALUE 9223372036854775807
-- 	START 1
-- 	CACHE 1
-- 	NO CYCLE;
	
	
	
CREATE SEQUENCE public.produto_venda_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
	
	
CREATE SEQUENCE public.produto_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
	
	
	
-- CREATE SEQUENCE public.produto_composicao_id_seq
-- 	INCREMENT BY 1
-- 	MINVALUE 1
-- 	MAXVALUE 9223372036854775807
-- 	START 1
-- 	CACHE 1
-- 	NO CYCLE;
	
CREATE SEQUENCE public.venda_id_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
	
-- CREATE SEQUENCE public.lancamento_id_seq
-- 	INCREMENT BY 1
-- 	MINVALUE 1
-- 	MAXVALUE 9223372036854775807
-- 	START 1
-- 	CACHE 1
-- 	NO CYCLE;


CREATE TABLE cliente (
	id int4 DEFAULT nextval('cliente_id_seq') NOT NULL,
	nome varchar(200),
	cep int4,
	rua varchar(100),
	numero int4,
	logradouro varchar(200),
	bairro varchar,
	ativo boolean default true
);

ALTER TABLE cliente ADD CONSTRAINT pk_cliente_id PRIMARY KEY(id);


-- CREATE TABLE pedido (
-- 	id int4 DEFAULT nextval('pedido_id_seq') NOT NULL,
-- 	cliente_id int4,
-- 	data_pedido timestamp,
-- 	data_entrega timestamp,
-- 	valor_pedido float8,
-- 	logradouro varchar(200),
-- 	cancelado boolean default false,
-- 	entrega varchar(1) default 'B',
-- 	status varchar(1) default 'P'
-- );

-- ALTER TABLE public.pedido ADD CONSTRAINT pk_pedido_id PRIMARY KEY(id);
-- ALTER TABLE public.pedido ADD CONSTRAINT fk_pedido_cliente_id FOREIGN KEY(id) REFERENCES public.cliente(id);


CREATE TABLE produto(
	id int4 DEFAULT nextval('produto_id_seq') NOT NULL,
	descricao varchar(200),
	valor float8,
	valor_producao_compra float8,
	uso_consumo boolean default false,
	ativo boolean default true
);

ALTER TABLE public.produto ADD CONSTRAINT pk_produto_id PRIMARY KEY(id);


CREATE TABLE venda(
	id int4 DEFAULT nextval('venda_id_seq') NOT NULL,
	cliente_id int4,
	-- pedido_id int4,
	data_venda timestamp,
	valor_venda float8,
	valor_pago float8,
	valor_troco float8,
	cancelado boolean default false,
	entrega varchar(1) default 'B'
);

ALTER TABLE venda ADD CONSTRAINT pk_venda_id PRIMARY KEY (id);
ALTER TABLE venda ADD CONSTRAINT fk_venda_cliente_id FOREIGN KEY (cliente_id) REFERENCES cliente(id);
-- ALTER TABLE venda ADD CONSTRAINT fk_venda_pedido_id FOREIGN KEY (pedido_id) REFERENCES pedido(id);


CREATE TABLE produto_venda(
 	id int4 DEFAULT nextval('produto_venda_id_seq') NOT NULL,
	venda_id int4,
	produto_id int4,
	valor_unitario float8,
	quantidade int4,
	valor_total float8,
	-- observacao varchar(100)
);

ALTER TABLE produto_venda ADD CONSTRAINT pk_produto_venda_id PRIMARY KEY (id);
ALTER TABLE produto_venda ADD CONSTRAINT fk_produto_venda_produto_id FOREIGN KEY (produto_id) REFERENCES produto(id);
ALTER TABLE produto_venda ADD CONSTRAINT fk_produto_venda_venda_id FOREIGN KEY (venda_id) REFERENCES venda(id);


-- CREATE TABLE produto_pedido(
--  	id int4 DEFAULT nextval('produto_pedido_id_seq') NOT NULL,
-- 	pedido_id int4,
-- 	produto_id int4,
-- 	valor_unitario float8,
-- 	quantidade int4,
-- 	valor_total float8,
-- 	observacao varchar(100)
-- );

-- ALTER TABLE produto_pedido ADD CONSTRAINT pk_produto_pedido_id PRIMARY KEY (id);
-- ALTER TABLE produto_pedido ADD CONSTRAINT fk_produto_pedido_produto_id FOREIGN KEY (produto_id) REFERENCES produto(id);
-- ALTER TABLE produto_pedido ADD CONSTRAINT fk_produto_pedido_pedido_id FOREIGN KEY (pedido_id) REFERENCES pedido(id);

-- CREATE TABLE produto_composicao(
--  	id int4 DEFAULT nextval('produto_composicao_id_seq') NOT NULL,
-- 	pedido_id int4,
-- 	produto_id int4,
-- 	valor_unitario float8,
-- 	quantidade int4,
-- 	valor_total float8,
-- 	observacao varchar(100)
-- );

-- ALTER TABLE produto_composicao ADD CONSTRAINT pk_produto_composicao_id PRIMARY KEY (id);
-- ALTER TABLE produto_composicao ADD CONSTRAINT fk_produto_composicao_produto_id FOREIGN KEY (produto_id) REFERENCES produto(id);

-- CREATE TABLE lancamento(
-- 	id int4 DEFAULT nextval('lancamento_id_seq') NOT NULL,
-- 	cliente_id int4,
-- 	venda_id int4,
-- 	data_lancamento timestamp,
-- 	valor float8,
-- 	tipo varchar(1),
-- 	status varchar(1) default 'P'
-- );

-- ALTER TABLE lancamento ADD CONSTRAINT pk_lancamento_id PRIMARY KEY (id);
-- ALTER TABLE lancamento ADD CONSTRAINT fk_lancamento_cliente_id FOREIGN KEY (cliente_id) REFERENCES cliente(id);
-- ALTER TABLE lancamento ADD CONSTRAINT fk_lancamento_venda_id FOREIGN KEY (venda_id) REFERENCES venda(id)




------------------------------- INSERTS -------------------------------

----- Clientes
insert into cliente (nome, cep, rua, numero, logradouro, bairro, ativo)
values ('Vitor', 85580000, 'Rua José Silva', 415, 'N/A', 'Centro', true);

insert into cliente (nome, cep, rua, numero, logradouro, bairro, ativo)
values ('Josivaldo', 85503170, 'Rua Aimoré', 55, 'N/A', 'La Salle', true);

insert into cliente (nome, cep, rua, numero, logradouro, bairro, ativo)
values ('Perisvaldo', 85580000, 'Av. Tupi', 415, 'N/A', 'Centro', true);




----- Produtos

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Pão Francês', 0.5, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Pão Integral', 7, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Cuca', 10, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Sonho Baunilha', 5,NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Sonho Chocolate', 5, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Coxinha',3, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Pastel', 2, NULL, false, true);

insert into produto (descricao, valor, valor_producao_compra, uso_consumo, ativo)
values ('Coca 600', 5, NULL, false, true);