package me.anthonybruno.matchtracker.match;

import me.anthonybruno.matchtracker.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController()
@RequestMapping("api/v1/matches")
public class MatchController extends AbstractController<Match> {

    @Autowired
    private MatchService matchService;


    @GetMapping()
    public Collection<Match> list() {
        return matchService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Match getById(@PathVariable("id") long id) {
        return matchService.getById(id);
    }

    @PostMapping()
    public Match add(@RequestBody  Match match) {
        System.out.println(match);
        matchService.add(match);
        return match;
    }

    @DeleteMapping(value = "/{id}")
    public Match deleteById(@PathVariable("id") long id) {
        return matchService.deleteById(id);
    }
}
