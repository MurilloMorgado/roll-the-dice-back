package murillo.com.br.roll_the_dice_back.model;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dado {

  private Integer lado;
  private Integer resultado;

  public Dado(Dado dado) {
    this.lado = dado.getLado();
    this.resultado = dado.getResultado();
  }

  public Integer gerarNumeroAleatorio(int lados) {
    Random random = new Random();
    return random.nextInt(lados) + 1;
  }
}
