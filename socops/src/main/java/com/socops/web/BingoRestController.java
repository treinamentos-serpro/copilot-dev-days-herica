package com.socops.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.socops.model.BingoCell;
import com.socops.service.BoardAssembler;

/** Serves the game page and the board-generation REST endpoint. */
@Controller
public class BingoRestController {

    /**
     * Serves the lobby page for the bingo game.
     *
     * @return the name of the game template
     */
    @GetMapping("/")
    public String serveLobbyPage() {
        return "game";
    }

    /**
     * Dispenses a fresh bingo board with shuffled prompts.
     *
     * @return a list of 25 BingoCell objects representing the board
     */
    @GetMapping("/api/bingo/fresh-board")
    @ResponseBody
    public List<BingoCell> dispenseFreshBoard() {
        return BoardAssembler.assembleNewBoard();
    }
}
