package com.lais.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lais.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
