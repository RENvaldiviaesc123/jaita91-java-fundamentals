package org.java.lessons;

public class BookInfo {
    public static void main(String[] args) {
        //dichiaro quali variabili rappresentano le caratteristiche del libro
        String coverImage;
        String title;
        //Tipi di libro
        boolean isFlexibleCover;
        boolean isKindle;
        //Campi della data di pubblicazione
        int dayOfPublishing;
        int monthOfPublishing;
        int yearOfPublishing;
        //Campi per la valutazione rating
        int numberOfRating;
        float avgRating; //avg sta per average media
        //Dati dell'autore
        String author;
        //Codici SBN di 10 o 13 cifre dei libri
        long isbn;

        //Assegniamo un valore alle variabili
        coverImage="Link dell'immagine del libro";
        title ="Clean Code: A Handbook of Agile Software Craftsmanship";
        author=" Robert C. Martin";
        isbn=9780132350884L; // l al finale per i long
        isFlexibleCover = true;
        isKindle = true;
        dayOfPublishing=1;
        monthOfPublishing=8;
        yearOfPublishing=2008;
        numberOfRating=5559;
        avgRating=4.7F; //Per i float sempre f al finale

        //Stampiamo le variabili
        System.out.println("Title " + title);
        System.out.println("Autore " + author);
        System.out.println("ISBN " + isbn);
        System.out.println("Is flexible cover " + isFlexibleCover);
        System.out.println("Is kindle " + isKindle);
        //Dichiaro e inizializzo una variabile che contiene la data
        String dateOfPublishing = dayOfPublishing + "/" + monthOfPublishing + "/" + yearOfPublishing;
        System.out.println("Data di pubblicazione " +dateOfPublishing);
        //Dichiaro e inizializzo una varibile string con le informazioni rating
        String ratingInfo = avgRating + " over " + numberOfRating + " ratings ";
        System.out.println(ratingInfo); //Oppure possiamo fare System.out.println(avgRating + " over " + numberOfRating + " ratings ");
        System.out.println("Cover image URL " + coverImage);
    }
}
