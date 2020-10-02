<h1><b>desafio-aluno</b></h1>   
Neste readme irei dividir as informações relevantes em tópicos, os desafios passados foram:
<br>
1 - Criar um CRUD de Aluno com as propriedades { ID, Nome, Idade }.
<br>
2 - Ter uma tela com o CRUD.
<br>
3 - Salvar e remover em banco ou TXT.

<h3><b>Como executar o projeto:</b></h3>

   <LI><b>Via IDE</b><br>
    Para executar o projeto via IDE basta entrar no projeto e executar a classe <b>ApiStarter.java</b>.
    <br>
    Tem que executar o scrip start no arquivo package.json.
</UL>
    
<h3><b>Tecnologias utilizadas:</b></h3>
<UL>
  <LI><b>SpringFramework(Web e DataJpa) v2.3.3:</b> Ferramenta facilitadora de configuração de projetos.</LI>
  <LI><b>H2 Database v1.4.200:</b> Banco de dados embarcado utilizado principalmente para testes.</LI> 
  <LI><b>Lombok v1.18.8:</b> Ferramenta que tem por principal objetivo diminuir a verbosidade do código.</LI> 
  <LI><b>Gradle v4.2:</b> Ferramenta de gerenciamento de dependências e automatização de builds, utiliza o ANT e o Maven.</LI>
  <LI><b>Postman v7.33.1:</b> Ferramenta para teste de API's que utilizam o padrão REST.</LI>
  <LI><b>Intellij v2020.2.2:</b> IDE de desenvolvimento.</LI>
</UL>

<h3><b>Urls relevantes:</b></h3>
  <UL>
<LI><b><a href='http://localhost:3000'> http://localhost:3000</a></b><br>
      Url principal do react.
  <LI><b><a href='http://localhost:8080/students'>GET http://localhost:8080/students</a></b><br>
      Url destinada a recuperar a lista de estudantes.
  <LI><b><a href='http://localhost:8080/students/id'>GET http://localhost:8080/students/id</a></b><br>
        Url destinada a recuperar o estudante por id.  
  <LI><b><a href='http://localhost:8080/students'>POST http://localhost:8080/students</a></b><br>
        Url destinada a adicionar um estudante. 
  <LI><b><a href='http://localhost:8080/students/id'>DELETE http://localhost:8080/students/id</a></b><br>
        Url destinada a deletar um estudante por id.
  <LI><b><a href='http://localhost:8080/students/id'>PUT http://localhost:8080/students/id</a></b><br>
        Url destinada a alterar um estudante inteiro por id.                   
  <LI><b><a href='http://localhost:8080/h2-console'>http://localhost:8080/h2-console</a></b><br>
    Url destinada ao banco de dados H2, para conectar ao banco e observar suas informações, os seguintes dados deveram ser         respeitados após start da aplicação.<br>
    <b>JDBC URL:</b> jdbc:h2:mem:aluno<br>
    <b>User name:</b> sa<br>
    <b>Password:</b> em branco<br>
  <LI><b><a href='https://developer.okta.com/blog/2018/07/19/simple-crud-react-and-spring-boot#/'>https://developer.okta.com/blog/2018/07/19/simple-crud-react-and-spring-boot#/</a></b><br>
      Tutorial para desenvolvimento do react. 
</UL>

<h3><b>Considerações finais:</b></h3>
  Gostei de executar o projeto pois foi a primeira vez que usei o react, porém tive muita dificuldade, principalmente na configuração. Em relação ao CRUD, já havia feito um projeto parecido, então foi um pouco mais confortável para codar, e quando surgia alguma dúvida foi mais fácil consultar em um código feito por mim. 