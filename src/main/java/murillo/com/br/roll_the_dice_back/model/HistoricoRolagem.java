package murillo.com.br.roll_the_dice_back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HISTORICO")
public class HistoricoRolagem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_NATUREZA")
  private Long id;

  @Column(name = "LADO")
  private Integer lado;

  @Column(name = "RESULTADO")
  private Integer resultado;

}
