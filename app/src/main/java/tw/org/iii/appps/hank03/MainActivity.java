package tw.org.iii.appps.hank03;
//任何你完得到摸的到的程式通通是繼承Activity,只是不曉得你繼承哪一個Activity是爸爸
//背景看不到是由serivice去處理
//任何你看的到摸的到的原件爸爸都是view
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b;  //這裡設置的id name ,不用等於viwe那邊設置的依樣
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.creatlottery); //找尋View裡面的物件靠id(在資源區(R)底下的id,底下的物件id名),因為他已經給他一個位置是int,所以從裡面去找
        t = findViewById(R.id.textlottery);

        b.setOnClickListener(new View.OnClickListener() { //設置一個按下去的事件請聽者(靠 new Onc事件觸發)
            @Override
            public void onClick(View view) {
                Log.v("hank","ok");//抓到log裡面的V查訊息("標籤","訊息名")
//                Log.e
//                Log.w
//                Log.i
//                Log.a

            }
        });
    }
}
