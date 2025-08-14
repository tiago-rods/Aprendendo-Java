/*public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;
    
    // Construtor
    // Getters e Setters
    // Método para exibir informações
}
Tarefas:
Crie a classe com os atributos privados
Implemente construtor, getters e setters
Crie um método exibirInfo()
Teste criando objetos na classe Main
*/

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    // Construtor

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Getters e Setters    

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    // Método para exibir informações
}


