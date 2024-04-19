package com.msaggik.sixthlessonmakinganinsurancepolicy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    // поля
    private TextView output;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка разметки к полям
        output = findViewById(R.id.output);
        button = findViewById(R.id.button);

        // считывание данных из намерения
        Bundle bundle = getIntent().getExtras();

        // извлечение объекта сущности полиса по ключу "InsurancePolicy.class.getSimpleName()"
        if (bundle != null) {
            InsurancePolicy policy = (InsurancePolicy) bundle.getSerializable(InsurancePolicy.class.getSimpleName());
            //Обработка данных
            String DeparturePoint = policy.getDeparturePoint(); // Место отправления

            // расчёт аварийности вождения
            String timeArrive = policy.getTimeArrive(); // время прибытия

            // расчёт коэффициента категории автомобиля
            String sentTime = policy.getsentTime(); // время отправления

            // вывод полученных данных на экран
            output.setText("Место отправления:"+ DeparturePoint +
            "\nВремя прибытия: " + timeArrive + "\nВремя отправления: " + sentTime);
        }

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // намерение перехода в первую активность
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); // перемещение активности на вершину стека
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // удаление всех активностей кроме той на корую происходит переход
            startActivity(intent);
        }
    };
}