package com.codegym.minitest2;

public class Main {
    static FictionBook[] fictionBooks = new FictionBook[5];
    static ProgrammingBook[] programmingBooks = new ProgrammingBook[5];

    public static double sumBook(){
        System.out.println("TỔng tiền của 10 cuốn sách là ;");
        int count = 0;
        for (ProgrammingBook p :  programmingBooks){
            count += p.price;

        }
        for (FictionBook q : fictionBooks){
            count += q.price;
        }
        return count;
    }
    public static int countLanguage(){
        int count1 = 0;
        for (int i = 0 ; i < programmingBooks.length ; i ++){
            if (programmingBooks[i].getLanguage().equals("Java")){
                count1 ++;
            }
        }
        return  count1;
    }
    public static int countFiction(){
        int count2 = 0;
        for (int j = 0 ; j < fictionBooks.length ; j++){
            if (fictionBooks[j].getCategory().equals("Viễn tưởng 1")){
                count2 ++;
            }
        }
        return count2;
    }
    public static int priceFiction(){
        int count3 = 0;
        for (int k = 0 ; k < fictionBooks.length ; k++){
            if (fictionBooks[k].getPrice()<100)
            count3 ++;
        }
        return count3;
    }
    public static void main(String[] args) {
        programmingBooks[0] = new ProgrammingBook(111, "Sever1", 5000, "Đạt", "Việt", "D1");
        programmingBooks[1] = new ProgrammingBook(222, "Sever2", 3000, "Đạt", "Việt", "D2");
        programmingBooks[2] = new ProgrammingBook(333, "Sever3", 4000, "Đạt", "Java", "D3");
        programmingBooks[3] = new ProgrammingBook(444, "Sever4", 6000, "Đạt", "Java", "D4");
        programmingBooks[4] = new ProgrammingBook(555, "Sever5", 7000, "Đạt", "Java", "D5");

        fictionBooks[0] = new FictionBook(666, "Sever6", 50, "Đạt", "Viễn tưởng 1");
        fictionBooks[1] = new FictionBook(777, "Sever7", 30, "Đạt", "Anime");
        fictionBooks[2] = new FictionBook(888, "Sever8", 70, "Đạt", "Anime");
        fictionBooks[3] = new FictionBook(999, "Sever9", 90, "Đạt", "Anime");
        fictionBooks[4] = new FictionBook(789, "Sever789", 90, "Đạt", "Anime");
        System.out.println(sumBook());
        System.out.println("Số sách ProgrammingBook có language là \"Java\".");
        System.out.println(countLanguage());
        System.out.println("Số sách Fiction có category là “Viễn tưởng 1”.");
        System.out.println(countFiction());
        System.out.println("Số sách Fiction có giá <100.");
        System.out.println(priceFiction());
    }
}

