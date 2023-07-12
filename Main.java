import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        while (true) {
            // 現在の時刻を取得
            Date currentTime = new Date();

            // 時刻の表示形式を指定
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            // 時刻を文字列として取得
            String formattedTime = sdf.format(currentTime);

            // 時刻をコンソールに表示
            System.out.println(formattedTime);

            // 1秒待機
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // コンソールをクリア
            clearConsole();
        }
    }

    // コンソールをクリアするメソッド
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
