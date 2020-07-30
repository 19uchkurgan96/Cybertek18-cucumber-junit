package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfigurationReader {


        //1-we created properties object
        private static Properties properties = new Properties();

        static {

            //2-get the paht and store in String, or directly pass into fileInputStream object
            String path = "configuration.properties";

            //3-we need to open the file
            try {
                //4- we need to load the file
                FileInputStream file = new FileInputStream(path);
                properties.load(file);
                //5- close.file
                file.close();
            }catch(IOException e){
                System.out.println("Properties file not found.");
            }
        }
        // our own cutom method to read and get values from configuration.properties file
        public static String getProperty(String keyword){
            return properties.getProperty(keyword);
        }
    }

