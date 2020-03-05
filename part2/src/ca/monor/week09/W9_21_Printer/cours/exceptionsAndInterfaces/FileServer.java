package ca.monor.week09.W9_21_Printer.cours.exceptionsAndInterfaces;

public interface FileServer {
    String download(String file) throws Exception;
    void save(String file, String string) throws Exception;
}
