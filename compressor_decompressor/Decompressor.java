/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compressor_decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author dell
 */
public class Decompressor {
    public static void method(File file) throws IOException {
        String fileDirectory=file.getParent();
        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzipIS=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"\\DecompressedFileCheck");
        
        byte[] buffer=new byte[1024];
        
        int len;
        
        while((len=gzipIS.read(buffer))!=-1){
            System.out.println("Length of file "+len);
            fos.write(buffer,0,len);
        }
        gzipIS.close();
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\compressor_decompressor\\Compressed.gz");
        method(file);
    }
}
