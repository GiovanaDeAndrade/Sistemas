# 17 — Swing: entrada e saída com JOptionPane

**Use quando:** a interface usar caixas de diálogo

**O que adaptar:** a pergunta e a fórmula de dobro.

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template17.Main
```

## Resultado / roteiro de teste

Abre janela: `2,5` deve retornar `5.0`; `abc` deve mostrar erro; Cancelar encerra. Exige computador com ambiente gráfico.

As classes auxiliares estão no mesmo arquivo para facilitar a consulta. Se o enunciado exigir arquivos separados, mova cada classe para seu próprio arquivo, mantenha o mesmo `package` e adicione `public` à classe. Compile todos com `javac -encoding UTF-8 -d out *.java`.
