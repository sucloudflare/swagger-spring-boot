<h1>spring-swagger-api</h1>
  <p>Projeto demo usando Spring Boot 3.2.0 com documentação automática via Swagger (springdoc-openapi).</p>

  <hr />

  <h2>Pré-requisitos</h2>
  <ul>
    <li>Java JDK 21 instalado e configurado no sistema</li>
    <li>Maven 3.x instalado</li>
    <li>Sistema Linux (Kali, Ubuntu, Debian, etc.)</li>
  </ul>

  <hr />

  <h2>Configuração do Java 21 no Linux</h2>

  <h3>1. Verifique as versões instaladas:</h3>
  <pre><code>java -version
javac -version
</code></pre>
  <p>Caso <code>javac</code> ainda esteja na versão 17, prossiga para configurar o Java 21.</p>

  <h3>2. Configure o <code>JAVA_HOME</code> e <code>PATH</code> temporariamente:</h3>
  <pre><code>export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
</code></pre>
  <p>Verifique novamente a versão do compilador:</p>
  <pre><code>javac -version
# Deve mostrar algo como javac 21.0.x
</code></pre>

  <h3>3. (Opcional) Defina o Java 21 como padrão permanente:</h3>
  <pre><code>sudo update-alternatives --install /usr/bin/java java /usr/lib/jvm/java-21-openjdk-amd64/bin/java 2
sudo update-alternatives --install /usr/bin/javac javac /usr/lib/jvm/java-21-openjdk-amd64/bin/javac 2
sudo update-alternatives --config java
sudo update-alternatives --config javac
</code></pre>
  <p>Adicione as variáveis ao seu arquivo <code>~/.bashrc</code> ou <code>~/.zshrc</code>:</p>
  <pre><code>export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
</code></pre>

  <hr />

  <h2>Como rodar o projeto</h2>
  <h3>1. Baixe as dependências, compile e empacote o projeto</h3>
  <pre><code>mvn clean install
</code></pre>

  <h3>2. Execute a aplicação Spring Boot</h3>
  <pre><code>mvn spring-boot:run
</code></pre>

  <h3>3. Acesse a documentação Swagger</h3>
  <p>Abra no navegador:</p>
  <pre><code>http://localhost:8080/swagger-ui.html
</code></pre>
  <p>ou</p>
  <pre><code>http://localhost:8080/swagger-ui/index.html
</code></pre>

  <hr />

  <h2>Sobre o projeto</h2>
  <ul>
    <li>Spring Boot 3.2.0</li>
    <li>Java 21</li>
    <li>Documentação da API com springdoc-openapi-ui</li>
  </ul>

  <hr />

  <h2>Problemas comuns</h2>
  <p><strong>Erro <code>release version 17 not supported</code> no Maven:</strong><br />
  Ocorre quando o Maven está usando uma versão antiga do <code>javac</code>.<br />
  <strong>Solução:</strong> configurar <code>JAVA_HOME</code> e <code>PATH</code> para apontar para o JDK 21 corretamente.</p>

  <hr />
