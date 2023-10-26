package com.example.image;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("ОК",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    EditText fio;
    EditText phone;
    EditText adress;

    public void OnArrange(View view){
        fio = findViewById(R.id.fio);
        phone = findViewById(R.id.phone);
        adress = findViewById(R.id.adress);



        if(fio.getText().length() <= 10) AlertDialog("Уведомление" , "Пожалуйста, ФИО не может составлять меньше чем из 10 букв");
        else if(phone.getText().length() <= 11) AlertDialog("Уведомление" , "Некорректно набран номер");
        else if(adress.getText().length() <= 5) AlertDialog("Уведомление" , "Адрес не может состоять из 5 символов, введите адрес корректно");
        else if(fio.getText().length() == 0) AlertDialog("Уведомление" , "Пожалуйста, укажите фамилию имя и отчество");
        else if(phone.getText().length() == 0) AlertDialog("Уведомление" , "Пожалуйста, укажите ваш номер телефона");
        else if(adress.getText().length() == 0) AlertDialog("Уведомление" , "Пожалуйста, укажите адрес доставки");
        else {
            AlertDialog("Уведомление", "Заказ оформлен");
        }


    }
}