package murillo.com.br.roll_the_dice_back.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import murillo.com.br.roll_the_dice_back.model.Dado;
import murillo.com.br.roll_the_dice_back.model.HistoricoRolagem;
import murillo.com.br.roll_the_dice_back.service.jpa.RolagemDeDadosRepository;

@Service
@RequiredArgsConstructor
public class RolagemDeDadosServiceImpl implements RolagemDeDadosService {

  private final RolagemDeDadosRepository rolagemDeDadosRepository;

  @Override
  public Dado rolarDados(Dado dado) {
    Dado newDado = new Dado(dado);
    Integer resultadoRolagem = newDado.gerarNumeroAleatorio(newDado.getLado());
    newDado.setResultado(resultadoRolagem);

    salvarHistorico(newDado);

    return newDado;

  }

  @Override
  public List<HistoricoRolagem> listarResultados() {
    
    return rolagemDeDadosRepository.findAll();
  }

  @Override
  public void salvarHistorico(Dado dado) {
    HistoricoRolagem historicoRolagem = new HistoricoRolagem();
    historicoRolagem.setLado(dado.getLado());
    historicoRolagem.setResultado(dado.getResultado());
    rolagemDeDadosRepository.save(historicoRolagem);
  }

}
