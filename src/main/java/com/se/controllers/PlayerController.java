package com.se.controllers;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.se.DAO.PlayerDAO;
import com.se.api.Player;
import com.se.execptions.PlayerNotFoundException;

@RestController
public class PlayerController {

	@Autowired
	private PlayerDAO playerDAO;
	List<Player> players;
//@GetMapping(value="/players",produces = {MediaType.APPLICATION_XML_VALUE})
@GetMapping(value="/players")
List<Player> getPlayers()
{
	 players=playerDAO.getAllPlayers();
	return players;
}

@GetMapping(value="/players/{id}")
Player getPlayers(@PathVariable("id") int id)
{
	players=playerDAO.getAllPlayers();
	if(id>players.size())
	{
		throw new PlayerNotFoundException("id not found");
	}
	 Player player=playerDAO.getPlayer(id);
	return player;
}

@PostMapping(value="/players")
ResponseEntity<Player> addPlayer(@Valid @RequestBody Player player)
{
	Player player1=playerDAO.addPlayer(player);
	System.out.println("printing the player");
	System.out.println(player1);
	return new ResponseEntity<Player>(player1,HttpStatus.ACCEPTED);
}

@PutMapping(value="/players/{id}")
ResponseEntity<Player> updatePlayer(@PathVariable int id,@RequestBody Player player)
{
	Player player1=playerDAO.updatePlayer(id,player);
	System.out.println("printing the player");
	System.out.println(player1);
	return new ResponseEntity<Player>(player1,HttpStatus.ACCEPTED);
}


@DeleteMapping(value="/players/{id}")
ResponseEntity<Player> updatePlayer(@PathVariable int id)
{
	playerDAO.deletePlayer(id);

	return new ResponseEntity<Player>(HttpStatus.NO_CONTENT);
}


}
