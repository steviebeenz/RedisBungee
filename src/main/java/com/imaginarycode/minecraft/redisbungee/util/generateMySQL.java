package com.imaginarycode.minecraft.redisbungee.util;
// /generateMySQL


public class generateMySQL {
    public String generateMySQL(String serverIP, String serverPort, String databaseName, String databaseUseSSL ) {
        return "jdbc:mysql://" + serverIP + ":" + serverPort + "/" + databaseName + "?useSSL=" + databaseUseSSL;
    }
}