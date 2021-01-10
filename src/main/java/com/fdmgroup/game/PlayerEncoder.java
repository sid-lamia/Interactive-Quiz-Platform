package com.fdmgroup.game;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.fdmgroup.util.Log;
import com.google.gson.Gson;

public class PlayerEncoder implements Encoder.Text<PlayerDetails> {
	 
    private static Gson gson = new Gson();
 
    @Override
    public String encode(PlayerDetails message) throws EncodeException {
    	Log.debug("ENCODING PLAYER DETAILS FROM CLIENT");
    	Log.debug(gson.toJson(message));
        return gson.toJson(message);
    }
 
    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }
 
    @Override
    public void destroy() {
        // Close resources
    }

}