Desafio Dev Voxus - Victor Hugo da Silva Burghi Batista


O Sistema foi desenvolvido nas tecnologias Java, com framework Spring Boot para o Backend,
as dependências de backend foram gerenciadas com o Maven 3.5.2,
e Javascript, com framework AngularJS 1.6, além do Bootstrap 4.0, para Frontend.
O banco de dados foi desenvolvido em MYSQL.
O Servidor web é integrado ao SpringBoot, que possui o tomcat embarcado.


Para executar o projeto localmente, a melhor IDE para isso é o Eclipse JEE (no projeto, foi utilizada a versão Oxygen),
com a ferramenta Spring instalada(para isso, no Eclipse, vá em Help -> Eclipse Marketplace e instale a extensão Spring Tools).
clone o projeto, faça os comandos do Maven - Clean e Install (clique com o botão direito na raiz do projeto -> Run As -> Maven Clean, depois 
no mesmo menu, faca o comando Maven Install), depois faça o deploy com o comando Run Spring Boot App (Clique com o botão direito na raiz do projeto->
Run As -> Spring Boot App). O Projeto está configurado para rodar na porta 8080, então acesse localhost:8080/voxus, para acessar 
a tela inicial do sistema.
O Banco de dados está configurado para o usuário 'root', com senha '123', caso haja necessidade de mudar, 
o arquivo src/main/resources-> aplication.properties nas configurações 'spring.datasource.username=root' e 
'spring.datasource.password=123' podem ser alterados conforme necessidade.
Execute o script localizado na pasta 'mysql' do projeto para criar o banco, e o projeto estará pronto para ser utilizado.

Cada etapa levou cerca de um dia sendo feita. Passei o domingo estudando e fiz os html's, a segunda no backend e no banco de dados, e terça no front end e na integração entre ambos.

Como já estava acostumado com a tecnologia, pos trabalho com ela atualmente, executar back e front não foram difíceis, no entanto a login com o google foi um problema, pois a sessão parece não persistir, e tive que usar o local storage do browser para armazenar os dados do usuário. Há pouca documentação e ela parece vaga. A parde de anexos também não foi feita, pois não houve tempo, porque não pude estudar tanto como armazenar os arquivos na aplicação, quanto na plataforma da Amazon.

No entanto foi muito divertido fazer o projeto, e crio que com um pouco mais de tempo(uma semana, talvez) eu poderia ter completado ele de acordo com as especificações.

Obrigado.