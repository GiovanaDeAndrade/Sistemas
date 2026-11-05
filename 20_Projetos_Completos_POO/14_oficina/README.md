# 14 — Oficina e ordens de serviço

Projeto completo de estudo: cadastro, consulta, alteração, exclusão e cálculo de **OrdemServico**, usando console ou Swing. Os dois modos usam as mesmas regras. Não há dependências externas nem banco de dados.

## Enunciado de referência

Desenvolva um cadastro de OrdemServico, identificado por ID positivo, associado a um objeto Proprietario. Cada registro possui descrição, valor da mão de obra por hora e horas de trabalho. Existem as categorias Preventivo e Emergencial, que calculam o resultado de maneira diferente. O sistema deve permitir inserir, listar, pesquisar, alterar e remover registros, além de mostrar total, média, maior resultado e um filtro específico.

## Regras deste projeto

Preventivo: valor por hora × horas. Emergencial: acréscimo de 50% na mão de obra mais deslocamento de 100.

- Valor da mão de obra por hora: entre zero e 1 bilhão, sem NaN nem infinito.
- Horas de trabalho: inteiro entre 1 e 1 milhão.
- ID maior que zero e único. Descrição e nome de Proprietario não podem ficar vazios.
- Uma alteração inválida preserva o registro anterior.
- Atualizar mantém o ID informado, podendo mudar os demais dados e a categoria.
- Filtro de destaque: **ordens com valor de pelo menos 500**.
- Regras de valores, taxas e descontos são fictícias para exercícios. Double foi usado para simplificar a adaptação; valores exibidos têm duas casas.

## Arquivos e responsabilidades

| Arquivo | Responsabilidade |
|---|---|
| `Main.java` | Monta as dependências e escolhe console ou janela. |
| `modelo/Proprietario.java` | Objeto associado ao cadastro. |
| `modelo/OrdemServico.java` | Classe abstrata com atributos privados e validação. |
| `modelo/ServicoPreventivo.java` | Cálculo da categoria Preventivo. |
| `modelo/ServicoEmergencial.java` | Cálculo da categoria Emergencial. |
| `modelo/Calculavel.java` | Interface com calcularTotal. |
| `modelo/Validacao.java` | Validações e conversão de decimal. |
| `repositorio/Repositorio.java` | ArrayList, pesquisa e armazenamento em memória. |
| `servico/Servico.java` | Operações, relatórios e criação do subtipo correto. |
| `excecao/OperacaoInvalidaException.java` | Exceção verificada de operação inválida. |
| `visao/Console.java` | Menu, Scanner e tratamento de erros. |
| `visao/Tela.java` | Formulário, JTable, botões, eventos e mensagens. |
| `Teste.java` | Verifica regras e operações sem JUnit. |

Os fontes estão em `src/estudo/t14/`. Métodos calculam sem imprimir; apresentação fica nas classes de visão. A associação é representada por uma referência a Proprietario. O repositório agrega objetos recebidos. A composição aparece na tela, que cria e controla seus componentes; este domínio não força composição onde ela não é necessária.

## Executar agora

Requer **JDK 8 ou superior**. Extraia o ZIP primeiro. Abra o terminal dentro desta pasta.

```sh
javac -encoding UTF-8 -d out @fontes.txt
java -cp out estudo.t14.Main
```

No PowerShell, se necessário, use `"@fontes.txt"` entre aspas.

**Janela Swing:**

```sh
java -cp out estudo.t14.Main gui
```

**Teste automático:**

```sh
java -cp out estudo.t14.Teste
```

No Windows, pode abrir `executar.bat` com duplo clique para o console ou executar `executar.bat gui` no terminal. No Linux/macOS: `sh executar.sh` ou `sh executar.sh gui`.

## Eclipse e VS Code

**Eclipse:** File → Import → General → Existing Projects into Workspace → selecione esta pasta. Existe `.project` para importar diretamente. Execute `Main` com Run As → Java Application. Para janela, adicione `gui` em Run Configurations → Arguments → Program arguments.

**VS Code:** abra somente esta pasta em File → Open Folder. Com suporte Java e JDK configurados, abra Main.java e clique Run. Para janela, use o terminal e os comandos acima. A pasta `.vscode` define `src` como raiz dos fontes.

## Teste manual com resultado conhecido

1. Escolha **9** no console ou **Exemplos** na janela.
2. Serão incluídos os IDs 1 e 2, com valor da mão de obra por hora = **80** e horas de trabalho = **4**.
3. O resultado do ID 1 é **320.00** e do ID 2 é **580.00**. O total é **900.00**, a média **450.00**.
4. Busque ID 1. Atualize seus dados usando o mesmo ID. Na janela, selecionar a linha preenche os campos.
5. Tente cadastrar ID 1 novamente: deve aparecer erro de duplicidade.
6. Tente valor negativo e quantidade abaixo de 1: deve aparecer erro, sem salvar.
7. Remova ID 1 e confirme. A listagem deve mostrar apenas o ID 2.
8. Consulte o resumo de uma lista vazia: total e média serão zero e maior será “nenhum”.

### Menu do console

1 cadastrar; 2 listar; 3 buscar por ID; 4 atualizar; 5 remover com confirmação; 6 resumo; 7 destaque específico; 8 buscar parte do nome de Proprietario; 9 carregar exemplos; 0 sair.

Cadastro e atualização pedem nesta ordem: ID, categoria (1 ou 2), descrição, Proprietario, valor da mão de obra por hora, horas de trabalho. Letras em campos numéricos cancelam a operação e devolvem ao menu. Aceita decimal com vírgula ou ponto, sem separador de milhar.

## O que adaptar para outra questão

1. Mantenha o package coerente em todos os arquivos (ou renomeie pela IDE).
2. Renomeie a classe OrdemServico, as filhas e o objeto Proprietario conforme o diagrama.
3. Altere os atributos e suas validações na classe abstrata.
4. Mude a fórmula em calcularTotal das filhas. Não copie taxas sem comparar com o enunciado.
5. Ajuste os argumentos em criar, cadastrar e atualizar no serviço.
6. Adicione os novos campos ao console e ao formulário.
7. Atualize os testes e confira pelo menos um cálculo à mão.

**Limite do exemplo:** é um cadastro didático completo para esse enunciado, não um sistema comercial de oficina. Os dados duram só enquanto o programa está aberto. O modo console e o modo janela são execuções separadas, portanto não compartilham cadastros entre processos. A lista usa objetos imutáveis; alterar substitui o objeto inteiro depois da validação, em vez de usar setters parciais.
