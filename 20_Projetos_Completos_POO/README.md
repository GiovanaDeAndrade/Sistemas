# 20 projetos completos de POO em Java

**Agora são sistemas completos de cadastro e cálculo, com classes separadas.** Cada pasta é um projeto independente, com 13 arquivos Java, menu de console, formulário Swing, regras de negócio, armazenamento em memória, documentação e testes executáveis. Nenhum arquivo depende de outro projeto do pacote.

## Comece por aqui

1. Extraia o ZIP e escolha um tema abaixo.
2. Abra só a pasta escolhida no VS Code ou importe no Eclipse.
3. Rode Main e escolha 9 para carregar exemplos; depois 2 para listar e 6 para ver o resumo.
4. Para telas, siga o comando `Main gui` no README do projeto.
5. Leia as duas subclasses para entender a regra de cálculo antes de adaptar.

Os exemplos cobrem associação/agregação, encapsulamento, herança, classe abstrata, interface, polimorfismo, exceção personalizada, ArrayList, camadas, Scanner, Swing e eventos. As regras de preço são fictícias. O conteúdo foi construído a partir dos títulos dos assuntos enviados, não dos enunciados completos das listas.

## Os 20 projetos

| Nº | Projeto | Tipos | Cálculo específico |
|---|---|---|---|
| 01 | [Loja e precificação](01_loja/README.md) | Comum / Promocional | Produto comum: preço × quantidade. Promocional: desconto de 10% no subtotal. |
| 02 | [Loja de vendedores e comissões](02_vendedores/README.md) | Interno / Externo | Interno: 5% das vendas. Externo: 8% das vendas mais ajuda de 100 por mês. |
| 03 | [Folha de pagamento](03_funcionarios/README.md) | Administrativo / Técnico | Administrativo: salário base + 20 por hora extra. Técnico: salário base + 30 por hora extra + adicional fixo de 300. |
| 04 | [Biblioteca e empréstimos](04_biblioteca/README.md) | Comum / Estudante | Comum: multa diária × dias de atraso. Estudante: os dois primeiros dias de atraso não geram multa. |
| 05 | [Locadora de veículos](05_locadora/README.md) | Popular / Executiva | Popular: diária × dias. Executiva: diária × dias + seguro de 40 por dia. |
| 06 | [Hotel e reservas](06_hotel/README.md) | Standard / Suíte | Standard: diária × noites. Suíte: acréscimo de 25% na hospedagem e taxa fixa de 50. |
| 07 | [Restaurante e comandas](07_restaurante/README.md) | Balcão / Mesa | Balcão: preço × refeições. Mesa: subtotal com serviço de 10%. |
| 08 | [Bilheteria de eventos](08_ingressos/README.md) | Inteira / Meia | Inteira: preço × ingressos. Meia: metade do subtotal. O exemplo não determina elegibilidade legal. |
| 09 | [Estacionamento e permanências](09_estacionamento/README.md) | Avulsa / Conveniada | Avulsa: hora × horas. Conveniada: primeira hora grátis e 20% de desconto nas restantes. |
| 10 | [Transportadora e fretes](10_fretes/README.md) | Normal / Expresso | Normal: preço por quilo × peso + 10. Expresso: 50% de acréscimo no frete por peso + 20. |
| 11 | [Escola de cursos e matrículas](11_cursos/README.md) | Regular / Bolsista | Regular: mensalidade × parcelas. Bolsista: bolsa de 30% sobre o total. |
| 12 | [Academia e planos](12_academia/README.md) | Mensal / Fidelidade | Mensal: mensalidade × meses. Fidelidade: desconto de 15% no total. |
| 13 | [Pet shop e atendimentos](13_petshop/README.md) | Avulso / Pacote | Avulso: preço × sessões. Pacote: a cada três sessões, uma é gratuita. A divisão inteira conta grupos completos de três. |
| 14 | [Oficina e ordens de serviço](14_oficina/README.md) | Preventivo / Emergencial | Preventivo: valor por hora × horas. Emergencial: acréscimo de 50% na mão de obra mais deslocamento de 100. |
| 15 | [Delivery e pedidos](15_entregas/README.md) | Retirada / Entrega | Retirada: preço × itens. Entrega: frete de 12, gratuito quando o subtotal é pelo menos 100. |
| 16 | [Simulador de consumo de energia](16_energia/README.md) | Residencial / Comercial | Residencial: tarifa × consumo. Comercial: tarifa × consumo + taxa de 30. Regras fictícias, não representam uma concessionária. |
| 17 | [Assinaturas de conteúdo](17_streaming/README.md) | Básica / Família | Básica: preço × meses. Família: acréscimo mensal de 15. |
| 18 | [Organização de eventos](18_eventos/README.md) | Simples / Completo | Simples: preço × participantes. Completo: subtotal + estrutura de 500 + 10 por participante. |
| 19 | [Gráfica e trabalhos](19_impressao/README.md) | Simples / Volume | Simples: preço × páginas. Volume: desconto de 20% somente a partir de 100 páginas. |
| 20 | [Agência de turismo e pacotes](20_turismo/README.md) | Econômico / Conforto | Econômico: diária × dias. Conforto: subtotal + 75 por dia para extras + traslado fixo de 200. |

## O que todos permitem fazer

- Cadastrar, listar e buscar por ID.
- Atualizar dados e trocar a categoria, preservando o ID.
- Excluir com confirmação.
- Buscar parte do nome do objeto associado.
- Calcular total, média e maior resultado com polimorfismo.
- Aplicar um filtro específico de cada tema.
- Validar campos, tratar duplicidade, cadastro ausente e entrada inválida.
- Usar console ou interface gráfica com JTable.

## Qual arquivo procurar na hora de adaptar

| O enunciado pede... | Vá a... |
|---|---|
| Alterar atributos e regras de validade | modelo / classe abstrata e Validacao |
| Alterar cálculo por tipo | modelo / duas subclasses |
| Criar contrato | modelo / Calculavel |
| Incluir, buscar e remover objetos | repositorio / Repositorio |
| Somar, calcular média ou filtrar | servico / Servico |
| Ler pelo teclado | visao / Console |
| Fazer tela e ações de botão | visao / Tela |
| Tratar exceção própria | excecao e catches das visões |
| Executar o programa | Main |
| Conferir o comportamento | Teste |

Todos usam sintaxe compatível com Java 8 e não precisam de Maven, JUnit ou WindowBuilder. O JDK e o suporte a Java da IDE devem estar instalados. Swing exige ambiente gráfico.

**Importante para entender:** os projetos usam uma arquitetura parecida para você reaproveitar o padrão. Os temas, atributos, subclasses, fórmulas e filtros variam. São 20 aplicações didáticas completas dentro dos enunciados definidos nos respectivos READMEs; não são vinte produtos comerciais com banco de dados.
