package org.kaddiya.alexa;

import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.Set;


public class HelloWorldSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    public HelloWorldSpeechletRequestStreamHandler(SpeechletV2 speechlet,
        Set<String> supportedApplicationIds) {
        super(speechlet, supportedApplicationIds);
    }
}
