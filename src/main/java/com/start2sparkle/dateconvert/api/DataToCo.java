package main.java.com.start2sparkle.dateconvert.api;

import main.java.com.start2sparkle.dateconvert.Converters.Converter;

import java.util.regex.Pattern;

public class DataToCo extends Converter {

    public DataToCo(String data) throws Exception {

        boolean b2 = Pattern.compile(".s").matcher(data).matches();

    }

}
