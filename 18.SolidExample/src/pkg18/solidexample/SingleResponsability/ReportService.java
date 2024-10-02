/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg18.solidexample.SingleResponsability;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jufeq
 */
public class ReportService {

    private ReportGenerator reportGenerator;
    private ReportSaver reportSaver;

    public ReportService() {
        this.reportGenerator = new ReportGenerator();
        this.reportSaver = new ReportSaver();
    }

    public boolean generateAndSaveReport(String path) {
        try {
            reportGenerator.generateReport();
            reportSaver.saveReportToFile(path);
            
            return true;
            
        } catch(Exception exe){
            var stack = "";
            for(StackTraceElement error : exe.getStackTrace()){
                stack = stack + error.toString()+";"+"\n";
            }
            
            System.out.println("Error: "+stack+exe.getMessage());
            return false;
        }
    }

}
