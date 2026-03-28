package com.secure.notes.models;

import jakarta.persistence.*;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonTypeId;
@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String ownerUsername;
}

