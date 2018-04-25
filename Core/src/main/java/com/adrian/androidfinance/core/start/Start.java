package com.adrian.androidfinance.core.start;

import com.adrian.androidfinance.core.database.SQLiteConnection;

import java.sql.ResultSet;
import java.sql.Statement;



public class Start {

    public static void main(String[] args) {

//        try {
//
//            DefaultStorage storage = new DefaultStorage();
//
//            Currency currencyUSD = Currency.getInstance("USD");
//            Currency currencyRUB = Currency.getInstance("RUB");
//
//            storage.addCurrency(currencyUSD);
//            storage.addCurrency(currencyRUB);
//            storage.addAmount(new BigDecimal(200), currencyUSD);
//
//            //storage.expenseAmount(new BigDecimal(250), currencyUSD);
//
//            System.out.println("storage = " + storage.getAvailableCurrencies());
//
//        } catch (CurrencyException e) {
//            e.printStackTrace();
//        }


        try (Statement stmt = SQLiteConnection.getConnection().createStatement(); ResultSet rs = stmt.executeQuery("select * from storage")){

            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
