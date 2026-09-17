package utils;
import models.Category;
import models.Transaction;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class FileHandler{
    private static final String FILE_NAME="transactions.csv";
    public static void saveTransactions(List<Transaction> transactions){
        try(PrintWriter pw=new PrintWriter(new FileWriter(FILE_NAME))){
            for(Transaction t:transactions){
                pw.println(t.getDescription()+","+t.getAmount()+","+t.getCategory().name()+","+t.isIncome()+","+t.getDate().toString());
            }
        }catch(IOException e){
            System.out.println("Error saving data");
        }
    }
    public static List<Transaction> loadTransactions(){
        List<Transaction> list=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts.length==5){
                    Transaction t=new Transaction(parts[0],Double.parseDouble(parts[1]),Category.valueOf(parts[2]),Boolean.parseBoolean(parts[3]),LocalDate.parse(parts[4]));
                    list.add(t);
                }
            }
        }catch(FileNotFoundException e){
        }catch(IOException e){
            System.out.println("Error loading data");
        }
        return list;
    }
}