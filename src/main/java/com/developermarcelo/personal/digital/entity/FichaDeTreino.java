package com.developermarcelo.personal.digital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_ficha_treino")
public class FichaDeTreino {
    private final List<String> treinoA = new ArrayList<>();
    private final List<String> treinoB = new ArrayList<>();
    private final List<String> treinoC = new ArrayList<>();

    private final LocalDateTime dataDaFicha = LocalDateTime.now();


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno alunoId;
}
