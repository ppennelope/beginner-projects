package sa;


import java.util.ArrayList;
import java.util.Scanner;

public class todolist {

    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> completed = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1- Görev ekle");
            System.out.println("2- Görevleri listele");
            System.out.println("3- Görev tamamla");
            System.out.println("4- Görev sil");
            System.out.println("0- Çıkış");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Görev adı: ");
                    addTask(sc.nextLine());
                    break;

                case 2:
                    listTasks();
                    break;

                case 3:
                    System.out.print("Tamamlanan görev index: ");
                    completeTask(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Silinecek görev index: ");
                    deleteTask(sc.nextInt());
                    break;
            }
        }
    }

    static void addTask(String task) {
        tasks.add(task);
        completed.add(false);
    }

    static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Liste boş.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            String status = completed.get(i) ? "[X]" : "[ ]";
            System.out.println(i + " " + status + " " + tasks.get(i));
        }
    }

    static void completeTask(int index) {
        if (index >= 0 && index < completed.size()) {
            completed.set(index, true);
        }
    }

    static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            completed.remove(index);
        }
    }
}
