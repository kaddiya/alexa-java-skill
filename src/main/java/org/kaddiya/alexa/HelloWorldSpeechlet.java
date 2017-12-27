package org.kaddiya.alexa;

import com.amazon.speech.speechlet.*;


public class HelloWorldSpeechlet implements Speechlet {
    @Override public void onSessionStarted(SessionStartedRequest request, Session session)
        throws SpeechletException {

    }

    @Override public SpeechletResponse onLaunch(LaunchRequest request, Session session)
        throws SpeechletException {
        return null;
    }

    @Override public SpeechletResponse onIntent(IntentRequest request, Session session)
        throws SpeechletException {
        return null;
    }

    @Override public void onSessionEnded(SessionEndedRequest request, Session session)
        throws SpeechletException {

    }
}
