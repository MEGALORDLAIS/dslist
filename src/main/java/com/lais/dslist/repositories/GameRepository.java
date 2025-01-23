package com.lais.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lais.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
