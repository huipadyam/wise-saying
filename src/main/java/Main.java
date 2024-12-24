import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App{
    public void run(){
        //ArrayList<String>
        Scanner scanner = new Scanner(System.in);
        System.out.println("== wise-saying App ==");

        int lastNo = 0;
        String content = "";
        String[] contentList = new String[3];
        String[] authorList = new String[3];
        while(true){
            System.out.print("command) ");
            String command = scanner.nextLine();

            if(command.equals("quit")){ // 문자열 비교 시에는 .equals() 사용
                System.out.println("Quit wise-saying App");
                break;
            } else if(command.equals("add")){ // 문자열 비교 시에는 .equals() 사용
                System.out.print("comment : ");
                contentList[lastNo] = scanner.nextLine(); // 입력값 가져옴. 입력값 없으면 기다린다.

                System.out.print("author : ");
                authorList[lastNo] = scanner.nextLine();

                System.out.println("%d(th) comment has been added".formatted(lastNo++));
            } else if(command.equals("list")){
                System.out.println("No. / author / comment");
                System.out.println("---------------------------");
                for(int i = 2; i >= 0; i++){
                    System.out.println("%d / %s / %s".formatted(i, authorList[i], contentList[i]));
                }

            } else if(command.equals("delete")){

            }




            // System.out.println("명령) 종료");
        }

    }
}
