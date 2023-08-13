package ru.yandex.practicum.shareit.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tests")
@Slf4j
@RequiredArgsConstructor
public class testController {
    @GetMapping
    public String getResponse() {
        return "ok";
    }
}
