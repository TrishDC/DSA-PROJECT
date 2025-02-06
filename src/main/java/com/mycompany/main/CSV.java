/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author trisha
 */
    
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CSV {
    public static void main(String[] args) {
        try {
            List<List<String>> data = new ArrayList<>(); // list of lists to store data
            String file = "Users/trisha/DesktopA.csv/"; // replace with the path to your own CSV file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // Reading until we run out of lines
            String line = br.readLine();
            while (line != null) {
                List<String> lineData = Arrays.asList(line.split(","));
                data.add(lineData);
                line = br.readLine();
            }

            // Printing the fetched data
            for (List<String> list : data) {
                for (String str : list) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}