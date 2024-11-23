-- Curso
INSERT INTO tb_curso(descricao) VALUES ('Informática');
INSERT INTO tb_curso(descricao) VALUES ('Administração');
INSERT INTO tb_curso(descricao) VALUES ('Direito');

-- Professor
INSERT INTO tb_professor (carga_horaria, matricula, salario, data_nascimento, cpf, endereco, nome, telefone, tipo_vinculo, titulacao) VALUES (40, 1001, 5000.00, '1980-03-15', '11223344550', 'Rua X, 10', 'Prof. Antonio', '11666666666', 'CLT', 'Doutorado');
INSERT INTO tb_professor (carga_horaria, matricula, salario, data_nascimento, cpf, endereco, nome, telefone, tipo_vinculo, titulacao) VALUES (20, 1002, 3500.00, '1975-07-22', '22334455661', 'Rua Y, 20', 'Prof. Beatriz', '11555555555', 'CLT', 'Mestrado');
INSERT INTO tb_professor (carga_horaria, matricula, salario, data_nascimento, cpf, endereco, nome, telefone, tipo_vinculo, titulacao) VALUES (30, 1003, 4500.00, '1985-11-10', '33445566772', 'Rua Z, 30', 'Prof. Carlos', '11444444444', 'PJ', 'Doutorado');

-- Disciplina
INSERT INTO tb_disciplina (professor_id) VALUES (1);
INSERT INTO tb_disciplina (professor_id) VALUES (2);
INSERT INTO tb_disciplina (professor_id) VALUES (3);

-- Associação Curso-Disciplina
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (1, 1);
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (1, 2);
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (2, 2);
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (2, 3);
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (3, 1);
INSERT INTO tb_curso_disciplina (curso_id, disciplina_id) VALUES (3, 3);

-- Aluno
INSERT INTO tb_aluno (bolsista, curso_id, matricula, periodo, data_de_ingresso, data_nascimento, cpf, endereco, nome, telefone, tipo_curso) VALUES (true, 1, 101, 1, '2020-02-01', '2000-05-15', '12345678900', 'Rua A, 123', 'João Silva', '11999999999', 'Bacharelado');
INSERT INTO tb_aluno (bolsista, curso_id, matricula, periodo, data_de_ingresso, data_nascimento, cpf, endereco, nome, telefone, tipo_curso) VALUES (false, 2, 102, 2, '2021-03-01', '2001-10-25', '98765432100', 'Rua B, 456', 'Maria Oliveira', '11888888888', 'Tecnológico');
INSERT INTO tb_aluno (bolsista, curso_id, matricula, periodo, data_de_ingresso, data_nascimento, cpf, endereco, nome, telefone, tipo_curso) VALUES (true, 3, 103, 1, '2022-04-01', '1999-01-20', '45678912300', 'Rua C, 789', 'Carlos Souza', '11777777777', 'Licenciatura');

-- Fornecedor
INSERT INTO tb_fornecedor (fim_vigencia, inicio_vigencia, cnpj, contrato, endereco, nome, produto, telefone, tipo_servico) VALUES ('2025-12-31', '2023-01-01', '11222333000199', 'Contr01', 'Rua F, 100', 'Fornecedor A', 'Equipamentos', '11333333333', 'produtos');
INSERT INTO tb_fornecedor (fim_vigencia, inicio_vigencia, cnpj, contrato, endereco, nome, produto, telefone, tipo_servico) VALUES ('2024-12-31', '2022-01-01', '22334455000288', 'Contr02', 'Rua G, 200', 'Fornecedor B', 'Livros', '11222222222', 'servicos');
INSERT INTO tb_fornecedor (fim_vigencia, inicio_vigencia, cnpj, contrato, endereco, nome, produto, telefone, tipo_servico) VALUES ('2026-12-31', '2023-06-01', '33445566000377', 'Contr03', 'Rua H, 300', 'Fornecedor C', 'Uniformes', '11111111111', 'outros');

-- Pessoa Física
INSERT INTO tb_pessoa_fisica (data_nascimento, cpf, endereco, nome, telefone) VALUES ('1990-05-10', '99988877766', 'Rua PF1, 123', 'Ana Paula', '11700000001');
INSERT INTO tb_pessoa_fisica (data_nascimento, cpf, endereco, nome, telefone) VALUES ('1985-03-22', '88877766655', 'Rua PF2, 456', 'Lucas Lima', '11700000002');
INSERT INTO tb_pessoa_fisica (data_nascimento, cpf, endereco, nome, telefone) VALUES ('2000-11-15', '77766655544', 'Rua PF3, 789', 'Carla Mendes', '11700000003');

-- Pessoa Jurídica
INSERT INTO tb_pessoa_juridica (cnpj, endereco, nome, telefone) VALUES ('55667788000199', 'Rua PJ1, 101', 'Empresa X', '11711111111');
INSERT INTO tb_pessoa_juridica (cnpj, endereco, nome, telefone) VALUES ('66778899000288', 'Rua PJ2, 202', 'Empresa Y', '11722222222');
INSERT INTO tb_pessoa_juridica (cnpj, endereco, nome, telefone) VALUES ('77889911000377', 'Rua PJ3, 303', 'Empresa Z', '11733333333');