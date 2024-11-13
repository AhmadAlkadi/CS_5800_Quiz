/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.cs_5800_quiz1;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy implements Cloneable{
    private String title;
    private String author;
    private List<String> chapters;

    public BookDeepCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<String>(chapters);
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public List<String> getChapters() {
        return chapters;
    }
    
    public void setChapters(List<String> chapters) {
        this.chapters = new ArrayList<String>(chapters);
    }


    @Override
    public BookDeepCopy clone() {
        try {
            BookDeepCopy copy = (BookDeepCopy) super.clone();
            copy.chapters = new ArrayList<String>(this.chapters);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    } 
    
    @Override
    public String toString() {
        return "BookShallowCopy{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
