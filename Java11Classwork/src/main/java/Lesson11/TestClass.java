/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11; 

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Keagan Dodsworth
 */
public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        
        try{
            testClass.testCheckedException();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
        public void testCheckedException() throws IOException{
            File TestFile = new File ("//testFile.txt");
            TestFile.createNewFile();
            System.out.println("TestFile exists: "+ TestFile.exists());
        }
    }

