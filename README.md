![z2_solutions](https://github.com/user-attachments/assets/1c0fdad7-6c97-4bdc-a9dd-c52d91e2a78f)

# Zero Two Solutions - Sistema de Cadastro e Gestão de Universidades  

Um simples projeto acadêmico para modelagem e criação de um sistema de cadastro e gestão de universidades, permitindo registrar, visualizar e gerenciar informações sobre instituições de ensino superior.  

---

## Índice  
- [Visão Geral](#visão-geral)  
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Pré-requisitos](#pré-requisitos)  
- [Como Rodar o Projeto](#como-rodar-o-projeto)  
- [Estrutura do Projeto](#estrutura-do-projeto)  
- [Contribuições](#contribuições)  
- [Protótipo](#protótipo)
- [API](#api)
- [Telas](#telas)

---

## Visão Geral  
O projeto simula um sistema básico de gerenciamento acadêmico com foco no cadastro e gestão de pessoas e entidades relacionadas a universidades. As principais funcionalidades incluem:

- Cadastro de diferentes tipos de usuários: Pessoa Física, Pessoa Jurídica, Professores, Alunos e Fornecedores.
- Visualização organizada dos dados cadastrados. (nao sei)
- Simulação de login para acesso ao sistema administrativo. (nao sei)

O sistema foi desenvolvido para fins educacionais, explorando conceitos de front-end, organização de dados e princípios de usabilidade.

---

## Tecnologias Utilizadas  

![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)  
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)  
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)  
![H2 Database](https://img.shields.io/badge/H2_Database-0078D6?style=for-the-badge&logo=databricks&logoColor=white)  
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)  

---

## Programas Utilizados  

![Visual Studio Code](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=White)  
![IntelliJ](https://img.shields.io/badge/Intellij%20Idea-000?logo=intellij-idea&style=for-the-badge)  
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)  

---

## Pré-requisitos  
Para rodar o projeto, você precisará de:  
- Um editor de texto, como VS Code.  
- Um navegador moderno (Chrome, Firefox, Edge).
- JDK ^17 configurada.  

## Como Rodar o Projeto  

1. **Clone o repositório**:  
  
   git clone https://github.com/MWPersico/zero_two_solutions

2. Navegue até a pasta do projeto:

   cd gestao-universidades (exemplo)

3. Abra o arquivo HTML principal em seu navegador:

   - Para sistemas locais, abra dashboard.html.

4. Execute e garanta que o backend do projeto está funcionando para realizar as operações na aplicação.

5. Acesse a página do dashboard 'dashboard.html' e use as opções de cadastro e visualização disponíveis.



---

## Estrutura do Projeto

frontend                      # Frontend do projeto         
├── js/                           # Arquivos javascript  
├── styles.css 		             # Estilos do projeto  
├── cadastro.html                 # Página de cadastro  
├── login.html                    # Página de login  
├── cadastro-alunos.html          # Página de cadastro de alunos  
├── cadastro-fornecedores.html    # Página de cadastro de fornecedores  
├── cadastro-professores.html     # Página de cadastro de professores  
├── cadastro-pessoa-fisica.html   # Página de cadastro de pessoa física  
├── cadastro-pessoa-juridica.html # Página de cadastro de pessoa jurídica  
├── dashboard.html                # Painel administrativo  
backend/                      # Backend do projeto       
README.md                     # Documentação do projeto  

---

## Contribuições  
Quer ajudar a melhorar o projeto? Siga os passos:

1. Faça um fork do repositório.

2. Crie uma branch para sua feature:
   git checkout -b feature/nova-feature

3. Commit suas mudanças:
   git commit -m "Adiciona nova funcionalidade"

4. Envie para sua branch:
   git push origin feature/nova-feature

5. Abra um Pull Request no repositório original.

---

## Protótipo
Foi desenvolvido um protótipo de telas do projeto com Figma, que serviram para o desenvolvimento do front-end do projeto em com HTML e CSS, fornecendo uma base sólida para criação das telas.

Link do protótipo: [Protótipo no Figma](https://www.figma.com/design/57RTOGtbTeYvhWRil7zInx/Projeto-Integrador?node-id=0-1&node-type=canvas&t=YtbRUJF0KswUbegc-0)

---

## API
A api do projeto foi criada utilizando Java com Spring Boot, com banco H2 em memória para persistência e HIbernate como ferramenta de ORM, disponibilizando operações de leitura, criação, deleção e atualização de entidades.

Alunos:

![alunos](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_aluno.png)

Professores:

![professores](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_professor.png)

Pessoas Jurídicas:

![pj](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_pessoaJuridica.png)

Pessoas Físicas:

![pf](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_pessoaFisica.png)

Fornecedores:

![fornecedores](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_fornecedor.png)

Cursos:

![cursos](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_curso.png)

Disciplinas:

![discplinas](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/api_disciplina.png)

Especificando um id na rota, é possível recuperar entidades por ID, a mesma rota é utilizada para deletar e atualizar as mesmas.

---

## Telas
As telas para cadastro de cada uma das entidades principais foi desenvolvida utilizando HTML, CSS e JavaScript e se baseando totalmente no protótipo desenvolvido no figma. Os formulários e tabelas consomem a API para recuperar, deletar, cadastrar e atualizar as entidades de maneira dinâmica, as telas dos formulários são capazes de realizar todas as operações:

Alunos:

![alunos](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/tela_aluno.png)

Professores:

![professores](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/tela_professor.png)

Pessoas Jurídicas:

![pj](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/tela_pessoaJuridica.png)

Pessoas Físicas:

![pf](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/tela_pessoaFisica.png)

Fornecedores:

![fornecedores](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/tela_fornecedor.png)

Também foram desenvolvido o dashboard para acessar os formulários e as telas de login e cadastro que será aproveitada futuramente para autenticação no projeto:

Dashboard:

![dashboard](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/dashboard.png)

Login:

![login](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/login.png)

Cadastro:

![cadastro](https://raw.githubusercontent.com/MWPersico/zero_two_solutions/refs/heads/main/projeto/imagens/cadastro.png)

---
