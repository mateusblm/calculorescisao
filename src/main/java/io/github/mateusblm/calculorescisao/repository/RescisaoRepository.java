package io.github.mateusblm.calculorescisao.repository;

import io.github.mateusblm.calculorescisao.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RescisaoRepository extends JpaRepository<Empregado, String> {
}
