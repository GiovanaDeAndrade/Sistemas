# 09 — Estacionamento e permanências

Projeto completo de estudo: cadastro, consulta, alteração, exclusão e cálculo de **Permanencia**, usando console ou Swing. Os dois modos usam as mesmas regras. Não há dependências externas nem banco de dados.

## Enunciado de referência

Desenvolva um cadastro de Permanencia, identificado por ID positivo, associado a um objeto Motorista. Cada registro possui descrição, valor por hora e horas inteiras. Existem as categorias Avulsa e Conveniada, que calculam o resultado de maneira diferente. O sistema deve permitir inserir, listar, pesquisar, alterar e remover registros, além de mostrar total, média, maior resultado e um filtro específico.

## Regras deste projeto

Avulsa: hora × horas. Conveniada: primeira hora grátis e 20% de desconto nas restantes.

- Valor por hora: entre zero e 1 bilhão, sem NaN nem infinito.
- Horas inteiras: inteiro entre 1 e 1 milhão.
- ID maior que zero e único. Descrição e nome de Motorista não podem ficar vazios.
- Uma alteração inválida preserva o registro anterior.
- Atualizar mantém o ID informado, podendo mudar os demais dados e a categoria.
- Filtro de destaque: **permanências de pelo menos 4 horas**.
- Regras de valores, taxas e descontos são fictícias para exercícios. Double foi usado para simplificar a adaptação; valores exibidos têm duas casas.

## Arquivos e responsabilidades

| Arquivo | Responsabilidade |
|---|---|
| `Main.java` | Monta as dependências e escolhe console ou janela. |
| `modelo/Motorista.java` | Objeto associado ao cadastro. |
| `modelo/Permanencia.java` | Classe abstrata com atributos privados e validação. |
| `modelo/PermanenciaAvulsa.java` | Cálculo da categoria Avulsa. |
| `modelo/PermanenciaConveniada.java` | Cálculo da categoria Conveniada. |
| `modelo/Calculavel.java` | Interface com calcularTotal. |
| `modelo/Validacao.java` | Validações e conversão de decimal. |
| `repositorio/Repositorio.java` | ArrayList, pesquisa e armazenamento em memória. |
| `servico/Servico.java` | Operações, relatórios e criação do subtipo correto. |
| `excecao/OperacaoInvalidaException.java` | Exceção verificada de operação inválida. |
| `visao/Console.java` | Menu, Scanner e tratamento de erros. |
| `visao/Tela.java` | Formulário, JTable, botões, eventos e mensagens. |
| `Teste.java` | Verifica regras e operações sem JUnit. |

Os fontes estão em `src/estudo/t09/`. Métodos calculam sem imprimir; apresentação fica nas classes de visão. A associação é representada por uma referência a Motorista. O repositório agrega objetos recebidos. A composição aparece na tela, que cria e controla seus componentes; este domínio não força composição onde ela não é necessária.

## Executar agora

Requer **JDK 8 ou superior**. Extraia o ZIP primeiro. Abra o terminal dentro desta pasta.

```sh
javac -encoding UTF-8 -d out @fontes.txt
java -cp out estudo.t09.Main
```

No PowerShell, se necessário, use `"@fontes.txt"` entre aspas.

**Janela Swing:**

```sh
java -cp out estudo.t09.Main gui
```

**Teste automático:**

```sh
java -cp out estudo.t09.Teste
```

No Windows, pode abrir `executar.bat` com duplo clique para o console ou executar `executar.bat gui` no terminal. No Linux/macOS: `sh executar.sh` ou `sh executar.sh gui`.

## Eclipse e VS Code

**Eclipse:** File → Import → General → Existing Projects into Workspace → selecione esta pasta. Existe `.project` para importar diretamente. Execute `Main` com Run As → Java Application. Para janela, adicione `gui` em Run Configurations → Arguments → Program arguments.

**VS Code:** abra somente esta pasta em File → Open Folder. Com suporte Java e JDK configurados, abra Main.java e clique Run. Para janela, use o terminal e os comandos acima. A pasta `.vscode` define `src` como raiz dos fontes.

## Teste manual com resultado conhecido

1. Escolha **9** no console ou **Exemplos** na janela.
2. Serão incluídos os IDs 1 e 2, com valor por hora = **8** e horas inteiras = **4**.
3. O resultado do ID 1 é **32.00** e do ID 2 é **19.20**. O total é **51.20**, a média **25.60**.
4. Busque ID 1. Atualize seus dados usando o mesmo ID. Na janela, selecionar a linha preenche os campos.
5. Tente cadastrar ID 1 novamente: deve aparecer erro de duplicidade.
6. Tente valor negativo e quantidade abaixo de 1: deve aparecer erro, sem salvar.
7. Remova ID 1 e confirme. A listagem deve mostrar apenas o ID 2.
8. Consulte o resumo de uma lista vazia: total e média serão zero e maior será “nenhum”.

### Menu do console

1 cadastrar; 2 listar; 3 buscar por ID; 4 atualizar; 5 remover com confirmação; 6 resumo; 7 destaque específico; 8 buscar parte do nome de Motorista; 9 carregar exemplos; 0 sair.

Cadastro e atualização pedem nesta ordem: ID, categoria (1 ou 2), descrição, Motorista, valor por hora, horas inteiras. Letras em campos numéricos cancelam a operação e devolvem ao menu. Aceita decimal com vírgula ou ponto, sem separador de milhar.

## O que adaptar para outra questão

1. Mantenha o package coerente em todos os arquivos (ou renomeie pela IDE).
2. Renomeie a classe Permanencia, as filhas e o objeto Motorista conforme o diagrama.
3. Altere os atributos e suas validações na classe abstrata.
4. Mude a fórmula em calcularTotal das filhas. Não copie taxas sem comparar com o enunciado.
5. Ajuste os argumentos em criar, cadastrar e atualizar no serviço.
6. Adicione os novos campos ao console e ao formulário.
7. Atualize os testes e confira pelo menos um cálculo à mão.

**Limite do exemplo:** é um cadastro didático completo para esse enunciado, não um sistema comercial de estacionamento. Os dados duram só enquanto o programa está aberto. O modo console e o modo janela são execuções separadas, portanto não compartilham cadastros entre processos. A lista usa objetos imutáveis; alterar substitui o objeto inteiro depois da validação, em vez de usar setters parciais.
