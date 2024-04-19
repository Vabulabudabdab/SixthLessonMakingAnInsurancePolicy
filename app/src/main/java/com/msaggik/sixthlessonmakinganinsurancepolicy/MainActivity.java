package com.msaggik.sixthlessonmakinganinsurancepolicy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // поля
    private EditText inputId, inputDepPoint, inputTimeArrive, inputStartSent;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка разметки к полям
        inputId = findViewById(R.id.inputId);
        inputDepPoint = findViewById(R.id.inputDepPoint);
        inputTimeArrive = findViewById(R.id.inputTimeArrive);
        inputStartSent = findViewById(R.id.inputStartSent);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённых данных
            int ID = Integer.parseInt(inputId.getText().toString()); // идентификатор
            String DeparturePoint = inputDepPoint.getText().toString(); // место отправки
            String sentTime = inputTimeArrive.getText().toString(); //  время прибытия
            String StartSent = inputStartSent.getText().toString(); // время отправления

            // создание объекта сущности полиса
            InsurancePolicy insurancePolicy = new InsurancePolicy(ID, DeparturePoint, sentTime, StartSent);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // передача объекта сущности полиса в намерение
            intent.putExtra(InsurancePolicy.class.getSimpleName(), insurancePolicy);

            // старт переключения активности
            startActivity(intent);
        }
    };
}