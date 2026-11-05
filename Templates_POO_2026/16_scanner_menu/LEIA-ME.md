# 16 — Scanner: menu com cadastro e repetição

**Use quando:** precisar cadastrar várias pessoas sem pular o nome

**O que adaptar:** opções do menu e campos do cadastro; use nextLine para todas as entradas.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template16.Main
```

## Resultado / roteiro de teste

Digite `1`, depois `Ana Maria`, depois `2` e `0` (cada entrada em uma linha). A listagem deve mostrar `[Ana Maria]`. Teste também `abc` e nome vazio.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
