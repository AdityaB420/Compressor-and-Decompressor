/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compressor_decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author dell
 */
public class Compressor {
    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory +"\\Compressed.gz");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte[] buffer=new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\compressor_decompressor\\TestFile.txt");
        method(file);
    }
}
