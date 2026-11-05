# 20 — Sistema em camadas: cadastro de produtos

**Use quando:** precisar separar apresentação, regras e armazenamento

**O que adaptar:** Produto (modelo), ProdutoService (regras), ProdutoRepository (memória), Tela (Swing).

## Executar

Abra o terminal nesta pasta e execute:

```sh
javac -encoding UTF-8 -d out @fontes.txt
java -cp out template20.Main
```

## Resultado / roteiro de teste

Cadastro em janela: nome `Caneta`, preço `2,50`, Salvar; deve listar Caneta - 2.5. Nome repetido ou preço negativo devem mostrar erro. Fechar encerra; não há banco de dados.

As classes deste modelo já estão separadas em arquivos e pacotes. Mantenha as subpastas. O arquivo `fontes.txt` lista todos os fontes para compilar.

Fluxo: Tela lê os campos → ProdutoService verifica as regras → ProdutoRepository guarda os objetos. Produto representa os dados e valida seus próprios atributos. Nenhuma classe de negócio usa JOptionPane.
