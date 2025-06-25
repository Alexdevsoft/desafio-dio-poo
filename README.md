# 📘 Sistema de Gerenciamento de Bootcamps Educacionais em Java

Este projeto Java simula um sistema simplificado de gerenciamento de bootcamps educacionais, permitindo a criação de **Bootcamps**, a inclusão de **Conteúdos** (Cursos e Mentorias) e a interação de **Desenvolvedores (Devs)** com esses bootcamps.

---

## 🚀 Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

### 📚 Criação de Conteúdos

- **Cursos**: Definir título, descrição e carga horária. O XP ganho é proporcional à carga horária.
- **Mentorias**: Definir título, descrição e uma data. Mentorias concedem um XP padrão adicional.

### 🎓 Criação de Bootcamps

- Associar **nome**, **descrição** e uma **coleção de Conteúdos** (Cursos e Mentorias).
- Definir **datas de início e fim**.

### 👥 Inscrição de Devs

- Devs podem se inscrever em bootcamps, tendo acesso a todos os seus conteúdos.

### 📈 Progressão de Devs

- Devs podem "progredir" nos conteúdos, movendo-os de "inscritos" para "concluídos".
- O sistema verifica se o Dev está matriculado em algum conteúdo antes de permitir a progressão.

### 🧮 Cálculo de XP

- Cada Dev tem seu **XP total** calculado com base nos conteúdos que concluiu.

---

## 📦 Estrutura do Projeto

O projeto é organizado nas seguintes classes principais:

```
src/
├── main/
│   └── java/
│       ├── Main.java
│       └── br/com/dio/desafio/dominio/
│           ├── Bootcamp.java
│           ├── Conteudo.java
│           ├── Curso.java
│           ├── Dev.java
│           └── Mentoria.java
```

### 📄 Descrição das Classes

- **`Main.java`**: Ponto de entrada da aplicação, onde a lógica de demonstração é executada.
- **`Conteudo.java`**: Classe abstrata que representa um conteúdo educacional, com título, descrição e método abstrato para calcular XP.
- **`Curso.java`**: Estende `Conteudo`, adiciona `cargaHoraria` e define cálculo de XP proporcional.
- **`Mentoria.java`**: Estende `Conteudo`, adiciona `data` e XP fixo.
- **`Bootcamp.java`**: Representa o bootcamp com seus conteúdos e devs inscritos.
- **`Dev.java`**: Representa o desenvolvedor com funcionalidades de inscrição e progressão.

---

## 🛠️ Como Executar

### ✅ Pré-requisitos

- Ter o **JDK 11 ou superior** instalado na máquina.

### 📥 Passos

1. Clone o repositório ou baixe os arquivos do projeto.
2. Navegue até o diretório raiz no terminal.
3. Compile os arquivos `.java` com o comando:

```bash
javac -d . src/main/java/br/com/dio/desafio/dominio/*.java src/main/java/Main.java
```

> *Observação: ajuste o caminho se necessário, de acordo com a estrutura do seu projeto.*

4. Execute a aplicação:

```bash
java Main
```

---

## 🎯 Exemplo de Uso (Saída do Console)

```txt
Conteúdo inscritos Alex[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=0}, Curso{titulo='Curso Javascript', descricao='Descrição curso Javascript', cargaHoraria=0}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2025-06-25}]
-
Conteúdo inscritos Alex [Curso{titulo='Curso Javascript', descricao='Descrição curso Javascript', cargaHoraria=0}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2025-06-25}]
Conteúdo concluídos Alex [Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=0}]
XP: 0.0
===================================================
Conteúdo inscritos Mila[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=0}, Curso{titulo='Curso Javascript', descricao='Descrição curso Javascript', cargaHoraria=0}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2025-06-25}]
Conteúdo inscritos Mila[Curso{titulo='Curso Javascript', descricao='Descrição curso Javascript', cargaHoraria=0}, Mentoria{titulo='Mentoria de Java', descricao='Descrição mentoria Java', data=2025-06-25}]
Conteúdo concluídos Mila[Curso{titulo='Curso Java', descricao='Descrição curso Java', cargaHoraria=0}]
XP: 0.0
```

---

## Autor: [Alex Almeida](www.linkedin.com/in/alexsandro-j-a-almeida)

## 🤝 Contribuições

Sinta-se à vontade para explorar o código, propor melhorias ou adicionar novas funcionalidades!