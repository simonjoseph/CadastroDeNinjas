package dev.uevo.CadastroDeNinjas.Ninjas;

import dev.uevo.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// Transfomar uma classe em uma entidade JPA
// A anotação @Entity indica que a classe NinjaModel é uma entidade JPA
// Isso significa que ela será mapeada para uma tabela no banco de dados
// As propriedades da classe serão mapeadas para colunas dessa tabela
// É necessário ter um construtor padrão (sem parâmetros) para que o JPA possa instantiate the entity
// Além disso, é comum ter um construtor com parâmetros para facilitar a criação de instâncias da entidade
// As propriedades da classe podem ser anotadas com @Id para indicar a chave primária
// Outras anotações como @Column podem ser usadas para personalizar o mapeamento das colunas
// A classe pode conter métodos getters e setters para acessar e modificar as propriedades
// É importante garantir que a classe siga as convenções de nomenclatura e estrutura esperadas
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;

    // A anotação @ManyToOne indica que um NinjaModel pode estar associado a várias
    // MissoesModel, mas cada MissoesModel está associada a apenas um NinjaModel
    // A anotação @JoinColumn especifica a coluna que será usada para a associação
    // Isso cria uma relação entre as tabelas NinjaModel e MissoesModel no banco
    @ManyToOne
    @JoinColumn(name = "missao_id")  //Foreign key column in NinjaModel table
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
