# 12 — Duas interfaces na mesma classe

**Use quando:** um objeto oferecer duas capacidades

**O que adaptar:** Imprimivel/Exportavel e os métodos do contrato.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template12.Main
```

## Resultado / roteiro de teste

Mostra `Relatorio: Vendas`, depois `titulo` e `Vendas`. A exportação só produz texto; não grava arquivo.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
