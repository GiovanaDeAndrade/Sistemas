# 10 — Sobrecarga: mesmo nome, parâmetros diferentes

**Use quando:** o enunciado pedir versões de um método

**O que adaptar:** calcular e os parâmetros; o retorno sozinho não diferencia métodos.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template10.Main
```

## Resultado / roteiro de teste

Mostra `60.0` e `54.0`. Sobrecarga muda os parâmetros; sobrescrita mantém a assinatura herdada.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
