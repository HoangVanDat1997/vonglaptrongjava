package Baitapdog;

import java.util.HashMap;
import java.util.Scanner;

public class DogManager {
        static Scanner sc = new Scanner(System.in);
        static HashMap<Integer, Dog> data = new HashMap<>();

        public static Object[] scannerDog(){
            System.out.println("nhap id dog");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("nhap name dog");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi dog");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("nhap can nang dog");
            int weight = Integer.parseInt(sc.nextLine());
            return new Object[]{id,name,age,weight};
        }

        public static void createDog(){
            Object[] a = scannerDog();

            if (data.containsKey((Integer) a[0])){
                System.out.println("Key nay da ton tai, xin nhap lai: ");
                createDog();
            }
            data.put((Integer) a[0], new Dog((Integer) a[0], (String) a[1],(Integer) a[2], (Integer) a[3]));

        }


        public static void updateDog (){
            Object[] a = scannerDog();

            if (data.containsKey(a[0])){
                System.out.println("id nay khong ton tai, xin nhap lai: ");
                updateDog();
            }

            Dog dog = data.get(a[0]);
            dog.setName((String)a[1]);
            dog.setAge((Integer) a[2]);
            dog.setWeight((Integer) a[3]);
        }

        public static void deleteDog (){
            System.out.println("Nhap id Dog can xoa");
            int key = Integer.parseInt(sc.nextLine());

            if (!data.containsKey(key)){
                System.out.println("id nay khong ton tai, xin nhap lai: ");
                deleteDog();
            }

            data.remove(key);


        }
        public static void display(){
            for ( Integer dog : data.keySet()){
                System.out.println(data.get(dog));
                System.out.println();
            }
        }

        public static void displayWeightMoreTwo(){ 
            for ( Integer dog : data.keySet()){
                if (data.get(dog).getWeight() > 2){
                    System.out.println(data.get(dog));
                    System.out.println();
                }
            }
        }
        public static void main(String[] args) {

            while (true){
                System.out.println("1. Them 1 doi tuong dog: \n" +
                        "2. Sua thong tin: \n" +
                        "3. Xoa doi tuong : \n" +
                        "4. Hien thi thong tin: \n" +
                        "5. Hien thi dog weight > 2: \n" +
                        "Lua chon: ");

                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        createDog();
                        break;
                    case 2:
                        updateDog();
                        break;
                    case 3:
                        deleteDog();
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        displayWeightMoreTwo();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("lua chon nay khong co");

                }
            }
        }
    }
