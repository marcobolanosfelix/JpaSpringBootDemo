package com.orm.demo.infraestructure.in;

import com.orm.demo.application.usecases.club.GetAllClubUsecase;
import com.orm.demo.application.usecases.club.GetClubUsecase;
import com.orm.demo.application.usecases.club.SaveClubUsecase;
import com.orm.demo.domain.models.Club;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/club")
public class ClubController {
    private final SaveClubUsecase saveClubUsecase;
    private final GetAllClubUsecase getAllClubUsecase;
    private final GetClubUsecase getClubUsecase;

    public ClubController(SaveClubUsecase saveClubUsecase, GetAllClubUsecase getAllClubUsecase, GetClubUsecase getClubUsecase) {
        this.saveClubUsecase = saveClubUsecase;
        this.getAllClubUsecase = getAllClubUsecase;
        this.getClubUsecase = getClubUsecase;
    }

    @GetMapping
    public ResponseEntity<List<Club>> getAll() {
        List<Club> clubs;
        try {
            clubs = getAllClubUsecase.getAll();
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(clubs);
    }

    @GetMapping("/{idClub}")
    public ResponseEntity<Club> getById(@PathVariable Integer idClub) {
        Club club;
        try {
            club = getClubUsecase.getById(idClub);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(club);
    }

    @PostMapping
    public ResponseEntity<Club> save(@RequestBody Club club) {
        try {
            club = saveClubUsecase.save(club);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(club);
    }

}
