package com.test;

import java.io.File;

public class Clearn {
    public static void main(String[] args) {
        File repo = new File("D:\\dev\\evn\\maven\\repo");
        checkFile(repo);
    }

    public static void checkFile(File file){
        if(!file.exists()){
            return;
        }
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File childFile : files){
                checkFile(childFile);
            }
        }else {
            if(file.getName().endsWith("lastUpdated")){
                File parent = file.getParentFile();
                deleteFile(parent);
            }
        }
    }

    public static void deleteFile(File file){
        if(!file.exists()){
            return;
        }
        if(file.isFile()){
            file.delete();
            System.out.println("delete file " + file.getAbsolutePath() + " finish! ");
        }else {
            File[] files = file.listFiles();
            for(File childFile : files){
                deleteFile(childFile);
            }
            file.delete();
            System.out.println("delete dir " + file.getAbsolutePath() + " finished！ ");
        }
    }
}
