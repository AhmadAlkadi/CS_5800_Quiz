/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.homework.cs_5800_quiz1;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        // Original book
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy originalBook = new BookShallowCopy("Original Title", "Author A", chapters);
        System.out.println("Original Book (Shallow Copy): " + originalBook);
        BookShallowCopy copyOriginal = (BookShallowCopy) originalBook.clone();
        System.out.println("Cloned Book (Shallow Copy): " + copyOriginal);
        originalBook.getChapters().add("Chapter 3");
        System.out.println("Original Book Modified(Shallow Copy): " + originalBook);
        System.out.println("Cloned Book not Modified(Shallow Copy): " + copyOriginal); 
        System.out.println();

        BookDeepCopy originalBookDeep = new BookDeepCopy("Original Title", "Author A", chapters);
        System.out.println("Original Book (Deep Copy): " + originalBookDeep);
        BookDeepCopy clonedBookDeep = originalBookDeep.clone();
        System.out.println("Cloned Book (Deep Copy): " + clonedBookDeep);
        originalBookDeep.getChapters().add("Chapter 3");
        System.out.println("Original Book Modified(Deep Copy): " + originalBookDeep);
        System.out.println("Cloned Book not Modified(Deep Copy): " + clonedBookDeep); 
        System.out.println();
    }
    
}
