# 14 — Exceções: conversão, divisão e finally

**Use quando:** precisar tratar entradas inválidas e continuar

**O que adaptar:** as entradas e os tipos de exceção de cada operação.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template14.Main
```

## Resultado / roteiro de teste

Mostra 10, erro de conversão e erro de divisor; após cada tentativa mostra `Tentativa encerrada`.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
