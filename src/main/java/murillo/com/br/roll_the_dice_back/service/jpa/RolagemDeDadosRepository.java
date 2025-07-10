package murillo.com.br.roll_the_dice_back.service.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import murillo.com.br.roll_the_dice_back.model.HistoricoRolagem;

@Repository
public interface RolagemDeDadosRepository extends JpaRepository<HistoricoRolagem, Long> {
  
}
