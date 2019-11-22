package com.fiacu.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Beesion.Lang.Base.FileData;
import Beesion.Lang.Base.HelperIO;
import Beesion.Lang.Spreadsheets.HelperSpreadsheets;

public class TestSpreedsheat {

    public static void main(String[] args) {
        System.out.print("Start -> ");
        Map<String, List<Object[]>> spreadsheet = new HashMap<String, List<Object[]>>();
        
        List<Object[]> sheet1 = new ArrayList<Object[]>();
        sheet1.add(new Object[]{"h1","h2","h3","h4","h5"});
        sheet1.add(new Object[]{1,2,3,4,5});
        List<Object[]> sheet2 = new ArrayList<Object[]>();
        sheet2.add(new Object[]{"h1","h2","h3","h4","h5","h6","h7","h8","h9"});
        sheet2.add(new Object[]{9,8,7,6,5,4,3,2,1});
        List<Object[]> sheet3 = new ArrayList<Object[]>();
        
        spreadsheet.put("Sheet-1", sheet1);
        spreadsheet.put("Sheet-2", sheet2);
        spreadsheet.put("Sheet-3", sheet3);
        spreadsheet.put("Sheet-4", null);

        FileData fd = HelperSpreadsheets.generateSpreadSheat("Test1", spreadsheet);
        HelperIO.WriteAllBytes("C:\\share\\Test1.xlsx", fd.getMemoryContent());
        
        ///-------------------
        FileData fd2 = HelperIO.GetFileDataPhysical("C:\\\\share\\\\Test1.xlsx");
        Map<String, List<Object[]>> spreadsheet2 = HelperSpreadsheets.readAllFromSpreadsheet(fd2);
        for(String sheetName : spreadsheet2.keySet()) {
            System.out.println(sheetName + ": ");
            for(Object[] rows : spreadsheet2.get(sheetName)) {
                for(Object col : rows) {
                    System.out.print(col.toString() + ", ");
                }
            }
            System.out.println("");
            System.out.println("----------");
        }
        System.out.println("End.");
    }

}

