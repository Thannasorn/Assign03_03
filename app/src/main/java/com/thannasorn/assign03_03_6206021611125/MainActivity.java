//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.assign03_03_6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Mr, Name, Age, Birthday;
    private RadioButton Man, Girls;
    private CheckBox Music, Game, Book, Movie;
    private Button btnOk;
    private TextView Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mr = (EditText) findViewById(R.id.Mr);
        Name = (EditText) findViewById(R.id.Name);
        Age = (EditText) findViewById(R.id.Age);
        Birthday = (EditText) findViewById(R.id.Birthday);

        Man = (RadioButton) findViewById(R.id.Man);
        Girls = (RadioButton) findViewById(R.id.Girls);

        Music = (CheckBox) findViewById(R.id.Music);
        Game = (CheckBox) findViewById(R.id.Game);
        Book = (CheckBox) findViewById(R.id.Book);
        Movie = (CheckBox) findViewById(R.id.Movie);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);

        Show = (TextView) findViewById(R.id.Show);
    }

    @Override
    public void onClick(View view) {
        String mess = "";
        mess += Mr.getText().toString() + "  " + Name.getText().toString() + "\n" +
                "เพศ : " + (Man.isChecked() ? "ชาย" : "") + (Girls.isChecked() ? "หญิง" : "") +
                " อายุ : " + Age.getText().toString() +
                " วันเกิด : " + Birthday.getText().toString() + "\n" +
                "งานอดิเรก : " + (Music.isChecked() ? " ฟังเพลง " : "") + (Game.isChecked() ? " เล่นเกมส์ " : "") +
                (Book.isChecked() ? " อ่านหนังสือ " : "") + (Movie.isChecked() ? " ดูหนัง" : "");

        Show.setText(mess);
    }
}




