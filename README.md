<h1 align="center">💾 JDBC DAO Implementation</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-%23ED8B00?style=flat&logo=openjdk&logoColor=white" alt="Java 17">
  <img src="https://img.shields.io/badge/JDBC-API-%2300A98F" alt="JDBC API">
  <img src="https://img.shields.io/badge/DAO-Pattern-%23430098" alt="DAO Pattern">
</p>

<p align="center">Implementação de padrão DAO (Data Access Object) usando JDBC puro, desenvolvido durante curso de Java.</p>

<h2>📂 Estrutura do Projeto</h2>

<pre>
dao-jdbc/
├── src/
│   ├── model/
│   │   ├── entities/
│   │   │   ├── Department.java
│   │   │   └── Seller.java
│   │   │
│   │   └── exceptions/
│   │       └── DbException.java
│   │
│   ├── db/
│   │   └── DB.java            # Gerenciamento de conexões
│   │
│   ├── dao/
│   │   ├── impl/
│   │   │   ├── DepartmentDaoJDBC.java
│   │   │   └── SellerDaoJDBC.java
│   │   │
│   │   ├── DepartmentDao.java # Interface DAO
│   │   └── SellerDao.java     # Interface DAO
│   │
│   └── application/
│       └── Program.java       # Classe de teste
│
├── script.sql                 # Script do banco de dados
└── .gitignore
</pre>

<h2>🛠 Tecnologias Utilizadas</h2>
<ul>
  <li>Java 17</li>
  <li>JDBC (Java Database Connectivity)</li>
  <li>Padrão DAO (Data Access Object)</li>
  <li>MySQL (ou outro SGBD compatível com JDBC)</li>
</ul>

<h2>⚙️ Configuração</h2>

<ol>
  <li>Configure o banco de dados executando <code>script.sql</code></li>
  <li>Atualize as credenciais no arquivo <code>DB.java</code>:
    <pre><code>// Exemplo de configuração
private static final String URL = "jdbc:mysql://localhost:3306/coursejdbc";
private static final String USER = "seuUsuario";
private static final String PASS = "suaSenha";</code></pre>
  </li>
</ol>

<h2>🚀 Como Executar</h2>

<ol>
  <li>Clone o repositório:
    <pre><code>git clone https://github.com/gabrielhs33/dao-jdbc.git</code></pre>
  </li>
  <li>Importe no Eclipse/IntelliJ como projeto Java</li>
  <li>Execute a classe <code>Program.java</code> para testar</li>
</ol>

<h2>🔍 Funcionalidades Implementadas</h2>

<div>
  <h3>DepartmentDaoJDBC</h3>
  <ul>
    <li>✅ insert(Department obj)</li>
    <li>✅ update(Department obj)</li>
    <li>✅ deleteById(Integer id)</li>
    <li>✅ findById(Integer id)</li>
    <li>✅ findAll()</li>
  </ul>

  <h3>SellerDaoJDBC</h3>
  <ul>
    <li>✅ insert(Seller obj)</li>
    <li>✅ update(Seller obj)</li>
    <li>✅ deleteById(Integer id)</li>
    <li>✅ findById(Integer id)</li>
    <li>✅ findByDepartment(Department department)</li>
    <li>✅ findAll()</li>
  </ul>
</div>

<h2>📝 Exemplo de Uso</h2>

<pre><code>// Obtendo DAO
SellerDao sellerDao = DaoFactory.createSellerDao();

// Buscando vendedor por ID
Seller seller = sellerDao.findById(3);
System.out.println(seller);

// Buscando por departamento
List&lt;Seller&gt; list = sellerDao.findByDepartment(seller.getDepartment());
list.forEach(System.out::println);</code></pre>



<p align="center">
  Desenvolvido por <a href="https://github.com/gabrielhs33">Gabriel Henrique</a> durante curso de Java
</p>
