package br.com.codenation.CentralDeErros.model;


import br.com.codenation.CentralDeErros.enums.Levels;

import java.time.LocalDateTime;

public class ErrorEventLog {
    private long id;

    private Levels levels;

    private String log;

    private String description;

    private String origin;

    private Long quantity = 0L;

    private LocalDateTime createdAt;
}
