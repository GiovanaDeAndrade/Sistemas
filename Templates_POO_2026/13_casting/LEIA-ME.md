# 13 — instanceof e conversão de tipo

**Use quando:** precisar chamar um método que só existe na subclasse

**O que adaptar:** Animal/Cachorro e o método exclusivo buscarBolinha.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template13.Main
```

## Resultado / roteiro de teste

Mostra `Au au`, `Buscou a bolinha`, `Miau`. Para comportamentos comuns, prefira polimorfismo sem cast.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
