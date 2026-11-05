# 19 — Swing: combo, checkbox, lista e remoção

**Use quando:** precisar escolher categoria, marcar opção e listar cadastros

**O que adaptar:** categorias, checkbox e campos; o DefaultListModel abastece a JList.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template19.Main
```

## Resultado / roteiro de teste

Cadastre dois nomes com categorias diferentes; selecione um e remova. Tente adicionar nome vazio e remover sem seleção. Dados ficam somente na memória.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
