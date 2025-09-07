# ⚡ Jogo da Forca — Java Console Game

Bem-vindo ao repositório do meu **Jogo da Forca**!  
Este projeto foi desenvolvido em **Java** como prática de programação, lógica e interação via console.  
O game é pensado para **duas pessoas**: uma define a palavra secreta e a outra tenta adivinhar antes que a forca seja
concluída.

---

## 🎮 Estrutura do Jogo

Game

```plaintext
├── INTRO
│ ├── Menu inicial (start)
│ └── Jogador define a palavra secreta
├── MAIN LOOP
│ ├── Exibe a forca em ASCII (Forca.java)
│ ├── Mostra letras já tentadas
│ ├── Verifica se a letra existe na palavra
│ └── Atualiza erros ou progresso
├── GAME OVER
│ ├── Vitória: palavra completada
│ └── Derrota: limite de 6 erros
└── RESTART
└── Pergunta se deseja jogar novamente (y/n)
```

---

## 🚀 Funcionalidades

- 📖 Palavra definida manualmente por um dos jogadores.
- ⌨️ Entrada de letras pelo console.
- 🔄 Validação de letras repetidas.
- 🎨 Forca em **ASCII art**, exibida a cada erro.
- ❌ Limite de 6 erros antes da derrota.
- 🔁 Opção de reiniciar o jogo após o fim.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Scanner (java.util)** para entrada de dados
- **ArrayList / Arrays** para manipulação de letras
- **Console (ASCII art)** para exibir a forca

---

## 📂 Estrutura do Projeto

```plaintext
src/
├── Main.java # Lógica principal do jogo
└── Forca.java # ASCII art da forca
```

---

## 👨‍💻 Como rodar o projeto localmente

1. Clone o repositório:

```bash
git clone https://github.com/Patrick-souza-silva/hangman-game.git
cd hangman-game
```

---

## 📬 Contato

- [📸 Instagram](https://www.instagram.com/_patrick.edueu_)
- [💼 LinkedIn](https://www.linkedin.com/in/patrick-souza-b20b50248/)

  ---
