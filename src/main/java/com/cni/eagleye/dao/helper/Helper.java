package com.cni.eagleye.dao.helper;

import com.cni.eagleye.dao.entities.CsvFile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {
    public  Helper(){
        
    }
    public static boolean checkExcelFormat(MultipartFile file) {
        return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(file.getContentType());

    }
    public static List<CsvFile> convertExcelToListOfCSV(InputStream is) {
        List<CsvFile> list = new ArrayList<>();

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet("Feuil1");
            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                } else {
                    Iterator<Cell> cells = row.iterator();
                    int cid = 0;
                    CsvFile p = new CsvFile();

                    while (cells.hasNext()) {
                        Cell cell = cells.next();
                        switch (cid) {
                            case 0:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setMatricule((int) cell.getNumericCellValue());
                                }
                                break;
                            case 1:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setMois((int) cell.getNumericCellValue());
                                }
                                break;
                            case 2:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setAnnee((int) cell.getNumericCellValue());
                                }
                                break;
                            case 3:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setType_paie((int) cell.getNumericCellValue());
                                }
                                break;
                            case 4:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCodind((int) cell.getNumericCellValue());
                                }
                                break;
                            case 5:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setMontant_ind((float) cell.getNumericCellValue());
                                }
                                break;
                                
                            case 6:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setNature_ind((int) cell.getNumericCellValue());
                                }
                                break;
                            case 7:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setGrd((int) cell.getNumericCellValue());
                                }
                                break;
                            case 8:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCat((int) cell.getNumericCellValue());
                                }
                                break;
                            case 9:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCorps((int) cell.getNumericCellValue());
                                }
                                break;
                            case 10:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCodfam((int) cell.getNumericCellValue());
                                }
                                break;
                            case 11:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCodsfam((int) cell.getNumericCellValue());
                                }
                                break;
                            case 12:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setIndice((int) cell.getNumericCellValue());
                                }
                                break;
                            case 13:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setNature((int) cell.getNumericCellValue());
                                }
                                break;
                            case 14:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setFonc((int) cell.getNumericCellValue());
                                }
                                break;
                            case 15:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setDire((int) cell.getNumericCellValue());
                                }
                                break;
                            case 16:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setSdir((int) cell.getNumericCellValue());
                                }
                                break;
                            case 17:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setServ((int) cell.getNumericCellValue());
                                }
                                break;
                            case 18:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setCentreg((int) cell.getNumericCellValue());
                                }
                                break;
                            case 19:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setGouv((int) cell.getNumericCellValue());
                                }
                                break;
                            case 20:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setGouvn((int) cell.getNumericCellValue());
                                }
                                break;
                            case 21:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setNatorg((int) cell.getNumericCellValue());
                                }
                                break;
                            case 22:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setBudg((int) cell.getNumericCellValue());
                                }
                                break;
                            case 23:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setSitfam((int) cell.getNumericCellValue());
                                }
                                break;
                            case 24:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setSexe((int) cell.getNumericCellValue());
                                }
                                break;
                            case 25:
                                if (cell.getCellType() == CellType.NUMERIC) {
                                    p.setMontant_ind_masse_salariale((float) cell.getNumericCellValue());
                                }
                                break;
                            default:
                                break;
                        }
                        cid++;
                    }
                    list.add(p);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
