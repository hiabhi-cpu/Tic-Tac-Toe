package com.example.tietactoegamenew;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    int turn =1;
    int winner=-1;
    int cnt=0;
    TicTacToeGame t;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        t=new TicTacToeGame();
        getInput();
//        Toast.makeText(this, resInp[0]+":"+resInp[1], Toast.LENGTH_SHORT).show();
    }

    private void showAlterBox(String msg){
        builder=new AlertDialog.Builder(this);
        builder.setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        resetButtons();
                        t.reset();
                        turn =1;
                        cnt=0;
//                        Toast.makeText(getApplicationContext(), "You choose to close the app", Toast.LENGTH_SHORT).show();

                    }
                });
        AlertDialog alert=builder.create();
        alert.setTitle("Alert Dialog box");
        alert.show();
    }
    private void getInput() {
        int [] res=new int[2];
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                if(button1.getText().toString().equals("")){
                    if(turn == 1){
                        button1.setText("X");
                        turn=2;
                    }
                    else{
                        button1.setText("O");
                        turn=1;
                    }
                    t.place(0,0);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }
                res[0]=0;
                res[1]=0;

//                Toast.makeText(MainActivity.this, "button1 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                if(button2.getText().toString().equals("")){
                    if(turn == 1){
                        button2.setText("X");
                        turn=2;
                    }
                    else{
                        button2.setText("O");
                        turn=1;
                    }
                    t.place(0,1);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button2 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=0;
                res[1]=2;
                if(button3.getText().toString().equals("")){
                    if(turn == 1){
                        button3.setText("X");
                        turn=2;
                    }
                    else{
                        button3.setText("O");
                        turn=1;
                    }
                    t.place(0,2);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button3 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=1;
                res[1]=0;
                if(button4.getText().toString().equals("")){
                    if(turn == 1){
                        button4.setText("X");
                        turn=2;
                    }
                    else{
                        button4.setText("O");
                        turn=1;
                    }
                    t.place(1,0);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button4 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=1;
                res[1]=1;
                if(button5.getText().toString().equals("")){
                    if(turn == 1){
                        button5.setText("X");
                        turn=2;
                    }
                    else{
                        button5.setText("O");
                        turn=1;
                    }
                    t.place(1,1);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button5 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=1;
                res[1]=2;
                if(button6.getText().toString().equals("")){
                    if(turn == 1){
                        button6.setText("X");
                        turn=2;
                    }
                    else{
                        button6.setText("O");
                        turn=1;
                    }
                    t.place(1,2);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button6 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=2;
                res[1]=0;
                if(button7.getText().toString().equals("")){
                    if(turn == 1){
                        button7.setText("X");
                        turn=2;
                    }
                    else{
                        button7.setText("O");
                        turn=1;
                    }
                    t.place(2,0);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button7 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=2;
                res[1]=1;
                if(button8.getText().toString().equals("")){
                    if(turn == 1){
                        button8.setText("X");
                        turn=2;
                    }
                    else{
                        button8.setText("O");
                        turn=1;
                    }
                    t.place(2,1);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button8 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int prev=turn;
                res[0]=2;
                res[1]=2;
                if(button9.getText().toString().equals("")){
                    if(turn == 1){
                        button9.setText("X");
                        turn=2;
                    }
                    else{
                        button9.setText("O");
                        turn=1;
                    }
                    t.place(2,2);
                }
                cnt++;
                if(t.haveWon(prev)){
                    showAlterBox("Player "+prev+" has won");
                }
                else if(cnt==9){
                    showAlterBox("Match drawn");
//                    Toast.makeText(MainActivity.this, "Count reaches 9", Toast.LENGTH_SHORT).show();
                }

//                Toast.makeText(MainActivity.this, "button9 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void resetButtons(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

}

class TicTacToeGame {
    private int [][]box;
    private int turn=0;


    public TicTacToeGame() {
        // TODO Auto-generated constructor stub
        box=new int[3][3];
        turn=1;
    }

    public void reset() {
        box=new int[3][3];
        turn=1;
    }

    public int place(int r,int c) {
        if(r>2 || c>2 || box[r][c]!=0) {
            System.out.println("Cannot place in this position");
            return -1;
        }
        if(turn==1) {
            turn=2;
            box[r][c]=1;
            return 1;
        }
        else {
            turn=1;
            box[r][c]=2;
            return 2;
        }

    }

    public void display() {
        for(int []x:box) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    public boolean haveWon(int player) {
        // check the rows
        for (int row = 0; row < box.length; row++) {
            if (box[row][0] == player && box[row][1] == player && box[row][2] == player) {
                return true;
            }
        }

        // check for col
        for (int col = 0; col < box[0].length; col++) {
            if (box[0][col] == player && box[1][col] == player && box[2][col] == player) {
                return true;
            }
        }

        // diagonal
        if (box[0][0] == player && box[1][1] == player && box[2][2] == player) {
            return true;
        }

        if (box[0][2] == player && box[1][1] == player && box[2][0] == player) {
            return true;
        }
        return false;
    }
}