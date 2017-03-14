package com.android.widgets.demo;

import android.app.Activity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ButtonActivity extends Activity {
	
    private String mPlantillaMensajeBoton;
    private String mPlantillaMensajeImageBoton;
    private String mPlantillaMensajeToggleBotonSimple;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons); 
        mPlantillaMensajeBoton = getString(R.string.plantilla_mensaje_boton);
        mPlantillaMensajeImageBoton = getString(R.string.plantilla_mensaje_imagebutton);
        mPlantillaMensajeToggleBotonSimple = getString(R.string.plantilla_mensaje_togglebutton_simple);
    }
    
    /** Makes a Toast showing the label of the Button, RadioButton, or CheckBox.
     *  ImageButtons do not have text, and are not subclasses of Button, so you
     *  cannot pass an ImageButton to this method.
     *  You need the muestraInfoImageButton method.
     */
    
    public void muestraTextoBoton(View clickedButton) { 
        Button button = (Button)clickedButton;
        CharSequence text = button.getText();
        String message = String.format(mPlantillaMensajeBoton, text);
        showToast(message);
    }
    
    public void muestraInfoImageButton1(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_1);
    }
    
    public void muestraInfoImageButton2(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_2);
    }
    
    public void muestraInfoImageButton3(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_3);
    }
    
    public void muestraInfoImageButton4(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_4);
    }
    
    public void muestraInfoImageButton5(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_5);
    }
    
    public void muestraInfoImageButton6(View clickedImageButton) {
    	muestraInfoImageButton(R.string.info_imagebutton_6);
    }
    
    private void muestraInfoImageButton(int imageId) {
        String imageString = getString(imageId);
        String message = String.format(mPlantillaMensajeImageBoton, imageString);
        showToast(message);
    }

    
    /** Makes a Toast showing whether you turned ToggleButton on or off. Also
     *  shows the resultant text (label).
     */
    
    public void muestraInfoToggleBoton(View clickedToggleButton) { 
        ToggleButton toggleButton = (ToggleButton)clickedToggleButton;
        String status;
        if (toggleButton.isChecked()) {
            status = "ON";
        } else {
            status = "OFF";
        }
        String message = String.format(mPlantillaMensajeToggleBotonSimple, status);
        showToast(message);
    }
    
    
    private void showToast(String text) {
    	Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

  
}
