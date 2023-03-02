package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Модель данных описывающая пользователя
 *
 * @author Vasiliy Novopashin
 * @version 1.0
 * {@code @date} 28.02.2023
 */

@Entity
@Table(name = "auto_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;
}
