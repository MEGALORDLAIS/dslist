package com.lais.dslist.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lais.dslist.dto.GameListDTO;
import com.lais.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")

public class GameListComtroller {

	
	@Autowired
	private GameListService gameListService;
	
	
		
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
		}
	}
