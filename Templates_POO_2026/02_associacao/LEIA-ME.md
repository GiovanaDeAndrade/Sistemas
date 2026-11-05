# 02 — Associação: cliente tem endereço

**Use quando:** um objeto precisar guardar referência a outro

**O que adaptar:** Cliente/Endereco por Vendedor/Endereco, Aluno/Curso etc.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template02.Main
```

## Resultado / roteiro de teste

Mostra `Ana - Blumenau`.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
