# Java web app

## Instalação e configuração do Apache Tomcat

1. Fazer download do apache tomcat 10 core zip
https://tomcat.apache.org/download-10.cgi

2. Descompactar no dir home de estudante ~/

3. Abrir no terminal o dir apache-tomcat-10.1.12 e executar o comando apenas no Linux: chmod +x bin/*.sh

4. No Linux: Executar o comando ./bin/startup.sh para iniciar o serviço do tomcat
5. No Windows: Entrar na pasta bin `cd bin` e executar o comando startup.bat para iniciar o serviço do tomcat

5. Acessar localhost:8080

6. Alterar o arquivo /conf/tomcat-users.xml configurando user admin e senha admin
<user username="admin" password="admin" roles="manager-gui"/>

7. No Linux: Executar o comando ./bin/shutdown.sh para para o serviço do tomcat
8. No Windows: Entrar na pasta bin `cd bin` e executar o comando shutdown.bat para para o serviço do tomcat

9. Executar o comando ./bin/startup.sh para iniciar o serviço do tomcat com as novas configurações

10. Acessar localhost:8080 e em seguida o link server status e manager app

## Implantando a aplicação manualmente

11. Executar os comandos
```bash 
export JAVA_TOOL_OPTIONS="-Djava.net.useSystemProxies=true" 
```

```bash
./mvnw package
ou
./mvnw.cmd package
```

12. Mover o arquivo .war localizado na pasta target para a pasta /apache-tomcat-10.1.12/webapps do tomcat. 

13. Reiniciar o tomcat 
```bash
./bin/shutdown.sh
ou
shutdown.bat
```
```bash
./bin/startup.sh
ou
startup.bat
```

14. Refazer os passos 13, 14 e 15 a cada alteração no código

## Implantando a aplicação com uma extensão do VSCode

15. Instalar as extensões Extension Pack for Java e Community Server Connectors

16. Configurar o Apache Tomcat com Server na Community Server Connectors
Create new server -> Download server -> No, use server on disk, selecionar o diretório /apache-tomcat-10.1.12

17. No icone do Tomcat configurado parar o server com Stop Server e em seguida iniciar com Start Server

18. Executar os comandos
```bash 
export JAVA_TOOL_OPTIONS="-Djava.net.useSystemProxies=true" 
```
```bash
./mvnw package
ou
./mvnw.cmd package
```

19. No tomcat configurado adicionar uma implantação via Add Deployment, Exploded, selecionar o diretório gerado pelo maven no projeto projeto/target/java-web-app-1.0

20. Refazer o passo 17 e a opção Publish Server (Full) cada alteração.

21. No arquivo conf/context.xml do servidor adicionar o seguinte configuração `<Context reloadable="true">`

22. Refazer apenas o passo 17 a cada alteração que a extensão irá implantar automaticamente a aplicação no Tomcat.

```bash
./mvnw package
ou
./mvnw.cmd package
```

