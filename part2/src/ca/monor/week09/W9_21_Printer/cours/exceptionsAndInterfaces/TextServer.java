package ca.monor.week09.W9_21_Printer.cours.exceptionsAndInterfaces;

import java.util.HashMap;
import java.util.Map;

public class TextServer implements FileServer {

    private Map<String, String> data;

    public TextServer() {
        this.data = new HashMap<String, String>();
    }

    @Override
    public String download(String file) throws Exception {
        return this.data.get(file);
    }

    @Override
    public void save(String file, String string) throws Exception {
        this.data.put(file, string);
    }
}
