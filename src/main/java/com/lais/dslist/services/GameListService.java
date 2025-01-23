package com.lais.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lais.dslist.dto.GameListDTO;
import com.lais.dslist.entities.GameList;
import com.lais.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
	       List<GameList> result = gameListRepository.findAll();
	        return result.stream().map(x -> new GameListDTO(x)).toList();
	       
	}
}
 