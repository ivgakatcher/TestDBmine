package org.example;


import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        example10();
       // example1();
        //example2();
        //exampleXXX();
         example11XXX();
    }

    private static void example2() throws SQLException {
        Connection conn = connectToDB();
        ArrayList<User> users = loadUsers(conn);
        System.out.println("получен список из "+users.size()+" юзеров");
        users.forEach(System.out::println);

        conn.close();
    }

    public static ArrayList<User> loadUsers(Connection conn) throws SQLException {
        ArrayList<User> users=new ArrayList<>();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM public.user");
        while (rs.next()) {
            int x = rs.getInt("id");
            String fio = rs.getString("fio");
            double m = rs.getDouble("money");
            users.add(new User(x, fio, m));
        }
        rs.close();
        st.close();
        return users;
    }



    private static void example1() throws SQLException {
        Connection conn = connectToDB();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM public.user");
        while (rs.next()) {
            int x = rs.getInt("id");
            String fio = rs.getString("fio");
            double m = rs.getDouble("money");
            System.out.println("получена строка: "+x+" "+fio+" "+m);
        }
        rs.close();
        st.close();
        conn.close();
    }

    public static void example0(){
        String url = "jdbc:postgresql://10.10.104.136:5432/test4";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        props.setProperty("ssl", "false");
        try {
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("удалось подключиться к БД test4");
            conn.close();
        }
        catch (SQLException e){
            System.out.println("все пропало");
            e.printStackTrace();
        }
    }

    public static Connection connectToDB(){
        String url = "jdbc:postgresql://10.10.104.136:5432/test4";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        props.setProperty("ssl", "false");
        try {
            Connection conn = DriverManager.getConnection(url, props);
            return conn;
        }
        catch (SQLException e){
            System.out.println("все пропало");
            e.printStackTrace();
            return null;
        }
    }
    public static void exampleXXX(){
        String url = "jdbc:postgresql://10.10.104.136:5432/test4";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        props.setProperty("ssl", "false");
        try {
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("удалось подключиться к БД Geometry");
            conn.close();
        }
        catch (SQLException e){
            System.out.println("все пропало");
            e.printStackTrace();
        }
    }
    private static void example1XXX() throws SQLException {
        Connection conn = connectToDB();
        Statement st = conn.createStatement();
        String s = "SELECT * FROM public.\"Triangle\"";
        ResultSet rs = st.executeQuery(s);
        while (rs.next()) {
            int x = rs.getInt("id");
            int a = rs.getInt("a");
            int b = rs.getInt("b");
            int c = rs.getInt("c");
            System.out.println("получена строка: "+x+" "+a+" "+b+" "+c);
        }
        rs.close();
        st.close();
        conn.close();
    }
    public static void example10(){
        String url = "jdbc:postgresql://10.10.104.136:5432/test4";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        props.setProperty("ssl", "false");
        try {
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("удалось подключиться к БД test4");
            conn.close();
        }
        catch (SQLException e){
            System.out.println("все пропало");
            e.printStackTrace();
        }
    }
    private static void example11XXX() throws SQLException {
        Connection conn = connectToDB();
        Statement st = conn.createStatement();
        String s = "SELECT * FROM public.message";
        ResultSet rs = st.executeQuery(s);
        while (rs.next()) {
            int x = rs.getInt("id");
            String a = rs.getString("text");
            int b = rs.getInt("sender_id");
            int c = rs.getInt("target_id");
            System.out.println("получена строка: "+x+" "+a+" "+b+" "+c);
        }
        rs.close();
        st.close();
        conn.close();
    }

}