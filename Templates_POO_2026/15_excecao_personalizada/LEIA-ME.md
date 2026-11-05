# 15 — Exceção personalizada: saque

**Use quando:** uma regra de negócio precisar sinalizar um erro específico

**O que adaptar:** SaldoInsuficienteException e a condição de saque.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template15.Main
```

## Resultado / roteiro de teste

Mostra `Saldo insuficiente` e `70.0`. `throw` lança; `throws` declara; `catch` trata. Esta exceção é verificada porque estende Exception.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
