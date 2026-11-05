# 04 — Composição: pedido cria seus itens

**Use quando:** o objeto principal controlar a criação das partes

**O que adaptar:** Pedido/Item e a fórmula quantidade vezes preço.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template04.Main
```

## Resultado / roteiro de teste

Mostra `35.0`. Composição expressa propriedade e ciclo de vida no modelo; Java não oferece destruição manual em cascata.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
