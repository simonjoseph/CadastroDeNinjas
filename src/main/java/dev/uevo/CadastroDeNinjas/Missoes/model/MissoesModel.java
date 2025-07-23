package dev.uevo.CadastroDeNinjas.Missoes.model;

import java.util.List;

import dev.uevo.CadastroDeNinjas.Ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuladade;

    // A anotação @OneToMany indica que uma MissoesModel pode estar associada a várias
    // NinjaModel, mas cada NinjaModel está associada a apenas uma MissoesModel
    // A anotação mappedBy indica que a propriedade missoes na classe NinjaModel é
    // responsável por gerenciar a relação
    // A anotação cascade define o comportamento de persistência em cascata
    // A anotação fetch define como os dados serão carregados (lazy ou eager)
    // Isso cria uma relação entre as tabelas MissoesModel e NinjaModel no banco
    @OneToMany(mappedBy = "missoes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<NinjaModel> ninjas;

}
