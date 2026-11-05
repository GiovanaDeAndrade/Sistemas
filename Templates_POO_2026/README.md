# 20 templates de Java — revisão de POO

Material de estudo preparado para Giovana, em 05/11/2026.
Base: títulos visíveis nos seis prints das aulas 16 a 22. Não foram fornecidos os slides completos nem os enunciados das listas. Os exemplos são autorais e ilustrativos; não são respostas oficiais das listas.

## Comece aqui

1. Abra `GUIA_RAPIDO.md` para reconhecer a estrutura pedida no enunciado.
2. Escolha uma pasta na tabela abaixo e leia seu `LEIA-ME.md`.
3. Execute o exemplo sem alterar nada e confira o resultado esperado.
4. Mude nomes, atributos, regras e dados do Main conforme o enunciado.
5. Teste um caso válido e um inválido. Não basta trocar o nome da classe se as regras forem diferentes.

Precisa de JDK 8 ou superior instalado, sem Maven, sem bibliotecas externas e sem WindowBuilder. Os modelos 17 a 20 abrem janelas e precisam de ambiente gráfico. Os valores monetários usam double para simplificar exercícios; siga o tipo exigido pelo professor.

## Índice: escolha pelo problema

| Nº | Modelo | Use quando... |
|---|---|---|
| 01 | [Classe, construtor, getters e setters](01_classe_validacao/LEIA-ME.md) | o enunciado pedir atributos privados e dados válidos |
| 02 | [Associação: cliente tem endereço](02_associacao/LEIA-ME.md) | um objeto precisar guardar referência a outro |
| 03 | [Agregação: equipe e jogadores](03_agregacao/LEIA-ME.md) | as partes existirem independentemente do grupo |
| 04 | [Composição: pedido cria seus itens](04_composicao/LEIA-ME.md) | o objeto principal controlar a criação das partes |
| 05 | [Cadastro: adicionar, buscar, alterar, remover](05_crud_lista/LEIA-ME.md) | houver uma lista de objetos identificados por código |
| 06 | [Herança: Pessoa e Aluno](06_heranca_super/LEIA-ME.md) | uma classe for um tipo específico de outra |
| 07 | [Sobrescrita e polimorfismo: animais](07_sobrescrita/LEIA-ME.md) | o mesmo método tiver comportamento diferente por subtipo |
| 08 | [Classe abstrata: formas e áreas](08_abstrata_formas/LEIA-ME.md) | o tipo geral não puder ser instanciado |
| 09 | [Lista polimórfica: folha de pagamento](09_folha_polimorfica/LEIA-ME.md) | precisar somar resultados calculados de maneiras diferentes |
| 10 | [Sobrecarga: mesmo nome, parâmetros diferentes](10_sobrecarga/LEIA-ME.md) | o enunciado pedir versões de um método |
| 11 | [Interface: pagamento com Pix ou cartão](11_interface_pagamento/LEIA-ME.md) | várias classes cumprirem um mesmo contrato |
| 12 | [Duas interfaces na mesma classe](12_multiplas_interfaces/LEIA-ME.md) | um objeto oferecer duas capacidades |
| 13 | [instanceof e conversão de tipo](13_casting/LEIA-ME.md) | precisar chamar um método que só existe na subclasse |
| 14 | [Exceções: conversão, divisão e finally](14_try_catch_finally/LEIA-ME.md) | precisar tratar entradas inválidas e continuar |
| 15 | [Exceção personalizada: saque](15_excecao_personalizada/LEIA-ME.md) | uma regra de negócio precisar sinalizar um erro específico |
| 16 | [Scanner: menu com cadastro e repetição](16_scanner_menu/LEIA-ME.md) | precisar cadastrar várias pessoas sem pular o nome |
| 17 | [Swing: entrada e saída com JOptionPane](17_joptionpane/LEIA-ME.md) | a interface usar caixas de diálogo |
| 18 | [Swing: JFrame, campos, botão e evento](18_swing_formulario/LEIA-ME.md) | precisar de formulário com resultado na própria janela |
| 19 | [Swing: combo, checkbox, lista e remoção](19_swing_lista/LEIA-ME.md) | precisar escolher categoria, marcar opção e listar cadastros |
| 20 | [Sistema em camadas: cadastro de produtos](20_camadas_completo/LEIA-ME.md) | precisar separar apresentação, regras e armazenamento |

## Rodar no terminal (Windows, Linux ou macOS)

Extraia o ZIP primeiro. Abra um terminal **dentro da pasta do exemplo**, por exemplo `06_heranca_super`:

```sh
javac -encoding UTF-8 -d out Main.java
java -cp out template06.Main
```

Troque `06` pelo número do modelo (01 a 19). O modelo 20 tem vários arquivos:

```sh
javac -encoding UTF-8 -d out @fontes.txt
java -cp out template20.Main
```

No PowerShell, se necessário, escreva `"@fontes.txt"` entre aspas.

## VS Code

Abra a pasta do modelo em Arquivo → Abrir Pasta. Com suporte a Java e um JDK configurados, abra Main.java e use Run acima de main. Se houver aviso de pacote, use o terminal com os comandos acima. Não execute uma classe auxiliar: a entrada é Main.

## Eclipse

Crie um Java Project (sem module-info.java). Dentro de src, crie o pacote `template06` para o modelo 06 e copie Main.java para ele. Execute Main com Run As → Java Application. Para o modelo 20, crie `template20`, `template20.modelo`, `template20.repositorio`, `template20.servico` e `template20.visao`, colocando cada arquivo no pacote correspondente.

## Adaptação para arquivos separados

Nos modelos 01 a 19, as classes auxiliares estão no Main.java para consulta rápida. Java permite várias classes no mesmo arquivo se apenas uma for pública. Se a atividade exigir uma classe por arquivo, mova cada classe para NomeDaClasse.java, torne-a pública e mantenha o mesmo package e os imports necessários. Compile com `javac -encoding UTF-8 -d out *.java`.

Cada exemplo tem pacote diferente para evitar conflito entre nomes repetidos. Ao juntar exemplos em um projeto próprio, ajuste os packages/imports e elimine classes duplicadas.
