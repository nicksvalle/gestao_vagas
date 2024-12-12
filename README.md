# Gestão de Vagas

O projeto **Gestão de Vagas** é uma aplicação desenvolvida em Java com o objetivo de gerenciar vagas de emprego de maneira eficiente. Ele permite o cadastro, a visualização e o gerenciamento de vagas, com foco em otimizar os processos de recrutamento e seleção.

---

## Funcionalidades

- **Cadastro de Vagas**: Permite adicionar informações detalhadas sobre cada vaga, como título, descrição, requisitos e localidade.
- **Gestão de Candidatos**: Em desenvolvimento - possibilitará a inscrição de candidatos e o acompanhamento de suas aplicações.
- **Administração**: Área para gerenciar vagas e acessar relatórios sobre inscrições.
- **Integração com APIs Externas**: Planejado para enviar notificações por e-mail e realizar integração com plataformas como LinkedIn.

---

## Tecnologias Utilizadas

- **Java**: Linguagem principal para o desenvolvimento da aplicação.
- **Spring Boot**: Framework para facilitar a construção da aplicação backend.
- **PostgreSQL**: Banco de dados relacional para armazenamento de informações.
- **Docker**: Utilizado para containerização e deploy.

---

## Estrutura do Projeto

- `src/main`: Contém o código principal, incluindo controladores, serviços e modelos.
- `src/test`: Testes unitários para validação da lógica do sistema.
- `docker-compose.yml`: Arquivo para configuração e execução dos containers.
- `application.yml`: Configurações do Spring Boot, como dados de conexão ao banco.

---

## Como Executar

### Pré-requisitos

- [Docker](https://www.docker.com/) instalado na máquina.
- Ambiente de desenvolvimento configurado (como IntelliJ IDEA ou VS Code).

### Passo a Passo

1. Clone este repositório:

```bash
git clone https://github.com/nicksvalle/gestao_vagas.git
```
2. Navegue até o diretório do projeto:
```bash
cd gestao_vagas
```
3. Suba os containers com Docker Compose:
```bash
docker-compose up -d
```
4. Acesse a documentação da API no Swagger:
   
Abra o navegador e cole o seguinte link:
```bash
http://localhost:8080/swagger-ui/index.html
```
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias ou novas ideias.

## Contato

Se tiver dúvidas ou sugestões, entre em contato:

- **Email**: [nicolasdeoliveiravalle@gmail.com](mailto:nicolasdeoliveiravalle@gmail.com)  
- **LinkedIn**: [Nicolas Valle](www.linkedin.com/in/nicolas-valle-620b29219)
