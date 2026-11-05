# 11 — Interface: pagamento com Pix ou cartão

**Use quando:** várias classes cumprirem um mesmo contrato

**O que adaptar:** Pagamento e as regras de Pix/Cartao; descontos/taxas são fictícios.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template11.Main
```

## Resultado / roteiro de teste

Mostra `95.0` e `102.0`.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
