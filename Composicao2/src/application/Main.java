package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Tenha uma boa viagem!");
        Comment c2 = new Comment("Uau, isso é incrivel!");

        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", dateFormatComplete), "Viajando para Nova Zelandia", "Vou visitar um pais maravilhoso", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}