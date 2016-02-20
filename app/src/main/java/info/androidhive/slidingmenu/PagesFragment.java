package info.androidhive.slidingmenu;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;

import info.androidhive.slidingmenu.FindPeopleFragment;
import info.androidhive.slidingmenu.R;

public class PagesFragment extends Fragment {

    // TODO: Rename and change types and number of parameters

    public PagesFragment() {
        // Required empty public constructor
    }



    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button cancel,confirm;
    String mypattern = "0";
    public static String mypatternfinal="0";


    String currentstring;
    Boolean oncecheck1=true,oncecheck2=true,oncecheck3=true,oncecheck4=true;
    Boolean oncecheck5=true,oncecheck6=true,oncecheck7=true,oncecheck8=true,oncecheck9=true;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_confirm_password, container, false);
        btn1 = (Button)rootView.findViewById(R.id.btn1);
        btn2 = (Button)rootView.findViewById(R.id.btn2);
        btn3 = (Button)rootView.findViewById(R.id.btn3);
        btn4 = (Button)rootView.findViewById(R.id.btn4);
        btn5 = (Button)rootView.findViewById(R.id.btn5);
        btn6 = (Button)rootView.findViewById(R.id.btn6);
        btn7 = (Button)rootView.findViewById(R.id.btn7);
        btn8 = (Button)rootView.findViewById(R.id.btn8);
        btn9 = (Button)rootView.findViewById(R.id.btn9);
        confirm = (Button)rootView.findViewById(R.id.confirm);
        cancel = (Button)rootView.findViewById(R.id.cancel);
        setTouchListener();
        confirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("shivamgarg:",FindPeopleFragment.mypatternfinal.toString());
                Log.d("shivamgarg:",mypatternfinal.toString());
                if (FindPeopleFragment.mypatternfinal.equals(mypatternfinal)) {
                    remove();
                } else {
                    Log.d("shivamgarg","insideelse");

                    resetcolor();
                    resetAll();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });
        return rootView;
    }
    public void remove()
    {
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }
    public void resetcolor()
    {
        btn1.setBackgroundResource(R.drawable.bg_red);
        btn2.setBackgroundResource(R.drawable.bg_red);
        btn3.setBackgroundResource(R.drawable.bg_red);
        btn4.setBackgroundResource(R.drawable.bg_red);
        btn5.setBackgroundResource(R.drawable.bg_red);
        btn6.setBackgroundResource(R.drawable.bg_red);
        btn7.setBackgroundResource(R.drawable.bg_red);
        btn8.setBackgroundResource(R.drawable.bg_red);
        btn9.setBackgroundResource(R.drawable.bg_red);
    }
    public void resetAll()
    {
        mypattern = "0";
        mypatternfinal="0";
        oncecheck1=true;oncecheck2=true;oncecheck3=true;oncecheck4=true;
        oncecheck5=true;oncecheck6=true;oncecheck7=true;oncecheck8=true;oncecheck9=true;
    }

    public void setTouchListener()
    {
        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck", "shivam4");
                onTouchEvent(event);
                return false;
            }
        });
        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam5");
                onTouchEvent(event);
                return false;
            }
        });

        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam4");
                onTouchEvent(event);
                return false;
            }
        });
        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam5");
                onTouchEvent(event);
                return false;
            }
        });
        btn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam4");
                onTouchEvent(event);
                return false;
            }
        });
        btn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam5");
                onTouchEvent(event);
                return false;
            }
        });
        btn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam4");
                onTouchEvent(event);
                return false;
            }
        });
        btn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck","shivam5");
                onTouchEvent(event);
                return false;
            }
        });
        btn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, final MotionEvent event) {
                Log.d("mycheck", "shivam5");
                onTouchEvent(event);
                return false;
            }
        });
    }

    public boolean onTouchEvent(MotionEvent event) {
        if(check(event,btn1)&&oncecheck1)
        {
            Log.d("mycheck5", "inside button1");
            btn1.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn1.getText();
            if(mypattern == "0")
            {Log.d("hey","value1");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value1"+mypattern);
            }
            oncecheck1 = false; //so that event or button is processed only once.
        }
        if(check(event,btn2)&&oncecheck2)
        {
            Log.d("mycheck5","inside butto2");
            btn2.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn2.getText();
            if(mypattern == "0")
            {Log.d("hey","value2");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value2" + mypattern);
            }
            oncecheck2 = false;
        }
        if(check(event,btn3)&&oncecheck3)
        {
            Log.d("mycheck5","inside button3");
            btn3.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn3.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value3");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value3" + mypattern);
            }
            oncecheck3 = false;
        }
        if(check(event,btn4)&&oncecheck4)
        {
            Log.d("mycheck5","inside button4");
            btn4.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn4.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value4");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value4" + mypattern);
            }
            oncecheck4 = false;
        }
        if(check(event,btn5)&&oncecheck5)
        {
            Log.d("mycheck5","inside button5");
            btn5.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn5.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value5");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value5" + mypattern);
            }
            oncecheck5 = false;
        }
        if(check(event,btn6)&&oncecheck6)
        {
            Log.d("mycheck5","inside button6");
            btn6.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn6.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value6");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value6" + mypattern);
            }
            oncecheck6 = false;
        }
        if(check(event,btn7)&&oncecheck7)
        {
            Log.d("mycheck5","inside button7");
            btn7.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn7.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value7");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value7" + mypattern);
            }
            oncecheck7 = false;
        }
        if(check(event,btn8)&&oncecheck8)
        {
            Log.d("mycheck5","inside button8");
            btn8.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn8.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value8");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value8" + mypattern);
            }
            oncecheck8 = false;
        }
        if(check(event,btn9)&&oncecheck9)
        {
            Log.d("mycheck5","inside button9");
            btn9.setBackgroundResource(R.drawable.bg_blue);
            currentstring = (String)btn9.getText();
            if(mypattern == "0")
            {
                Log.d("hey","value9");
                mypattern= currentstring;
            }
            else {
                mypattern =mypattern + currentstring;
                Log.d("heyyeah", "value9" + mypattern);
            }
            oncecheck9 = false;
        }
        if(event.getAction()== MotionEvent.ACTION_UP)
        {
            mypatternfinal = mypattern.substring(0,mypattern.length());
            if(FindPeopleFragment.mypatternfinal == mypatternfinal)
            {
                getActivity().getFragmentManager().beginTransaction().remove(this).commit();
            }

        }

        return true;
    }


    public boolean check(MotionEvent e,Button b)
    {
        Log.d("mycheck", "shivam3");
        int x = (int) e.getRawX();
        int y = (int) e.getRawY();
        int test2[] = new int[2];
        test2[0]=x;
        test2[1]=y;
        int test1[] = new int[2];
        b.getLocationOnScreen(test1);
        Log.d("mycheck1", Arrays.toString(test1));
        Log.d("mycheck2", Arrays.toString(test2));
        if((test1[0]<test2[0])&&(test2[0]<test1[0]+200)&&(test1[1]<test2[1])&&(test2[1]<test1[1]+200)) {
            Log.d("mycheck3","gotcha");
            return true;

        }
        return false;
    }
}
