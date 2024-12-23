import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App{
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if(command.equals("등록")){ // 문자열 비교 시에는 .equals() 사용
                System.out.print("명언 : ");
                scanner.nextLine(); // 입력값 가져옴. 입력값 없으면 기다린다.

                System.out.print("작가 : ");
                scanner.nextLine();

                System.out.println("1번 명령이 등록되었습니다.");
            }


            // System.out.println("명령) 종료");
        }

    }
}
