package com.isyxf.test.tryCatch;

import java.io.File;
import java.io.FileFilter;

public class TryCatch {
    public static void main(String[] args) {
        File[] hiddenFile = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });
    }
}
