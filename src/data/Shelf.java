package data;

import java.util.Scanner;

public class Shelf {

    private String color;
    private String label;
    private int count = 0;
    private Student ls[] = new Student[1000];

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void sv1() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob;
        double gpa;
        System.out.println("SV: " +(count+1) +"/" +1000);
        
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input yob: ");
        gpa = Double.parseDouble(sc.nextLine());
        ls[count] = new Student(id, name, yob, gpa);
        count++;
    }

    public void Show1() {
        for (int i = 0; i < count; i++) {
            ls[i].showProfile();
        }
    }

}
