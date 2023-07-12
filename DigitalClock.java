import java.util.Date;
import java.text.SimpleDateFormat;

public class DigitalClock {
    public static void main(String[] args) {
        while (true) {
            // 現在の時刻を取得
            Date now = new Date();
            
            // 時刻のフォーマットを指定
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            
            // フォーマットに基づいて時刻を文字列に変換
            String currentTime = sdf.format(now);
            
            // 時刻を表示
            System.out.println(currentTime);
            
            try {
                // 1秒待機
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
