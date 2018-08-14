package me.anthonybruno.matchtracker.season;

import me.anthonybruno.matchtracker.controller.AbstractController;
import me.anthonybruno.matchtracker.season.Season;
import me.anthonybruno.matchtracker.season.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/seasons")
public class SeasonController extends AbstractController<Season> {

    @Autowired
    private SeasonService seasonService;

    @Override
    @GetMapping
    public Collection<Season> list() {
        return seasonService.getAll();
    }

    @Override
    @GetMapping(value = "/{id}")
    public Season getById(long id) {
        return seasonService.getById(id);
    }

    @Override
    @PostMapping
    public Season add(Season item) {
        seasonService.add(item);
        return item;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public Season deleteById(long id) {
        return seasonService.deleteById(id);
    }
}
