# 🕹️ Cadastro de Jogos - JSF + PrimeFaces

Projeto desenvolvido como parte da avaliação **APS/AP2** da disciplina **Desenvolvimento de Sistemas para Web (DSW 2025.1)** da **UNIFAMETRO-CE**.

A aplicação permite cadastrar jogadores com um número apostado, sorteia um número secreto aleatório (entre 1 e 5), compara os valores e mostra se o jogador acertou ou não. Também é possível listar todos os jogos cadastrados, excluir registros e visualizar a quantidade total de jogos realizados.

---

## 🚀 Funcionalidades

- ✅ Cadastro de jogador e número da aposta
- 🎲 Geração automática de número secreto (1 a 5)
- 📊 Avaliação de resultado: "Acertou" ou "Não acertou"
- 📋 Listagem de todos os jogos cadastrados
- 🗑️ Exclusão de jogos da tabela
- 🔢 Contador de quantidade de jogos

---

## 🛠️ Tecnologias Utilizadas

- **Java 8+**
- **JSF (JavaServer Faces)**
- **PrimeFaces**
- **Eclipse IDE for Enterprise Java and Web Developers**
- **Apache Tomcat 9**

---

## 📁 Estrutura de Arquivos

📦 src

┣ 📂 br.beans

┃┗ 📄 JogoBean.java

┣📂 br.jogo

┃┗ 📄 Jogo.java

📦 WebContent

┣📄 index.xhtml

┣📄 listagem.xhtml

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/LeviDeveloper-tech/jogo-cadastro-jsf-primefaces.git
Abra no Eclipse como projeto Web Dinâmico.

Configure o servidor Apache Tomcat 9 no Eclipse.

Execute o projeto no servidor.

Acesse no navegador:

bash
Copiar
Editar
http://localhost:8080/seu-projeto

## **🧠 Sobre a Lógica**
A cada cadastro, um número secreto é sorteado.

O resultado ("Acertou" ou "Não acertou") é avaliado automaticamente.

Todos os dados são armazenados temporariamente em uma ArrayList na classe JogoBean.

## **👨‍💻 Autor**
LeviDeveloper-tech
[GitHub](https://github.com/LeviDeveloper-tech/)

## **📌 Observações**
Este projeto é parte de uma atividade avaliativa. Não utiliza banco de dados — os dados ficam apenas em memória enquanto o servidor estiver rodando.


