# Guia rápido: do enunciado para o código

## Se tiver pouco tempo

Leia 06 (extends/super), 08 (abstract), 11 (interface), 15 (throw/throws/catch) e 18 (Swing). Depois veja 20 para juntar tela e regras. Se a questão for sobre relacionamento entre objetos, leia 02, 03 e 04.

## Tradução do enunciado

| Pedido | Estrutura | Modelo |
|---|---|---|
| Atributos privados, construtor, getters e setters | private, this, métodos de acesso | 01 |
| Um cliente tem endereço | atributo do tipo Endereco | 02 |
| Equipe reúne jogadores que existem fora dela | ArrayList de objetos recebidos | 03 |
| Pedido é dono dos próprios itens | criação das partes dentro do todo | 04 |
| Incluir, pesquisar por código, alterar, excluir | ArrayList + laço de busca | 05 |
| Aluno é uma Pessoa | Aluno extends Pessoa | 06 |
| Cada tipo responde de um jeito | @Override e chamada pelo tipo pai | 07, 09 |
| Classe geral não pode ser instanciada | abstract class | 08 |
| Mesmo método com diferentes parâmetros | sobrecarga | 10 |
| Contrato compartilhado por várias classes | interface + implements | 11 |
| Duas capacidades na mesma classe | implements A, B | 12 |
| Método exclusivo de um subtipo | instanceof antes do cast | 13 |
| Tratar erro e continuar | try/catch; finally para finalização | 14 |
| Criar uma exceção específica | extends Exception; throw/throws | 15 |
| Menu e vários cadastros | while + switch + Scanner | 16 |
| Caixas de diálogo | JOptionPane | 17 |
| Janela, campos, botão | JFrame, JTextField, JButton, evento | 18 |
| Escolher categoria e selecionar item | JComboBox, JCheckBox, JList | 19 |
| Separar interface e negócio | modelo, serviço, repositório, visão | 20 |

## Como transformar um enunciado

Exemplo: “Uma loja possui vendedores; cada vendedor tem nome e calcula comissão; vendedor interno e externo calculam diferente”.

1. Substantivos viram candidatos a classes: Loja, Vendedor, Interno, Externo.
2. Dados viram atributos privados: nome, vendas, taxa.
3. Verbos viram métodos: adicionarVendedor, removerVendedor, calcularComissao.
4. “Loja possui vários” sugere ArrayList<Vendedor> (modelo 03/05).
5. “Interno é um vendedor” sugere extends Vendedor (06/09).
6. “Calculam diferente” sugere sobrescrita de calcularComissao (07/09).
7. “Não aceitar vendas negativas” sugere validação antes da atribuição (01/15).
8. “Cadastrar pela tela” sugere evento do botão chamando o serviço (18/20).

## Palavras que você precisa reconhecer

- `this.nome = nome`: atributo do objeto recebe o parâmetro.
- `new`: cria uma instância e chama seu construtor.
- Construtor tem o nome da classe e não tem tipo de retorno, nem void.
- `extends`: herda de uma classe (uma classe Java tem no máximo uma superclasse direta).
- `super(...)`: chama o construtor da superclasse.
- `super.metodo()`: reaproveita implementação da superclasse.
- `@Override`: indica sobrescrita; ajuda o compilador a verificar a assinatura.
- `abstract`: classe não instanciável ou método que uma filha concreta deve implementar.
- `implements`: classe cumpre uma interface; métodos implementados são públicos.
- `throw new ...`: lança uma exceção agora.
- `throws ...`: declara que um método pode propagar a exceção.
- `try/catch`: tenta a operação e trata o erro especificado.
- `finally`: executa na saída normal do try/catch, inclusive com return; não é garantia diante do encerramento abrupto da JVM.
- `return`: devolve um resultado e encerra o método.
- `void`: método não devolve valor.
- `static`: membro da classe; não significa que todos os métodos devem ser static.

## Diferenças que costumam confundir

**Sobrecarga:** `calcular(double a)` e `calcular(double a, double b)` na mesma classe. Retorno diferente sozinho não basta.

**Sobrescrita:** uma filha redefine o método da mãe com assinatura compatível. Métodos static não têm o mesmo despacho polimórfico de métodos de instância.

**Associação:** um objeto conhece outro. **Agregação:** todo reúne partes independentes. **Composição:** todo controla partes que pertencem a ele no modelo. Um ArrayList sozinho não determina qual relação existe.

**Interface Java:** contrato de métodos. **Interface do usuário:** tela com campos e botões. São dois sentidos diferentes da palavra interface.

**Classe abstrata versus interface:** use a abstrata para compartilhar estado e implementação entre tipos relacionados; interface descreve um contrato que diferentes classes podem cumprir. Siga a estrutura exigida no enunciado.

## Checklist antes de rodar

- Nome do arquivo igual ao da classe public? Main.java / public class Main.
- main escrito como `public static void main(String[] args)`?
- Construtor recebendo os tipos certos? Endereco é objeto, não String.
- Lista inicializada com new ArrayList<>()?
- Comparação de texto com equals/equalsIgnoreCase, não com ==?
- Busca pode retornar null? Verifique antes de chamar métodos.
- Média protege lista vazia? Evite dividir por zero.
- Percentual convertido? 5% = 0.05.
- @Override tem o mesmo nome e parâmetros? Não reduza a visibilidade.
- Cada classe concreta implementa todos os métodos abstratos necessários?
- Exceção específica capturada antes de sua superclasse?
- Swing lê texto com getText(), converte e então chama a regra de negócio?
- `setVisible(true)` e ação do botão configurados?

## Erros comuns e correções

| Erro | Verifique |
|---|---|
| cannot find symbol | nome, import e classe existente |
| incompatible types: String cannot be converted to Endereco | crie new Endereco(...) e passe o objeto |
| non-static method cannot be referenced from a static context | crie um objeto e chame objeto.metodo() |
| constructor cannot be applied | quantidade, ordem e tipos dos argumentos |
| must implement inherited abstract method | implemente a assinatura exata com public quando necessário |
| unreported exception | capture com catch ou propague com throws |
| NullPointerException | objeto não criado ou busca retornou null |
| ClassCastException | confira instanceof antes de converter |
| nome “pulando” no Scanner | use nextLine e converta os números, como no 16 |
| Could not find or load main class | compile com -d out e use o nome completo templateXX.Main |
| javac não reconhecido | configure um JDK, não só um JRE |

## Mini exercícios de adaptação

1. No 06, transforme Aluno em Funcionario com salário.
2. No 08, adicione Triangulo e implemente base * altura / 2.
3. No 11, crie Dinheiro sem acréscimo nem desconto.
4. No 15, permita depósito, validando valor positivo antes de alterar saldo.
5. No 18, troque soma por divisão e valide divisor zero na classe de regra.
6. No 20, adicione quantidade ao Produto, ao serviço e ao formulário.

Depois de cada mudança, execute novamente e confira o resultado com uma conta simples feita à mão.
