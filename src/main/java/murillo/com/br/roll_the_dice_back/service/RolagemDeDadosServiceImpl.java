package murillo.com.br.roll_the_dice_back.service;

import java.util.List;

import org.springframework.stereotype.Service;

import murillo.com.br.roll_the_dice_back.model.Dado;

@Service
public class RolagemDeDadosServiceImpl implements RolagemDeDadosService {

  @Override
  public Dado rolarDados(Dado dado) {
    Dado newDado = new Dado(dado);
    Integer resultadoRolagem = newDado.gerarNumeroAleatorio(newDado.getLado());
    newDado.setResultado(resultadoRolagem);
    
    return newDado;

  }

  @Override
  public List<Dado> listarResultados() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarResultados'");
  }

  // private static Integer gerarNumeroAleatorio(int lados) {
  //   Random random = new Random();
  //   return random.nextInt(lados) + 1;
  // }

}
