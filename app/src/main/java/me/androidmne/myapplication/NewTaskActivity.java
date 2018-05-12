package me.androidmne.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import me.androidmne.myapplication.models.TaskModel;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        final EditText taskTitleEditText = findViewById(R.id.task_title_edittext);
        final EditText taskDescEditText = findViewById(R.id.task_desc_edittext);
        Button saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TaskModel newTaskModel = new TaskModel();
                newTaskModel.setTitle(taskTitleEditText.getText().toString());
                newTaskModel.setDescription(taskDescEditText.getText().toString());
                final Intent intent = new Intent();
                intent.putExtra("task", newTaskModel);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
