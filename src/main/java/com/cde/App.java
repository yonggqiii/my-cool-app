package com.cde;

import com.cde.stuff.Person;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException 
    {
        System.out.println(getPerson());
        System.out.println("byebye!");

    }

    public static Person getPerson() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./test.json"));
        Gson gson = new Gson();
        return gson.fromJson(sc.nextLine(), Person.class);
    }
}
