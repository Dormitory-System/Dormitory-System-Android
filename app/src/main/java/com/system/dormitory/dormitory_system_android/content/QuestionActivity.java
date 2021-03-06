package com.system.dormitory.dormitory_system_android.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.androidquery.AQuery;
import com.ibm.icu.text.SimpleDateFormat;
import com.system.dormitory.dormitory_system_android.R;
import com.system.dormitory.dormitory_system_android.data.Item;
import com.system.dormitory.dormitory_system_android.data.QuestionItem;


public class QuestionActivity extends Activity {
    private AQuery aq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_content_layout);
        aq = new AQuery(this);

        Intent intent = getIntent();
        QuestionItem item = (QuestionItem)intent.getSerializableExtra("Item");

        aq.id(R.id.content_layout_title).text(item.getTitle());
        aq.id(R.id.content_layout_content).text(item.getContent());
        aq.id(R.id.content_layout_date).text(item.getTime());
        aq.id(R.id.content_layout_answer).text(item.getAnswer());
    }
}