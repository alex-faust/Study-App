package com.magic.studyapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.speech.tts.TextToSpeech;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class TextToSpeechActivity extends AppCompatActivity
{
    TextToSpeech tts;
    Button btn;
    EditText editText, ttsResult;
    ImageView speechBtn;
    SpeechRecognizer speechRecognizer;
    public static final Integer RecordAudioRequestCode = 1;

    @Override
    protected void onCreate(@Nullable Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.text_to_speech_layout);

        editText = findViewById(R.id.ttsEditTxt);
        btn = findViewById(R.id.ttsBtn);
        speechBtn = findViewById(R.id.ttsSpeechToTextBtn);
        ttsResult = findViewById(R.id.ttsSpeechResult);

        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                != PackageManager.PERMISSION_GRANTED)
        {
            checkPermission();
        }

        tts = new TextToSpeech(getApplicationContext(), status -> {
            if (status == TextToSpeech.SUCCESS)
            {
                int result = tts.setLanguage(Locale.US);
                if (result == TextToSpeech.LANG_MISSING_DATA ||
                        result == TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Log.e("TTS", "this language is not supported");
                } else {
                    //figure out what this does
                    //it prolly allows the button to be clicked?
                    btn.setEnabled(true);
                    btn.setOnClickListener((v) ->
                    {
                        String toSpeak = editText.getText().toString();
                        Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    });
                }
            } else
            {
                Log.e("TTS", "Initialization failed");
            }
        });

        final Intent speechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        speechRecognizer.setRecognitionListener(new RecognitionListener()
        {
            @Override
            public void onReadyForSpeech(Bundle bundle)
            {

            }

            @Override
            public void onBeginningOfSpeech()
            {
                editText.setText(" ");
                editText.setHint("Listening...");
            }

            @Override
            public void onRmsChanged(float v)
            {

            }

            @Override
            public void onBufferReceived(byte[] bytes)
            {

            }

            @Override
            public void onEndOfSpeech()
            {

            }

            @Override
            public void onError(int i)
            {

            }

            @Override
            public void onResults(Bundle bun)
            {
                speechBtn.setImageResource(R.drawable.ic_baseline_mic_none_24);
               ArrayList<String> data = bun.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
               editText.setText(data.get(0));
               if (data.isEmpty())
               {
                   editText.setText("There is no text.");
               }
            }

            @Override
            public void onPartialResults(Bundle bundle)
            {

            }

            @Override
            public void onEvent(int i, Bundle bundle)
            {

            }
        });

        speechBtn.setOnTouchListener( (v, t) ->
        {
            if (t.getAction() == MotionEvent.ACTION_UP){
                speechRecognizer.stopListening();
            }
            if (t.getAction() == MotionEvent.ACTION_DOWN){
                //sp.setImageResource(R.drawable.ic_mic_black_24dp);
                speechRecognizer.startListening(speechRecognizerIntent);
            }
            return false;

        });

    }


    public void onPause()
    {
        if (tts != null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }

    public void onDestroy(){
        if(tts != null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    private void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            ActivityCompat.requestPermissions(this,new String[]{
                    Manifest.permission.RECORD_AUDIO}, RecordAudioRequestCode);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == RecordAudioRequestCode && grantResults.length > 0 ){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show();
        }
    }
}
