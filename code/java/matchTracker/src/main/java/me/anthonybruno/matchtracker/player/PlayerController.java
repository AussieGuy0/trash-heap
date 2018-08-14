package me.anthonybruno.matchtracker.player;

import me.anthonybruno.matchtracker.controller.AbstractController;
import me.anthonybruno.matchtracker.player.Player;
import me.anthonybruno.matchtracker.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/players")
public class PlayerController extends AbstractController<Player> {

    @Autowired
    private PlayerService playerService;


    @Override
    @GetMapping()
    public Collection<Player> list() {
        return playerService.getAll();
    }

    @Override
    @GetMapping(value = "/{id}")
    public Player getById(@PathVariable("id") long id) {
        return playerService.getById(id);
    }

    @Override
    @PostMapping()
    public Player add(@RequestBody Player player) {
        playerService.add(player);
        return player;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public Player deleteById(@PathVariable("id") long id) {
        return playerService.deleteById(id);
    }
}
