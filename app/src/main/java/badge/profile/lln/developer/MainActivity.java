package badge.profile.lln.developer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private int mCountSli = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final NotificationBadge mBadge = (NotificationBadge) findViewById(R.id.badge);
        final NotificationBadge mBadgeSli = (NotificationBadge) findViewById(R.id.badge2);
        mBadge.setType(Type.XP);
        mBadgeSli.setType(Type.SLI);
        Button increase = (Button) findViewById(R.id.button);
        Button increaseSli = (Button) findViewById(R.id.button3);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBadge.setNumber(++mCount);
            }
        });

        increaseSli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBadgeSli.setNumber(++mCountSli * 100);
            }
        });
        Button clear = (Button) findViewById(R.id.button2);
        Button clearSli = (Button) findViewById(R.id.button4);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount = 0;
                mBadge.setNumber(mCount);
            }
        });

        clearSli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCountSli = 0;
                mBadgeSli.setNumber(mCountSli);
            }
        });
    }
}
