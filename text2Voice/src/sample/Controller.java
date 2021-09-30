package sample;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {


    public static final String VOICENAME="kevin";

    @FXML
    private TextField input;


    public void setButton(ActionEvent event) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;
        VoiceManager voiceManager= VoiceManager.getInstance();
        voice=voiceManager.getVoice(VOICENAME);
        voice.allocate();
        try {

            voice.speak(input.getText());

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void clear(ActionEvent event){
        input.setText("");
    }





}
