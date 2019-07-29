package tw.org.iii.appps.hank03;
//任何你完得到摸的到的程式通通是繼承Activity,只是不曉得你繼承哪一個Activity是爸爸
//背景看不到是由serivice去處理
//任何你看的到摸的到的原件爸爸都是view
//t.setText(lottery) ://顯示在畫面上(字串物件)
//t = findViewById(R.id.textlottery); //找尋View裡面的物件靠id(在資源區(R)底下的id,底下的物件id名),因為他已經給他一個位置是int,所以從裡面去找
// Log.v://抓到log裡面的V查訊息("標籤","訊息名")
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private Button b;  //這裡設置的id name ,不用等於viwe那邊設置的依樣
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t = findViewById(R.id.textlottery); //找尋View裡面的物件靠id(在資源區(R)底下的id,底下的物件id名),因為他已經給他一個位置是int,所以從裡面去找

        //因為這顆按鈕只是要觸發事件沒有要另外寫的部分,所以直接在xml那邊寫onclick就好
//        b.setOnClickListener(new View.OnClickListener() { //設置一個按下去的事件請聽者(靠 new Onc事件觸發)
//            @Override
//            public void onClick(View view) {
//                Log.v("hank","ok");//抓到log裡面的V查訊息("標籤","訊息名")
////                Log.e
////                Log.w
////                Log.i
////                Log.a
//
//            }
//        });

    }
     //當按鈕點下去觸發的事件
    public void creatlottery (View view){
        String lottery = lottery();
        t.setText(lottery);

    }
    //寫樂透的方法
    public String lottery(){
        TreeSet<Integer> lottery = new TreeSet<>();
        while(lottery.size() < 6){
            lottery.add((int)(Math.random()*36+1));
        }
        return  lottery.toString();
    }

}
