# 📖 Analisador Léxico – Checkpoint 01  

Projeto desenvolvido para a disciplina **Construção de Compiladores I**, como parte do **Checkpoint 01**.  

O objetivo foi implementar um **Analisador Léxico** em **Java**, sem o uso de ferramentas automáticas, reconhecendo tokens básicos de uma linguagem simples.  

---

## 🚀 Funcionalidades implementadas  

✔️ Identificadores: `(a-z | A-Z | _)(a-z | A-Z | _ | 0-9)*`  
✔️ Operadores matemáticos: `+ - * /`  
✔️ Operador de atribuição: `=`  
✔️ Operadores relacionais: `> >= < <= != ==`  
✔️ Parênteses: `(` e `)`  
✔️ Constantes numéricas inteiras e decimais (ex.: `123`, `123.456`, `.456`)  
✔️ Palavras reservadas: `int`, `float`, `print`, `if`, `else`  
✔️ Comentários:  
   - Linha: `# ...` ou `// ...`  
   - Bloco: `/* ... */`  
✔️ Tratamento de erros léxicos com **linha e coluna**  

---

## 📂 Estrutura do projeto  
```c
Analisador_Lexico/
│── src/
│ ├── lexical/
│ │ ├── Scanner.java
│ │ ├── Token.java
│ │ ├── LexicalException.java
│ ├── util/
│ │ └── TokenType.java
│ ├── mini_compiler/
│ │ └── Main.java
│── programa.mc 
│── .gitignore

```

---

## ▶️ Como executar  

### 1. Compilar os arquivos
No terminal, dentro da raiz do projeto:  

```bash
javac util/*.java lexical/*.java mini_compiler/*.java
```
```bash
java mini_compiler.Main
```
---
## 📝 Exemplo de entrada (programa.mc)

```c
int a = 10 
float b = 3.14 
float c = .5 
print(a + b * (a - 2) / c)

/* comentário multi-linha */

if a >= 5 
    print(a) 
else 
    print(b)
```

---

## 💻 Exemplo de saída

```c
Token[type=KW_INT, lexeme='int', line=2, col=1]
Token[type=IDENTIFIER, lexeme='a', line=2, col=5]
Token[type=ASSIGN, lexeme='=', line=2, col=7]
Token[type=INT_LITERAL, lexeme='10', line=2, col=9]
...
Token[type=KW_ELSE, lexeme='else', line=13, col=1]
Token[type=KW_PRINT, lexeme='print', line=14, col=1]
```

---

## 👨‍💻 Integrantes
João Victor Martelletto de Paula Teixeira
