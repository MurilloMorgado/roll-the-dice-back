package murillo.com.br.roll_the_dice_back.service;

import java.util.List;

import murillo.com.br.roll_the_dice_back.model.Dado;

public interface RolagemDeDadosService {
  
  Dado rolarDados(Dado dado);

  void salvarHistorico(Dado dado);

  List<Dado> listarResultados();
}
