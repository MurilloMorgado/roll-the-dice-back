package murillo.com.br.roll_the_dice_back.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import murillo.com.br.roll_the_dice_back.model.Dado;
import murillo.com.br.roll_the_dice_back.model.HistoricoRolagem;
import murillo.com.br.roll_the_dice_back.service.RolagemDeDadosService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dados")
public class RolagemDeDadosController {
  
  private final RolagemDeDadosService rolagemDeDadosService;

  @GetMapping
  public ResponseEntity<List<HistoricoRolagem>> listarHistorico(){

    List<HistoricoRolagem> listaHistorico = rolagemDeDadosService.listarResultados();

    return ResponseEntity.ok().body(listaHistorico);
  }

  @PostMapping
  public ResponseEntity<Dado> rolarDados(@RequestBody Dado dado){

    Dado resultado = rolagemDeDadosService.rolarDados(dado);

    return ResponseEntity.ok().body(resultado);
  }
}
